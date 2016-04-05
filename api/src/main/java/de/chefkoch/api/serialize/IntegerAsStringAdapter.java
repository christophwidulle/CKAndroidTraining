package de.chefkoch.api.serialize;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class IntegerAsStringAdapter extends TypeAdapter<Integer> {

    @Override
    public Integer read(JsonReader in) throws IOException {
        JsonToken peek = in.peek();
        switch (peek) {
            case NULL:
                in.nextNull();
                return null;
            case NUMBER:
                return in.nextInt();
            case STRING:
                try {
                    return Integer.parseInt(in.nextString());
                } catch (NumberFormatException e) {
                    return 0;
                }
            default:
                throw new IllegalStateException("Expected NUMBER or STRING but was " + peek);
        }
    }

    @Override
    public void write(JsonWriter out, Integer value) throws IOException {
        if (value == null) {
            out.nullValue();
        } else {
            out.value(value);
        }
    }

}
