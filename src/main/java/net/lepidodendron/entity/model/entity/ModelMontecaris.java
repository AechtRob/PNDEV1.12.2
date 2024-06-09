package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMontecaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legRs2;
    private final AdvancedModelRenderer legRs;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legLs;
    private final AdvancedModelRenderer legLs2;
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
    private final AdvancedModelRenderer seg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer seg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer seg3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer seg4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer seg5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;

    public ModelMontecaris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 33, 52, 3.5F, -6.75F, -4.5F, 1, 0, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 33, 52, -4.5F, -6.75F, -4.5F, 1, 0, 12, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -12.5F, -1.5F, 7, 9, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -12.5F, -1.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 13, -3.0F, 0.0F, -6.0F, 7, 9, 6, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -2.5F, -12.5F, -4.75F, 5, 4, 12, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, -9.0F, -5.5F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.2182F, 0.2618F, -0.0436F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 0, 0.0F, -2.5F, -5.0F, 0, 3, 5, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, -9.0F, -5.5F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.2182F, -0.2618F, 0.0436F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 0, 0.0F, -2.5F, -5.0F, 0, 3, 5, 0.0F, true));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.25F, -9.0F, -5.5F);
        this.body.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.3927F, 0.0873F, 0.0436F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 0, 0, 0.0F, -2.5F, -5.0F, 0, 3, 5, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(0.25F, -9.0F, -5.5F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.3927F, -0.0873F, 0.0436F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 0, 0.0F, -2.5F, -5.0F, 0, 3, 5, 0.0F, true));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-0.75F, -9.0F, -5.5F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.2182F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 28, -0.75F, -0.5F, -2.25F, 1, 1, 2, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(0.75F, -9.0F, -5.5F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.2182F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 28, -0.25F, -0.5F, -2.25F, 1, 1, 2, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.25F, -7.5F, -4.5F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.48F, 0.0F, 0.2182F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 19, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.legRs2 = new AdvancedModelRenderer(this);
        this.legRs2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.legR.addChild(legRs2);
        this.setRotateAngle(legRs2, 0.8727F, -0.0873F, 0.0F);
        this.legRs2.cubeList.add(new ModelBox(legRs2, 0, 32, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, false));

        this.legRs = new AdvancedModelRenderer(this);
        this.legRs.setRotationPoint(0.0F, 6.0F, -0.5F);
        this.legR.addChild(legRs);
        this.setRotateAngle(legRs, 1.309F, 0.0F, 0.0F);
        this.legRs.cubeList.add(new ModelBox(legRs, 22, 16, 0.0F, 0.0F, 0.0F, 0, 7, 3, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.25F, -7.5F, -4.5F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.48F, 0.0F, -0.2182F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 19, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

        this.legLs = new AdvancedModelRenderer(this);
        this.legLs.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.legL.addChild(legLs);
        this.setRotateAngle(legLs, 0.8727F, 0.0873F, 0.0F);
        this.legLs.cubeList.add(new ModelBox(legLs, 0, 32, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, true));

        this.legLs2 = new AdvancedModelRenderer(this);
        this.legLs2.setRotationPoint(0.0F, 6.0F, -0.5F);
        this.legL.addChild(legLs2);
        this.setRotateAngle(legLs2, 1.309F, 0.0F, 0.0F);
        this.legLs2.cubeList.add(new ModelBox(legLs2, 22, 16, 0.0F, 0.0F, 0.0F, 0, 7, 3, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, -8.0F, -3.0F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.1745F, -0.2618F, 0.3491F);
        this.legR2.cubeList.add(new ModelBox(legR2, 22, 23, 0.0F, 0.75F, -0.5F, 0, 5, 3, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, -8.0F, -3.0F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.1745F, 0.2618F, -0.3491F);
        this.legL2.cubeList.add(new ModelBox(legL2, 22, 23, 0.0F, 0.75F, -0.5F, 0, 5, 3, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.25F, -8.0F, -2.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.1745F, -0.2618F, 0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 22, 23, 0.0F, 0.25F, -0.5F, 0, 5, 3, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, -8.0F, -2.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.1745F, 0.2618F, -0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 22, 23, 0.0F, 0.25F, -0.5F, 0, 5, 3, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.25F, -8.0F, -1.0F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.1745F, -0.2618F, 0.3491F);
        this.legR4.cubeList.add(new ModelBox(legR4, 22, 23, 0.0F, 0.0F, -0.5F, 0, 5, 3, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.25F, -8.0F, -1.0F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.1745F, 0.2618F, -0.3491F);
        this.legL4.cubeList.add(new ModelBox(legL4, 22, 23, 0.0F, 0.0F, -0.5F, 0, 5, 3, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.25F, -8.0F, 0.0F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.1745F, -0.2618F, 0.3491F);
        this.legR5.cubeList.add(new ModelBox(legR5, 6, 32, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, -8.0F, 0.0F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.1745F, 0.2618F, -0.3491F);
        this.legL5.cubeList.add(new ModelBox(legL5, 6, 32, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.25F, -8.0F, 1.0F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.1745F, -0.2618F, 0.3491F);
        this.legR6.cubeList.add(new ModelBox(legR6, 6, 32, 0.0F, -0.25F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.25F, -8.0F, 1.0F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.1745F, 0.2618F, -0.3491F);
        this.legL6.cubeList.add(new ModelBox(legL6, 6, 32, 0.0F, -0.25F, -0.5F, 0, 4, 3, 0.0F, true));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.25F, -8.0F, 2.0F);
        this.body.addChild(legR7);
        this.setRotateAngle(legR7, 0.1745F, -0.2618F, 0.3491F);
        this.legR7.cubeList.add(new ModelBox(legR7, 6, 32, 0.0F, -1.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.25F, -8.0F, 2.0F);
        this.body.addChild(legL7);
        this.setRotateAngle(legL7, 0.1745F, 0.2618F, -0.3491F);
        this.legL7.cubeList.add(new ModelBox(legL7, 6, 32, 0.0F, -1.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.25F, -8.0F, 3.0F);
        this.body.addChild(legR8);
        this.setRotateAngle(legR8, 0.4363F, -0.2618F, 0.3491F);
        this.legR8.cubeList.add(new ModelBox(legR8, 4, 17, 0.0F, -0.25F, -0.5F, 0, 3, 2, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.25F, -8.0F, 3.0F);
        this.body.addChild(legL8);
        this.setRotateAngle(legL8, 0.4363F, 0.2618F, -0.3491F);
        this.legL8.cubeList.add(new ModelBox(legL8, 4, 17, 0.0F, -0.25F, -0.5F, 0, 3, 2, 0.0F, true));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.25F, -8.1F, 4.25F);
        this.body.addChild(legR9);
        this.setRotateAngle(legR9, 0.4363F, -0.2618F, 0.3491F);
        this.legR9.cubeList.add(new ModelBox(legR9, 4, 17, 0.0F, -1.0F, -0.5F, 0, 3, 2, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.25F, -8.1F, 4.25F);
        this.body.addChild(legL9);
        this.setRotateAngle(legL9, 0.4363F, 0.2618F, -0.3491F);
        this.legL9.cubeList.add(new ModelBox(legL9, 4, 17, 0.0F, -1.0F, -0.5F, 0, 3, 2, 0.0F, true));

        this.seg = new AdvancedModelRenderer(this);
        this.seg.setRotationPoint(0.0F, -11.5F, 6.0F);
        this.body.addChild(seg);
        this.setRotateAngle(seg, -0.1309F, 0.0F, 0.0F);
        this.seg.cubeList.add(new ModelBox(seg, 26, 37, -1.0F, -0.5F, 0.0F, 2, 2, 2, 0.01F, false));
        this.seg.cubeList.add(new ModelBox(seg, 0, 47, -1.5F, 1.0F, 1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.75F, -0.5F, 1.0F);
        this.seg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6981F, 0.0F, 1.0472F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 38, 0.0F, -5.0F, 0.0F, 0, 5, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.75F, -0.5F, 1.0F);
        this.seg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6981F, 0.0F, -1.0472F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 38, 0.0F, -5.0F, 0.0F, 0, 5, 1, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.25F, 1.5F, 0.0F);
        this.seg.addChild(legR10);
        this.setRotateAngle(legR10, 0.2618F, -0.1745F, 0.5236F);
        this.legR10.cubeList.add(new ModelBox(legR10, 6, 6, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.25F, 1.5F, 0.0F);
        this.seg.addChild(legL10);
        this.setRotateAngle(legL10, 0.2618F, 0.1745F, -0.5236F);
        this.legL10.cubeList.add(new ModelBox(legL10, 6, 6, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.seg2 = new AdvancedModelRenderer(this);
        this.seg2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.seg.addChild(seg2);
        this.setRotateAngle(seg2, -0.0873F, 0.0F, 0.0F);
        this.seg2.cubeList.add(new ModelBox(seg2, 11, 47, -1.5F, 1.0F, 1.0F, 3, 0, 1, 0.0F, false));
        this.seg2.cubeList.add(new ModelBox(seg2, 20, 35, -1.0F, -0.5F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.75F, -0.5F, 1.0F);
        this.seg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6981F, 0.0F, 1.0472F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 38, 0.0F, -5.0F, 0.0F, 0, 5, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.75F, -0.5F, 1.0F);
        this.seg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6981F, 0.0F, -1.0472F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 38, 0.0F, -5.0F, 0.0F, 0, 5, 1, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.25F, 1.5F, 0.0F);
        this.seg2.addChild(legR11);
        this.setRotateAngle(legR11, 0.2618F, -0.1745F, 0.5236F);
        this.legR11.cubeList.add(new ModelBox(legR11, 6, 6, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.25F, 1.5F, 0.0F);
        this.seg2.addChild(legL11);
        this.setRotateAngle(legL11, 0.2618F, 0.1745F, -0.5236F);
        this.legL11.cubeList.add(new ModelBox(legL11, 6, 6, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.seg3 = new AdvancedModelRenderer(this);
        this.seg3.setRotationPoint(0.0F, 0.0F, 1.975F);
        this.seg2.addChild(seg3);
        this.setRotateAngle(seg3, -0.0873F, 0.0F, 0.0F);
        this.seg3.cubeList.add(new ModelBox(seg3, 22, 47, -1.5F, 1.0F, 1.0F, 3, 0, 1, 0.0F, false));
        this.seg3.cubeList.add(new ModelBox(seg3, 12, 35, -1.0F, -0.5F, 0.0F, 2, 2, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.75F, -0.5F, 1.0F);
        this.seg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6981F, 0.0F, 1.0472F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 36, 0.0F, -5.0F, 0.0F, 0, 5, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.75F, -0.5F, 1.0F);
        this.seg3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6981F, 0.0F, -1.0472F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 36, 0.0F, -5.0F, 0.0F, 0, 5, 1, 0.0F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.25F, 1.5F, 0.025F);
        this.seg3.addChild(legR12);
        this.setRotateAngle(legR12, 0.2618F, -0.1745F, 0.5236F);
        this.legR12.cubeList.add(new ModelBox(legR12, 6, 6, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.25F, 1.5F, 0.025F);
        this.seg3.addChild(legL12);
        this.setRotateAngle(legL12, 0.2618F, 0.1745F, -0.5236F);
        this.legL12.cubeList.add(new ModelBox(legL12, 6, 6, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.seg4 = new AdvancedModelRenderer(this);
        this.seg4.setRotationPoint(0.0F, 0.0F, 1.975F);
        this.seg3.addChild(seg4);
        this.setRotateAngle(seg4, -0.0873F, 0.0F, 0.0F);
        this.seg4.cubeList.add(new ModelBox(seg4, 36, 47, -1.5F, 1.0F, 2.0F, 3, 0, 2, 0.0F, false));
        this.seg4.cubeList.add(new ModelBox(seg4, 30, 31, -1.0F, -0.5F, 0.0F, 2, 2, 4, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.75F, -0.5F, 3.0F);
        this.seg4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7854F, 0.0F, 1.0472F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 36, 0.0F, -6.0F, 0.0F, 0, 6, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.75F, -0.5F, 3.0F);
        this.seg4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7854F, 0.0F, -1.0472F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 36, 0.0F, -6.0F, 0.0F, 0, 6, 1, 0.0F, false));

        this.seg5 = new AdvancedModelRenderer(this);
        this.seg5.setRotationPoint(0.0F, 0.0F, 3.975F);
        this.seg4.addChild(seg5);
        this.setRotateAngle(seg5, -0.1745F, 0.0F, 0.0F);
        this.seg5.cubeList.add(new ModelBox(seg5, 0, 0, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.seg5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 22, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 8, -1.0F, 0.5F, 2.0F, 2, 0, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.seg5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.4363F, -0.3491F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 19, 0.0F, 0.0F, 0.0F, 2, 0, 8, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.seg5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.4363F, 0.3491F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 19, -2.0F, 0.0F, 0.0F, 2, 0, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.33F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.05F;
        this.body.render(0.01F);
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
        this.body.offsetY = 1.0F;

        AdvancedModelRenderer[] Tail = {this.seg, this.seg2, this.seg3, this.seg4, this.seg5};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
            this.body.offsetY = 1.08F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(antennaL, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaR, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(antennaL, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaR, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            this.walk(antennaL2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);

            this.walk(antennaR2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);

            float tailVdegree = 0.15F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.65F, tailVdegree, -2, f2, 1);


            float speedLeg = 1.2F;
            float degreeLeg = 0.35F;
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
