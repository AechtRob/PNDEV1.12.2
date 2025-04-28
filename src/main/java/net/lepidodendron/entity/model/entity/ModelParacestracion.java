package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraParacestracion;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParacestracion extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;

    public ModelParacestracion() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.2538F, -6.8383F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -1.6992F, 1.3871F, 6, 4, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 23, -2.5F, -1.2992F, -2.8629F, 5, 3, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 14, 12, 1.7F, -1.4992F, -3.2879F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 14, 12, -2.7F, -1.4992F, -3.2879F, 1, 1, 1, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 14, 10, -2.0F, 1.6008F, -1.2129F, 4, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.4747F, 2.821F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1134F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 14, -2.0F, 0.0028F, 0.0115F, 4, 2, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.5853F, -3.117F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5236F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 21, -2.0F, -0.0152F, -2.9865F, 4, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.625F, -1.7536F, -1.5798F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2081F, -0.066F, 0.3029F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 31, -0.884F, -0.3939F, -2.6737F, 1, 1, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.625F, -1.7536F, -1.5798F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2081F, 0.066F, -0.3029F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 31, -0.116F, -0.3939F, -2.6737F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.5742F, -3.1129F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.144F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 6, -2.0F, -0.0268F, 0.0119F, 4, 2, 6, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.8758F, 3.6371F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.096F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 0, -2.0F, -1.2013F, -1.0204F, 4, 1, 5, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.7008F, 0.6371F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0654F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 27, -2.0F, -0.05F, -0.975F, 4, 1, 3, 0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(3.0F, 1.8008F, 2.3871F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.2618F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 12, 0, 0.2F, 0.0F, -0.75F, 6, 0, 6, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-3.0F, 1.8008F, 2.3871F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.2618F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 12, 0, -6.2F, 0.0F, -0.75F, 6, 0, 6, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.006F, 7.311F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 8, 14, -2.5F, -1.2052F, -0.9239F, 5, 3, 6, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.1392F, 1.7647F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3098F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 18, 0.0F, -3.375F, -0.075F, 0, 5, 5, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 20, -0.5F, -1.375F, -0.825F, 1, 3, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.8552F, 0.0761F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1353F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 31, -2.0F, 0.0F, 0.0F, 4, 1, 5, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.2948F, 0.0761F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1004F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 30, -2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.5F, 1.2948F, 1.5761F);
        this.body.addChild(backleftfin);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.25F, 0.0F, 2.0F);
        this.backleftfin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3054F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 14, -2.9F, 0.0F, -1.85F, 5, 0, 5, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.5F, 1.2948F, 1.5761F);
        this.body.addChild(backrightfin);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.25F, 0.0F, 2.0F);
        this.backrightfin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3054F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 14, -2.1F, 0.0F, -1.85F, 5, 0, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.1193F, 4.879F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 20, 23, -2.0F, -0.3245F, -0.8029F, 4, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.5745F, 2.1971F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0654F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 6, -1.5F, -0.575F, -2.9F, 3, 1, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0839F, 4.0648F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 28, 31, -1.5F, -0.4084F, -0.8676F, 3, 2, 5, -0.02F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, 0.0F, 1.3416F, 2.1324F, 0, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.4235F, 1.8677F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2793F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 34, 0.0F, -3.35F, 0.725F, 0, 5, 4, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 24, -0.5F, -1.35F, -0.275F, 1, 3, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.1584F, 2.1324F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 36, -1.0F, -0.725F, -2.0F, 2, 2, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.3416F, 4.0824F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 37, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.8373F, 3.8684F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 3, 0.0F, -6.2127F, -0.0934F, 0, 10, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.5373F, -0.0934F);
        this.body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5672F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 39, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7008F, -1.2129F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 38, -1.5F, -0.1F, -3.0F, 3, 1, 3, 0.0F, false));

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
        this.setRotateAngle(main, 0.2F, 0.3F, -0.1F);
        this.setRotateAngle(body, 0.05F, -0.1F, 0.0F);
        this.setRotateAngle(body2, 0.05F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.1F, 0.4F, 0.0F);
        this.setRotateAngle(body5, 0.1F, 0.5F, 0.0F);
        this.main.offsetY = -0.28F;
        this.main.render(0.018f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body, 0.05F, -0.1F, 0.0F);
        this.setRotateAngle(body2, 0.05F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.1F, 0.4F, 0.0F);
        this.setRotateAngle(body5, 0.1F, 0.5F, 0.0F);
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
        //this.Root.offsetY = 1.45F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
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
                this.flap(frontleftfin, speed * 2.5F, 0.4F, false, -0, -0.5F, f2, 1);
                this.flap(frontrightfin, speed* 2.5F, -0.4F, false, -0, 0.5F, f2, 1);
                this.chainWave(fishTail, speed* 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed* 2.5F, 0.25F, -3, f2, 1);
            }

            else{ //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
                this.flap(frontleftfin, (speed), 0.25F, false, -0, -0.5F, f2, 1);
                this.flap(frontrightfin, (speed), -0.25F, false, -0, 0.5F, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);



        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraParacestracion e = (EntityPrehistoricFloraParacestracion) entity;
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
