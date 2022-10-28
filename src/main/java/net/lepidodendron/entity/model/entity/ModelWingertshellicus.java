package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelWingertshellicus extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer AntennaR;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer HeadlegR;
    private final AdvancedModelRenderer HeadlegL;
    private final AdvancedModelRenderer HeadlegR2;
    private final AdvancedModelRenderer HeadlegL2;
    private final AdvancedModelRenderer HeadlegR3;
    private final AdvancedModelRenderer HeadlegL3;
    private final AdvancedModelRenderer HeadlegR4;
    private final AdvancedModelRenderer HeadlegL4;
    private final AdvancedModelRenderer HeadlegR5;
    private final AdvancedModelRenderer HeadlegL5;
    private final AdvancedModelRenderer HeadlegR6;
    private final AdvancedModelRenderer HeadlegL6;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer legR13;
    private final AdvancedModelRenderer legR14;
    private final AdvancedModelRenderer legR15;
    private final AdvancedModelRenderer legR16;
    private final AdvancedModelRenderer legL13;
    private final AdvancedModelRenderer legL14;
    private final AdvancedModelRenderer legL15;
    private final AdvancedModelRenderer legL16;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer legR17;
    private final AdvancedModelRenderer legR18;
    private final AdvancedModelRenderer legR19;
    private final AdvancedModelRenderer legR20;
    private final AdvancedModelRenderer legL17;
    private final AdvancedModelRenderer legL18;
    private final AdvancedModelRenderer legL19;
    private final AdvancedModelRenderer legL20;
    private final AdvancedModelRenderer Body7;
    private final AdvancedModelRenderer legR21;
    private final AdvancedModelRenderer legR22;
    private final AdvancedModelRenderer legR23;
    private final AdvancedModelRenderer legR24;
    private final AdvancedModelRenderer legL21;
    private final AdvancedModelRenderer legL22;
    private final AdvancedModelRenderer legL23;
    private final AdvancedModelRenderer legL24;
    private final AdvancedModelRenderer Body8;
    private final AdvancedModelRenderer legR25;
    private final AdvancedModelRenderer legR26;
    private final AdvancedModelRenderer legR27;
    private final AdvancedModelRenderer legR28;
    private final AdvancedModelRenderer legL25;
    private final AdvancedModelRenderer legL26;
    private final AdvancedModelRenderer legL27;
    private final AdvancedModelRenderer legL28;
    private final AdvancedModelRenderer Body9;
    private final AdvancedModelRenderer legR29;
    private final AdvancedModelRenderer legR30;
    private final AdvancedModelRenderer legR31;
    private final AdvancedModelRenderer legR32;
    private final AdvancedModelRenderer legL29;
    private final AdvancedModelRenderer legL30;
    private final AdvancedModelRenderer legL31;
    private final AdvancedModelRenderer legL32;
    private final AdvancedModelRenderer Body10;
    private final AdvancedModelRenderer legR33;
    private final AdvancedModelRenderer legR34;
    private final AdvancedModelRenderer legR35;
    private final AdvancedModelRenderer legR36;
    private final AdvancedModelRenderer legL33;
    private final AdvancedModelRenderer legL34;
    private final AdvancedModelRenderer legL35;
    private final AdvancedModelRenderer legL36;
    private final AdvancedModelRenderer Body11;
    private final AdvancedModelRenderer legR37;
    private final AdvancedModelRenderer legR38;
    private final AdvancedModelRenderer legR39;
    private final AdvancedModelRenderer legR40;
    private final AdvancedModelRenderer legL37;
    private final AdvancedModelRenderer legL38;
    private final AdvancedModelRenderer legL39;
    private final AdvancedModelRenderer legL40;

    public ModelWingertshellicus() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 6, 10, -1.0F, -1.0F, -7.0F, 2, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 8, 0, -0.5F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.0F, -8.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, -0.5F, -1.0F, 0.075F, 2, 1, 1, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, -8.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 5, -1.5F, -1.0F, 0.075F, 2, 1, 1, -0.01F, false));

        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(-0.25F, -0.5F, -8.0F);
        this.Body.addChild(AntennaR);
        this.setRotateAngle(AntennaR, -0.2182F, 0.3491F, 0.0F);
        this.AntennaR.cubeList.add(new ModelBox(AntennaR, 0, 0, 0.0F, -2.5F, -7.0F, 0, 3, 7, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(0.25F, -0.5F, -8.0F);
        this.Body.addChild(AntennaL);
        this.setRotateAngle(AntennaL, -0.2182F, -0.3491F, 0.0F);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, 0, 0, 0.0F, -2.5F, -7.0F, 0, 3, 7, 0.0F, true));

        this.HeadlegR = new AdvancedModelRenderer(this);
        this.HeadlegR.setRotationPoint(-1.0F, -0.25F, -6.825F);
        this.Body.addChild(HeadlegR);
        this.setRotateAngle(HeadlegR, 0.0F, -0.7854F, -0.6545F);
        this.HeadlegR.cubeList.add(new ModelBox(HeadlegR, 0, 1, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.HeadlegL = new AdvancedModelRenderer(this);
        this.HeadlegL.setRotationPoint(1.0F, -0.25F, -6.825F);
        this.Body.addChild(HeadlegL);
        this.setRotateAngle(HeadlegL, 0.0F, 0.7854F, 0.6545F);
        this.HeadlegL.cubeList.add(new ModelBox(HeadlegL, 0, 1, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.HeadlegR2 = new AdvancedModelRenderer(this);
        this.HeadlegR2.setRotationPoint(-1.0F, -0.25F, -6.725F);
        this.Body.addChild(HeadlegR2);
        this.setRotateAngle(HeadlegR2, 0.0F, -0.6109F, -0.6545F);
        this.HeadlegR2.cubeList.add(new ModelBox(HeadlegR2, 0, 1, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.HeadlegL2 = new AdvancedModelRenderer(this);
        this.HeadlegL2.setRotationPoint(1.0F, -0.25F, -6.725F);
        this.Body.addChild(HeadlegL2);
        this.setRotateAngle(HeadlegL2, 0.0F, 0.6109F, 0.6545F);
        this.HeadlegL2.cubeList.add(new ModelBox(HeadlegL2, 0, 1, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.HeadlegR3 = new AdvancedModelRenderer(this);
        this.HeadlegR3.setRotationPoint(-1.0F, -0.25F, -6.625F);
        this.Body.addChild(HeadlegR3);
        this.setRotateAngle(HeadlegR3, 0.0F, -0.4363F, -0.6545F);
        this.HeadlegR3.cubeList.add(new ModelBox(HeadlegR3, 6, 6, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.HeadlegL3 = new AdvancedModelRenderer(this);
        this.HeadlegL3.setRotationPoint(1.0F, -0.25F, -6.625F);
        this.Body.addChild(HeadlegL3);
        this.setRotateAngle(HeadlegL3, 0.0F, 0.4363F, 0.6545F);
        this.HeadlegL3.cubeList.add(new ModelBox(HeadlegL3, 6, 6, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.HeadlegR4 = new AdvancedModelRenderer(this);
        this.HeadlegR4.setRotationPoint(-1.0F, -0.25F, -6.525F);
        this.Body.addChild(HeadlegR4);
        this.setRotateAngle(HeadlegR4, 0.0F, -0.3491F, -0.1309F);
        this.HeadlegR4.cubeList.add(new ModelBox(HeadlegR4, 8, 3, -4.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, false));

        this.HeadlegL4 = new AdvancedModelRenderer(this);
        this.HeadlegL4.setRotationPoint(1.0F, -0.25F, -6.525F);
        this.Body.addChild(HeadlegL4);
        this.setRotateAngle(HeadlegL4, 0.0F, 0.3491F, 0.1309F);
        this.HeadlegL4.cubeList.add(new ModelBox(HeadlegL4, 8, 3, 0.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, true));

        this.HeadlegR5 = new AdvancedModelRenderer(this);
        this.HeadlegR5.setRotationPoint(-1.0F, -0.25F, -6.325F);
        this.Body.addChild(HeadlegR5);
        this.setRotateAngle(HeadlegR5, 0.0F, -0.2618F, -0.1309F);
        this.HeadlegR5.cubeList.add(new ModelBox(HeadlegR5, 8, 3, -4.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, false));

        this.HeadlegL5 = new AdvancedModelRenderer(this);
        this.HeadlegL5.setRotationPoint(1.0F, -0.25F, -6.325F);
        this.Body.addChild(HeadlegL5);
        this.setRotateAngle(HeadlegL5, 0.0F, 0.2618F, 0.1309F);
        this.HeadlegL5.cubeList.add(new ModelBox(HeadlegL5, 8, 3, 0.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, true));

        this.HeadlegR6 = new AdvancedModelRenderer(this);
        this.HeadlegR6.setRotationPoint(-1.0F, -0.25F, -6.125F);
        this.Body.addChild(HeadlegR6);
        this.setRotateAngle(HeadlegR6, 0.0F, -0.1309F, -0.1309F);
        this.HeadlegR6.cubeList.add(new ModelBox(HeadlegR6, 8, 3, -4.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, false));

        this.HeadlegL6 = new AdvancedModelRenderer(this);
        this.HeadlegL6.setRotationPoint(1.0F, -0.25F, -6.125F);
        this.Body.addChild(HeadlegL6);
        this.setRotateAngle(HeadlegL6, 0.0F, 0.1309F, 0.1309F);
        this.HeadlegL6.cubeList.add(new ModelBox(HeadlegL6, 8, 3, 0.0F, -0.25F, 0.0F, 4, 3, 0, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 14, -0.5F, -0.52F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body2.addChild(legR);
        this.legR.cubeList.add(new ModelBox(legR, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body2.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body2.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Body2.addChild(legR4);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body2.addChild(legL);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body2.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body2.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Body2.addChild(legL4);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 14, -0.5F, -0.5F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body3.addChild(legR5);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body3.addChild(legR6);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body3.addChild(legR7);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Body3.addChild(legR8);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body3.addChild(legL5);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body3.addChild(legL6);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body3.addChild(legL7);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Body3.addChild(legL8);
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 14, -0.5F, -0.52F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body4.addChild(legR9);
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body4.addChild(legR10);
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body4.addChild(legR11);
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Body4.addChild(legR12);
        this.legR12.cubeList.add(new ModelBox(legR12, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body4.addChild(legL9);
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body4.addChild(legL10);
        this.legL10.cubeList.add(new ModelBox(legL10, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body4.addChild(legL11);
        this.legL11.cubeList.add(new ModelBox(legL11, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Body4.addChild(legL12);
        this.legL12.cubeList.add(new ModelBox(legL12, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 14, -0.5F, -0.5F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR13 = new AdvancedModelRenderer(this);
        this.legR13.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body5.addChild(legR13);
        this.legR13.cubeList.add(new ModelBox(legR13, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR14 = new AdvancedModelRenderer(this);
        this.legR14.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body5.addChild(legR14);
        this.legR14.cubeList.add(new ModelBox(legR14, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR15 = new AdvancedModelRenderer(this);
        this.legR15.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body5.addChild(legR15);
        this.legR15.cubeList.add(new ModelBox(legR15, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR16 = new AdvancedModelRenderer(this);
        this.legR16.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Body5.addChild(legR16);
        this.legR16.cubeList.add(new ModelBox(legR16, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL13 = new AdvancedModelRenderer(this);
        this.legL13.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body5.addChild(legL13);
        this.legL13.cubeList.add(new ModelBox(legL13, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL14 = new AdvancedModelRenderer(this);
        this.legL14.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body5.addChild(legL14);
        this.legL14.cubeList.add(new ModelBox(legL14, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL15 = new AdvancedModelRenderer(this);
        this.legL15.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body5.addChild(legL15);
        this.legL15.cubeList.add(new ModelBox(legL15, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL16 = new AdvancedModelRenderer(this);
        this.legL16.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Body5.addChild(legL16);
        this.legL16.cubeList.add(new ModelBox(legL16, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 14, -0.5F, -0.52F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legR17 = new AdvancedModelRenderer(this);
        this.legR17.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body6.addChild(legR17);
        this.legR17.cubeList.add(new ModelBox(legR17, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR18 = new AdvancedModelRenderer(this);
        this.legR18.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body6.addChild(legR18);
        this.legR18.cubeList.add(new ModelBox(legR18, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR19 = new AdvancedModelRenderer(this);
        this.legR19.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body6.addChild(legR19);
        this.legR19.cubeList.add(new ModelBox(legR19, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR20 = new AdvancedModelRenderer(this);
        this.legR20.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Body6.addChild(legR20);
        this.legR20.cubeList.add(new ModelBox(legR20, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL17 = new AdvancedModelRenderer(this);
        this.legL17.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body6.addChild(legL17);
        this.legL17.cubeList.add(new ModelBox(legL17, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL18 = new AdvancedModelRenderer(this);
        this.legL18.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body6.addChild(legL18);
        this.legL18.cubeList.add(new ModelBox(legL18, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL19 = new AdvancedModelRenderer(this);
        this.legL19.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body6.addChild(legL19);
        this.legL19.cubeList.add(new ModelBox(legL19, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL20 = new AdvancedModelRenderer(this);
        this.legL20.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Body6.addChild(legL20);
        this.legL20.cubeList.add(new ModelBox(legL20, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Body7 = new AdvancedModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body6.addChild(Body7);
        this.Body7.cubeList.add(new ModelBox(Body7, 0, 14, -0.5F, -0.5F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body7.cubeList.add(new ModelBox(Body7, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR21 = new AdvancedModelRenderer(this);
        this.legR21.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body7.addChild(legR21);
        this.legR21.cubeList.add(new ModelBox(legR21, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR22 = new AdvancedModelRenderer(this);
        this.legR22.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body7.addChild(legR22);
        this.legR22.cubeList.add(new ModelBox(legR22, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR23 = new AdvancedModelRenderer(this);
        this.legR23.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body7.addChild(legR23);
        this.legR23.cubeList.add(new ModelBox(legR23, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR24 = new AdvancedModelRenderer(this);
        this.legR24.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Body7.addChild(legR24);
        this.legR24.cubeList.add(new ModelBox(legR24, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL21 = new AdvancedModelRenderer(this);
        this.legL21.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body7.addChild(legL21);
        this.legL21.cubeList.add(new ModelBox(legL21, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL22 = new AdvancedModelRenderer(this);
        this.legL22.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body7.addChild(legL22);
        this.legL22.cubeList.add(new ModelBox(legL22, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL23 = new AdvancedModelRenderer(this);
        this.legL23.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body7.addChild(legL23);
        this.legL23.cubeList.add(new ModelBox(legL23, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL24 = new AdvancedModelRenderer(this);
        this.legL24.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Body7.addChild(legL24);
        this.legL24.cubeList.add(new ModelBox(legL24, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Body8 = new AdvancedModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 14, -0.5F, -0.52F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legR25 = new AdvancedModelRenderer(this);
        this.legR25.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body8.addChild(legR25);
        this.legR25.cubeList.add(new ModelBox(legR25, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR26 = new AdvancedModelRenderer(this);
        this.legR26.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body8.addChild(legR26);
        this.legR26.cubeList.add(new ModelBox(legR26, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR27 = new AdvancedModelRenderer(this);
        this.legR27.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body8.addChild(legR27);
        this.legR27.cubeList.add(new ModelBox(legR27, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR28 = new AdvancedModelRenderer(this);
        this.legR28.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Body8.addChild(legR28);
        this.legR28.cubeList.add(new ModelBox(legR28, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL25 = new AdvancedModelRenderer(this);
        this.legL25.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body8.addChild(legL25);
        this.legL25.cubeList.add(new ModelBox(legL25, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL26 = new AdvancedModelRenderer(this);
        this.legL26.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body8.addChild(legL26);
        this.legL26.cubeList.add(new ModelBox(legL26, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL27 = new AdvancedModelRenderer(this);
        this.legL27.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body8.addChild(legL27);
        this.legL27.cubeList.add(new ModelBox(legL27, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL28 = new AdvancedModelRenderer(this);
        this.legL28.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Body8.addChild(legL28);
        this.legL28.cubeList.add(new ModelBox(legL28, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Body9 = new AdvancedModelRenderer(this);
        this.Body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body8.addChild(Body9);
        this.Body9.cubeList.add(new ModelBox(Body9, 0, 14, -0.5F, -0.5F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body9.cubeList.add(new ModelBox(Body9, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR29 = new AdvancedModelRenderer(this);
        this.legR29.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body9.addChild(legR29);
        this.legR29.cubeList.add(new ModelBox(legR29, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR30 = new AdvancedModelRenderer(this);
        this.legR30.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body9.addChild(legR30);
        this.legR30.cubeList.add(new ModelBox(legR30, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR31 = new AdvancedModelRenderer(this);
        this.legR31.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body9.addChild(legR31);
        this.legR31.cubeList.add(new ModelBox(legR31, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR32 = new AdvancedModelRenderer(this);
        this.legR32.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Body9.addChild(legR32);
        this.legR32.cubeList.add(new ModelBox(legR32, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL29 = new AdvancedModelRenderer(this);
        this.legL29.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body9.addChild(legL29);
        this.legL29.cubeList.add(new ModelBox(legL29, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL30 = new AdvancedModelRenderer(this);
        this.legL30.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body9.addChild(legL30);
        this.legL30.cubeList.add(new ModelBox(legL30, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL31 = new AdvancedModelRenderer(this);
        this.legL31.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body9.addChild(legL31);
        this.legL31.cubeList.add(new ModelBox(legL31, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL32 = new AdvancedModelRenderer(this);
        this.legL32.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Body9.addChild(legL32);
        this.legL32.cubeList.add(new ModelBox(legL32, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Body10 = new AdvancedModelRenderer(this);
        this.Body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body9.addChild(Body10);
        this.Body10.cubeList.add(new ModelBox(Body10, 0, 14, -0.5F, -0.52F, 0.0F, 1, 0, 2, 0.0F, false));
        this.Body10.cubeList.add(new ModelBox(Body10, 0, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legR33 = new AdvancedModelRenderer(this);
        this.legR33.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.Body10.addChild(legR33);
        this.legR33.cubeList.add(new ModelBox(legR33, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR34 = new AdvancedModelRenderer(this);
        this.legR34.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Body10.addChild(legR34);
        this.legR34.cubeList.add(new ModelBox(legR34, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR35 = new AdvancedModelRenderer(this);
        this.legR35.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.Body10.addChild(legR35);
        this.legR35.cubeList.add(new ModelBox(legR35, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR36 = new AdvancedModelRenderer(this);
        this.legR36.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Body10.addChild(legR36);
        this.legR36.cubeList.add(new ModelBox(legR36, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL33 = new AdvancedModelRenderer(this);
        this.legL33.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.Body10.addChild(legL33);
        this.legL33.cubeList.add(new ModelBox(legL33, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL34 = new AdvancedModelRenderer(this);
        this.legL34.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Body10.addChild(legL34);
        this.legL34.cubeList.add(new ModelBox(legL34, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL35 = new AdvancedModelRenderer(this);
        this.legL35.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.Body10.addChild(legL35);
        this.legL35.cubeList.add(new ModelBox(legL35, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL36 = new AdvancedModelRenderer(this);
        this.legL36.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Body10.addChild(legL36);
        this.legL36.cubeList.add(new ModelBox(legL36, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Body11 = new AdvancedModelRenderer(this);
        this.Body11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body10.addChild(Body11);
        this.Body11.cubeList.add(new ModelBox(Body11, 8, 12, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.Body11.cubeList.add(new ModelBox(Body11, 0, 3, -3.25F, 0.0F, 2.5F, 3, 0, 2, 0.0F, false));
        this.Body11.cubeList.add(new ModelBox(Body11, 0, 3, 0.25F, 0.0F, 2.5F, 3, 0, 2, 0.0F, true));

        this.legR37 = new AdvancedModelRenderer(this);
        this.legR37.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.Body11.addChild(legR37);
        this.legR37.cubeList.add(new ModelBox(legR37, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR38 = new AdvancedModelRenderer(this);
        this.legR38.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.Body11.addChild(legR38);
        this.legR38.cubeList.add(new ModelBox(legR38, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR39 = new AdvancedModelRenderer(this);
        this.legR39.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.Body11.addChild(legR39);
        this.legR39.cubeList.add(new ModelBox(legR39, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR40 = new AdvancedModelRenderer(this);
        this.legR40.setRotationPoint(-0.5F, 0.0F, 2.0F);
        this.Body11.addChild(legR40);
        this.legR40.cubeList.add(new ModelBox(legR40, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legL37 = new AdvancedModelRenderer(this);
        this.legL37.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.Body11.addChild(legL37);
        this.legL37.cubeList.add(new ModelBox(legL37, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL38 = new AdvancedModelRenderer(this);
        this.legL38.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.Body11.addChild(legL38);
        this.legL38.cubeList.add(new ModelBox(legL38, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL39 = new AdvancedModelRenderer(this);
        this.legL39.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.Body11.addChild(legL39);
        this.legL39.cubeList.add(new ModelBox(legL39, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legL40 = new AdvancedModelRenderer(this);
        this.legL40.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.Body11.addChild(legL40);
        this.legL40.cubeList.add(new ModelBox(legL40, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.head.render(f5 * 0.25F);
        this.Body.render(f5 * 0.2F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.offsetX = -0.F;
        this.Body.offsetY = -0F;
        this.Body.offsetZ = 0.0F;
        this.Body.render(0.01F);
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
        this.Body.offsetY = 1.17F;
        //this.gill.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.gill.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5, this.Body6, this.Body7, this.Body8, this.Body9, this.Body10, this.Body11};
        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10,
                this.legL11, this.legL12, this.legL13, this.legL14, this.legL15, this.legL16, this.legL17, this.legL18, this.legL19, this.legL20,
                this.legL21, this.legL22, this.legL23, this.legL24, this.legL25, this.legL26, this.legL27, this.legL28, this.legL29, this.legL30,
                this.legL31, this.legL32, this.legL33, this.legL34, this.legL35, this.legL36, this.legL37, this.legL38, this.legL39, this.legL40};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10,
                this.legR11, this.legR12, this.legR13, this.legR14, this.legR15, this.legR16, this.legR17, this.legR18, this.legR19, this.legR20,
                this.legR21, this.legR22, this.legR23, this.legR24, this.legR25, this.legR26, this.legR27, this.legR28, this.legR29, this.legR30,
                this.legR31, this.legR32, this.legR33, this.legR34, this.legR35, this.legR36, this.legR37, this.legR38, this.legR39, this.legR40};
        AdvancedModelRenderer[] handL = {this.HeadlegL, this.HeadlegL2, this.HeadlegL3, this.HeadlegL4, this.HeadlegL5, this.HeadlegL6};
        AdvancedModelRenderer[] handR = {this.HeadlegR, this.HeadlegR2, this.HeadlegR3, this.HeadlegR4, this.HeadlegR5, this.HeadlegR6};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 0.7F);
            this.chainWave(handL, speed, 0.2F, -3, f2, 1);
            this.chainSwing(handL, speed, 0.05F, -3, f2, 0.7F);
            this.chainWave(handR, speed, 0.2F, -3, f2, 1);
            this.chainSwing(handR, speed, 0.05F, -3, f2, 0.7F);
            this.chainSwing(legsL, speed, 0.1F, -3, f2, 0.7F);
            this.chainSwing(legsR, speed, 0.1F, -3, f2, 0.7F);
            this.walk(AntennaL, speed, 0.5F, false, 0, -0.5F, f2, 0.3F);
            this.walk(AntennaR, speed, 0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(Body, speed, 0.4F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Body.rotateAngleZ = (float) Math.toRadians(90);
                this.Body.offsetY = 1.07F;
                this.bob(Body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
