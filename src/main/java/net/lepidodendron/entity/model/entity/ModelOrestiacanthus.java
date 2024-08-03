package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelOrestiacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer horn;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelOrestiacanthus() {
        this.textureWidth = 48;
        this.textureHeight = 41;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.75F, 1.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -5.0F, -3.5F, 4, 5, 7, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.0F, 0.0F, -3.0F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.2182F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontleftfin.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -0.2F, 0.0F, -0.5F, 5, 0, 7, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.0F, 0.0F, -3.0F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.2182F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontrightfin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, -4.8F, 0.0F, -0.5F, 5, 0, 7, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 3.25F, 3.5F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 31, 2, -1.5F, -8.225F, -10.5F, 3, 3, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 37, 10, -1.0F, -8.225F, -13.5F, 2, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 13, 0.5F, -8.475F, -13.5F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -8.475F, -13.5F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.0F, -8.475F, -12.5F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -3.25F, -7.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 18, -0.5F, -2.0F, -4.0F, 3, 2, 4, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -5.95F, -12.975F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 32, -0.5F, -1.9715F, -0.1128F, 2, 2, 3, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -6.375F, -14.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 38, -0.5F, -0.992F, 0.0139F, 2, 1, 1, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -7.225F, -14.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.0472F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 21, -0.5F, -2.0F, 0.0F, 2, 2, 1, -0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.25F, -7.1F, -12.725F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 38, -1.3F, -0.375F, -0.5F, 2, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 38, -1.2F, -0.375F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -8.225F, -13.5F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6545F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 0, -1.0F, 0.0F, -1.4F, 2, 1, 1, -0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 29, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.horn = new AdvancedModelRenderer(this);
        this.horn.setRotationPoint(0.0F, -8.225F, -8.5F);
        this.head.addChild(horn);
        this.horn.cubeList.add(new ModelBox(horn, 24, 37, -0.5F, -2.0F, 0.0F, 1, 2, 1, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.horn.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 29, -0.5F, -2.0F, -1.1F, 1, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0F, 0.5F);
        this.horn.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 21, -0.75F, -2.0F, -0.5F, 1, 3, 1, -0.001F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 21, -0.25F, -2.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -5.5F, -10.6F);
        this.head.addChild(jaw);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.375F, -0.3F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3534F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 10, -0.5F, -1.0004F, -2.4655F, 2, 1, 1, 0.002F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 18, -0.5F, -1.0004F, -1.9655F, 2, 1, 2, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.45F, -2.375F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 35, -0.5F, 0.0035F, -0.1128F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.875F, -3.4F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 15, -0.5F, -0.042F, 0.2639F, 2, 1, 1, -0.004F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.4352F, 2.7993F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 18, 7, -1.5F, -1.4648F, -0.2993F, 3, 4, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -2.4648F, 3.7007F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 31, 0.5F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.3352F, 0.7007F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 21, -1.5F, -1.15F, -1.0F, 3, 1, 6, -0.001F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.5F, 2.5352F, 3.2007F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.5236F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backleftfin.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.1309F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 0, -0.25F, 0.0F, -0.5F, 3, 0, 5, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.5F, 2.5352F, 3.2007F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.5236F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backrightfin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1309F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 0, -2.75F, 0.0F, -0.5F, 3, 0, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1852F, 5.2007F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 29, -1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.35F, 4.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 25, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 20, 18, 0.0F, -6.0F, 0.0F, 0, 11, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.035F;
        this.main.offsetY = 0.03F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

        //Rotations, positions and sizing:
        this.main.offsetY = 0.0F;
        this.main.offsetX = 0.1F;
        this.main.rotateAngleY = (float)Math.toRadians(-68);
        this.main.rotateAngleX = (float)Math.toRadians(15);
        this.main.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 1.5F;
        this.main.scaleChildren = true;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.main.offsetY = 1.4F;
        //this.main.offsetZ = -0.65F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.4F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.65F, -3, f2, 0.7F);
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.flap(frontleftfin, (float) (speed ), 0.5F, true, 0, 0, f2, 0.5F);
            this.swing(frontleftfin, (float) (speed), 0.2F, true, 0, 0, f2, 0.5F);
            this.flap(frontrightfin, (float) (speed), 0.5F, true, -3, 0, f2, 0.5F);
            this.swing(frontrightfin, (float) (speed), 0.2F, true, -3, 0, f2, 0.5F);
            this.flap(backleftfin, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);
            this.flap(backrightfin, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);

                //this.main.offsetY = 1.25F;
                //this.main.offsetZ = -0.2F;
                this.bob(main, -speed, 2F, false, f2, 1);
            }
        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }


}