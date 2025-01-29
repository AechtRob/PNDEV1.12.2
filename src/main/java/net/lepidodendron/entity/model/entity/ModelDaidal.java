package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraEurypteridBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDaidal extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer antennaR1;
    private final AdvancedModelRenderer antennaL1;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer pleopodR;
    private final AdvancedModelRenderer pleopodL;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pleopodR2;
    private final AdvancedModelRenderer pleopodL2;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer pleopodR3;
    private final AdvancedModelRenderer pleopodL3;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer pleopodR4;
    private final AdvancedModelRenderer pleopodL4;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer pleopodR5;
    private final AdvancedModelRenderer pleopodL5;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer talson;
    private final AdvancedModelRenderer talson2;
    private final AdvancedModelRenderer talson4;
    private final AdvancedModelRenderer talson3;
    private final AdvancedModelRenderer talson5;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer armR4;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer armL4;

    public ModelDaidal() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 20.55F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -6.35F, -7.75F, 5, 5, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -1.5F, -6.0F, -5.75F, 3, 3, 5, 0.0F, false));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.5F, -3.75F, -6.1F);
        this.bone.addChild(antennaR2);
        this.setRotateAngle(antennaR2, -0.0873F, 0.1745F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 0, 4, 0.0F, -2.5F, -7.0F, 0, 5, 8, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(0.5F, -3.75F, -6.1F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, -0.0873F, -0.1745F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 4, 0.0F, -2.5F, -7.0F, 0, 5, 8, 0.0F, true));

        this.antennaR1 = new AdvancedModelRenderer(this);
        this.antennaR1.setRotationPoint(-0.5F, -3.65F, -6.0F);
        this.bone.addChild(antennaR1);
        this.setRotateAngle(antennaR1, 0.1309F, 0.3927F, 0.5672F);
        this.antennaR1.cubeList.add(new ModelBox(antennaR1, 0, 19, 0.0F, -0.25F, -5.75F, 0, 4, 6, 0.0F, false));

        this.antennaL1 = new AdvancedModelRenderer(this);
        this.antennaL1.setRotationPoint(0.5F, -3.65F, -6.0F);
        this.bone.addChild(antennaL1);
        this.setRotateAngle(antennaL1, 0.1309F, -0.3927F, -0.5672F);
        this.antennaL1.cubeList.add(new ModelBox(antennaL1, 0, 19, 0.0F, -0.25F, -5.75F, 0, 4, 6, 0.0F, true));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-0.5F, -4.0F, -5.5F);
        this.bone.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.2182F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 0, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(0.5F, -4.0F, -5.5F);
        this.bone.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.2182F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 0, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -6.15F, -1.5F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, 0.0873F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 36, 6, -2.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, 3.75F, 0.25F);
        this.body1.addChild(legR);
        this.setRotateAngle(legR, -0.3491F, 0.0F, 0.4363F);
        this.legR.cubeList.add(new ModelBox(legR, 22, 35, -0.05F, -0.25F, -0.5F, 0, 3, 3, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, 3.75F, 0.25F);
        this.body1.addChild(legL);
        this.setRotateAngle(legL, -0.3491F, 0.0F, -0.4363F);
        this.legL.cubeList.add(new ModelBox(legL, 22, 35, 0.05F, -0.25F, -0.5F, 0, 3, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.25F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 34, 31, -2.0F, 0.0F, 0.0F, 4, 5, 2, 0.02F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, 4.0F, 0.0F);
        this.body2.addChild(legR2);
        this.setRotateAngle(legR2, -0.1309F, 0.0F, 0.4363F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 26, -0.05F, 0.0F, -0.5F, 0, 3, 3, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, 4.0F, 0.0F);
        this.body2.addChild(legL2);
        this.setRotateAngle(legL2, -0.1309F, 0.0F, -0.4363F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 26, 0.05F, 0.0F, -0.5F, 0, 3, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 32, -2.0F, 0.0F, 0.0F, 4, 5, 2, 0.015F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, 4.75F, 0.0F);
        this.body3.addChild(legR3);
        this.setRotateAngle(legR3, 0.0873F, 0.0F, 0.4363F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -0.05F, 0.0F, -0.5F, 0, 3, 3, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, 4.75F, 0.0F);
        this.body3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0873F, 0.0F, -0.4363F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 0, 0.05F, 0.0F, -0.5F, 0, 3, 3, 0.0F, true));

        this.pleopodR = new AdvancedModelRenderer(this);
        this.pleopodR.setRotationPoint(-1.0F, 5.0F, 1.5F);
        this.body3.addChild(pleopodR);
        this.setRotateAngle(pleopodR, 0.4363F, 0.4363F, 0.1745F);
        this.pleopodR.cubeList.add(new ModelBox(pleopodR, 33, 8, -0.7074F, -1.2348F, -0.0734F, 1, 4, 0, 0.0F, false));

        this.pleopodL = new AdvancedModelRenderer(this);
        this.pleopodL.setRotationPoint(1.0F, 5.0F, 1.5F);
        this.body3.addChild(pleopodL);
        this.setRotateAngle(pleopodL, 0.4363F, -0.4363F, -0.1745F);
        this.pleopodL.cubeList.add(new ModelBox(pleopodL, 33, 8, -0.2926F, -1.2348F, -0.0734F, 1, 4, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.25F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0436F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 24, 0, -2.0F, 0.0F, 0.0F, 4, 5, 3, 0.01F, false));

        this.pleopodR2 = new AdvancedModelRenderer(this);
        this.pleopodR2.setRotationPoint(-1.0F, 5.0F, 2.5F);
        this.body4.addChild(pleopodR2);
        this.setRotateAngle(pleopodR2, 0.4363F, 0.4363F, 0.1745F);
        this.pleopodR2.cubeList.add(new ModelBox(pleopodR2, 13, 17, -0.7074F, -1.2348F, -0.0734F, 1, 4, 0, 0.0F, false));

        this.pleopodL2 = new AdvancedModelRenderer(this);
        this.pleopodL2.setRotationPoint(1.0F, 5.0F, 2.5F);
        this.body4.addChild(pleopodL2);
        this.setRotateAngle(pleopodL2, 0.4363F, -0.4363F, -0.1745F);
        this.pleopodL2.cubeList.add(new ModelBox(pleopodL2, 13, 17, -0.2926F, -1.2348F, -0.0734F, 1, 4, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 22, 9, -2.0F, 0.0F, 0.0F, 4, 5, 3, 0.005F, false));

        this.pleopodR3 = new AdvancedModelRenderer(this);
        this.pleopodR3.setRotationPoint(-1.0F, 5.0F, 1.75F);
        this.body5.addChild(pleopodR3);
        this.setRotateAngle(pleopodR3, 0.4363F, 0.4363F, 0.1745F);
        this.pleopodR3.cubeList.add(new ModelBox(pleopodR3, 11, 17, -0.7074F, -1.2348F, -0.0734F, 1, 4, 0, 0.0F, false));

        this.pleopodL3 = new AdvancedModelRenderer(this);
        this.pleopodL3.setRotationPoint(1.0F, 5.0F, 1.75F);
        this.body5.addChild(pleopodL3);
        this.setRotateAngle(pleopodL3, 0.4363F, -0.4363F, -0.1745F);
        this.pleopodL3.cubeList.add(new ModelBox(pleopodL3, 11, 17, -0.2926F, -1.2348F, -0.0734F, 1, 4, 0, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.1309F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 22, 31, -2.0F, 0.0F, 0.0F, 4, 5, 2, 0.0F, false));

        this.pleopodR4 = new AdvancedModelRenderer(this);
        this.pleopodR4.setRotationPoint(-1.0F, 5.0F, 1.25F);
        this.body6.addChild(pleopodR4);
        this.setRotateAngle(pleopodR4, 0.4363F, 0.4363F, 0.1745F);
        this.pleopodR4.cubeList.add(new ModelBox(pleopodR4, 2, 17, -0.7074F, -1.2348F, -0.0734F, 1, 4, 0, 0.0F, false));

        this.pleopodL4 = new AdvancedModelRenderer(this);
        this.pleopodL4.setRotationPoint(1.0F, 5.0F, 1.25F);
        this.body6.addChild(pleopodL4);
        this.setRotateAngle(pleopodL4, 0.4363F, -0.4363F, -0.1745F);
        this.pleopodL4.cubeList.add(new ModelBox(pleopodL4, 2, 17, -0.2926F, -1.2348F, -0.0734F, 1, 4, 0, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, -0.0873F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 10, 27, -2.0F, 0.0F, 0.0F, 4, 5, 2, -0.005F, false));

        this.pleopodR5 = new AdvancedModelRenderer(this);
        this.pleopodR5.setRotationPoint(-1.0F, 5.0F, 1.5F);
        this.body7.addChild(pleopodR5);
        this.setRotateAngle(pleopodR5, 0.4363F, 0.3927F, 0.1745F);
        this.pleopodR5.cubeList.add(new ModelBox(pleopodR5, 0, 17, -0.7104F, -1.2348F, -0.0665F, 1, 4, 0, 0.0F, false));

        this.pleopodL5 = new AdvancedModelRenderer(this);
        this.pleopodL5.setRotationPoint(1.0F, 5.0F, 1.5F);
        this.body7.addChild(pleopodL5);
        this.setRotateAngle(pleopodL5, 0.4363F, -0.3927F, -0.1745F);
        this.pleopodL5.cubeList.add(new ModelBox(pleopodL5, 0, 17, -0.2896F, -1.2348F, -0.0665F, 1, 4, 0, 0.0F, true));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body9);
        this.setRotateAngle(body9, -0.1309F, 0.0F, 0.0F);
        this.body9.cubeList.add(new ModelBox(body9, 23, 24, -2.0F, 0.0F, 0.0F, 4, 4, 3, -0.02F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body9.addChild(body10);
        this.setRotateAngle(body10, -0.0873F, 0.0F, 0.0F);


        this.talson = new AdvancedModelRenderer(this);
        this.talson.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body10.addChild(talson);
        this.setRotateAngle(talson, -0.0873F, 0.0F, 0.0F);
        this.talson.cubeList.add(new ModelBox(talson, 35, 21, -0.5F, -0.25F, 3.75F, 1, 1, 3, 0.0F, false));
        this.talson.cubeList.add(new ModelBox(talson, 12, 34, -1.0F, -0.25F, 0.75F, 2, 2, 3, 0.0F, false));

        this.talson2 = new AdvancedModelRenderer(this);
        this.talson2.setRotationPoint(0.0F, 1.85F, 1.0F);
        this.body10.addChild(talson2);
        this.setRotateAngle(talson2, -0.3491F, -0.3491F, 0.0F);
        this.talson2.cubeList.add(new ModelBox(talson2, 9, 12, -2.3F, 0.0F, 0.5F, 3, 0, 7, 0.0F, false));

        this.talson4 = new AdvancedModelRenderer(this);
        this.talson4.setRotationPoint(0.0F, 1.85F, 1.0F);
        this.body10.addChild(talson4);
        this.setRotateAngle(talson4, -0.3491F, 0.3491F, 0.0F);
        this.talson4.cubeList.add(new ModelBox(talson4, 9, 12, -0.7F, 0.0F, 0.5F, 3, 0, 7, 0.0F, true));

        this.talson3 = new AdvancedModelRenderer(this);
        this.talson3.setRotationPoint(0.0F, 1.7F, 1.0F);
        this.body10.addChild(talson3);
        this.setRotateAngle(talson3, -0.48F, -0.7418F, 0.0F);
        this.talson3.cubeList.add(new ModelBox(talson3, 10, 0, -2.55F, 0.0F, 0.5F, 3, 0, 7, 0.0F, false));

        this.talson5 = new AdvancedModelRenderer(this);
        this.talson5.setRotationPoint(0.0F, 1.7F, 1.0F);
        this.body10.addChild(talson5);
        this.setRotateAngle(talson5, -0.48F, 0.7418F, 0.0F);
        this.talson5.cubeList.add(new ModelBox(talson5, 10, 0, -0.45F, 0.0F, 0.5F, 3, 0, 7, 0.0F, true));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-1.25F, -2.75F, -4.0F);
        this.bone.addChild(armR);
        this.setRotateAngle(armR, -0.4363F, -0.2182F, 1.0472F);
        this.armR.cubeList.add(new ModelBox(armR, 16, 14, 0.0F, -0.5F, -3.5F, 0, 8, 5, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-1.25F, -2.75F, -3.25F);
        this.bone.addChild(armR2);
        this.setRotateAngle(armR2, -0.1745F, -0.2182F, 0.8727F);
        this.armR2.cubeList.add(new ModelBox(armR2, 16, 14, 0.0F, -0.5F, -3.5F, 0, 8, 5, 0.0F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(-1.25F, -2.75F, -2.5F);
        this.bone.addChild(armR3);
        this.setRotateAngle(armR3, 0.1745F, -0.2182F, 0.6981F);
        this.armR3.cubeList.add(new ModelBox(armR3, 16, 14, 0.0F, -0.5F, -3.5F, 0, 8, 5, 0.0F, false));

        this.armR4 = new AdvancedModelRenderer(this);
        this.armR4.setRotationPoint(-1.25F, -2.75F, -1.75F);
        this.bone.addChild(armR4);
        this.setRotateAngle(armR4, 0.5236F, -0.2182F, 0.5236F);
        this.armR4.cubeList.add(new ModelBox(armR4, 16, 14, 0.0F, -0.5F, -3.5F, 0, 8, 5, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(1.25F, -2.75F, -4.0F);
        this.bone.addChild(armL);
        this.setRotateAngle(armL, -0.4363F, 0.2182F, -1.0472F);
        this.armL.cubeList.add(new ModelBox(armL, 16, 14, 0.0F, -0.5F, -3.5F, 0, 8, 5, 0.0F, true));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(1.25F, -2.75F, -3.25F);
        this.bone.addChild(armL2);
        this.setRotateAngle(armL2, -0.1745F, 0.2182F, -0.8727F);
        this.armL2.cubeList.add(new ModelBox(armL2, 16, 14, 0.0F, -0.5F, -3.5F, 0, 8, 5, 0.0F, true));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(1.25F, -2.75F, -2.5F);
        this.bone.addChild(armL3);
        this.setRotateAngle(armL3, 0.1745F, 0.2182F, -0.6981F);
        this.armL3.cubeList.add(new ModelBox(armL3, 16, 14, 0.0F, -0.5F, -3.5F, 0, 8, 5, 0.0F, true));

        this.armL4 = new AdvancedModelRenderer(this);
        this.armL4.setRotationPoint(1.25F, -2.75F, -1.75F);
        this.bone.addChild(armL4);
        this.setRotateAngle(armL4, 0.5236F, 0.2182F, -0.5236F);
        this.armL4.cubeList.add(new ModelBox(armL4, 16, 14, 0.0F, -0.5F, -3.5F, 0, 8, 5, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(bone, -0.1F, 0.0F, 0.05F);
        this.setRotateAngle(body1, 0.05F, 0.05F, 0.05F);
        this.setRotateAngle(body2, 0.05F, 0.05F, 0.05F);
        this.setRotateAngle(body3, 0.05F, 0.05F, 0.05F);
        this.setRotateAngle(body4, 0.05F, -0.05F, 0.02F);
        this.setRotateAngle(body5, 0.05F, -0.05F, 0.02F);
        this.setRotateAngle(body6, -0.05F, -0.1F, 0.02F);
        this.setRotateAngle(body7, -0.05F, -0.1F, 0.02F);
        this.setRotateAngle(body9, -0.05F, -0.15F, 0.02F);
        this.setRotateAngle(body10, -0.05F, -0.15F, 0.02F);
        this.bone.offsetZ = -0.04F;
        this.bone.offsetY = -0.12F;
        this.bone.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = -2.0F;
        this.bone.offsetX = -1.338F;
        this.bone.rotateAngleY = (float)Math.toRadians(200);
        this.bone.rotateAngleX = (float)Math.toRadians(8);
        this.bone.rotateAngleZ = (float)Math.toRadians(-8);
        this.bone.scaleChildren = true;
        float scaler = 1.63F;
        this.bone.setScale(scaler, scaler, scaler);

        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
        resetToDefaultPose();

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
        this.bone.offsetY = 0F;

        AdvancedModelRenderer[] Tail = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body9, this.body10, this.talson};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        EntityPrehistoricFloraEurypteridBase ee = (EntityPrehistoricFloraEurypteridBase) e;

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(antennaL1, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaR1, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(antennaL1, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaR1, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            this.walk(antennaL2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);

            this.walk(antennaR2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);

            float tailVdegree = 0.01F;
            float tailHdegree = 0.3F;

            float bob = 1F;
            float speedLeg = 1.5F;
            float speedArm = 0.35F;
            float degreeLeg = 0.4F;
            float degreeArm = 0.3F;
            if (ee.isAtBottom()) {
                speedLeg = 0.8F;
                speedArm = 0.3F;
                bob = 0.1F;
            }
            if(ee.isInWater()) {
                this.chainWave(Tail, speed, tailVdegree, -3, f2, 1);

                this.flap(armL, speedArm, -degreeArm, false, 0, -0F, f2, 0.7F);
                this.flap(armR, speedArm, -degreeArm, false, 0, 0F, f2, 0.7F);
                this.flap(armL2, speedArm, -degreeArm, false, 0, -0F, f2, 0.7F);
                this.flap(armR2, speedArm, -degreeArm, false, 0, 0F, f2, 0.7F);
                this.flap(armL3, speedArm, -degreeArm, false, 0, -0F, f2, 0.7F);
                this.flap(armR3, speedArm, -degreeArm, false, 0, 0F, f2, 0.7F);
                this.flap(armL4, speedArm, -degreeArm, false, 0, -0F, f2, 0.7F);
                this.flap(armR4, speedArm, -degreeArm, false, 0, 0F, f2, 0.7F);

                this.flap(legL, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
                this.flap(legR, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
                this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
                this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
                this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
                this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
                this.flap(pleopodL, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
                this.flap(pleopodR, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.flap(pleopodL2, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
                this.flap(pleopodR2, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
                this.flap(pleopodL3, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
                this.flap(pleopodR3, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
                this.flap(pleopodL4, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
                this.flap(pleopodR4, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
                this.flap(pleopodL5, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
                this.flap(pleopodR5, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);

                this.walk(armL, speedArm, -degreeArm, false, 0, -0F, f2, 0.7F);
                this.walk(armR, speedArm, -degreeArm, false, 0, 0F, f2, 0.7F);
                this.walk(armL2, speedArm, -degreeArm, false, 0, -0F, f2, 0.7F);
                this.walk(armR2, speedArm, -degreeArm, false, 0, 0.F, f2, 0.7F);
                this.walk(armL3, speedArm, -degreeArm, false, 0, -0F, f2, 0.7F);
                this.walk(armR3, speedArm, -degreeArm, false, 0, 0F, f2, 0.7F);
                this.walk(armL4, speedArm, -degreeArm, false, 0, -0F, f2, 0.7F);
                this.walk(armR4, speedArm, -degreeArm, false, 0, 0F, f2, 0.7F);

                this.walk(legL, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
                this.walk(legR, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
                this.walk(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
                this.walk(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
                this.walk(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
                this.walk(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodL, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
                this.walk(pleopodR, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodL2, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
                this.walk(pleopodR2, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodL3, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
                this.walk(pleopodR3, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodL4, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
                this.walk(pleopodR4, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodL5, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
                this.walk(pleopodR5, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
                this.walk(talson2, speedLeg*0.4F, degreeLeg, false, 0, -0.5F, f2, 0.7F);
                this.walk(talson3, speedLeg*0.4F, degreeLeg*0.4F, false, 0, 0.5F, f2, 0.7F);
                this.walk(talson4, speedLeg*0.4F, degreeLeg*0.4F, false, 0, -0.5F, f2, 0.7F);
                this.walk(talson5, speedLeg*0.4F, degreeLeg*0.4F, false, 0, 0.5F, f2, 0.7F);
            }

            if (!e.isInWater()) {
                this.bone.offsetY = 0F;
                this.bone.rotateAngleZ = (float)Math.toRadians(90);
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(bone, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(bone, -speed, bob, false, f2, 2);
                }
            }
        }
    }
}
