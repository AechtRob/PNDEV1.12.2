package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudorhina;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPseudorhina extends AdvancedModelBase {
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
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer lwing;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer rwing;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    public ModelPseudorhina() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 14.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -2.0F, -17.5F, 8, 2, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 38, 33, -3.0F, -1.0F, -19.5F, 6, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 42, 23, -1.5F, -1.0F, -21.5F, 3, 1, 2, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 6, 8, -0.225F, -1.0F, -22.325F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 6, 8, -0.8F, -1.0F, -22.325F, 1, 1, 1, -0.01F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, -0.5F, -17.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3098F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 35, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.02F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(4.0F, -0.5F, -17.5F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3098F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 35, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.0F, -0.5F, -20.5F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.8727F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.04F, -0.5F, -2.85F, 2, 1, 3, 0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, -0.5F, -20.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.8727F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -2.04F, -0.5F, -2.85F, 2, 1, 3, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7531F, -21.5288F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 8, -1.0F, -0.45F, -0.475F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.0F, -20.5F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3272F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 41, -1.5F, 0.35F, -1.0F, 3, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.4987F, -13.5231F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0785F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 31, -3.0F, 0.0021F, 0.0023F, 6, 1, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0F, -19.5F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0829F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 2, -3.0F, 0.0F, 0.0F, 6, 2, 6, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.5F, -0.5F, -15.5F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.48F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 38, -1.625F, -0.75F, -1.55F, 3, 1, 6, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.5F, -0.5F, -15.5F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.48F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 38, -1.375F, -0.75F, -1.55F, 3, 1, 6, 0.0F, false));

        this.lwing = new AdvancedModelRenderer(this);
        this.lwing.setRotationPoint(6.6524F, -0.6F, -16.1209F);
        this.main.addChild(lwing);
        this.setRotateAngle(lwing, 0.0F, -0.829F, 0.0F);


        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lwing.addChild(leftwing);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 26, 23, 0.0025F, 0.0F, -0.0054F, 4, 0, 8, 0.0F, false));
        this.leftwing.cubeList.add(new ModelBox(leftwing, 18, 0, 0.0025F, 0.025F, -0.0054F, 4, 0, 8, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(4.0154F, 0.0F, 3.7305F);
        this.leftwing.addChild(leftwing2);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 43, 38, -0.0134F, 0.0F, -4.2441F, 4, 0, 8, 0.0F, false));
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 6, 49, -0.0134F, 0.025F, -4.2441F, 4, 0, 8, 0.0F, false));

        this.rwing = new AdvancedModelRenderer(this);
        this.rwing.setRotationPoint(-6.6524F, -0.6F, -16.1209F);
        this.main.addChild(rwing);
        this.setRotateAngle(rwing, 0.0F, 0.829F, 0.0F);


        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rwing.addChild(rightwing);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 26, 23, -4.0025F, 0.0F, -0.0054F, 4, 0, 8, 0.0F, true));
        this.rightwing.cubeList.add(new ModelBox(rightwing, 18, 0, -4.0025F, 0.025F, -0.0054F, 4, 0, 8, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-4.0154F, 0.0F, 3.7305F);
        this.rightwing.addChild(rightwing2);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 43, 38, -3.9866F, 0.0F, -4.2441F, 4, 0, 8, 0.0F, true));
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 6, 49, -3.9866F, 0.025F, -4.2441F, 4, 0, 8, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.4F, -17.25F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 42, -2.5F, -0.5F, -2.0F, 5, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 38, -2.0F, -0.5F, -4.0F, 4, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, -8.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 14, -3.0F, -1.0F, 0.5F, 6, 2, 7, -0.01F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.0F, 0.7625F, 4.0F);
        this.tail.addChild(backleftfin);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 45, 10, 0.0F, -0.0125F, -3.5F, 4, 0, 7, 0.0F, false));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, -7, 57, 0.0F, 0.0125F, -3.5F, 4, 0, 7, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-3.0F, 0.7625F, 4.0F);
        this.tail.addChild(backrightfin);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 45, 10, -4.0F, -0.0125F, -3.5F, 4, 0, 7, 0.0F, true));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, -7, 57, -4.0F, 0.0125F, -3.5F, 4, 0, 7, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 7.45F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 38, 26, -2.0F, -0.75F, 0.0F, 4, 2, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 8, 0.0F, -3.75F, 1.0F, 0, 3, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 39, 17, -1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 32, 38, -1.0F, -0.5F, 0.0F, 2, 1, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 22, 0.0F, -3.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 32, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 27, 45, 0.0F, -6.5F, 4.0F, 0, 9, 10, 0.0F, false));

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
        this.main.offsetX = -0.02F;
        this.main.offsetZ = -0.01F;
        this.main.offsetY = -0.245F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        this.main.offsetZ = -0.5F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] leftwings = {this.leftwing, this.leftwing2};
        AdvancedModelRenderer[] rightwings = {this.rightwing, this.rightwing2};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        } else if (!ee.getIsMoving()) {
            speed = 0.7F * 0.13F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {

                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed*0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed*0.1F, 0.1F, -3, f2, 1);
                return;
            }


            this.flap(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            //this.swing(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(ee.getIsMoving()|| e.isInWater()) { //if moving, slap fins
                //this.flap(LeftPectoral, speed * 2.5F, 0.4F, true, -3, 0, f2, 1);
                //this.flap(RightPectoral, speed* 2.5F, -0.4F, true, -3, 0, f2, 1);
                this.chainFlap(leftwings, speed* 2.5F, 0.15F, 0, f2, 1);
                this.chainFlap(rightwings, speed* 2.5F, -0.15F, 0, f2, 1);
                this.chainWave(fishTail, speed* 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed* 2.5F, 0.25F, -3, f2, 1);
            }

            else { //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
//                this.flap(LeftPectoral, (speed), 0.25F, true, -3, 0, f2, 1);
//                this.flap(RightPectoral, (speed), -0.25F, true, -3, 0, f2, 1);
                this.chainFlap(leftwings, speed, 0.15F, 0, f2, 1);
                this.chainFlap(rightwings, speed, -0.15F, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            //this.swing(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);


        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPseudorhina e = (EntityPrehistoricFloraPseudorhina) entity;
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
