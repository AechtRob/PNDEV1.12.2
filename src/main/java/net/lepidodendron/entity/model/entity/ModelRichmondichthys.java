package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRichmondichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer leftmax;
    private final AdvancedModelRenderer rightmax;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail5;


    private ModelAnimator animator;

    public ModelRichmondichthys() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 25, 0, -1.5F, -7.0F, -10.0F, 3, 7, 8, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 23, 38, -1.0F, -7.0F, -18.0F, 2, 5, 8, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 64, 62, 0.1F, -6.5F, -17.0F, 1, 2, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 65, 3, 0.175F, -6.0F, -16.5F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 64, 62, -1.1F, -6.5F, -17.0F, 1, 2, 2, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 65, 3, -1.175F, -6.0F, -16.5F, 1, 1, 1, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 64, 56, -0.5F, -6.75F, -20.25F, 1, 2, 3, -0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 65, 0, -0.5F, -4.9F, -18.75F, 1, 1, 1, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.6552F, -21.8976F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5498F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 61, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.5829F, -15.7144F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 50, -0.5F, -2.0F, 0.0F, 2, 2, 6, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.9682F, -18.3754F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 10, -0.5F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -7.0F, -17.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 63, 36, 1.5F, 0.0F, -5.0F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, -7.0F, -18.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 61, 50, 1.5F, 0.0F, -4.0F, 1, 1, 4, 0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -3.5F, -10.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1134F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 53, 59, 0.0F, -2.5F, -4.0F, 1, 5, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -3.5F, -10.0F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1134F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 59, -1.0F, -2.5F, -4.0F, 1, 5, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.45F, -1.25F, -10.5F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.2528F, 0.1733F, -0.5888F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 30, 61, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.45F, -1.25F, -10.5F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.2528F, -0.1733F, 0.5888F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 30, 61, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, true));

        this.leftmax = new AdvancedModelRenderer(this);
        this.leftmax.setRotationPoint(0.5F, -5.1632F, -21.0165F);
        this.main.addChild(leftmax);
        this.setRotateAngle(leftmax, -0.8454F, 0.122F, -0.1251F);
        this.leftmax.cubeList.add(new ModelBox(leftmax, 63, 30, -1.0F, -0.992F, -0.0151F, 1, 1, 4, 0.0F, false));

        this.rightmax = new AdvancedModelRenderer(this);
        this.rightmax.setRotationPoint(-0.5F, -5.1632F, -21.0165F);
        this.main.addChild(rightmax);
        this.setRotateAngle(rightmax, -0.8454F, -0.122F, 0.1251F);
        this.rightmax.cubeList.add(new ModelBox(rightmax, 63, 30, 0.0F, -0.992F, -0.0151F, 1, 1, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -3.0484F, -18.1961F);
        this.main.addChild(jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.025F, -3.2447F, -4.4043F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3098F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 63, -0.5F, 0.0F, 0.0F, 0, 2, 6, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 63, 0.45F, 0.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.0803F, -0.1793F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6327F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 59, -0.5F, -1.0F, -6.0F, 1, 1, 6, -0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.5F, -3.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -1.5F, -3.5F, -0.25F, 3, 7, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0065F, 7.4742F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 17, -1.5F, -2.5065F, 0.0258F, 3, 5, 9, -0.006F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -3.5065F, 0.0258F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0611F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 16, -0.5F, 0.025F, 0.0F, 2, 1, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.4935F, 0.0258F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0567F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 27, -1.0F, -1.025F, 0.0F, 2, 1, 9, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 2.9935F, 0.0258F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.582F, 0.1975F, -0.2898F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 38, 52, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 2.9935F, 0.0258F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.582F, -0.1975F, 0.2898F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 38, 52, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0488F, 7.9935F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 32, -1.0F, -1.5553F, 0.0323F, 2, 3, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -2.6376F, 3.205F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6545F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 63, 20, 0.5F, -5.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.0303F, 0.0323F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 45, -0.5F, 0.0F, 0.2F, 1, 2, 9, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 2.5271F, 3.205F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5672F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 63, 10, 0.5F, 0.0F, 0.025F, 0, 5, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.9447F, 0.0323F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 38, -0.5F, -2.0F, 0.225F, 1, 2, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0385F, 8.2337F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 0, -0.5F, -1.0168F, -0.0013F, 1, 2, 7, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.7668F, -0.2013F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0742F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 52, -0.5F, -0.125F, 0.25F, 1, 1, 7, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.7833F, -0.2013F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0611F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 57, -0.5F, -0.925F, 0.225F, 1, 1, 7, -0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0168F, 6.7987F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 25, 16, 0.0F, -7.0F, 0.0F, 0, 14, 7, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.258F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(235);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.14F;
        this.main.offsetY = -0.19F;
        this.main.offsetZ = 0.06F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.18F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

