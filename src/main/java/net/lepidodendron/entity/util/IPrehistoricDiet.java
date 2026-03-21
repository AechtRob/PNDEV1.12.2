package net.lepidodendron.entity.util;

import javax.annotation.Nullable;

public interface IPrehistoricDiet {

    String[] getFoodOreDicts();

   String[] getFoodOreDictsForVariantInPalaeopedia(@Nullable String variantIn);

}
