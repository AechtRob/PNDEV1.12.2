package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelYawunik extends AdvancedModelBase {
    private final AdvancedModelRenderer bodybase;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer tentacle1_1;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tentacle1_2;
    private final AdvancedModelRenderer tentacle1_3;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle2_1;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tentacle2_2;
    private final AdvancedModelRenderer tentacle2_3;

    public ModelYawunik() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bodybase = new AdvancedModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodybase.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -1.5F, -9.5F, -7.0F, 3, 4, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -9.0F, -6.0F);
        this.bodybase.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -2.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, 2.5F, 2.5F);
        this.body1.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.0873F);
        this.legR4.cubeList.add(new ModelBox(legR4, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.2618F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, 2.5F, 2.5F);
        this.body1.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.0873F);
        this.legL4.cubeList.add(new ModelBox(legL4, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, 2.25F, 1.75F);
        this.body1.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.0873F);
        this.legR3.cubeList.add(new ModelBox(legR3, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.2618F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, 2.25F, 1.75F);
        this.body1.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.0873F);
        this.legL3.cubeList.add(new ModelBox(legL3, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.2618F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.5F, 2.25F, 0.25F);
        this.body1.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.0F, -0.0873F);
        this.legL1.cubeList.add(new ModelBox(legL1, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.2618F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, 2.25F, 1.0F);
        this.body1.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.0873F);
        this.legL2.cubeList.add(new ModelBox(legL2, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.2618F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, 2.25F, 1.0F);
        this.body1.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.0873F);
        this.legR2.cubeList.add(new ModelBox(legR2, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, 2.5F, 3.25F);
        this.body1.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.0873F);
        this.legL5.cubeList.add(new ModelBox(legL5, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.5F, 2.5F, 4.0F);
        this.body1.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, -0.0873F);
        this.legL6.cubeList.add(new ModelBox(legL6, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL6.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2618F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.5F, 2.5F, 4.0F);
        this.body1.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, 0.0873F);
        this.legR6.cubeList.add(new ModelBox(legR6, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.2618F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 2.5F, 3.25F);
        this.body1.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.0873F);
        this.legR5.cubeList.add(new ModelBox(legR5, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.2618F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.5F, 2.25F, 4.75F);
        this.body1.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, -0.0873F);
        this.legL7.cubeList.add(new ModelBox(legL7, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.2618F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.5F, 2.25F, 4.75F);
        this.body1.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, 0.0873F);
        this.legR7.cubeList.add(new ModelBox(legR7, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.2618F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.5F, 2.25F, 0.25F);
        this.body1.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, 0.0F, 0.0873F);
        this.legR1.cubeList.add(new ModelBox(legR1, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.2618F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 10, 10, -1.5F, 0.0F, 0.0F, 3, 4, 4, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.5F, 2.0F, 0.5F);
        this.body2.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, 0.0873F);
        this.legR8.cubeList.add(new ModelBox(legR8, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR8.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.2618F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.5F, 2.0F, 1.25F);
        this.body2.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, -0.0873F);
        this.legL9.cubeList.add(new ModelBox(legL9, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL9.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.2618F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.5F, 2.0F, 0.5F);
        this.body2.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, -0.0873F);
        this.legL8.cubeList.add(new ModelBox(legL8, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL8.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.2618F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.5F, 2.0F, 1.25F);
        this.body2.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, 0.0873F);
        this.legR9.cubeList.add(new ModelBox(legR9, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR9.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.2618F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 2, 0, -0.5F, 0.25F, 3.0F, 1, 0, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 11, 0, -1.0F, 0.25F, 1.0F, 2, 0, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 13, 2, -1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.5F, 1.5F, -2.0F);
        this.body3.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, -0.0873F);
        this.legL10.cubeList.add(new ModelBox(legL10, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL10.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.2618F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.5F, 1.5F, -2.0F);
        this.body3.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, 0.0873F);
        this.legR10.cubeList.add(new ModelBox(legR10, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR10.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.2618F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.5F, 1.25F, -1.25F);
        this.body3.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0F, -0.0873F);
        this.legL11.cubeList.add(new ModelBox(legL11, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL11.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.2618F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.5F, 1.25F, -1.25F);
        this.body3.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, 0.0F, 0.0873F);
        this.legR11.cubeList.add(new ModelBox(legR11, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR11.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.2618F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.5F, 1.0F, -0.5F);
        this.body3.addChild(legL12);
        this.setRotateAngle(legL12, 0.0F, 0.0F, -0.0873F);
        this.legL12.cubeList.add(new ModelBox(legL12, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL12.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.2618F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 18, 0, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.5F, 1.0F, -0.5F);
        this.body3.addChild(legR12);
        this.setRotateAngle(legR12, 0.0F, 0.0F, 0.0873F);
        this.legR12.cubeList.add(new ModelBox(legR12, 18, 5, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.5F, 3.0F, 5.0F);
        this.legR12.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.2618F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 0, -5.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, true));

        this.tentacle1 = new AdvancedModelRenderer(this);
        this.tentacle1.setRotationPoint(0.7F, -7.5F, -6.6F);
        this.bodybase.addChild(tentacle1);
        this.setRotateAngle(tentacle1, 0.0F, 0.0F, -0.0873F);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle1_1 = new AdvancedModelRenderer(this);
        this.tentacle1_1.setRotationPoint(0.2F, 3.0F, 0.0F);
        this.tentacle1.addChild(tentacle1_1);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 1.0F, 6.5F);
        this.tentacle1_1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.2618F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 2, 0.5F, -1.0F, -7.0F, 0, 5, 7, 0.0F, false));

        this.tentacle1_2 = new AdvancedModelRenderer(this);
        this.tentacle1_2.setRotationPoint(0.4F, 3.0F, 0.0F);
        this.tentacle1.addChild(tentacle1_2);
        this.setRotateAngle(tentacle1_2, 0.0F, 0.0F, -0.4363F);
        this.tentacle1_2.cubeList.add(new ModelBox(tentacle1_2, 0, 2, 0.0F, 0.0F, -0.5F, 0, 5, 7, 0.0F, false));

        this.tentacle1_3 = new AdvancedModelRenderer(this);
        this.tentacle1_3.setRotationPoint(-0.3F, 3.0F, 0.0F);
        this.tentacle1.addChild(tentacle1_3);
        this.setRotateAngle(tentacle1_3, 0.0F, 0.0F, 0.0873F);
        this.tentacle1_3.cubeList.add(new ModelBox(tentacle1_3, 0, 2, 0.0F, 0.0F, -0.5F, 0, 5, 7, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-0.8F, -7.5F, -6.6F);
        this.bodybase.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.0F, 0.0F, 0.0873F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.tentacle2_1 = new AdvancedModelRenderer(this);
        this.tentacle2_1.setRotationPoint(-0.2F, 3.0F, 0.0F);
        this.tentacle2.addChild(tentacle2_1);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 1.0F, 6.5F);
        this.tentacle2_1.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.2618F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 2, -0.5F, -1.0F, -7.0F, 0, 5, 7, 0.0F, true));

        this.tentacle2_2 = new AdvancedModelRenderer(this);
        this.tentacle2_2.setRotationPoint(-0.4F, 3.0F, 0.0F);
        this.tentacle2.addChild(tentacle2_2);
        this.setRotateAngle(tentacle2_2, 0.0F, 0.0F, 0.4363F);
        this.tentacle2_2.cubeList.add(new ModelBox(tentacle2_2, 0, 2, 0.0F, 0.0F, -0.5F, 0, 5, 7, 0.0F, true));

        this.tentacle2_3 = new AdvancedModelRenderer(this);
        this.tentacle2_3.setRotationPoint(0.3F, 3.0F, 0.0F);
        this.tentacle2.addChild(tentacle2_3);
        this.setRotateAngle(tentacle2_3, 0.0F, 0.0F, -0.0873F);
        this.tentacle2_3.cubeList.add(new ModelBox(tentacle2_3, 0, 2, 0.0F, 0.0F, -0.5F, 0, 5, 7, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bodybase.render(f5 * 0.24F);
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
        this.bodybase.offsetY = 1.1F;

        AdvancedModelRenderer[] Tail = {this.body3};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(tentacle1, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(tentacle2, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(tentacle1, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(tentacle2, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            this.walk(tentacle1_1, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
            this.walk(tentacle1_2, 0.6F, 0.15F, false, 1f, 0f, f2, 1F);
            this.walk(tentacle1_3, 0.6F, 0.15F, false, 2f, 0f, f2, 1F);

            this.walk(tentacle2_1, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
            this.walk(tentacle2_2, 0.6F, 0.15F, false, 1f, 0f, f2, 1F);
            this.walk(tentacle2_3, 0.6F, 0.15F, false, 2f, 0f, f2, 1F);

            float tailVdegree = 0.1F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(Tail, speed, tailHdegree, -2.5, f2, 0.5F);

            float speedLeg = 2.5F;
            float degreeLeg = 0.2F;
            this.flap(legL1, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legR1, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
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

            if (!e.isInWater()) {
                this.bodybase.offsetY = 1.2F;
                this.bob(bodybase, -speed * 1.5F, 3F, false, f2, 1);
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(bodybase, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(bodybase, -speed, 1F, false, f2, 2);
                }
            }
        }
    }
}
