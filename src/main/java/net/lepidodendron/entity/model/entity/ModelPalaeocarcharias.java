package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeocarcharias;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPalaeocarcharias extends AdvancedModelBase {
    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer jaw;

    public ModelPalaeocarcharias() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.4104F, -1.1052F);
        this.main.cubeList.add(new ModelBox(main, 43, 12, -3.0F, -1.4104F, -9.8948F, 6, 1, 5, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 17, -4.0F, -3.9104F, 5.8552F, 8, 4, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.5F, -4.4104F, -2.1448F, 9, 5, 9, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 43, 18, -3.0F, -0.4625F, -5.6287F, 6, 1, 4, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 44, 8, -3.0F, -0.4625F, -6.8787F, 6, 1, 2, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.7F, -2.1604F, -8.2698F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -1.625F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.7F, -2.1604F, -8.2698F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, -1.625F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.1625F, -11.0999F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4014F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, -3.0F, 0.4391F, -1.4963F, 6, 0, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.4104F, -0.1448F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 0, -3.0F, -1.25F, -10.9F, 6, 3, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 47, -3.0F, -1.25F, -5.9F, 6, 4, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.0F, -1.6988F, -1.8789F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.124F, 0.1732F, 0.0215F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 30, -1.575F, -1.6875F, -7.9702F, 2, 2, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.2367F, -2.8988F, -5.9524F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0385F, 0.2092F, -0.4216F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 8, -2.0F, 0.0F, -5.0F, 4, 0, 9, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.2367F, -2.8988F, -5.9524F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0385F, -0.2092F, 0.4216F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 8, -2.0F, 0.0F, -5.0F, 4, 0, 9, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.0F, -1.6988F, -1.8789F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.124F, -0.1732F, -0.0215F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 38, -0.425F, -1.6875F, -7.9702F, 2, 2, 8, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.8039F, 12.8933F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 20, 29, -3.0F, -0.8565F, -0.038F, 6, 3, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 70, 0.0F, -4.8565F, 0.962F, 0, 4, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 2.8935F, -2.038F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 40, -3.0F, -1.0F, 2.0F, 5, 1, 6, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.0F, 1.956F, 0.962F);
        this.tail.addChild(backleftfin);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 19, 0, 0.0F, -0.0125F, -1.0F, 6, 0, 8, 0.0F, true));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 51, 33, 0.0F, 0.0125F, -1.0F, 6, 0, 8, 0.0F, true));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-3.0F, 1.956F, 0.962F);
        this.tail.addChild(backrightfin);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 19, 0, -6.0F, -0.0125F, -1.0F, 6, 0, 8, 0.0F, false));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 51, 33, -6.0F, 0.0125F, -1.0F, 6, 0, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 0.6435F, 5.462F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, -2.5F, -1.0F, 0.0F, 4, 2, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 70, -0.5F, -5.75F, 3.0F, 0, 6, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.5F, 0.0F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0829F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 43, -1.5F, -1.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-1.0F, -0.125F, 5.925F);
        this.tail2.addChild(tail3);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -1.0F, 0.325F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 18, -1.0F, 0.0F, -0.75F, 2, 2, 7, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 1.1702F, 3.5821F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4756F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -1.5F, -1.775F, 0, 3, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.8F, 6.375F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3818F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 11, 48, 0.0F, -0.4371F, 0.0096F, 1, 1, 7, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 16, 0.5F, -0.9371F, 0.0096F, 0, 5, 13, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-4.0F, -0.2604F, -1.6448F);
        this.main.addChild(frontrightfin);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 25, 60, -7.775F, -0.1F, -0.5F, 8, 0, 11, 0.0F, false));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, -10, 60, -7.775F, -0.05F, -0.5F, 8, 0, 11, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(4.0F, -0.2604F, -1.6448F);
        this.main.addChild(frontleftfin);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 25, 60, -0.225F, -0.1F, -0.5F, 8, 0, 11, 0.0F, true));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, -10, 60, -0.225F, -0.05F, -0.5F, 8, 0, 11, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.4125F, -6.8787F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 25, -2.0F, -0.1F, -3.25F, 4, 1, 4, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.07F;
        this.main.offsetZ = -0.01F;
        this.main.offsetY = -0.245F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
            this.setRotateAngle(main, 0.0F, 0.0F, 0.1F);
            this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
            this.setRotateAngle(tail3, 0.1F, -0.3F, 0.0F);
            this.setRotateAngle(tail4, 0.2F, -0.3F, 0.0F);
            this.main.offsetY = -0.14F;
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
        //this.Root.offsetY = 1.45F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        } else if (!ee.getIsMoving()) {
            speed = 0.7F * 0.13F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                //this.Root.offsetY = 1.55F;
                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed*0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed*0.1F, 0.1F, -3, f2, 1);
                return;
            }


            this.flap(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(ee.getIsMoving()|| e.isInWater()) { //if moving, slap fins
                this.flap(frontleftfin, speed * 2.5F, 0.4F, true, -3, 0, f2, 1);
                this.flap(frontrightfin, speed* 2.5F, -0.4F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed* 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed* 2.5F, 0.25F, -3, f2, 1);
            }

            else{ //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
                this.flap(frontleftfin, (speed), 0.25F, true, -3, 0, f2, 1);
                this.flap(frontrightfin, (speed), -0.25F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);



        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPalaeocarcharias e = (EntityPrehistoricFloraPalaeocarcharias) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
