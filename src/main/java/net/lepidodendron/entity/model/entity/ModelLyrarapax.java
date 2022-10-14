package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLyrarapax extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer finL1;
    private final AdvancedModelRenderer finR1;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer tailL;
    private final AdvancedModelRenderer tailR;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer cube_r17;

    public ModelLyrarapax() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.0F, -4.0F, 3, 1, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 17, -1.0F, -1.0F, 4.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.0F, -6.0F, 2, 1, 2, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(1.0F, -0.25F, -5.5F);
        this.body.addChild(finL1);
        this.finL1.cubeList.add(new ModelBox(finL1, 5, 4, -0.1F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-1.0F, -0.25F, -5.5F);
        this.body.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 5, 1, -0.9F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-1.0F, -0.25F, -4.5F);
        this.body.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 5, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(1.0F, -0.25F, -4.5F);
        this.body.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 5, 3, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(1.5F, -0.25F, -3.5F);
        this.body.addChild(finL3);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.finL3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, 0.0F, 0.0F, 0.0F, 8, 0, 2, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-1.5F, -0.25F, -3.5F);
        this.body.addChild(finR3);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.finR3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, -8.0F, 0.0F, 0.0F, 8, 0, 2, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(1.5F, -0.25F, -1.6F);
        this.body.addChild(finL4);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.finL4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5672F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 1, 0.25F, 0.0F, 0.35F, 6, 0, 1, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-1.5F, -0.25F, -1.6F);
        this.body.addChild(finR4);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.finR4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5672F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 0, -6.25F, 0.0F, 0.35F, 6, 0, 1, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(1.5F, -0.25F, -0.2F);
        this.body.addChild(finL5);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.finL5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 3, 0.25F, 0.0F, 0.6F, 5, 0, 1, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-1.5F, -0.25F, -0.2F);
        this.body.addChild(finR5);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.finR5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 2, -5.25F, 0.0F, 0.6F, 5, 0, 1, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(1.5F, -0.25F, 1.3F);
        this.body.addChild(finL6);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.finL6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.6545F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 5, 0.25F, 0.0F, 0.6F, 4, 0, 1, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-1.5F, -0.25F, 1.3F);
        this.body.addChild(finR6);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.finR6.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.6545F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 4, -4.25F, 0.0F, 0.6F, 4, 0, 1, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(1.5F, -0.25F, 2.45F);
        this.body.addChild(finL7);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.finL7.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 7, 0.5F, 0.0F, 0.6F, 3, 0, 1, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-1.5F, -0.25F, 2.45F);
        this.body.addChild(finR7);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.finR7.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 6, -3.5F, 0.0F, 0.6F, 3, 0, 1, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(1.5F, -0.25F, 3.65F);
        this.body.addChild(finL8);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.finL8.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.0036F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 7, -0.25F, 0.0F, 0.6F, 3, 0, 1, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-1.5F, -0.25F, 3.65F);
        this.body.addChild(finR8);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.finR8.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 1.0036F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 6, -2.75F, 0.0F, 0.6F, 3, 0, 1, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(0.65F, -0.25F, 4.5F);
        this.body.addChild(finL9);
        this.setRotateAngle(finL9, 0.0F, -1.309F, 0.0F);
        this.finL9.cubeList.add(new ModelBox(finL9, 8, 17, -0.5F, 0.0F, -0.3F, 2, 0, 1, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-0.65F, -0.25F, 4.5F);
        this.body.addChild(finR9);
        this.setRotateAngle(finR9, 0.0F, 1.309F, 0.0F);
        this.finR9.cubeList.add(new ModelBox(finR9, 4, 17, -1.5F, 0.0F, -0.3F, 2, 0, 1, 0.0F, false));

        this.tailL = new AdvancedModelRenderer(this);
        this.tailL.setRotationPoint(0.1F, 0.0F, 5.0F);
        this.body.addChild(tailL);
        this.setRotateAngle(tailL, 0.0F, 0.0873F, 0.0F);
        this.tailL.cubeList.add(new ModelBox(tailL, 10, 11, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.tailR = new AdvancedModelRenderer(this);
        this.tailR.setRotationPoint(-0.1F, 0.0F, 5.0F);
        this.body.addChild(tailR);
        this.setRotateAngle(tailR, 0.0F, -0.0873F, 0.0F);
        this.tailR.cubeList.add(new ModelBox(tailR, 0, 11, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 3, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 19, -0.5F, 0.51F, -1.25F, 1, 0, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 11, -0.99F, 0.0F, -0.1F, 2, 0, 1, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.0F, -0.3491F, 0.0F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 10, 8, 0.0F, -0.5F, -5.0F, 0, 3, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.appendageL.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 20, -0.01F, 0.0F, -1.0F, 0, 2, 1, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.0F, 0.3491F, 0.0F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 0, 8, 0.0F, -0.5F, -5.0F, 0, 3, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.appendageR.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 20, 0.01F, 0.0F, -1.0F, 0, 2, 1, 0.0F, true));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-0.65F, -0.4F, -1.0F);
        this.head.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.3491F, 0.3491F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 17, 9, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 1.0F, -0.5F);
        this.eyeR.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.7418F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 17, -0.75F, -1.5F, 0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 17, -0.76F, -1.51F, 1.0F, 1, 1, 1, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(0.65F, -0.4F, -1.0F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.3491F, -0.3491F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 17, 10, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 1.0F, -0.5F);
        this.eyeL.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.7418F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 18, -0.25F, -1.5F, 0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 5, 18, -0.24F, -1.51F, 1.0F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.22F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.render(0.018F);
        GlStateManager.enableCull();
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
        this.body.offsetY = 1.11F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.walk(appendageL, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
            this.walk(appendageR, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
            this.walk(appendageL, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);
            this.walk(appendageR, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);

            this.swing(tailL, 2.2F, -0.16F, false, 0, -0.5F, f2, 0.7F);
            this.swing(tailR, 2.2F, 0.16F, false, 0, 0.5F, f2, 0.7F);

            float degreeFin = 0.185F;
            this.flap(finL9, 0.5F, -degreeFin, false, 0, -0, f2, 0.7F);
            this.flap(finR9, 0.5F, degreeFin, false, 0, 0, f2, 0.7F);
            this.flap(finL8, 0.5F, -degreeFin, false, 0.5F, -0, f2, 0.7F);
            this.flap(finR8, 0.5F, degreeFin, false, 0.5F, 0, f2, 0.7F);
            this.flap(finL7, 0.5F, -degreeFin, false, 1.0F, -0, f2, 0.7F);
            this.flap(finR7, 0.5F, degreeFin, false, 1.0F, 0, f2, 0.7F);
            this.flap(finL6, 0.5F, -degreeFin, false, 1.5F, -0, f2, 0.7F);
            this.flap(finR6, 0.5F, degreeFin, false, 1.5F, 0, f2, 0.7F);
            this.flap(finL5, 0.5F, -degreeFin, false, 2.0F, -0, f2, 0.7F);
            this.flap(finR5, 0.5F, degreeFin, false, 2.0F, 0, f2, 0.7F);
            this.flap(finL4, 0.5F, -degreeFin, false, 2.5F, -0, f2, 0.7F);
            this.flap(finR4, 0.5F, degreeFin, false, 2.5F, 0, f2, 0.7F);
            this.flap(finL3, 0.5F, -degreeFin, false, 3.0F, -0, f2, 0.7F);
            this.flap(finR3, 0.5F, degreeFin, false, 3.0F, 0, f2, 0.7F);
            this.flap(finL2, 0.5F, -degreeFin, false, 3.5F, -0, f2, 0.7F);
            this.flap(finR2, 0.5F, degreeFin, false, 3.5F, 0, f2, 0.7F);
            this.flap(finL1, 0.5F, -degreeFin, false, 4.0F, -0, f2, 0.7F);
            this.flap(finR1, 0.5F, degreeFin, false, 4.0F, 0, f2, 0.7F);

            this.walk(finL9, 0.5F, -degreeFin * 0.5F, true, 0, -0.5F, f2, 0.7F);
            this.walk(finR9, 0.5F, degreeFin * 0.5F, false, 0, 0.5F, f2, 0.7F);
            this.walk(finL8, 0.5F, -degreeFin * 0.5F, true, 0.5F, -0.5F, f2, 0.7F);
            this.walk(finR8, 0.5F, degreeFin * 0.5F, false, 0.5F, 0.5F, f2, 0.7F);
            this.walk(finL7, 0.5F, -degreeFin * 0.5F, true, 1.0F, -0.5F, f2, 0.7F);
            this.walk(finR7, 0.5F, degreeFin * 0.5F, false, 1.0F, 0.5F, f2, 0.7F);
            this.walk(finL6, 0.5F, -degreeFin * 0.5F, true, 1.5F, -0.5F, f2, 0.7F);
            this.walk(finR6, 0.5F, degreeFin * 0.5F, false, 1.5F, 0.5F, f2, 0.7F);
            this.walk(finL5, 0.5F, -degreeFin * 0.5F, true, 2.0F, -0.5F, f2, 0.7F);
            this.walk(finR5, 0.5F, degreeFin * 0.5F, false, 2.0F, 0.5F, f2, 0.7F);
            this.walk(finL4, 0.5F, -degreeFin * 0.5F, true, 2.5F, -0.5F, f2, 0.7F);
            this.walk(finR4, 0.5F, degreeFin * 0.5F, false, 2.5F, 0.5F, f2, 0.7F);
            this.walk(finL3, 0.5F, -degreeFin * 0.5F, true, 3.0F, -0.5F, f2, 0.7F);
            this.walk(finR3, 0.5F, degreeFin * 0.5F, false, 3.0F, 0.5F, f2, 0.7F);
            this.walk(finL2, 0.5F, -degreeFin * 0.5F, true, 3.5F, -0.5F, f2, 0.7F);
            this.walk(finR2, 0.5F, degreeFin * 0.5F, false, 3.5F, 0.5F, f2, 0.7F);
            this.walk(finL1, 0.5F, -degreeFin * 0.5F, true, 4.0F, -0.5F, f2, 0.7F);
            this.walk(finR1, 0.5F, degreeFin * 0.5F, false, 4.0F, 0.5F, f2, 0.7F);


            if (!e.isInWater()) {
                this.bob(body, -speed * 1.5F, 2.5F, false, f2, 1);
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.15F, false, f2, 2);
                }
                else
                {
                    this.bob(body, -speed, 0.3F, false, f2, 2);
                }
            }
        }
    }
}
