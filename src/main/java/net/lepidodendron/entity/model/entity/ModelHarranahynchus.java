package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHarranahynchus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHarranahynchus extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r14;

    public ModelHarranahynchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -2.0F, -6.1F, 6, 2, 6, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 17, -2.5F, -2.5135F, -5.1647F, 5, 2, 5, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.0F, -0.25F, -6.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0227F, -0.4795F, 0.0492F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 34, 32, 0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.0F, -0.25F, -6.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0227F, 0.4795F, -0.0492F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 34, 32, -5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 30, 44, -1.0F, -1.0F, -3.0F, 4, 1, 3, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 37, 0.0F, -1.0F, -8.0F, 2, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 49, 0.5F, -1.0F, -11.0F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.7822F, -1.0F, -5.8574F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1605F, -0.2185F, 0.0043F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 33, 0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.7822F, -1.0F, -5.8574F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1605F, 0.2185F, -0.0043F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 33, -2.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.7822F, -0.5F, -5.8574F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2007F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 25, 0.0F, -0.5F, 0.0F, 2, 1, 6, -0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.7822F, -0.5F, -5.8574F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2007F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 25, -2.0F, -0.5F, 0.0F, 2, 1, 6, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.5F, -11.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2443F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 41, -0.5F, 0.0F, 0.0F, 1, 0, 6, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, 0.0F, -0.5F, 0.0F, 1, 1, 6, 0.003F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -0.5F, -11.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2443F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 41, -0.5F, 0.0F, 0.0F, 1, 0, 6, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 37, -1.0F, -0.5F, 0.0F, 1, 1, 6, 0.006F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.9914F, -3.1305F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 14, -1.6F, -0.15F, -1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 14, 1.6F, -0.15F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 44, -1.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -1.0F, -3.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 25, -2.0F, -1.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 9, -2.5F, -1.0F, 0.0F, 5, 2, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.5F, 0.5F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 0, -1.5F, 0.025F, -0.425F, 4, 1, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.5F, 0.75F, 1.0F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0193F, -0.2173F, 0.0894F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 13, 48, 0.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.5F, 0.75F, 1.0F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0193F, 0.2173F, -0.0894F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 13, 48, -2.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 9, -2.0F, -1.0F, 0.0F, 4, 2, 5, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.3037F, 0.9957F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0654F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 0, -1.5F, 0.05F, 0.0F, 3, 1, 4, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 29, -1.5F, -1.0F, 0.0F, 3, 2, 5, -0.006F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, 1.5F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 49, 0.0F, -3.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 38, 17, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 37, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.192F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 7, -1.0F, -0.975F, -4.8F, 2, 1, 5, -0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail4.addChild(tail5);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.5F, 0.5F);
        this.tail5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 17, 0.5F, -0.5F, -0.5F, 0, 3, 8, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 45, 0.0F, -0.5F, -0.5F, 1, 1, 5, 0.0F, false));

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


            this.flap(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(ee.getIsMoving()|| e.isInWater()) { //if moving, slap fins
                this.flap(frontLeftFin, speed * 2.5F, 0.4F, false, -0, -0.5F, f2, 1);
                this.flap(frontRightFin, speed* 2.5F, -0.4F, false, -0, 0.5F, f2, 1);
                this.chainWave(fishTail, speed* 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed* 2.5F, 0.25F, -3, f2, 1);
            }

            else{ //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
                this.flap(frontLeftFin, (speed), 0.25F, false, -0, -0.5F, f2, 1);
                this.flap(frontRightFin, (speed), -0.25F, false, -0, 0.5F, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(backLeftFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);



        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHarranahynchus e = (EntityPrehistoricFloraHarranahynchus) entity;
        animator.update(entity);

    }
}
