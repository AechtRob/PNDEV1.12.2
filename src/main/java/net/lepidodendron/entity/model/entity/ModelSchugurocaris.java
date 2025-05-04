package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSchugurocaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeR2;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legRs2;
    private final AdvancedModelRenderer legRs;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legLs2;
    private final AdvancedModelRenderer legLs;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer seg;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer seg2;
    private final AdvancedModelRenderer legR13;
    private final AdvancedModelRenderer legL13;
    private final AdvancedModelRenderer seg3;
    private final AdvancedModelRenderer legR14;
    private final AdvancedModelRenderer legL14;
    private final AdvancedModelRenderer seg4;
    private final AdvancedModelRenderer seg5;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;

    public ModelSchugurocaris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 13.7586F, 2.2789F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 11.2414F, -2.2789F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 5, -1.5F, -12.5F, 5.25F, 3, 2, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 12, -2.0F, -12.5F, -4.75F, 4, 4, 10, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.1586F, -7.0289F);
        this.body.addChild(bone);
        this.setRotateAngle(bone, 0.1571F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, 0.05F, -1.75F, 6, 0, 13, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, 0.05F, -1.75F, 0, 9, 13, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, 3.0F, 0.05F, -1.75F, 0, 9, 13, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 0, -0.5F, 0.0F, -2.75F, 1, 0, 3, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, 1.2414F, -7.7789F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.2182F, 0.2618F, -0.0436F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 19, 0.0F, -2.5F, -6.0F, 0, 3, 6, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, 1.2414F, -7.7789F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.2182F, -0.2618F, 0.0436F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 3, 0.0F, -2.5F, -6.0F, 0, 3, 6, 0.0F, false));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.25F, 1.2414F, -7.7789F);
        this.body.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.3927F, 0.0873F, 0.0436F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 0, 16, 0.0F, -2.5F, -6.0F, 0, 3, 6, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(0.25F, 1.2414F, -7.7789F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.3927F, -0.0873F, -0.0436F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 0, 0.0F, -2.5F, -6.0F, 0, 3, 6, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-0.75F, 1.2414F, -7.7039F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.5236F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 37, 36, -0.75F, -0.5F, -2.25F, 1, 1, 2, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 25, 0, -0.975F, -0.575F, -2.75F, 1, 1, 1, 0.0F, false));

        this.eyeR2 = new AdvancedModelRenderer(this);
        this.eyeR2.setRotationPoint(0.75F, 1.2414F, -7.7039F);
        this.body.addChild(eyeR2);
        this.setRotateAngle(eyeR2, 0.0F, -0.5236F, 0.0F);
        this.eyeR2.cubeList.add(new ModelBox(eyeR2, 37, 36, -0.25F, -0.5F, -2.25F, 1, 1, 2, 0.0F, true));
        this.eyeR2.cubeList.add(new ModelBox(eyeR2, 25, 0, -0.025F, -0.575F, -2.75F, 1, 1, 1, 0.0F, true));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(0.75F, 1.2414F, -7.7039F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.5236F, 0.0F);


        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.25F, 2.7414F, -6.7789F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.48F, 0.0F, 0.2182F);
        this.legR.cubeList.add(new ModelBox(legR, 37, 30, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legRs2 = new AdvancedModelRenderer(this);
        this.legRs2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.legR.addChild(legRs2);
        this.setRotateAngle(legRs2, 0.8727F, -0.0873F, 0.0F);
        this.legRs2.cubeList.add(new ModelBox(legRs2, 6, 26, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, false));

        this.legRs = new AdvancedModelRenderer(this);
        this.legRs.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.legR.addChild(legRs);
        this.setRotateAngle(legRs, 1.309F, 0.0F, 0.0F);
        this.legRs.cubeList.add(new ModelBox(legRs, 0, 25, 0.0F, 0.0F, 0.0F, 0, 7, 3, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.25F, 2.7414F, -6.7789F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.48F, 0.0F, -0.2182F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legLs2 = new AdvancedModelRenderer(this);
        this.legLs2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.legL.addChild(legLs2);
        this.setRotateAngle(legLs2, 0.8727F, 0.0873F, 0.0F);
        this.legLs2.cubeList.add(new ModelBox(legLs2, 25, 23, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, false));

        this.legLs = new AdvancedModelRenderer(this);
        this.legLs.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.legL.addChild(legLs);
        this.setRotateAngle(legLs, 1.309F, 0.0F, 0.0F);
        this.legLs.cubeList.add(new ModelBox(legLs, 19, 23, 0.0F, 0.0F, 0.0F, 0, 7, 3, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, 2.2414F, -6.0289F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.1745F, -0.2618F, 0.3491F);
        this.legR2.cubeList.add(new ModelBox(legR2, 31, 28, 0.0F, 0.75F, -0.5F, 0, 5, 3, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, 2.2414F, -6.0289F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.1745F, 0.2618F, -0.3491F);
        this.legL2.cubeList.add(new ModelBox(legL2, 18, 30, 0.0F, 0.75F, -0.5F, 0, 5, 3, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.25F, 2.2414F, -5.0289F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.1745F, -0.2618F, 0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 31, 23, 0.0F, 0.25F, -0.5F, 0, 5, 3, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, 2.2414F, -5.0289F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.1745F, 0.2618F, -0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 25, 29, 0.0F, 0.25F, -0.5F, 0, 5, 3, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.25F, 2.2414F, -4.0289F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.1745F, -0.2618F, 0.3491F);
        this.legR4.cubeList.add(new ModelBox(legR4, 12, 31, 0.0F, 0.0F, -0.5F, 0, 5, 3, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.25F, 2.2414F, -4.0289F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.1745F, 0.2618F, -0.3491F);
        this.legL4.cubeList.add(new ModelBox(legL4, 12, 26, 0.0F, 0.0F, -0.5F, 0, 5, 3, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.25F, 2.2414F, -3.0289F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.1745F, -0.2618F, 0.3491F);
        this.legR5.cubeList.add(new ModelBox(legR5, 34, 15, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, 2.2414F, -3.0289F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.1745F, 0.2618F, -0.3491F);
        this.legL5.cubeList.add(new ModelBox(legL5, 31, 33, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.25F, 2.2414F, -2.0289F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.1745F, -0.2618F, 0.3491F);
        this.legR6.cubeList.add(new ModelBox(legR6, 34, 11, 0.0F, -0.25F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.25F, 2.2414F, -2.0289F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.1745F, 0.2618F, -0.3491F);
        this.legL6.cubeList.add(new ModelBox(legL6, 6, 32, 0.0F, -0.25F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.25F, 2.2414F, -1.0289F);
        this.body.addChild(legR7);
        this.setRotateAngle(legR7, 0.1745F, -0.2618F, 0.3491F);
        this.legR7.cubeList.add(new ModelBox(legR7, 34, 7, 0.0F, -1.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.25F, 2.2414F, -1.0289F);
        this.body.addChild(legL7);
        this.setRotateAngle(legL7, 0.1745F, 0.2618F, -0.3491F);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 32, 0.0F, -1.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.25F, 2.2414F, -0.0289F);
        this.body.addChild(legR8);
        this.setRotateAngle(legR8, 0.4363F, -0.2618F, 0.3491F);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 37, 0.0F, -0.25F, -0.5F, 0, 3, 2, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.25F, 2.2414F, -0.0289F);
        this.body.addChild(legL8);
        this.setRotateAngle(legL8, 0.4363F, 0.2618F, -0.3491F);
        this.legL8.cubeList.add(new ModelBox(legL8, 25, 3, 0.0F, -0.25F, -0.5F, 0, 3, 2, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.25F, 2.1414F, 1.2211F);
        this.body.addChild(legR9);
        this.setRotateAngle(legR9, 0.4363F, -0.2618F, 0.3491F);
        this.legR9.cubeList.add(new ModelBox(legR9, 18, 36, 0.0F, -1.0F, -0.5F, 0, 3, 2, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.25F, 2.1414F, 1.2211F);
        this.body.addChild(legL9);
        this.setRotateAngle(legL9, 0.4363F, 0.2618F, -0.3491F);
        this.legL9.cubeList.add(new ModelBox(legL9, 8, 1, 0.0F, -1.0F, -0.5F, 0, 3, 2, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.25F, 0.2414F, 1.9711F);
        this.body.addChild(legR10);
        this.setRotateAngle(legR10, 0.2618F, -0.1745F, 0.5236F);
        this.legR10.cubeList.add(new ModelBox(legR10, 12, 37, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.25F, 0.2414F, 1.9711F);
        this.body.addChild(legL10);
        this.setRotateAngle(legL10, 0.2618F, 0.1745F, -0.5236F);
        this.legL10.cubeList.add(new ModelBox(legL10, 4, 37, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.25F, 0.2414F, 2.9711F);
        this.body.addChild(legR11);
        this.setRotateAngle(legR11, 0.2618F, -0.1745F, 0.5236F);
        this.legR11.cubeList.add(new ModelBox(legR11, 8, 37, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.25F, 0.2414F, 2.9711F);
        this.body.addChild(legL11);
        this.setRotateAngle(legL11, 0.2618F, 0.1745F, -0.5236F);
        this.legL11.cubeList.add(new ModelBox(legL11, 29, 8, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.seg = new AdvancedModelRenderer(this);
        this.seg.setRotationPoint(0.0F, -1.2586F, 3.7211F);
        this.body.addChild(seg);
        this.setRotateAngle(seg, -0.0436F, 0.0F, 0.0F);
        this.seg.cubeList.add(new ModelBox(seg, 37, 26, -1.0F, -0.5F, 0.0F, 2, 2, 2, 0.01F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.25F, 1.5F, 0.5F);
        this.seg.addChild(legR12);
        this.setRotateAngle(legR12, 0.2618F, -0.1745F, 0.5236F);
        this.legR12.cubeList.add(new ModelBox(legR12, 39, 2, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.25F, 1.5F, 0.5F);
        this.seg.addChild(legL12);
        this.setRotateAngle(legL12, 0.2618F, 0.1745F, -0.5236F);
        this.legL12.cubeList.add(new ModelBox(legL12, 25, 8, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.seg2 = new AdvancedModelRenderer(this);
        this.seg2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.seg.addChild(seg2);
        this.setRotateAngle(seg2, -0.0873F, 0.0F, 0.0F);
        this.seg2.cubeList.add(new ModelBox(seg2, 22, 37, -1.0F, -0.5F, 0.0F, 2, 2, 2, 0.0F, false));

        this.legR13 = new AdvancedModelRenderer(this);
        this.legR13.setRotationPoint(-0.25F, 1.5F, 0.5F);
        this.seg2.addChild(legR13);
        this.setRotateAngle(legR13, 0.2618F, -0.1745F, 0.5236F);
        this.legR13.cubeList.add(new ModelBox(legR13, 30, 38, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL13 = new AdvancedModelRenderer(this);
        this.legL13.setRotationPoint(0.25F, 1.5F, 0.5F);
        this.seg2.addChild(legL13);
        this.setRotateAngle(legL13, 0.2618F, 0.1745F, -0.5236F);
        this.legL13.cubeList.add(new ModelBox(legL13, 25, 0, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.seg3 = new AdvancedModelRenderer(this);
        this.seg3.setRotationPoint(0.0F, 0.0F, 1.475F);
        this.seg2.addChild(seg3);
        this.setRotateAngle(seg3, -0.0873F, 0.0F, 0.0F);
        this.seg3.cubeList.add(new ModelBox(seg3, 33, 0, -1.0F, -0.5F, 0.0F, 2, 2, 2, -0.01F, false));

        this.legR14 = new AdvancedModelRenderer(this);
        this.legR14.setRotationPoint(-0.25F, 1.5F, 0.525F);
        this.seg3.addChild(legR14);
        this.setRotateAngle(legR14, 0.2618F, -0.1745F, 0.5236F);
        this.legR14.cubeList.add(new ModelBox(legR14, 37, 37, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL14 = new AdvancedModelRenderer(this);
        this.legL14.setRotationPoint(0.25F, 1.5F, 0.525F);
        this.seg3.addChild(legL14);
        this.setRotateAngle(legL14, 0.2618F, 0.1745F, -0.5236F);
        this.legL14.cubeList.add(new ModelBox(legL14, 14, 24, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.seg4 = new AdvancedModelRenderer(this);
        this.seg4.setRotationPoint(0.0F, 0.0F, 1.975F);
        this.seg3.addChild(seg4);
        this.setRotateAngle(seg4, -0.2182F, 0.0F, 0.0F);
        this.seg4.cubeList.add(new ModelBox(seg4, 25, 0, -1.0F, 0.0F, 0.0F, 2, 1, 4, -0.02F, false));

        this.seg5 = new AdvancedModelRenderer(this);
        this.seg5.setRotationPoint(0.0F, 0.0F, 3.975F);
        this.seg4.addChild(seg5);
        this.setRotateAngle(seg5, -0.1745F, 0.0F, 0.0F);
        this.seg5.cubeList.add(new ModelBox(seg5, 7, 23, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
        this.seg5.cubeList.add(new ModelBox(seg5, 0, 0, -0.5F, 0.5F, 5.0F, 1, 0, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.seg5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.3491F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 5, -1.0F, -0.45F, -0.25F, 1, 1, 4, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, 0.0F, 3.75F, 1, 0, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.seg5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.4363F, -0.3491F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 5, 0.0F, -0.45F, -0.25F, 1, 1, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, 0.0F, 3.75F, 1, 0, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 );
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.32F;
        this.body.offsetZ = -0.02F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.2F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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

        AdvancedModelRenderer[] Tail = {this.seg, this.seg2, this.seg3, this.seg4, this.seg5};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(antennaL, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaR, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(antennaL, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaR, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            this.walk(antennaL2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);

            this.walk(antennaR2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);

            float tailVdegree = 0.12F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.5F, tailVdegree, 2, f2, 1);


            float speedLeg = 1.1F;
            float degreeLeg = 0.25F;
            this.flap(legL, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legR, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(legL4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(legR4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(legL5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(legR5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(legL6, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(legR6, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(legL7, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(legR7, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(legL8, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(legR8, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(legL9, speedLeg, -degreeLeg, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(legR9, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(legL10, speedLeg, -degreeLeg, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(legR10, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
            this.flap(legL11, speedLeg, -degreeLeg, false, 5.0F, -0.5F, f2, 0.7F);
            this.flap(legR11, speedLeg, degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
            this.flap(legL12, speedLeg, -degreeLeg, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(legR12, speedLeg, degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);
            this.flap(legL13, speedLeg, -degreeLeg, false, 6F, -0.5F, f2, 0.7F);
            this.flap(legR13, speedLeg, degreeLeg, false, 6F, 0.5F, f2, 0.7F);
            this.flap(legL14, speedLeg, -degreeLeg, false, 6.5F, -0.5F, f2, 0.7F);
            this.flap(legR14, speedLeg, degreeLeg, false, 6.5F, 0.5F, f2, 0.7F);
            if (!e.isInWater()) {
                this.body.offsetY = 0.4F;
                this.body.rotateAngleZ = (float) Math.toRadians(90);
            }


                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.3F, false, f2, 2);

                }
                else
                {
                    this.bob(body, -speed, 1F, false, f2, 2);
                }

        }
    }
}
