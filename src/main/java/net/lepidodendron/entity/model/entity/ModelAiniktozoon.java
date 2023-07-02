package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAiniktozoon extends AdvancedModelBase {
    private final AdvancedModelRenderer bones;
    private final AdvancedModelRenderer bodybase;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer finR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer finL10;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer finR11;
    private final AdvancedModelRenderer finL11;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer finR12;
    private final AdvancedModelRenderer finL12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelAiniktozoon() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bones = new AdvancedModelRenderer(this);
        this.bones.setRotationPoint(0.0F, 20.5F, 0.0F);


        this.bodybase = new AdvancedModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.bones.addChild(bodybase);
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 0, -1.01F, -2.75F, -8.0F, 2, 2, 4, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.65F, -1.0F, -6.0F);
        this.bodybase.addChild(legL);
        this.setRotateAngle(legL, -0.1745F, 0.0F, -0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 18, 7, 0.0F, 0.0F, -2.0F, 0, 3, 2, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.65F, -1.0F, -6.0F);
        this.bodybase.addChild(legR);
        this.setRotateAngle(legR, -0.1745F, 0.0F, 0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 18, 4, 0.0F, 0.0F, -2.0F, 0, 3, 2, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.65F, -1.0F, -5.25F);
        this.bodybase.addChild(legL2);
        this.setRotateAngle(legL2, -0.0436F, 0.0F, -0.3491F);
        this.legL2.cubeList.add(new ModelBox(legL2, 18, 0, 0.0F, -0.5F, -2.0F, 0, 4, 2, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.65F, -1.0F, -5.25F);
        this.bodybase.addChild(legR2);
        this.setRotateAngle(legR2, -0.0436F, 0.0F, 0.3491F);
        this.legR2.cubeList.add(new ModelBox(legR2, 10, 4, 0.0F, -0.5F, -2.0F, 0, 4, 2, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.85F, -1.0F, -4.5F);
        this.bodybase.addChild(legL3);
        this.setRotateAngle(legL3, 0.3054F, 0.0F, -0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 6, 7, 0.0F, -0.25F, -3.0F, 0, 4, 3, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.85F, -1.0F, -4.5F);
        this.bodybase.addChild(legR3);
        this.setRotateAngle(legR3, 0.3054F, 0.0F, 0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 7, 0.0F, -0.25F, -3.0F, 0, 4, 3, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.05F, -4.0F);
        this.bodybase.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 22, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body1.addChild(finL);
        this.setRotateAngle(finL, 0.2182F, 0.3927F, -0.48F);
        this.finL.cubeList.add(new ModelBox(finL, 18, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body1.addChild(finR);
        this.setRotateAngle(finR, 0.2182F, -0.3927F, 0.48F);
        this.finR.cubeList.add(new ModelBox(finR, 12, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 21, 11, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body2.addChild(finL2);
        this.setRotateAngle(finL2, 0.2182F, 0.3927F, -0.48F);
        this.finL2.cubeList.add(new ModelBox(finL2, 12, 9, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body2.addChild(finR2);
        this.setRotateAngle(finR2, 0.2182F, -0.3927F, 0.48F);
        this.finR2.cubeList.add(new ModelBox(finR2, 8, 5, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 22, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body3.addChild(finL3);
        this.setRotateAngle(finL3, 0.2182F, 0.3927F, -0.48F);
        this.finL3.cubeList.add(new ModelBox(finL3, 18, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body3.addChild(finR3);
        this.setRotateAngle(finR3, 0.2182F, -0.3927F, 0.48F);
        this.finR3.cubeList.add(new ModelBox(finR3, 12, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 21, 11, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body4.addChild(finL4);
        this.setRotateAngle(finL4, 0.2182F, 0.3927F, -0.48F);
        this.finL4.cubeList.add(new ModelBox(finL4, 12, 9, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body4.addChild(finR4);
        this.setRotateAngle(finR4, 0.2182F, -0.3927F, 0.48F);
        this.finR4.cubeList.add(new ModelBox(finR4, 8, 5, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 22, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body5.addChild(finL5);
        this.setRotateAngle(finL5, 0.2182F, 0.3927F, -0.48F);
        this.finL5.cubeList.add(new ModelBox(finL5, 18, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body5.addChild(finR5);
        this.setRotateAngle(finR5, 0.2182F, -0.3927F, 0.48F);
        this.finR5.cubeList.add(new ModelBox(finR5, 12, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 21, 11, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body6.addChild(finL6);
        this.setRotateAngle(finL6, 0.2182F, 0.3927F, -0.48F);
        this.finL6.cubeList.add(new ModelBox(finL6, 12, 9, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body6.addChild(finR6);
        this.setRotateAngle(finR6, 0.2182F, -0.3927F, 0.48F);
        this.finR6.cubeList.add(new ModelBox(finR6, 8, 5, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 22, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body7.addChild(finL7);
        this.setRotateAngle(finL7, 0.2182F, 0.3927F, -0.48F);
        this.finL7.cubeList.add(new ModelBox(finL7, 18, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body7.addChild(finR7);
        this.setRotateAngle(finR7, 0.2182F, -0.3927F, 0.48F);
        this.finR7.cubeList.add(new ModelBox(finR7, 12, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 21, 11, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body8.addChild(finL8);
        this.setRotateAngle(finL8, 0.2182F, 0.3927F, -0.48F);
        this.finL8.cubeList.add(new ModelBox(finL8, 12, 9, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body8.addChild(finR8);
        this.setRotateAngle(finR8, 0.2182F, -0.3927F, 0.48F);
        this.finR8.cubeList.add(new ModelBox(finR8, 8, 5, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 0, 22, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body9.addChild(finL9);
        this.setRotateAngle(finL9, 0.2182F, 0.3927F, -0.48F);
        this.finL9.cubeList.add(new ModelBox(finL9, 18, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body9.addChild(finR9);
        this.setRotateAngle(finR9, 0.2182F, -0.3927F, 0.48F);
        this.finR9.cubeList.add(new ModelBox(finR9, 12, 11, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 21, 11, -0.99F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body10.addChild(finL10);
        this.setRotateAngle(finL10, 0.2182F, 0.3927F, -0.48F);
        this.finL10.cubeList.add(new ModelBox(finL10, 12, 9, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-1.0F, 0.75F, 0.25F);
        this.body10.addChild(finR10);
        this.setRotateAngle(finR10, 0.2182F, -0.3927F, 0.48F);
        this.finR10.cubeList.add(new ModelBox(finR10, 8, 5, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 8, 0, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-1.0F, 0.15F, 0.0F);
        this.body11.addChild(finR11);
        this.setRotateAngle(finR11, 0.6981F, 0.0F, 0.8727F);
        this.finR11.cubeList.add(new ModelBox(finR11, 12, 2, 0.0F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(1.0F, 0.15F, 0.0F);
        this.body11.addChild(finL11);
        this.setRotateAngle(finL11, 0.6981F, 0.0F, -0.8727F);
        this.finL11.cubeList.add(new ModelBox(finL11, 0, 0, 0.0F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 18, 0, -0.49F, -0.51F, 0.0F, 1, 1, 1, 0.0F, false));

        this.finR12 = new AdvancedModelRenderer(this);
        this.finR12.setRotationPoint(-0.5F, 0.15F, 0.0F);
        this.body12.addChild(finR12);
        this.setRotateAngle(finR12, 0.8727F, 0.0F, 0.8727F);
        this.finR12.cubeList.add(new ModelBox(finR12, 0, 5, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL12 = new AdvancedModelRenderer(this);
        this.finL12.setRotationPoint(0.5F, 0.15F, 0.0F);
        this.body12.addChild(finL12);
        this.setRotateAngle(finL12, 0.8727F, 0.0F, -0.8727F);
        this.finL12.cubeList.add(new ModelBox(finL12, 2, 1, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.25F, 1.0F);
        this.body12.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, 0.05F, -0.5F, 1, 0, 2, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.25F, -0.75F, -7.0F);
        this.bones.addChild(eye);
        this.setRotateAngle(eye, 0.3491F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 6, -1.7F, -2.1F, -2.0F, 3, 2, 2, 0.0F, false));

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 0.6F, -8.2F);
        this.bones.addChild(carapace);
        this.setRotateAngle(carapace, 0.2182F, 0.0F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 9, 2.4F, -1.1F, 1.25F, 0, 1, 12, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 8, -2.4F, -1.1F, 1.25F, 0, 1, 12, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -2.75F, 0.25F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.5236F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, 0.05F, -0.1F, 1.0F, 0, 2, 13, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, -2.75F, 0.25F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.5236F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 5, -0.05F, -0.1F, 1.0F, 0, 2, 13, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.5F, 0.25F);
        this.carapace.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -0.5F, 0.0F, 2, 2, 14, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bones.render(f5 * 0.33F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.bones.render(0.02F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.bones.offsetY = 1.0F;

        AdvancedModelRenderer[] Tail = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.tail};
        AdvancedModelRenderer[] finsL = {this.legL, this.legL2, this.legL3};
        AdvancedModelRenderer[] finsR = {this.legR, this.legR2, this.legR3};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            float paddleVdegree = -0.08F;
            float paddleHdegree = 0.25F;
            this.chainSwing(finsL, speed, -paddleHdegree, -3, f2, 0.5F);
            this.chainWave(finsL, speed, paddleVdegree, -3, f2, 0.5F);
            this.chainSwing(finsR, speed, paddleHdegree, -3, f2, 0.5F);
            this.chainWave(finsR, speed, paddleVdegree, -3, f2, 0.5F);

            this.chainWave(Tail, speed * 0.65F, 0.025F, -1.5, f2, 0.8F);

            this.flap(finL11, 0.5F, -0.6F, false, 0, -0.5F, f2, 0.7F);
            this.flap(finR11, 0.5F, 0.6F, false, 0, 0.5F, f2, 0.7F);
            this.flap(finL10, 0.5F, -0.6F, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(finR10, 0.5F, 0.6F, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(finL9, 0.5F, -0.6F, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(finR9, 0.5F, 0.6F, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(finL8, 0.5F, -0.6F, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(finR8, 0.5F, 0.6F, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(finL7, 0.5F, -0.6F, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(finR7, 0.5F, 0.6F, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(finL6, 0.5F, -0.6F, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(finR6, 0.5F, 0.6F, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(finL5, 0.5F, -0.6F, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(finR5, 0.5F, 0.6F, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(finL4, 0.5F, -0.6F, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(finR4, 0.5F, 0.6F, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(finL3, 0.5F, -0.6F, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(finR3, 0.5F, 0.6F, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(finL2, 0.5F, -0.6F, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(finR2, 0.5F, 0.6F, false, 4.5F, 0.5F, f2, 0.7F);
            this.flap(finL, 0.5F, -0.6F, false, 5.0F, -0.5F, f2, 0.7F);
            this.flap(finR, 0.5F, 0.6F, false, 5.0F, 0.5F, f2, 0.7F);

            if (!e.isInWater()) {
                this.bob(bones, -speed * 1.5F, 3F, false, f2, 1);
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(bones, -speed, 0.2F, false, f2, 2);
                }
                else
                {
                    this.bob(bones, -speed, 0.6F, false, f2, 2);
                }
            }
        }
    }
}
