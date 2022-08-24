package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelFeroxichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer Feroxichthys;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r22;

    private ModelAnimator animator;

    public ModelFeroxichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Feroxichthys = new AdvancedModelRenderer(this);
        this.Feroxichthys.setRotationPoint(0.0F, 24.0F, 0.0F);

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Feroxichthys.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 46, 26, -2.0F, -3.25F, -11.0F, 4, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 38, -2.0F, -9.0F, -11.0F, 4, 6, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.8F, -3.8365F, -13.0727F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, 0.0F, -0.75F, -1.5F, 0, 1, 3, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, 3.6F, -0.75F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.0F, -11.5F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 38, -2.0F, -2.0F, -3.25F, 4, 2, 5, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 1, -1.5F, -0.25F, -3.1F, 3, 1, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -7.0337F, -12.0647F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 7, -2.0F, -1.0F, -2.0F, 4, 2, 4, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.25F, -12.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -2.1F, -0.5F, -0.5F, 1, 1, 1, 0.011F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 1.1F, -0.5F, -0.5F, 1, 1, 1, 0.011F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 13, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.011F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 20, -1.5F, -2.0F, -4.0F, 3, 2, 4, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -10.2277F, -9.6993F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6981F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 0, -2.0F, 0.0996F, -2.1361F, 4, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -11.0F, -8.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.48F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 49, -2.0F, 0.0F, -2.0F, 4, 2, 2, 0.0001F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, -3.75F, -11.0F);
        this.head.addChild(lowerjaw);

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.6603F, 0.1813F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 46, -1.5F, -0.9676F, -4.0786F, 3, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.75F, -1.0628F, -1.8562F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 8, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 8, 3.5F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.25F, -0.5F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 1, -1.5F, -0.75F, -3.1F, 3, 1, 0, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 33, -2.0F, 0.0F, -3.25F, 4, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.6897F, -7.918F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 32, 11, -2.0F, -4.3103F, 10.668F, 4, 8, 5, 0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -5.3103F, -0.082F, 4, 10, 12, 0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -6.3103F, 9.918F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 24, -2.0F, 0.5F, -4.8F, 4, 3, 11, -0.011F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -5.6676F, 0.233F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 17, -2.0F, 0.0653F, -0.9561F, 4, 2, 1, -0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -6.3103F, 1.918F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 0, -2.0F, 0.25F, -1.75F, 4, 2, 5, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.1897F, 11.918F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 45, -2.0F, -0.5F, -0.25F, 4, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.6897F, 14.168F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 20, 0, -2.0F, -2.0F, 0.0F, 4, 4, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.5048F, 5.9365F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.829F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 1, 29, 0.0F, -1.75F, -2.5F, 0, 5, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -4.9821F, 5.5311F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -3.25F, -4.5F, 0, 5, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -5.0F, 1.5F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 24, -1.5F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 3.0F, 1.5F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 39, 40, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1894F, 7.1597F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 44, -1.5F, -1.3106F, -1.1597F, 3, 3, 4, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0606F, 2.8403F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -1.0F, -0.75F, -1.0F, 2, 2, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 9, 0.0F, -6.75F, 0.0F, 0, 13, 13, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.0F, 3.9397F, 9.918F);
        this.body.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.2618F);

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backleftfin.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5672F, 0.0F, -0.7854F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 34, 0.0F, 0.0F, 0.0F, 0, 4, 4, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.0F, 3.9397F, 9.918F);
        this.body.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.2618F);

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backrightfin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5672F, 0.0F, 0.7854F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 34, 0.0F, 0.0F, 0.0F, 0, 4, 4, 0.0F, true));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.0F, 1.9397F, -0.082F);
        this.body.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -0.48F);

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.0F, 3.25F, -2.0F);
        this.frontleftfin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6545F, 0.0F, -0.4451F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 42, 3.25F, -1.0F, 2.75F, 0, 7, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.0F, 1.9397F, -0.082F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 0.48F);

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0F, 3.25F, -2.0F);
        this.frontrightfin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6545F, 0.0F, 0.4451F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 38, 42, -3.25F, -1.0F, 2.75F, 0, 7, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Feroxichthys.render(f5 * 0.1642F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Feroxichthys.rotateAngleY = (float) Math.toRadians(90);
        this.Feroxichthys.offsetX = -0.03F;
        this.Feroxichthys.offsetY = -0.19F;
        this.Feroxichthys.offsetZ = 0.07F;
        this.Feroxichthys.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.Feroxichthys.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.32F;
        if (!e.isInWater()) {
            speed = 0.77F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed, 0.02F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, speed, 0.49F, -0.85, f2, 0.5F);
            this.swing(Feroxichthys, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Feroxichthys, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontleftfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontleftfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontrightfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontrightfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backleftfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backleftfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backrightfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backrightfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.Feroxichthys.rotateAngleZ = (float) Math.toRadians(90);
            this.Feroxichthys.offsetY = 1.23F;
            this.bob(Feroxichthys, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F);
        }

    }
}

