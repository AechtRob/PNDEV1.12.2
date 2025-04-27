package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRevueltosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelRevueltosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;


    private ModelAnimator animator;

    public ModelRevueltosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.0F, 3.5F);
        this.main.cubeList.add(new ModelBox(main, 22, 32, -3.0F, -3.0F, -2.5F, 6, 6, 5, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-3.5F, -0.75F, 0.5F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.1745F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 0, 43, -1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F, false));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 3.5F, -0.05F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.3491F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 0, -1.0F, 0.0F, -1.5F, 2, 5, 2, 0.0F, false));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 4.5F, 0.25F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.1745F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 42, 10, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(3.5F, -0.75F, 0.5F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.1745F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 0, 43, -1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F, true));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 3.5F, -0.05F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.3491F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 0, -1.0F, 0.0F, -1.5F, 2, 5, 2, 0.0F, true));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 4.5F, 0.25F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.1745F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 42, 10, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.75F, 2.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3491F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 17, -2.5F, 0.0F, 0.0F, 5, 5, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 10, -2.0F, 0.0F, -1.0F, 4, 4, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 21, -1.5F, 0.0F, -1.0F, 3, 3, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 38, 37, -1.0F, 0.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.95F, 4.95F);
        this.tail4.addChild(tail5);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.95F, -0.05F);
        this.tail5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 4, -1.5F, -0.925F, -0.05F, 3, 1, 5, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, -0.4F);
        this.tail5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 28, -1.5F, 0.05F, 0.35F, 3, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1392F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -0.25F, -10.0F, 7, 7, 10, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 32, -3.0F, 0.0872F, -2.9962F, 6, 6, 5, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.5F, 3.8372F, -0.4962F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.5672F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 49, 15, -0.5F, -0.9424F, -0.9604F, 2, 4, 2, 0.01F, true));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 3.0576F, 1.0396F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.9163F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 24, 47, -0.5F, -0.009F, -2.009F, 2, 4, 2, 0.0F, true));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.5F, 3.241F, -0.509F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.3054F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 12, 43, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, true));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.5F, 3.8372F, -0.4962F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.5672F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 49, 15, -1.5F, -0.9424F, -0.9604F, 2, 4, 2, 0.01F, false));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 3.0576F, 1.0396F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.9163F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 24, 47, -1.5F, -0.009F, -2.009F, 2, 4, 2, 0.0F, false));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(-0.5F, 3.241F, -0.509F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.3054F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 12, 43, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.389F, -2.4975F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 24, 0, -2.5F, -0.0518F, -4.9986F, 5, 4, 5, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 3.1982F, -2.9986F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 21, -2.5F, -0.8F, -1.9F, 4, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.9732F, -4.9486F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 12, 48, -2.0F, -2.0573F, -3.624F, 4, 2, 2, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 39, 0, -3.0F, -2.0573F, -1.624F, 6, 2, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 29, -3.0F, -0.6573F, -1.624F, 6, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 48, 37, -2.0F, -0.6573F, -3.624F, 4, 1, 2, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.3427F, -3.624F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 32, -2.0F, -1.6F, -1.0F, 3, 1, 1, -0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 4, 0.75F, -0.75F, -2.5F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 4, -1.75F, -0.75F, -2.5F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 45, -2.0F, -1.0F, -3.0F, 3, 1, 3, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.25F, 0.1555F, -3.0972F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0087F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 3, 0.0F, -0.6F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 3, 2.5F, -0.6F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.1573F, -6.474F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.8727F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, -1.0F, 0.0987F, -1.1363F, 2, 1, 1, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -2.0573F, -3.624F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3578F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 45, -2.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, -1.0573F, -3.124F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2618F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 0, -1.075F, -0.5F, -0.1F, 1, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 17, -1.225F, -1.0F, -0.5F, 1, 2, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, -1.0573F, -3.124F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2618F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 0, 0.075F, -0.5F, -0.1F, 1, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 17, 0.225F, -1.0F, -0.5F, 1, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.4464F, 0.35F, 0.3639F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 53, -1.5536F, -2.375F, -1.6639F, 4, 3, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 34, -2.0536F, -0.0607F, -1.9877F, 5, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 25, -1.5536F, -0.0607F, -3.9877F, 4, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 7, -1.0536F, -0.3107F, -3.2377F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 7, 1.9464F, -0.3107F, -3.2377F, 0, 1, 1, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 40, -1.5536F, 0.7393F, -1.9877F, 4, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 7, -1.0536F, 0.7393F, -3.9627F, 3, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.4464F, 1.6774F, -3.8292F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4058F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 17, -1.0F, -0.925F, -3.0731F, 2, 1, 3, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.4464F, 0.2489F, -5.2327F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.144F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 43, -1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.6464F, -2.1428F, -6.0907F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1702F, 0.691F, -0.1091F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 1, -0.35F, 1.6F, -0.625F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.8464F, -0.0607F, -5.1877F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.2F, -0.35F, 0.25F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -2.6F, -0.35F, 0.25F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.7536F, -2.1428F, -6.0907F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1702F, -0.691F, 0.1091F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 1, 0.35F, 1.6F, -0.625F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck.offsetZ = -0.07F;
        this.neck.offsetY = -0.0F;
        this.neck.offsetX = -0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.30F;
        this.main.offsetX = -0.05F;
        this.main.scaleChildren = true;
        float scaler = 0.9F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraRevueltosaurus entityRevueltosaurus = (EntityPrehistoricFloraRevueltosaurus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityRevueltosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityRevueltosaurus.getAnimation() == entityRevueltosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityRevueltosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityRevueltosaurus.getIsMoving()) {
                    if (entityRevueltosaurus.getAnimation() != entityRevueltosaurus.EAT_ANIMATION
                            && entityRevueltosaurus.getAnimation() != entityRevueltosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityRevueltosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraRevueltosaurus ee = (EntityPrehistoricFloraRevueltosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRevueltosaurus entity = (EntityPrehistoricFloraRevueltosaurus) entitylivingbaseIn;
        int animCycle = 112;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -0.5 + (((tickAnim - 60) / 18) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -0.5 + (((tickAnim - 78) / 17) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (-0.05-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = -0.05 + (((tickAnim - 60) / 18) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = -0.05 + (((tickAnim - 78) / 17) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 60) / 18) * (1-(1)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 78) / 17) * (0-(1)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 60) / 18) * (1-(1)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 78) / 17) * (0-(1)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*128))*0.5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*128-50))*1), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*128-100))*1.5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*128-150))*2), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*128-180))*2.5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -3.75 + (((tickAnim - 30) / 15) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -3.75 + (((tickAnim - 45) / 15) * (-5.5-(-3.75)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -5.5 + (((tickAnim - 60) / 18) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -5.5 + (((tickAnim - 78) / 17) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 95) / 8) * (0.75-(0)));
            yy = 0 + (((tickAnim - 95) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 8) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0.75 + (((tickAnim - 103) / 10) * (0-(0.75)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 2.25 + (((tickAnim - 30) / 15) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 78) {
            xx = 2.25 + (((tickAnim - 45) / 33) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 45) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 33) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 2.25 + (((tickAnim - 78) / 17) * (0-(2.25)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 95) / 8) * (-1-(0)));
            yy = 0 + (((tickAnim - 95) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 8) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = -1 + (((tickAnim - 103) / 10) * (0-(-1)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-41.98461-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.37226-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-4.73542-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -41.98461 + (((tickAnim - 30) / 15) * (-41.98461-(-41.98461)));
            yy = -0.37226 + (((tickAnim - 30) / 15) * (-0.37226-(-0.37226)));
            zz = -4.73542 + (((tickAnim - 30) / 15) * (-4.73542-(-4.73542)));
        }
        else if (tickAnim >= 45 && tickAnim < 78) {
            xx = -41.98461 + (((tickAnim - 45) / 33) * (-41.98461-(-41.98461)));
            yy = -0.37226 + (((tickAnim - 45) / 33) * (-0.37226-(-0.37226)));
            zz = -4.73542 + (((tickAnim - 45) / 33) * (-4.73542-(-4.73542)));
        }
        else if (tickAnim >= 78 && tickAnim < 87) {
            xx = -41.98461 + (((tickAnim - 78) / 9) * (-10.2423-(-41.98461)));
            yy = -0.37226 + (((tickAnim - 78) / 9) * (-0.18613-(-0.37226)));
            zz = -4.73542 + (((tickAnim - 78) / 9) * (-2.36771-(-4.73542)));
        }
        else if (tickAnim >= 87 && tickAnim < 95) {
            xx = -10.2423 + (((tickAnim - 87) / 8) * (0-(-10.2423)));
            yy = -0.18613 + (((tickAnim - 87) / 8) * (0-(-0.18613)));
            zz = -2.36771 + (((tickAnim - 87) / 8) * (0-(-2.36771)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-19.66339-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (2.25761-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.60803-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -19.66339 + (((tickAnim - 14) / 16) * (27.14338-(-19.66339)));
            yy = 2.25761 + (((tickAnim - 14) / 16) * (3.80647-(2.25761)));
            zz = 0.60803 + (((tickAnim - 14) / 16) * (4.31285-(0.60803)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 27.14338 + (((tickAnim - 30) / 15) * (27.14338-(27.14338)));
            yy = 3.80647 + (((tickAnim - 30) / 15) * (3.80647-(3.80647)));
            zz = 4.31285 + (((tickAnim - 30) / 15) * (4.31285-(4.31285)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 27.14338 + (((tickAnim - 45) / 15) * (38.14338-(27.14338)));
            yy = 3.80647 + (((tickAnim - 45) / 15) * (3.80647-(3.80647)));
            zz = 4.31285 + (((tickAnim - 45) / 15) * (4.31285-(4.31285)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 38.14338 + (((tickAnim - 60) / 18) * (38.14338-(38.14338)));
            yy = 3.80647 + (((tickAnim - 60) / 18) * (3.80647-(3.80647)));
            zz = 4.31285 + (((tickAnim - 60) / 18) * (4.31285-(4.31285)));
        }
        else if (tickAnim >= 78 && tickAnim < 87) {
            xx = 38.14338 + (((tickAnim - 78) / 9) * (-16.77304-(38.14338)));
            yy = 3.80647 + (((tickAnim - 78) / 9) * (3.25672-(3.80647)));
            zz = 4.31285 + (((tickAnim - 78) / 9) * (0.05232-(4.31285)));
        }
        else if (tickAnim >= 87 && tickAnim < 95) {
            xx = -16.77304 + (((tickAnim - 87) / 8) * (0-(-16.77304)));
            yy = 3.25672 + (((tickAnim - 87) / 8) * (0-(3.25672)));
            zz = 0.05232 + (((tickAnim - 87) / 8) * (0-(0.05232)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (78.28-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 78.28 + (((tickAnim - 14) / 16) * (16-(78.28)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 16 + (((tickAnim - 30) / 15) * (16-(16)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 16 + (((tickAnim - 45) / 15) * (8.25-(16)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 8.25 + (((tickAnim - 60) / 18) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 87) {
            xx = 8.25 + (((tickAnim - 78) / 9) * (74.63-(8.25)));
            yy = 0 + (((tickAnim - 78) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 9) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 95) {
            xx = 74.63 + (((tickAnim - 87) / 8) * (0-(74.63)));
            yy = 0 + (((tickAnim - 87) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.395-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-1.025-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 1.395 + (((tickAnim - 14) / 16) * (0.15-(1.395)));
            zz = -1.025 + (((tickAnim - 14) / 16) * (0-(-1.025)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 30) / 15) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 45) / 15) * (0-(0.15)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 78) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 9) * (1.425-(0)));
            zz = 0 + (((tickAnim - 78) / 9) * (-1.075-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 87) / 8) * (0-(0)));
            yy = 1.425 + (((tickAnim - 87) / 8) * (0-(1.425)));
            zz = -1.075 + (((tickAnim - 87) / 8) * (0-(-1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -5.75 + (((tickAnim - 30) / 15) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -5.75 + (((tickAnim - 45) / 15) * (-9.5-(-5.75)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -9.5 + (((tickAnim - 60) / 18) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -9.5 + (((tickAnim - 78) / 17) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 18.75 + (((tickAnim - 30) / 15) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 18.75 + (((tickAnim - 45) / 15) * (34.75-(18.75)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 34.75 + (((tickAnim - 60) / 18) * (34.75-(34.75)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 34.75 + (((tickAnim - 78) / 17) * (0-(34.75)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -11.5 + (((tickAnim - 30) / 15) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -11.5 + (((tickAnim - 45) / 15) * (-20.25-(-11.5)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -20.25 + (((tickAnim - 60) / 18) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -20.25 + (((tickAnim - 78) / 17) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            yy = -0.15 + (((tickAnim - 60) / 18) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            yy = -0.15 + (((tickAnim - 78) / 17) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-1.83981-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.05391-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.99855-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -1.83981 + (((tickAnim - 14) / 16) * (-1.25-(-1.83981)));
            yy = -0.05391 + (((tickAnim - 14) / 16) * (0-(-0.05391)));
            zz = -0.99855 + (((tickAnim - 14) / 16) * (0-(-0.99855)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -1.25 + (((tickAnim - 30) / 5) * (-1.08279-(-1.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (-0.0625-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.99805-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -1.08279 + (((tickAnim - 35) / 10) * (-0.75-(-1.08279)));
            yy = -0.0625 + (((tickAnim - 35) / 10) * (0-(-0.0625)));
            zz = 0.99805 + (((tickAnim - 35) / 10) * (0-(0.99805)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -0.75 + (((tickAnim - 45) / 8) * (-3.53-(-0.75)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -3.53 + (((tickAnim - 53) / 7) * (-3.5-(-3.53)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -3.5 + (((tickAnim - 60) / 3) * (-4-(-3.5)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = -4 + (((tickAnim - 63) / 2) * (-3.5-(-4)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = -3.5 + (((tickAnim - 65) / 8) * (-4-(-3.5)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -4 + (((tickAnim - 73) / 5) * (-4-(-4)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -4 + (((tickAnim - 78) / 5) * (-5.75-(-4)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -5.75 + (((tickAnim - 83) / 7) * (3.75-(-5.75)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = 3.75 + (((tickAnim - 90) / 7) * (5.75-(3.75)));
            yy = 0 + (((tickAnim - 90) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 7) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = 5.75 + (((tickAnim - 97) / 6) * (1-(5.75)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 108) {
            xx = 1 + (((tickAnim - 103) / 5) * (-1.75-(1)));
            yy = 0 + (((tickAnim - 103) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 5) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = -1.75 + (((tickAnim - 108) / 5) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.05-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -0.05 + (((tickAnim - 35) / 5) * (0-(-0.05)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (-0.05-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = -0.05 + (((tickAnim - 53) / 7) * (0.2-(-0.05)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 60) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0.2 + (((tickAnim - 65) / 8) * (0.2-(0.2)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 73) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 78) / 5) * (0.45-(0.2)));
        }
        else if (tickAnim >= 83 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 83) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 20) * (0-(0)));
            zz = 0.45 + (((tickAnim - 83) / 20) * (0-(0.45)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-7.12-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -7.12 + (((tickAnim - 14) / 16) * (4.5-(-7.12)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 4.5 + (((tickAnim - 30) / 5) * (0-(4.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (3.25-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 3.25 + (((tickAnim - 40) / 5) * (2.25-(3.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 2.25 + (((tickAnim - 45) / 8) * (-3.25-(2.25)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -3.25 + (((tickAnim - 53) / 7) * (8.75-(-3.25)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 8.75 + (((tickAnim - 60) / 3) * (10.25-(8.75)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 10.25 + (((tickAnim - 63) / 2) * (8.75-(10.25)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 8.75 + (((tickAnim - 65) / 8) * (-11.75-(8.75)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -11.75 + (((tickAnim - 73) / 5) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 78) / 5) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 84) {
            xx = -3.5 + (((tickAnim - 83) / 1) * (-40.205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-35-(-3.5)));
            yy = 0 + (((tickAnim - 83) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 1) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -40.205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-35 + (((tickAnim - 84) / 6) * (5.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+150))*12-(-40.205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-35)));
            yy = 0 + (((tickAnim - 84) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 6) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 97) {
            xx = 5.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+150))*12 + (((tickAnim - 90) / 7) * (-0.75-(5.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+150))*12)));
            yy = 0 + (((tickAnim - 90) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 7) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = -0.75 + (((tickAnim - 97) / 6) * (-10-(-0.75)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 108) {
            xx = -10 + (((tickAnim - 103) / 5) * (0-(-10)));
            yy = 0 + (((tickAnim - 103) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 5) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.075-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -0.075 + (((tickAnim - 35) / 5) * (0-(-0.075)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (-0.075-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = -0.075 + (((tickAnim - 53) / 7) * (0-(-0.075)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (-0.075-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = -0.075 + (((tickAnim - 73) / 5) * (0-(-0.075)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0.1-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 83) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 30) * (0-(0)));
            zz = 0.1 + (((tickAnim - 83) / 30) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 16.5 + (((tickAnim - 14) / 16) * (0-(16.5)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (14.75-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 14.75 + (((tickAnim - 35) / 3) * (0-(14.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (2.75-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 2.75 + (((tickAnim - 43) / 2) * (0-(2.75)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (22.5-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 22.5 + (((tickAnim - 53) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 65) / 8) * (21.75-(0)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 21.75 + (((tickAnim - 73) / 5) * (0-(21.75)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 78) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 19) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 97) / 6) * (9.75-(0)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 105) {
            xx = 9.75 + (((tickAnim - 103) / 2) * (0-(9.75)));
            yy = 0 + (((tickAnim - 103) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 2) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 105) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
       

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRevueltosaurus entity = (EntityPrehistoricFloraRevueltosaurus) entitylivingbaseIn;
        int animCycle = 23;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -3.75 + (((tickAnim - 8) / 15) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -6 + (((tickAnim - 8) / 9) * (-15.43-(-6)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -15.43 + (((tickAnim - 17) / 6) * (0-(-15.43)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 17.25 + (((tickAnim - 8) / 9) * (25.25-(17.25)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 25.25 + (((tickAnim - 17) / 6) * (0-(25.25)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRevueltosaurus entity = (EntityPrehistoricFloraRevueltosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.75 + (((tickAnim - 10) / 10) * (0-(4.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 10) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.5 + (((tickAnim - 10) / 10) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 10) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 10) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.5 + (((tickAnim - 10) / 10) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 10) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.72492-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.64507-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.45362-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 10.72492 + (((tickAnim - 10) / 7) * (-0.52508-(10.72492)));
            yy = 0.64507 + (((tickAnim - 10) / 7) * (0.64507-(0.64507)));
            zz = -4.45362 + (((tickAnim - 10) / 7) * (-4.45362-(-4.45362)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -0.52508 + (((tickAnim - 17) / 3) * (0-(-0.52508)));
            yy = 0.64507 + (((tickAnim - 17) / 3) * (0-(0.64507)));
            zz = -4.45362 + (((tickAnim - 17) / 3) * (0-(-4.45362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.5 + (((tickAnim - 5) / 5) * (0-(9.5)));
            yy = -3 + (((tickAnim - 5) / 5) * (-6-(-3)));
            zz = -1.125 + (((tickAnim - 5) / 5) * (-2.25-(-1.125)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0.53125-(0)));
            yy = -6 + (((tickAnim - 10) / 1) * (-6-(-6)));
            zz = -2.25 + (((tickAnim - 10) / 1) * (-2.25-(-2.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.53125 + (((tickAnim - 11) / 2) * (-11.875-(0.53125)));
            yy = -6 + (((tickAnim - 11) / 2) * (-6-(-6)));
            zz = -2.25 + (((tickAnim - 11) / 2) * (-2.25-(-2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -11.875 + (((tickAnim - 13) / 4) * (-1.5-(-11.875)));
            yy = -6 + (((tickAnim - 13) / 4) * (-6-(-6)));
            zz = -2.25 + (((tickAnim - 13) / 4) * (-2.25-(-2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -1.5 + (((tickAnim - 17) / 3) * (0-(-1.5)));
            yy = -6 + (((tickAnim - 17) / 3) * (0-(-6)));
            zz = -2.25 + (((tickAnim - 17) / 3) * (0-(-2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 5) / 5) * (0-(21)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (9.75-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 9.75 + (((tickAnim - 13) / 4) * (0-(9.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRevueltosaurus entity = (EntityPrehistoricFloraRevueltosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 25 + (((tickAnim - 15) / 17) * (-15-(25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 32) / 18) * (0-(-15)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 29.5 + (((tickAnim - 15) / 3) * (34.4-(29.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 34.4 + (((tickAnim - 18) / 6) * (-3.29-(34.4)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -3.29 + (((tickAnim - 24) / 8) * (0-(-3.29)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0.5 + (((tickAnim - 18) / 6) * (1.025-(0.5)));
            zz = -0.575 + (((tickAnim - 18) / 6) * (0-(-0.575)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 1.025 + (((tickAnim - 24) / 8) * (0-(1.025)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (41-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 41 + (((tickAnim - 15) / 3) * (65.23-(41)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 65.23 + (((tickAnim - 18) / 2) * (72.28-(65.23)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 72.28 + (((tickAnim - 20) / 4) * (33.31-(72.28)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 33.31 + (((tickAnim - 24) / 7) * (0-(33.31)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 31) / 1) * (14.25-(0)));
            yy = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 1) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 14.25 + (((tickAnim - 32) / 18) * (0-(14.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 15) / 3) * (0.745-(0.45)));
            zz = -0.225 + (((tickAnim - 15) / 3) * (-0.635-(-0.225)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.745 + (((tickAnim - 18) / 2) * (1.88-(0.745)));
            zz = -0.635 + (((tickAnim - 18) / 2) * (-0.41-(-0.635)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 1.88 + (((tickAnim - 20) / 2) * (2.225-(1.88)));
            zz = -0.41 + (((tickAnim - 20) / 2) * (-0.26-(-0.41)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 2.225 + (((tickAnim - 22) / 2) * (1.245-(2.225)));
            zz = -0.26 + (((tickAnim - 22) / 2) * (-0.065-(-0.26)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            yy = 1.245 + (((tickAnim - 24) / 7) * (-0.625-(1.245)));
            zz = -0.065 + (((tickAnim - 24) / 7) * (0-(-0.065)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            yy = -0.625 + (((tickAnim - 31) / 1) * (-0.225-(-0.625)));
            zz = 0 + (((tickAnim - 31) / 1) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -0.225 + (((tickAnim - 32) / 18) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRevueltosaurus entity = (EntityPrehistoricFloraRevueltosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 20) / 10) * (-6-(-6)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 30) / 20) * (0-(-6)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.975 + (((tickAnim - 20) / 10) * (-1.975-(-1.975)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.975 + (((tickAnim - 30) / 20) * (0-(-1.975)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.25 + (((tickAnim - 20) / 10) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 30) / 20) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 45.5 + (((tickAnim - 20) / 10) * (45.5-(45.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 45.5 + (((tickAnim - 30) / 20) * (0-(45.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 20) / 10) * (0.275-(0.275)));
            zz = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.275 + (((tickAnim - 30) / 20) * (0-(0.275)));
            zz = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -33.75 + (((tickAnim - 20) / 10) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -33.75 + (((tickAnim - 30) / 20) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.25 + (((tickAnim - 20) / 10) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 30) / 20) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 45.5 + (((tickAnim - 20) / 10) * (45.5-(45.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 45.5 + (((tickAnim - 30) / 20) * (0-(45.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 20) / 10) * (0.275-(0.275)));
            zz = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.275 + (((tickAnim - 30) / 20) * (0-(0.275)));
            zz = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -33.75 + (((tickAnim - 20) / 10) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -33.75 + (((tickAnim - 30) / 20) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(0);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(0);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -7 + (((tickAnim - 7) / 13) * (0-(-7)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 36) / 14) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -1.75 + (((tickAnim - 3) / 4) * (2.58-(-1.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 2.58 + (((tickAnim - 7) / 13) * (9.25-(2.58)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 20) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 9.25 + (((tickAnim - 30) / 6) * (6.75-(9.25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 6.75 + (((tickAnim - 36) / 7) * (-2.78-(6.75)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -2.78 + (((tickAnim - 43) / 7) * (0-(-2.78)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (3.5-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 7) / 13) * (0-(3.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 30) / 16) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 30) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 16) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 46) / 4) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (10.5-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 10.5 + (((tickAnim - 7) / 13) * (4.5-(10.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.5 + (((tickAnim - 20) / 10) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 4.5 + (((tickAnim - 30) / 6) * (6.44-(4.5)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 6.44 + (((tickAnim - 36) / 7) * (12.66-(6.44)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 12.66 + (((tickAnim - 43) / 3) * (0-(12.66)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 20) / 10) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 30) / 20) * (0-(8.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13 + (((tickAnim - 20) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 30) / 20) * (0-(-13)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.75 + (((tickAnim - 20) / 10) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 30) / 20) * (0-(9.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 20) / 10) * (0.525-(0.525)));
            zz = 0.125 + (((tickAnim - 20) / 10) * (0.125-(0.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            zz = 0.125 + (((tickAnim - 30) / 20) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 20) / 10) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 30) / 20) * (0-(8.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13 + (((tickAnim - 20) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 30) / 20) * (0-(-13)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.75 + (((tickAnim - 20) / 10) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 30) / 20) * (0-(9.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 20) / 10) * (0.525-(0.525)));
            zz = 0.125 + (((tickAnim - 20) / 10) * (0.125-(0.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            zz = 0.125 + (((tickAnim - 30) / 20) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.75 + (((tickAnim - 20) / 10) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 30) / 20) * (0-(6.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRevueltosaurus entity = (EntityPrehistoricFloraRevueltosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*3.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.18);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-90))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-90))*-0.3);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -23.25 + (((tickAnim - 0) / 12) * (28.31507-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (-4.7479-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-1.56941-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 28.31507 + (((tickAnim - 12) / 7) * (-3.57295-(28.31507)));
            yy = -4.7479 + (((tickAnim - 12) / 7) * (6.55789-(-4.7479)));
            zz = -1.56941 + (((tickAnim - 12) / 7) * (10.74929-(-1.56941)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -3.57295 + (((tickAnim - 19) / 6) * (-23.25-(-3.57295)));
            yy = 6.55789 + (((tickAnim - 19) / 6) * (0-(6.55789)));
            zz = 10.74929 + (((tickAnim - 19) / 6) * (0-(10.74929)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 6 + (((tickAnim - 0) / 12) * (23.75-(6)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 23.75 + (((tickAnim - 12) / 3) * (36.31-(23.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 36.31 + (((tickAnim - 15) / 4) * (-0.09-(36.31)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -0.09 + (((tickAnim - 19) / 6) * (6-(-0.09)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 12) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0.855-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0.855 + (((tickAnim - 15) / 4) * (1.075-(0.855)));
            zz = -0.575 + (((tickAnim - 15) / 4) * (0-(-0.575)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 1.075 + (((tickAnim - 19) / 6) * (-0.475-(1.075)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17 + (((tickAnim - 0) / 5) * (-10.7-(17)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10.7 + (((tickAnim - 5) / 3) * (-7.44-(-10.7)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -7.44 + (((tickAnim - 8) / 4) * (39.5-(-7.44)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 39.5 + (((tickAnim - 12) / 3) * (56.37-(39.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 56.37 + (((tickAnim - 15) / 4) * (49.19-(56.37)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 49.19 + (((tickAnim - 19) / 3) * (0-(49.19)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (17-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 5) / 3) * (-0.095-(0.1)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.095 + (((tickAnim - 8) / 4) * (0.525-(-0.095)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 12) / 3) * (0.905-(0.525)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.905 + (((tickAnim - 15) / 3) * (2.02-(0.905)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 2.02 + (((tickAnim - 18) / 1) * (1.525-(2.02)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.525 + (((tickAnim - 19) / 3) * (-0.35-(1.525)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 22) / 3) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 28.31507 + (((tickAnim - 0) / 8) * (-3.57295-(28.31507)));
            yy = -4.7479 + (((tickAnim - 0) / 8) * (-6.55789-(-4.7479)));
            zz = -1.56941 + (((tickAnim - 0) / 8) * (-10.74929-(-1.56941)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -3.57295 + (((tickAnim - 8) / 4) * (-23.25-(-3.57295)));
            yy = -6.55789 + (((tickAnim - 8) / 4) * (0-(-6.55789)));
            zz = -10.74929 + (((tickAnim - 8) / 4) * (0-(-10.74929)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.25 + (((tickAnim - 12) / 13) * (28.31507-(-23.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (-4.7479-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (-1.56941-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.75 + (((tickAnim - 0) / 3) * (36.31-(23.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 36.31 + (((tickAnim - 3) / 5) * (-0.09-(36.31)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.09 + (((tickAnim - 8) / 4) * (6-(-0.09)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 6 + (((tickAnim - 12) / 13) * (23.75-(6)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.855-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.855 + (((tickAnim - 3) / 5) * (1.075-(0.855)));
            zz = -0.575 + (((tickAnim - 3) / 5) * (0-(-0.575)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.075 + (((tickAnim - 8) / 4) * (-0.475-(1.075)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -0.475 + (((tickAnim - 12) / 13) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39.5 + (((tickAnim - 0) / 3) * (56.37-(39.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 56.37 + (((tickAnim - 3) / 5) * (49.19-(56.37)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 49.19 + (((tickAnim - 8) / 2) * (0-(49.19)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (17-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 17 + (((tickAnim - 12) / 4) * (-0.37-(17)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -0.37 + (((tickAnim - 16) / 2) * (-17.88-(-0.37)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -17.88 + (((tickAnim - 18) / 7) * (39.5-(-17.88)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 3) * (0.905-(0.525)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.905 + (((tickAnim - 3) / 3) * (2.02-(0.905)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 2.02 + (((tickAnim - 6) / 2) * (1.525-(2.02)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.525 + (((tickAnim - 8) / 2) * (-0.35-(1.525)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 10) / 2) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (-0.34-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.34 + (((tickAnim - 18) / 7) * (0.525-(-0.34)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-180))*7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-210))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-240))*11), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-3.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*4.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-2));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -53.3469 + (((tickAnim - 0) / 13) * (28.2791-(-53.3469)));
            yy = -1.2293 + (((tickAnim - 0) / 13) * (11.21178-(-1.2293)));
            zz = -14.19797 + (((tickAnim - 0) / 13) * (-10.02608-(-14.19797)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 28.2791 + (((tickAnim - 13) / 5) * (-15.01336-(28.2791)));
            yy = 11.21178 + (((tickAnim - 13) / 5) * (10.97874-(11.21178)));
            zz = -10.02608 + (((tickAnim - 13) / 5) * (-29.79759-(-10.02608)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -15.01336 + (((tickAnim - 18) / 7) * (-53.3469-(-15.01336)));
            yy = 10.97874 + (((tickAnim - 18) / 7) * (-1.2293-(10.97874)));
            zz = -29.79759 + (((tickAnim - 18) / 7) * (-14.19797-(-29.79759)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 30.28754 + (((tickAnim - 0) / 13) * (17.39315-(30.28754)));
            yy = 2.56975 + (((tickAnim - 0) / 13) * (5.64369-(2.56975)));
            zz = 17.23349 + (((tickAnim - 0) / 13) * (7.96346-(17.23349)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.39315 + (((tickAnim - 13) / 2) * (19.2757-(17.39315)));
            yy = 5.64369 + (((tickAnim - 13) / 2) * (4.82313-(5.64369)));
            zz = 7.96346 + (((tickAnim - 13) / 2) * (5.21021-(7.96346)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 19.2757 + (((tickAnim - 15) / 3) * (-31.70922-(19.2757)));
            yy = 4.82313 + (((tickAnim - 15) / 3) * (3.182-(4.82313)));
            zz = 5.21021 + (((tickAnim - 15) / 3) * (-0.29631-(5.21021)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -31.70922 + (((tickAnim - 18) / 7) * (30.28754-(-31.70922)));
            yy = 3.182 + (((tickAnim - 18) / 7) * (2.56975-(3.182)));
            zz = -0.29631 + (((tickAnim - 18) / 7) * (17.23349-(-0.29631)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 13) * (0.55-(0.275)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 13) / 5) * (0.175-(0.55)));
            zz = 0.1 + (((tickAnim - 13) / 5) * (0-(0.1)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.175 + (((tickAnim - 18) / 7) * (0.275-(0.175)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 22 + (((tickAnim - 0) / 5) * (-6-(22)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -6 + (((tickAnim - 5) / 4) * (11.83-(-6)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 11.83 + (((tickAnim - 9) / 4) * (72-(11.83)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 72 + (((tickAnim - 13) / 2) * (88.83-(72)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 88.83 + (((tickAnim - 15) / 3) * (91.75-(88.83)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 91.75 + (((tickAnim - 18) / 4) * (22.63-(91.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 22.63 + (((tickAnim - 22) / 3) * (22-(22.63)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 3) * (0.64-(0.2)));
            zz = -0.2 + (((tickAnim - 0) / 3) * (-0.1-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.64 + (((tickAnim - 3) / 2) * (0.475-(0.64)));
            zz = -0.1 + (((tickAnim - 3) / 2) * (0-(-0.1)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 5) / 8) * (1.85-(0.475)));
            zz = 0 + (((tickAnim - 5) / 8) * (-0.9-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.85 + (((tickAnim - 13) / 2) * (2-(1.85)));
            zz = -0.9 + (((tickAnim - 13) / 2) * (-1.08-(-0.9)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 2 + (((tickAnim - 15) / 3) * (1.705-(2)));
            zz = -1.08 + (((tickAnim - 15) / 3) * (-1.45-(-1.08)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.705 + (((tickAnim - 18) / 4) * (0-(1.705)));
            zz = -1.45 + (((tickAnim - 18) / 4) * (0-(-1.45)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 28.2791 + (((tickAnim - 0) / 6) * (-15.01336-(28.2791)));
            yy = -11.21178 + (((tickAnim - 0) / 6) * (-10.97874-(-11.21178)));
            zz = 10.02608 + (((tickAnim - 0) / 6) * (29.79759-(10.02608)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -15.01336 + (((tickAnim - 6) / 7) * (-53.3469-(-15.01336)));
            yy = -10.97874 + (((tickAnim - 6) / 7) * (1.2293-(-10.97874)));
            zz = 29.79759 + (((tickAnim - 6) / 7) * (14.19797-(29.79759)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -53.3469 + (((tickAnim - 13) / 12) * (28.2791-(-53.3469)));
            yy = 1.2293 + (((tickAnim - 13) / 12) * (-11.21178-(1.2293)));
            zz = 14.19797 + (((tickAnim - 13) / 12) * (10.02608-(14.19797)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.39315 + (((tickAnim - 0) / 2) * (19.2757-(17.39315)));
            yy = -5.64369 + (((tickAnim - 0) / 2) * (-4.82313-(-5.64369)));
            zz = -7.96346 + (((tickAnim - 0) / 2) * (-5.21021-(-7.96346)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 19.2757 + (((tickAnim - 2) / 4) * (-31.70922-(19.2757)));
            yy = -4.82313 + (((tickAnim - 2) / 4) * (-3.182-(-4.82313)));
            zz = -5.21021 + (((tickAnim - 2) / 4) * (-0.29631-(-5.21021)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -31.70922 + (((tickAnim - 6) / 7) * (30.28754-(-31.70922)));
            yy = -3.182 + (((tickAnim - 6) / 7) * (-2.56975-(-3.182)));
            zz = -0.29631 + (((tickAnim - 6) / 7) * (-17.23349-(-0.29631)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 30.28754 + (((tickAnim - 13) / 12) * (17.39315-(30.28754)));
            yy = -2.56975 + (((tickAnim - 13) / 12) * (-5.64369-(-2.56975)));
            zz = -17.23349 + (((tickAnim - 13) / 12) * (-7.96346-(-17.23349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 6) * (0.175-(0.55)));
            zz = 0.1 + (((tickAnim - 0) / 6) * (0-(0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 7) * (0.275-(0.175)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.275 + (((tickAnim - 13) / 12) * (0.55-(0.275)));
            zz = 0 + (((tickAnim - 13) / 12) * (0.1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 72 + (((tickAnim - 0) / 2) * (88.83-(72)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 88.83 + (((tickAnim - 2) / 4) * (91.75-(88.83)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 91.75 + (((tickAnim - 6) / 4) * (22.63-(91.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.63 + (((tickAnim - 10) / 3) * (22-(22.63)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 22 + (((tickAnim - 13) / 4) * (0-(22)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (11.83-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 11.83 + (((tickAnim - 20) / 5) * (72-(11.83)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.85 + (((tickAnim - 0) / 2) * (2-(1.85)));
            zz = -0.9 + (((tickAnim - 0) / 2) * (-1.08-(-0.9)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 2 + (((tickAnim - 2) / 4) * (1.705-(2)));
            zz = -1.08 + (((tickAnim - 2) / 4) * (-1.45-(-1.08)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 1.705 + (((tickAnim - 6) / 4) * (0-(1.705)));
            zz = -1.45 + (((tickAnim - 6) / 4) * (0-(-1.45)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 13) / 2) * (0.64-(0.2)));
            zz = -0.2 + (((tickAnim - 13) / 2) * (-0.1-(-0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.64 + (((tickAnim - 15) / 2) * (0.475-(0.64)));
            zz = -0.1 + (((tickAnim - 15) / 2) * (0-(-0.1)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 17) / 8) * (1.85-(0.475)));
            zz = 0 + (((tickAnim - 17) / 8) * (-0.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-300))*-1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-180))*1));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0.025);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);
       
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRevueltosaurus entity = (EntityPrehistoricFloraRevueltosaurus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-50))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-90))*10), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-90))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616))*0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5))*0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-90))*-1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -23.25 + (((tickAnim - 0) / 5) * (33.81507-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-4.7479-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.56941-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 33.81507 + (((tickAnim - 5) / 3) * (-2.76141-(33.81507)));
            yy = -4.7479 + (((tickAnim - 5) / 3) * (8.04009-(-4.7479)));
            zz = -1.56941 + (((tickAnim - 5) / 3) * (17.12999-(-1.56941)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -2.76141 + (((tickAnim - 8) / 4) * (-23.25-(-2.76141)));
            yy = 8.04009 + (((tickAnim - 8) / 4) * (0-(8.04009)));
            zz = 17.12999 + (((tickAnim - 8) / 4) * (0-(17.12999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 6 + (((tickAnim - 0) / 5) * (23.75-(6)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 23.75 + (((tickAnim - 5) / 3) * (36.31-(23.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 36.31 + (((tickAnim - 8) / 1) * (-0.09-(36.31)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -0.09 + (((tickAnim - 9) / 3) * (6-(-0.09)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 5) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.855-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.855 + (((tickAnim - 8) / 1) * (1.075-(0.855)));
            zz = -0.575 + (((tickAnim - 8) / 1) * (0-(-0.575)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.075 + (((tickAnim - 9) / 3) * (-0.475-(1.075)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17 + (((tickAnim - 0) / 3) * (-10.7-(17)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10.7 + (((tickAnim - 3) / 2) * (74.25-(-10.7)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 74.25 + (((tickAnim - 5) / 3) * (73.62-(74.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 73.62 + (((tickAnim - 8) / 1) * (49.19-(73.62)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 49.19 + (((tickAnim - 9) / 2) * (0-(49.19)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (17-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 3) * (0.1-(0.6)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 3) / 2) * (0.525-(0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.85-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 5) / 3) * (0.905-(0.525)));
            zz = -0.85 + (((tickAnim - 5) / 3) * (-0.675-(-0.85)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.905 + (((tickAnim - 8) / 0) * (2.02-(0.905)));
            zz = -0.675 + (((tickAnim - 8) / 0) * (0-(-0.675)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.02 + (((tickAnim - 8) / 1) * (1.525-(2.02)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.525 + (((tickAnim - 9) / 2) * (-0.35-(1.525)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 11) / 1) * (0.6-(-0.35)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33.81507 + (((tickAnim - 0) / 3) * (-2.55038-(33.81507)));
            yy = -4.7479 + (((tickAnim - 0) / 3) * (-8.36875-(-4.7479)));
            zz = -1.56941 + (((tickAnim - 0) / 3) * (-18.60868-(-1.56941)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.55038 + (((tickAnim - 3) / 2) * (-23.25-(-2.55038)));
            yy = -8.36875 + (((tickAnim - 3) / 2) * (0-(-8.36875)));
            zz = -18.60868 + (((tickAnim - 3) / 2) * (0-(-18.60868)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -23.25 + (((tickAnim - 5) / 7) * (33.81507-(-23.25)));
            yy = 0 + (((tickAnim - 5) / 7) * (-4.7479-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (-1.56941-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.75 + (((tickAnim - 0) / 2) * (36.31-(23.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 36.31 + (((tickAnim - 2) / 1) * (-0.09-(36.31)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.09 + (((tickAnim - 3) / 2) * (6-(-0.09)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 6 + (((tickAnim - 5) / 7) * (23.75-(6)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.855-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.575-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.855 + (((tickAnim - 2) / 1) * (1.075-(0.855)));
            zz = -0.575 + (((tickAnim - 2) / 1) * (0-(-0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.075 + (((tickAnim - 3) / 2) * (-0.475-(1.075)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -0.475 + (((tickAnim - 5) / 7) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 74.25 + (((tickAnim - 0) / 2) * (56.37-(74.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 56.37 + (((tickAnim - 2) / 1) * (49.19-(56.37)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 49.19 + (((tickAnim - 3) / 2) * (17-(49.19)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 17 + (((tickAnim - 5) / 2) * (-0.83-(17)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.83 + (((tickAnim - 7) / 1) * (-0.37-(-0.83)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -0.37 + (((tickAnim - 8) / 0) * (-17.88-(-0.37)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17.88 + (((tickAnim - 8) / 4) * (74.25-(-17.88)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 2) * (0.905-(0.525)));
            zz = -0.85 + (((tickAnim - 0) / 2) * (0-(-0.85)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.905 + (((tickAnim - 2) / 1) * (2.02-(0.905)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.02 + (((tickAnim - 3) / 0) * (1.525-(2.02)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.525 + (((tickAnim - 3) / 2) * (0.325-(1.525)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 5) / 2) * (0.66-(0.325)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.66 + (((tickAnim - 7) / 1) * (0-(0.66)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (-0.34-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.34 + (((tickAnim - 8) / 4) * (0.525-(-0.34)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.85-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-50))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-120))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-120))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-100))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-150))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-120))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-180))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-120))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-200))*2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-210))*20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-120))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-250))*3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-240))*25), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-120))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-100))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-130))*-10), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-150))*5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-150))*2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-200))*11), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-100))*-7));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -63.3469 + (((tickAnim - 0) / 6) * (39.2791-(-63.3469)));
            yy = -1.2293 + (((tickAnim - 0) / 6) * (11.21178-(-1.2293)));
            zz = -14.19797 + (((tickAnim - 0) / 6) * (-10.02608-(-14.19797)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 39.2791 + (((tickAnim - 6) / 2) * (-18.5053-(39.2791)));
            yy = 11.21178 + (((tickAnim - 6) / 2) * (15.20951-(11.21178)));
            zz = -10.02608 + (((tickAnim - 6) / 2) * (-45.11348-(-10.02608)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -18.5053 + (((tickAnim - 8) / 4) * (-63.3469-(-18.5053)));
            yy = 15.20951 + (((tickAnim - 8) / 4) * (-1.2293-(15.20951)));
            zz = -45.11348 + (((tickAnim - 8) / 4) * (-14.19797-(-45.11348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 39.28754 + (((tickAnim - 0) / 6) * (17.39315-(39.28754)));
            yy = 2.56975 + (((tickAnim - 0) / 6) * (5.64369-(2.56975)));
            zz = 17.23349 + (((tickAnim - 0) / 6) * (7.96346-(17.23349)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 17.39315 + (((tickAnim - 6) / 2) * (19.2757-(17.39315)));
            yy = 5.64369 + (((tickAnim - 6) / 2) * (4.82313-(5.64369)));
            zz = 7.96346 + (((tickAnim - 6) / 2) * (5.21021-(7.96346)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 19.2757 + (((tickAnim - 8) / 0) * (-31.70922-(19.2757)));
            yy = 4.82313 + (((tickAnim - 8) / 0) * (3.182-(4.82313)));
            zz = 5.21021 + (((tickAnim - 8) / 0) * (-0.29631-(5.21021)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -31.70922 + (((tickAnim - 8) / 4) * (39.28754-(-31.70922)));
            yy = 3.182 + (((tickAnim - 8) / 4) * (2.56975-(3.182)));
            zz = -0.29631 + (((tickAnim - 8) / 4) * (17.23349-(-0.29631)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 6) * (0.55-(0.275)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 6) / 2) * (0.175-(0.55)));
            zz = 0.1 + (((tickAnim - 6) / 2) * (0-(0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.175 + (((tickAnim - 8) / 4) * (0.275-(0.175)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22 + (((tickAnim - 0) / 3) * (-6-(22)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -6 + (((tickAnim - 3) / 2) * (11.83-(-6)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 11.83 + (((tickAnim - 5) / 1) * (72-(11.83)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 72 + (((tickAnim - 6) / 2) * (88.83-(72)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 88.83 + (((tickAnim - 8) / 0) * (91.75-(88.83)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 91.75 + (((tickAnim - 8) / 3) * (22.63-(91.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 22.63 + (((tickAnim - 11) / 1) * (22-(22.63)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 2) * (0.64-(0.2)));
            zz = -0.2 + (((tickAnim - 0) / 2) * (-0.1-(-0.2)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.64 + (((tickAnim - 2) / 1) * (0.475-(0.64)));
            zz = -0.1 + (((tickAnim - 2) / 1) * (0-(-0.1)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 3) / 3) * (1.85-(0.475)));
            zz = 0 + (((tickAnim - 3) / 3) * (-0.9-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.85 + (((tickAnim - 6) / 2) * (2-(1.85)));
            zz = -0.9 + (((tickAnim - 6) / 2) * (-1.08-(-0.9)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 2 + (((tickAnim - 8) / 0) * (1.705-(2)));
            zz = -1.08 + (((tickAnim - 8) / 0) * (-1.45-(-1.08)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.705 + (((tickAnim - 8) / 3) * (0-(1.705)));
            zz = -1.45 + (((tickAnim - 8) / 3) * (0-(-1.45)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0.2-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39.2791 + (((tickAnim - 0) / 3) * (-19.81025-(39.2791)));
            yy = -11.21178 + (((tickAnim - 0) / 3) * (-16.30632-(-11.21178)));
            zz = 10.02608 + (((tickAnim - 0) / 3) * (49.91579-(10.02608)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -19.81025 + (((tickAnim - 3) / 3) * (-63.3469-(-19.81025)));
            yy = -16.30632 + (((tickAnim - 3) / 3) * (1.2293-(-16.30632)));
            zz = 49.91579 + (((tickAnim - 3) / 3) * (14.19797-(49.91579)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -63.3469 + (((tickAnim - 6) / 6) * (39.2791-(-63.3469)));
            yy = 1.2293 + (((tickAnim - 6) / 6) * (-11.21178-(1.2293)));
            zz = 14.19797 + (((tickAnim - 6) / 6) * (10.02608-(14.19797)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 17.39315 + (((tickAnim - 0) / 1) * (19.2757-(17.39315)));
            yy = -5.64369 + (((tickAnim - 0) / 1) * (-4.82313-(-5.64369)));
            zz = -7.96346 + (((tickAnim - 0) / 1) * (-5.21021-(-7.96346)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 19.2757 + (((tickAnim - 1) / 2) * (-31.70922-(19.2757)));
            yy = -4.82313 + (((tickAnim - 1) / 2) * (-3.182-(-4.82313)));
            zz = -5.21021 + (((tickAnim - 1) / 2) * (-0.29631-(-5.21021)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -31.70922 + (((tickAnim - 3) / 3) * (39.28754-(-31.70922)));
            yy = -3.182 + (((tickAnim - 3) / 3) * (-2.56975-(-3.182)));
            zz = -0.29631 + (((tickAnim - 3) / 3) * (-17.23349-(-0.29631)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 39.28754 + (((tickAnim - 6) / 6) * (17.39315-(39.28754)));
            yy = -2.56975 + (((tickAnim - 6) / 6) * (-5.64369-(-2.56975)));
            zz = -17.23349 + (((tickAnim - 6) / 6) * (-7.96346-(-17.23349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 3) * (0.175-(0.55)));
            zz = 0.1 + (((tickAnim - 0) / 3) * (0-(0.1)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 3) / 3) * (0.275-(0.175)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.275 + (((tickAnim - 6) / 6) * (0.55-(0.275)));
            zz = 0 + (((tickAnim - 6) / 6) * (0.1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 72 + (((tickAnim - 0) / 1) * (88.83-(72)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 88.83 + (((tickAnim - 1) / 2) * (91.75-(88.83)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 91.75 + (((tickAnim - 3) / 2) * (22.63-(91.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 22.63 + (((tickAnim - 5) / 1) * (22-(22.63)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22 + (((tickAnim - 6) / 2) * (0-(22)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (11.83-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 11.83 + (((tickAnim - 9) / 3) * (72-(11.83)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 1.85 + (((tickAnim - 0) / 1) * (2-(1.85)));
            zz = -0.9 + (((tickAnim - 0) / 1) * (-1.08-(-0.9)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 2 + (((tickAnim - 1) / 2) * (1.705-(2)));
            zz = -1.08 + (((tickAnim - 1) / 2) * (-1.45-(-1.08)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.705 + (((tickAnim - 3) / 2) * (0-(1.705)));
            zz = -1.45 + (((tickAnim - 3) / 2) * (0-(-1.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.2-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 6) / 2) * (0.64-(0.2)));
            zz = -0.2 + (((tickAnim - 6) / 2) * (-0.1-(-0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.64 + (((tickAnim - 8) / 0) * (0.475-(0.64)));
            zz = -0.1 + (((tickAnim - 8) / 0) * (0-(-0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 4) * (1.85-(0.475)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-200))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-200))*8), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-150))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/0.5-250))*1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-200))*-10), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616-180))*1));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0.025);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraRevueltosaurus e = (EntityPrehistoricFloraRevueltosaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
