package de.chefkoch.api.model;

import java.io.Serializable;

import de.chefkoch.api.IngredientHelper;


public class Ingredient implements Serializable {
    private String id;
    private String name;
    private String usageInfo;
    private String unit;
    private String unitId;
    private Double amount;
    private Boolean isHeadline;
    private Boolean isBasic;

    public Ingredient() {

    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getUnitId() {
		return unitId;
	}

	public void setUnitId(final String unitId) {
		this.unitId = unitId;
	}

	public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUsageInfo() {
        return usageInfo;
    }

    public void setUsageInfo(final String usageInfo) {
        this.usageInfo = usageInfo;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(final String unit) {
        this.unit = unit;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(final Double amount) {
        this.amount = amount;
    }

    public Boolean getIsHeadline() {
        return isHeadline;
    }

    public void setIsHeadline(final Boolean isHeadline) {
        this.isHeadline = isHeadline;
    }

    public Boolean getIsBasic() {
        return isBasic;
    }

    public void setIsBasic(final Boolean isBasic) {
        this.isBasic = isBasic;
    }

    private Boolean hasAmount() {
        return this.amount != null && this.amount > 0.0;
    }

    public String getCleanedName(final Integer servingsRecipe, final Integer servingsRequested) {
        Boolean plural = false;
        String name = this.name;
        if (this.amount == null || this.calculateAmount(servingsRecipe, servingsRequested) > 1.0) {
            plural = true;
        }
        if (plural) {
            name = name.replace("(n)", "n");
            name = name.replace("(er)", "er");
        } else {
            name = name.replace("(n)", "");
            name = name.replace("(er)", "");
        }
        return name;
    }

    public String getAmountAndUnit(final Integer servingsRecipe, final Integer servingsRequested) {
        final StringBuilder returnValue = new StringBuilder();
        if (this.hasAmount()) {
            returnValue.append(this.getAmountAsRationalString(servingsRecipe, servingsRequested));
        }
        returnValue.append(this.getFormattedUnit(servingsRecipe, servingsRequested));
        return returnValue.toString();
    }

    public String getFormattedUnit(final Integer servingsRecipe, final Integer servingsRequested) {
        String unit = "";
        if (!this.unit.isEmpty()) {
            unit = " " + this.unit;
            if (this.hasAmount() && this.calculateAmount(servingsRecipe, servingsRequested) <= 1.0) {
                unit = unit.replace("/n", "");
                unit = unit.replace("/e", "");
            }
            unit = unit.replace("/n", "n");
            unit = unit.replace("/e", "e");
        }
        if (this.hasAmount() && this.calculateAmount(servingsRecipe, servingsRequested) > 1.0) {
            if (unit.equals("Prise")) {
                unit = "Prisen";
            }
            if (unit.equals("Tasse")) {
                unit = "Tassen";
            }
        }
        return unit;
    }

    public String getFormattedAmount(final Integer servingsRecipe, final Integer servingsRequested) {
        return this.getAmountAsRationalString(servingsRecipe, servingsRequested);
    }

    private Double calculateAmount(final Integer servingsRecipe, final Integer servingsRequested) {
        return this.amount / servingsRecipe * servingsRequested;
    }

    private String getAmountAsRationalString(final Integer servingsRecipe, final Integer servingsRequested) {
        return IngredientHelper.getHumanReadableDouble(this.calculateAmount(servingsRecipe, servingsRequested));
    }
}