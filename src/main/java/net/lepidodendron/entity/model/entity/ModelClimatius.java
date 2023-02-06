package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelClimatius extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;

    public ModelClimatius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.8188F, -1.1301F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 1.2488F, 0.7037F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.0036F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.5F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, 1.2488F, 0.7037F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.0036F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.8312F, 1.2551F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1091F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 2, -1.5F, -1.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.682F, 0.6263F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7505F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 1, 0.0F, -1.7486F, 0.4477F, 0, 3, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 2, -0.5F, -2.2486F, -0.5523F, 1, 3, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.9188F, -3.9199F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 19, -1.5F, 0.0F, 0.0F, 3, 1, 5, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1688F, -1.3699F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0305F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 11, -1.5F, -1.5F, -2.5F, 3, 3, 5, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 4.8312F, 1.1301F);
        this.main.addChild(head);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.5F, -5.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 5, -1.55F, 0.35F, -2.65F, 1, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 5, 0.55F, 0.35F, -2.65F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 19, -1.5F, -0.25F, -3.025F, 3, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.744F, -5.0034F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 24, -1.0F, -0.006F, -2.7466F, 2, 1, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.169F, 0.0534F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0916F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 25, -1.0F, -0.9869F, -1.8549F, 2, 1, 2, -0.02F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.475F, 1.2812F, -0.8699F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.3927F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 15, 8, -0.5F, 0.0F, -1.5F, 5, 0, 3, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.475F, 1.2812F, -0.8699F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.3927F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 15, 8, -4.5F, 0.0F, -1.5F, 5, 0, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0147F, 0.4776F, 1.0113F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 16, -1.5147F, -2.1465F, 0.0188F, 3, 2, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5147F, 0.2952F, 2.9254F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1896F, -0.2409F, 0.8933F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 18, 0.175F, -0.3648F, -2.921F, 0, 3, 5, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.4853F, 0.2952F, 2.9254F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1896F, 0.2409F, -0.8933F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 18, -0.175F, -0.3648F, -2.921F, 0, 3, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.0147F, 0.3535F, 5.0188F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 0, -1.5F, -1.85F, -4.9F, 3, 2, 5, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0147F, -1.4214F, 5.0491F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 24, 11, -1.0F, -0.7251F, -0.0302F, 2, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.2749F, 1.4698F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1614F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 25, -1.0F, -0.625F, -1.5F, 2, 1, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.7251F, 0.4698F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 2, 0.0F, -1.05F, 0.5F, 0, 2, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 0, -0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(0.0F, 1.2749F, 1.4698F);
        this.tail.addChild(backleftfin);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.backleftfin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.6109F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(0.0F, 1.2749F, 1.4698F);
        this.tail.addChild(backrightfin);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.backrightfin.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.6109F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -2.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7251F, 2.9698F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.4363F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -0.5F, 0.0F, -0.5F, 1, 1, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.5F, 3.0F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4363F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -3.425F, -3.325F, 0, 7, 9, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.render(0.01F);
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(main, speed, 0.15F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, -0.2F, f2, 1);
            this.flap(frontleftfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.25F, true, -3, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.05F, true, -3, 0, f2, 1);
            this.flap(backleftfin, (float) (speed * 0.75), 0.2F, true, 0.5F, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.05F, true, 0.5F, 0, f2, 1);
            this.flap(backrightfin, (float) (speed * 0.75), 0.2F, true, 3.5F, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.05F, true, 3.5F, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
            }
        }
    }
}
