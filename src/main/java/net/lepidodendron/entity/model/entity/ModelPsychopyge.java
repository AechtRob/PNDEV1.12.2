package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPsychopyge extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legmain;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer leg12;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer leg11;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer leg10;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer leg9;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer leg;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer headspike;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;

    public ModelPsychopyge() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 10, 3, -3.0F, -1.0F, -7.0F, 6, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.9479F, -1.0F, -7.0325F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.1912F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 17, -0.9754F, 0.0F, -1.9433F, 1, 1, 2, -0.002F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.5F, -1.0F, -6.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7505F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -0.675F, 0.0F, -1.075F, 1, 1, 2, -0.003F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 18, -1.675F, 0.0F, 0.925F, 2, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.9479F, -1.0F, -7.0325F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.1912F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 17, -0.0246F, 0.0F, -1.9433F, 1, 1, 2, -0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.5F, -1.0F, -6.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.7505F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 18, -0.325F, 0.0F, 0.925F, 2, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 18, -0.325F, 0.0F, -1.075F, 1, 1, 2, -0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -1.3F, -5.2F, 1, 1, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, -1.0F, -0.325F, -10.625F, 2, 0, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 2, -0.5F, -0.325F, -12.625F, 1, 0, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, -3.0F, -1.0F, -5.0F, 6, 1, 3, 0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -2.0F, -1.0F, -2.0F, 4, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 9, -1.5F, -1.0F, 1.0F, 3, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, -0.5F, -0.5F, 3.0F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.5F, 3.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.575F, 0.0F, -0.225F, 1, 0, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.925F, -6.5F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 18, 1.0F, -0.175F, 0.15F, 1, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 18, -2.0F, -0.175F, 0.15F, 1, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 14, -1.0F, -0.45F, -1.425F, 2, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.0F, -0.4F, -3.5F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 15, -0.15F, 0.0F, -0.6F, 2, 0, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.0F, -0.4F, -3.5F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.4407F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 14, 0.125F, -0.05F, 0.35F, 2, 0, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, -0.5F, -2.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2574F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 12, -0.3F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.7467F, -0.5F, -0.123F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3883F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 8, -1.5F, -0.025F, -0.375F, 3, 0, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.7467F, -0.5F, -0.123F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.624F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 6, -1.5F, 0.05F, 0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.2992F, -0.625F, 4.0463F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.4443F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 0, -2.9984F, 0.025F, -0.0633F, 7, 0, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.2992F, -0.625F, 4.0463F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 1.4443F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 0, -4.0016F, 0.025F, -0.0633F, 7, 0, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.7467F, -0.5F, -0.123F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.624F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 6, -3.5F, 0.05F, 0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.7467F, -0.5F, -0.123F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3883F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 8, -1.5F, -0.025F, -0.375F, 3, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.0F, -0.5F, -2.0F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.2574F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 12, -2.7F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.0F, -0.4F, -3.5F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.4407F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 14, -2.125F, -0.05F, 0.35F, 2, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-3.0F, -0.4F, -3.5F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 15, -1.85F, 0.0F, -0.6F, 2, 0, 1, 0.0F, false));

        this.legmain = new AdvancedModelRenderer(this);
        this.legmain.setRotationPoint(-1.0F, 0.05F, -4.0F);
        this.body.addChild(legmain);


        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(1.0F, 0.0F, 6.1F);
        this.legmain.addChild(leg6);
        this.setRotateAngle(leg6, 0.0F, 0.0F, -0.1004F);
        this.leg6.cubeList.add(new ModelBox(leg6, 0, 7, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg12 = new AdvancedModelRenderer(this);
        this.leg12.setRotationPoint(1.0F, 0.0F, 6.1F);
        this.legmain.addChild(leg12);
        this.setRotateAngle(leg12, 0.0F, 0.0F, 0.1004F);
        this.leg12.cubeList.add(new ModelBox(leg12, 0, 7, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(1.0F, 0.0F, 5.0F);
        this.legmain.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, 0.0F, -0.1004F);
        this.leg5.cubeList.add(new ModelBox(leg5, 9, 7, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg11 = new AdvancedModelRenderer(this);
        this.leg11.setRotationPoint(1.0F, 0.0F, 5.0F);
        this.legmain.addChild(leg11);
        this.setRotateAngle(leg11, 0.0F, 0.0F, 0.1004F);
        this.leg11.cubeList.add(new ModelBox(leg11, 9, 7, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.legmain.addChild(leg4);
        this.setRotateAngle(leg4, 0.0F, 0.0F, -0.1004F);
        this.leg4.cubeList.add(new ModelBox(leg4, 10, 13, -2.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg10 = new AdvancedModelRenderer(this);
        this.leg10.setRotationPoint(2.0F, 0.0F, 3.75F);
        this.legmain.addChild(leg10);
        this.setRotateAngle(leg10, 0.0F, 0.0F, 0.1004F);
        this.leg10.cubeList.add(new ModelBox(leg10, 10, 13, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.legmain.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, 0.0F, -0.1004F);
        this.leg3.cubeList.add(new ModelBox(leg3, 15, 7, -2.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg9 = new AdvancedModelRenderer(this);
        this.leg9.setRotationPoint(2.0F, 0.0F, 2.5F);
        this.legmain.addChild(leg9);
        this.setRotateAngle(leg9, 0.0F, 0.0F, 0.1004F);
        this.leg9.cubeList.add(new ModelBox(leg9, 15, 7, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(0.0F, 0.0F, 1.25F);
        this.legmain.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.0F, -0.1004F);
        this.leg2.cubeList.add(new ModelBox(leg2, 16, 13, -2.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(2.0F, 0.0F, 1.25F);
        this.legmain.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.0F, 0.1004F);
        this.leg8.cubeList.add(new ModelBox(leg8, 16, 13, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leg = new AdvancedModelRenderer(this);
        this.leg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legmain.addChild(leg);
        this.setRotateAngle(leg, 0.0F, 0.0F, -0.1004F);
        this.leg.cubeList.add(new ModelBox(leg, 0, 17, -2.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.legmain.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, 0.0F, 0.1004F);
        this.leg7.cubeList.add(new ModelBox(leg7, 0, 17, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.headspike = new AdvancedModelRenderer(this);
        this.headspike.setRotationPoint(-2.5F, -1.0F, -6.0F);
        this.main.addChild(headspike);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(8.5289F, 0.5F, 3.3683F);
        this.headspike.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0785F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -0.9587F, 0.05F, -0.0201F, 1, 0, 4, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.headspike.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.7505F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 3, 0, -0.675F, 0.5F, 1.925F, 1, 0, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headspike.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.7505F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 3, 0, -0.325F, 0.5F, 1.925F, 1, 0, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.5289F, 0.5F, 3.3683F);
        this.headspike.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.0785F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -0.0413F, 0.05F, -0.0201F, 1, 0, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1F, 0.0F);
        this.main.offsetY = 0.055F;
        this.main.render(0.01F);
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
        //this.main.offsetY = 1.2F;

        AdvancedModelRenderer[] legsL = {this.leg7, this.leg8, this.leg9, this.leg10, this.leg11, this.leg12};
        AdvancedModelRenderer[] legsR = {this.leg, this.leg2, this.leg3, this.leg4, this.leg5, this.leg6};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.flap(leg7, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(leg, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
        this.flap(leg8, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
        this.flap(leg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
        this.flap(leg9, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
        this.flap(leg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
        this.flap(leg10, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
        this.flap(leg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
        this.flap(leg11, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
        this.flap(leg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
        this.flap(leg12, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
        this.flap(leg6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);

    }
}
