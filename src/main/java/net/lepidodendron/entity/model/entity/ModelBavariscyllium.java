package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBavariscyllium;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBavariscyllium extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r9;

    public ModelBavariscyllium() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -1.0F);
        this.main.cubeList.add(new ModelBox(main, 19, 24, -2.5F, -4.0F, 2.0F, 5, 4, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -4.0F, -5.0F, 6, 4, 7, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 21, -2.5F, -0.725F, -5.0F, 5, 1, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.275F, 2.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 18, -2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(3.0F, -0.25F, -1.5F);
        this.main.addChild(frontleftfin);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 12, 0, 0.0F, 0.0F, -3.5F, 5, 0, 7, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-3.0F, -0.25F, -1.5F);
        this.main.addChild(frontrightfin);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 12, 0, -5.0F, 0.0F, -3.5F, 5, 0, 7, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.0F, 8.0F);
        this.main.addChild(head);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.0F, -16.5F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -1.05F, -3.4F, 2, 2, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 26, -2.0F, -1.05F, -3.4F, 1, 2, 7, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 9, 1.0F, -1.05F, -3.4F, 1, 2, 7, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 8, -1.0F, -1.05F, -0.4F, 2, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -4.0F, -13.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1876F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 11, -2.0F, 0.125F, -7.5F, 4, 2, 8, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.5F, -1.0F, -13.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1396F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 37, 0.0489F, -1.825F, -5.6077F, 1, 1, 6, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.5F, -1.0F, -13.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1396F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 37, -1.0489F, -1.825F, -5.6077F, 1, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.5F, -1.0F, -13.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.048F, -0.1396F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 33, -0.0011F, -1.025F, -6.9827F, 1, 2, 7, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -1.0F, -13.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.048F, 0.1396F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 33, -0.9989F, -1.025F, -6.9827F, 1, 2, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -0.425F, -17.025F);
        this.head.addChild(jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.575F, 0.525F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 21, -1.0F, -0.05F, -2.4F, 2, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.0F, 6.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 29, -2.0F, -2.0F, 0.0F, 4, 4, 5, 0.01F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 33, 0.0F, -6.0F, 2.0F, 0, 4, 5, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.0F, 1.75F, 2.5F);
        this.tail.addChild(backleftfin);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 15, 33, 0.0F, 0.0F, -2.5F, 4, 0, 5, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.0F, 1.75F, 2.5F);
        this.tail.addChild(backrightfin);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 15, 33, -4.0F, 0.0F, -2.5F, 4, 0, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 0, -1.5F, -1.25F, -1.0F, 3, 3, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 16, 0.0F, 1.75F, -1.0F, 0, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.5F, 0.25F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 35, -1.5F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 12, -0.5F, 1.0F, 0.0F, 0, 2, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 11, -0.5F, -4.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.95F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 41, 24, -1.0F, -1.0F, 0.0F, 1, 2, 4, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.75F, 3.5F);
        this.tail4.addChild(tail5);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.tail5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -0.925F, -0.75F, 0, 5, 12, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 0, -0.5F, -0.5F, -0.5F, 1, 1, 8, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.02F, -0.01F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, 0.14F, 0.0F);
        this.setRotateAngle(tail3, 0.15F, -0.18F, 0.0F);
        this.setRotateAngle(tail4, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.1F, -0.24F, 0.0F);
        this.main.offsetY = -0.2F;
        this.main.render(0.018f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
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
        EntityPrehistoricFloraBavariscyllium e = (EntityPrehistoricFloraBavariscyllium) entity;
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
