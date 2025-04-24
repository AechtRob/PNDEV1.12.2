package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEdentosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEdentosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
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
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelEdentosuchus() {
        this.textureWidth = 45;
        this.textureHeight = 45;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 17.3F, 7.5F);
        this.main.cubeList.add(new ModelBox(main, 23, 23, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.5F, -0.0932F, 0.2548F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.2182F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 28, 13, -0.75F, -0.5F, -1.0F, 2, 4, 2, 0.002F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.75F, 3.25F, -1.0F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.6109F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 33, -1.5F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 31, 30, -1.5F, 0.0F, 0.6F, 2, 4, 1, -0.001F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.3927F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 26, 3, -2.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.5F, -0.0932F, 0.2548F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.2182F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 28, 13, -1.25F, -0.5F, -1.0F, 2, 4, 2, 0.002F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.75F, 3.25F, -1.0F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.6109F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 33, -0.5F, 0.0F, 0.0F, 2, 4, 1, 0.0F, true));
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 31, 30, -0.5F, 0.0F, 0.6F, 2, 4, 1, -0.001F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.3927F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 26, 3, -1.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.3004F, -1.2663F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.35F, -6.0F, 4, 4, 6, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, -5.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 21, -2.0F, -0.35F, -3.0F, 4, 3, 3, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(1.9F, 2.125F, -2.05F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.3491F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 25, 35, -1.0F, -0.25F, -0.5F, 2, 3, 1, 0.001F, false));
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 36, 0, -1.0F, -0.25F, 0.0F, 2, 3, 1, -0.003F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 2.5585F, -0.1607F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.9599F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 0, 11, -0.25F, -0.5F, -0.5F, 1, 3, 1, 0.0F, false));
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 0, 11, -0.75F, -0.5F, -0.5F, 1, 3, 1, -0.001F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 1.8051F, 0.1375F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.5236F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 16, 35, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.001F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.9F, 2.125F, -2.05F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.3491F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 25, 35, -1.0F, -0.25F, -0.5F, 2, 3, 1, 0.001F, true));
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 36, 0, -1.0F, -0.25F, 0.0F, 2, 3, 1, -0.003F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 2.5585F, -0.1607F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.9599F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 0, 11, -0.75F, -0.5F, -0.5F, 1, 3, 1, 0.0F, true));
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 0, 11, -0.25F, -0.5F, -0.5F, 1, 3, 1, -0.001F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 1.8051F, 0.1375F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.5236F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 16, 35, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.001F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.25F, -2.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 15, 0, -1.5F, 0.0F, -3.0F, 3, 2, 3, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 2.75F, 0.0F);
        this.body3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 28, -0.5F, -0.85F, -3.2F, 2, 1, 3, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.05F, -2.775F);
        this.body3.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 22, 30, -0.5F, 0.5F, -3.0F, 1, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 0, -1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.4329F, -2.9526F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 13, -1.0F, 0.0F, -1.75F, 1, 1, 1, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 11, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 34, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.75F, 1.3F, -2.25F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6981F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, -0.3F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.75F, 1.3F, -2.25F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.6981F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 19, 0.3F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.35F, 1.0F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1091F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 8, -0.625F, -0.5F, -2.0F, 2, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5973F, 0.5F, -2.0884F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1286F, -0.7589F, -0.0599F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 24, -0.125F, 0.0F, -1.9F, 1, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.35F, 1.0F, 0.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1091F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 8, -1.375F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5973F, 0.5F, -2.0884F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1286F, 0.7589F, 0.0599F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 24, -0.875F, 0.0F, -1.9F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 16, -0.5F, 0.0F, -4.0F, 1, 1, 2, -0.004F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 11, 30, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 20, -1.0F, -1.0F, -1.6F, 2, 1, 2, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.4F, 0.3F, -2.5F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3927F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 33, -0.3F, -0.5F, -1.4F, 0, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.4F, 0.3F, -2.5F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.48F, -0.3927F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 0, -0.4F, -0.5F, -0.65F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.4F, 0.3F, -2.5F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.48F, 0.3927F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 0, 0.4F, -0.5F, -0.65F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.4F, 0.3F, -2.5F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 33, 0.3F, -0.5F, -1.4F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, 0.5F, -2.0F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.6501F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 12, 0.0F, -0.5F, -2.0F, 1, 1, 2, -0.006F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, 0.5F, -2.0F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.6501F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 12, -1.0F, -0.5F, -2.0F, 1, 1, 2, -0.006F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-0.025F, 0.7806F, -1.7488F);
        this.head.addChild(eye);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.975F, 0.0F, 0.0F);
        this.eye.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 1, 40, -0.15F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 1, 40, 1.1F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -1.35F, 1.2F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 11, -0.5F, 0.0F, 0.0F, 2, 2, 5, 0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0106F, 4.5687F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.3491F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 6, -0.5F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 14, -0.5F, 0.5F, 0.0F, 2, 1, 5, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 10, 23, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 4.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3927F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 20, 16, 0.0F, -0.5F, 0.0F, 1, 1, 5, -0.001F, false));


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
        this.main.offsetY = -2.0F;
        this.main.offsetX = -0.0F;
        this.main.rotateAngleY = (float)Math.toRadians(222);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.93F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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
        this.main.offsetY = 0.0F;

        EntityPrehistoricFloraEdentosuchus proteros = (EntityPrehistoricFloraEdentosuchus) e;

        this.faceTarget(f3, f4, 10, body3);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.body3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEdentosuchus ee = (EntityPrehistoricFloraEdentosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEdentosuchus entity = (EntityPrehistoricFloraEdentosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.35395-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-16.44463-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-7.51672-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -25.35395 + (((tickAnim - 15) / 9) * (15.36576-(-25.35395)));
            yy = -16.44463 + (((tickAnim - 15) / 9) * (-16.97536-(-16.44463)));
            zz = -7.51672 + (((tickAnim - 15) / 9) * (-28.35428-(-7.51672)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 15.36576 + (((tickAnim - 24) / 11) * (53.27976-(15.36576)));
            yy = -16.97536 + (((tickAnim - 24) / 11) * (-16.42963-(-16.97536)));
            zz = -28.35428 + (((tickAnim - 24) / 11) * (-17.68323-(-28.35428)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 53.27976 + (((tickAnim - 35) / 15) * (0-(53.27976)));
            yy = -16.42963 + (((tickAnim - 35) / 15) * (0-(-16.42963)));
            zz = -17.68323 + (((tickAnim - 35) / 15) * (0-(-17.68323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -22.5 + (((tickAnim - 15) / 9) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (16.25-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 16.25 + (((tickAnim - 35) / 15) * (0-(16.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 28) * (0.75-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.75 + (((tickAnim - 43) / 7) * (0-(0.75)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (61.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 61.25 + (((tickAnim - 15) / 9) * (66.37633-(61.25)));
            yy = 0 + (((tickAnim - 15) / 9) * (-12.13005-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (-14.73532-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 66.37633 + (((tickAnim - 24) / 11) * (69-(66.37633)));
            yy = -12.13005 + (((tickAnim - 24) / 11) * (0-(-12.13005)));
            zz = -14.73532 + (((tickAnim - 24) / 11) * (0-(-14.73532)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 69 + (((tickAnim - 35) / 8) * (43.67-(69)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 43.67 + (((tickAnim - 43) / 7) * (0-(43.67)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-0.16-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (1.69-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.16 + (((tickAnim - 19) / 5) * (-0.35-(-0.16)));
            yy = 1.69 + (((tickAnim - 19) / 5) * (2-(1.69)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -0.35 + (((tickAnim - 24) / 11) * (0-(-0.35)));
            yy = 2 + (((tickAnim - 24) / 11) * (0-(2)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (1.5-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.5 + (((tickAnim - 43) / 7) * (0-(1.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
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
        EntityPrehistoricFloraEdentosuchus entity = (EntityPrehistoricFloraEdentosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.75 + (((tickAnim - 10) / 10) * (0-(18.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 10) / 10) * (-4.125-(-0.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -4.125 + (((tickAnim - 20) / 15) * (-4.125-(-4.125)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.125 + (((tickAnim - 35) / 15) * (0-(-4.125)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.75 + (((tickAnim - 10) / 10) * (2.23424-(-16.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (-10.86982-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-18.0777-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.23424 + (((tickAnim - 20) / 15) * (2.23424-(2.23424)));
            yy = -10.86982 + (((tickAnim - 20) / 15) * (-10.86982-(-10.86982)));
            zz = -18.0777 + (((tickAnim - 20) / 15) * (-18.0777-(-18.0777)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.23424 + (((tickAnim - 35) / 15) * (0-(2.23424)));
            yy = -10.86982 + (((tickAnim - 35) / 15) * (0-(-10.86982)));
            zz = -18.0777 + (((tickAnim - 35) / 15) * (0-(-18.0777)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (49.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 49.25 + (((tickAnim - 20) / 15) * (49.25-(49.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49.25 + (((tickAnim - 35) / 15) * (0-(49.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 40) * (0-(0.5)));
            zz = 0 + (((tickAnim - 10) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (125.75-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 125.75 + (((tickAnim - 20) / 15) * (125.75-(125.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 125.75 + (((tickAnim - 35) / 7) * (-31.55523-(125.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (6.37623-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (6.00461-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -31.55523 + (((tickAnim - 42) / 8) * (0-(-31.55523)));
            yy = 6.37623 + (((tickAnim - 42) / 8) * (0-(6.37623)));
            zz = 6.00461 + (((tickAnim - 42) / 8) * (0-(6.00461)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.75 + (((tickAnim - 10) / 10) * (2.23424-(-16.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (10.8698-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (18.0777-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.23424 + (((tickAnim - 20) / 15) * (2.23424-(2.23424)));
            yy = 10.8698 + (((tickAnim - 20) / 15) * (10.8698-(10.8698)));
            zz = 18.0777 + (((tickAnim - 20) / 15) * (18.0777-(18.0777)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.23424 + (((tickAnim - 35) / 15) * (0-(2.23424)));
            yy = 10.8698 + (((tickAnim - 35) / 15) * (0-(10.8698)));
            zz = 18.0777 + (((tickAnim - 35) / 15) * (0-(18.0777)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (49.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 49.25 + (((tickAnim - 20) / 15) * (49.25-(49.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49.25 + (((tickAnim - 35) / 15) * (0-(49.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 40) * (0-(0.5)));
            zz = 0 + (((tickAnim - 10) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (125.75-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 125.75 + (((tickAnim - 20) / 15) * (125.75-(125.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 125.75 + (((tickAnim - 35) / 7) * (-34.25674-(125.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (-10.89154-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (-9.24504-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -34.25674 + (((tickAnim - 42) / 8) * (0-(-34.25674)));
            yy = -10.89154 + (((tickAnim - 42) / 8) * (0-(-10.89154)));
            zz = -9.24504 + (((tickAnim - 42) / 8) * (0-(-9.24504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 10) / 10) * (-1-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 20) / 15) * (-1-(-1)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 35) / 15) * (0-(-1)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.5 + (((tickAnim - 10) / 10) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-40.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -19 + (((tickAnim - 10) / 25) * (-19-(-19)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = -40.5 + (((tickAnim - 10) / 25) * (-40.5-(-40.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 35) / 15) * (0-(-19)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -40.5 + (((tickAnim - 35) / 15) * (0-(-40.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38.31193-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.83723-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (38.88305-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -38.31193 + (((tickAnim - 10) / 25) * (-38.31193-(-38.31193)));
            yy = -5.83723 + (((tickAnim - 10) / 25) * (-5.83723-(-5.83723)));
            zz = 38.88305 + (((tickAnim - 10) / 25) * (38.88305-(38.88305)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -38.31193 + (((tickAnim - 35) / 15) * (0-(-38.31193)));
            yy = -5.83723 + (((tickAnim - 35) / 15) * (0-(-5.83723)));
            zz = 38.88305 + (((tickAnim - 35) / 15) * (0-(38.88305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0.8-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.95-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0.8 + (((tickAnim - 20) / 15) * (0.8-(0.8)));
            yy = 0.95 + (((tickAnim - 20) / 15) * (0.95-(0.95)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.8 + (((tickAnim - 35) / 15) * (0-(0.8)));
            yy = 0.95 + (((tickAnim - 35) / 15) * (0-(0.95)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 50.5 + (((tickAnim - 10) / 10) * (59.5-(50.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 59.5 + (((tickAnim - 20) / 15) * (59.5-(59.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 59.5 + (((tickAnim - 35) / 15) * (0-(59.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 45 + (((tickAnim - 10) / 25) * (45-(45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 45 + (((tickAnim - 35) / 15) * (0-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-47.81663-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.99913-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-51.86558-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -47.81663 + (((tickAnim - 10) / 25) * (-50.73083-(-47.81663)));
            yy = 2.99913 + (((tickAnim - 10) / 25) * (5.21088-(2.99913)));
            zz = -51.86558 + (((tickAnim - 10) / 25) * (-48.40671-(-51.86558)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -50.73083 + (((tickAnim - 35) / 15) * (0-(-50.73083)));
            yy = 5.21088 + (((tickAnim - 35) / 15) * (0-(5.21088)));
            zz = -48.40671 + (((tickAnim - 35) / 15) * (0-(-48.40671)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-0.85-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.65-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.85 + (((tickAnim - 20) / 15) * (-0.8-(-0.85)));
            yy = 0.65 + (((tickAnim - 20) / 15) * (0.55-(0.65)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -0.8 + (((tickAnim - 35) / 4) * (-0.58-(-0.8)));
            yy = 0.55 + (((tickAnim - 35) / 4) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -0.58 + (((tickAnim - 39) / 11) * (0-(-0.58)));
            yy = 0.55 + (((tickAnim - 39) / 11) * (0-(0.55)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 50 + (((tickAnim - 10) / 10) * (57.5-(50)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 57.5 + (((tickAnim - 20) / 15) * (57.5-(57.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 57.5 + (((tickAnim - 35) / 15) * (0-(57.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.25 + (((tickAnim - 10) / 10) * (-1-(-9.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 20) / 15) * (-1-(-1)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 35) / 15) * (0-(-1)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 10) / 40) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 7.25 + (((tickAnim - 20) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 35) / 15) * (0-(7.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 8 + (((tickAnim - 20) / 15) * (8-(8)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8 + (((tickAnim - 35) / 15) * (0-(8)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEdentosuchus entity = (EntityPrehistoricFloraEdentosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 7.75 + (((tickAnim - 7) / 3) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.75 + (((tickAnim - 10) / 5) * (0-(7.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4 + (((tickAnim - 7) / 3) * (4-(4)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4 + (((tickAnim - 10) / 5) * (0-(4)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-11.08969-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (11.26652-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-22.09199-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -11.08969 + (((tickAnim - 7) / 3) * (-11.08969-(-11.08969)));
            yy = 11.26652 + (((tickAnim - 7) / 3) * (11.26652-(11.26652)));
            zz = -22.09199 + (((tickAnim - 7) / 3) * (-22.09199-(-22.09199)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -11.08969 + (((tickAnim - 10) / 5) * (0-(-11.08969)));
            yy = 11.26652 + (((tickAnim - 10) / 5) * (0-(11.26652)));
            zz = -22.09199 + (((tickAnim - 10) / 5) * (0-(-22.09199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-33.42079-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (18.9463-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (3.4702-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -33.42079 + (((tickAnim - 7) / 3) * (-33.42079-(-33.42079)));
            yy = 18.9463 + (((tickAnim - 7) / 3) * (18.9463-(18.9463)));
            zz = 3.4702 + (((tickAnim - 7) / 3) * (3.4702-(3.4702)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -33.42079 + (((tickAnim - 10) / 5) * (0-(-33.42079)));
            yy = 18.9463 + (((tickAnim - 10) / 5) * (0-(18.9463)));
            zz = 3.4702 + (((tickAnim - 10) / 5) * (0-(3.4702)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 26 + (((tickAnim - 7) / 3) * (26-(26)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 26 + (((tickAnim - 10) / 5) * (0-(26)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-11.08969-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-11.2665-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (22.092-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -11.08969 + (((tickAnim - 7) / 3) * (-11.08969-(-11.08969)));
            yy = -11.2665 + (((tickAnim - 7) / 3) * (-11.2665-(-11.2665)));
            zz = 22.092 + (((tickAnim - 7) / 3) * (22.092-(22.092)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -11.08969 + (((tickAnim - 10) / 5) * (0-(-11.08969)));
            yy = -11.2665 + (((tickAnim - 10) / 5) * (0-(-11.2665)));
            zz = 22.092 + (((tickAnim - 10) / 5) * (0-(22.092)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-33.42079-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-18.9463-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-3.4702-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -33.42079 + (((tickAnim - 7) / 3) * (-33.42079-(-33.42079)));
            yy = -18.9463 + (((tickAnim - 7) / 3) * (-18.9463-(-18.9463)));
            zz = -3.4702 + (((tickAnim - 7) / 3) * (-3.4702-(-3.4702)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -33.42079 + (((tickAnim - 10) / 5) * (0-(-33.42079)));
            yy = -18.9463 + (((tickAnim - 10) / 5) * (0-(-18.9463)));
            zz = -3.4702 + (((tickAnim - 10) / 5) * (0-(-3.4702)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 26 + (((tickAnim - 7) / 3) * (26-(26)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 26 + (((tickAnim - 10) / 5) * (0-(26)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 7 + (((tickAnim - 7) / 1) * (14.25-(7)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 14.25 + (((tickAnim - 8) / 7) * (0-(14.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 9.25 + (((tickAnim - 7) / 1) * (0-(9.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (11.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 11.5 + (((tickAnim - 13) / 2) * (0-(11.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (18.25-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 18.25 + (((tickAnim - 7) / 1) * (0-(18.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.515-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 3) / 2) * (1-(1)));
            yy = 0.515 + (((tickAnim - 3) / 2) * (1-(0.515)));
            zz = 1 + (((tickAnim - 3) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEdentosuchus entity = (EntityPrehistoricFloraEdentosuchus) entitylivingbaseIn;
        int animCycle = 19;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 35.5 + (((tickAnim - 0) / 6) * (5.83698-(35.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (-1.08257-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-9.187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 5.83698 + (((tickAnim - 6) / 4) * (-15.5-(5.83698)));
            yy = -1.08257 + (((tickAnim - 6) / 4) * (0-(-1.08257)));
            zz = -9.187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 6) / 4) * (0-(-9.187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -15.5 + (((tickAnim - 10) / 9) * (35.5-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 0) / 3) * (27.31-(7.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 27.31 + (((tickAnim - 3) / 3) * (11.32141-(27.31)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.05586-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.47724-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 11.32141 + (((tickAnim - 6) / 4) * (-12.25-(11.32141)));
            yy = -0.05586 + (((tickAnim - 6) / 4) * (0-(-0.05586)));
            zz = 0.47724 + (((tickAnim - 6) / 4) * (0-(0.47724)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -12.25 + (((tickAnim - 10) / 9) * (7.5-(-12.25)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 6) / 4) * (0-(1)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
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
            xx = 59.5 + (((tickAnim - 0) / 3) * (77.13-(59.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 77.13 + (((tickAnim - 3) / 3) * (80.78-(77.13)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 80.78 + (((tickAnim - 6) / 2) * (7.39-(80.78)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.39 + (((tickAnim - 8) / 2) * (27-(7.39)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 27 + (((tickAnim - 10) / 3) * (2.07-(27)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 2.07 + (((tickAnim - 13) / 4) * (12.48-(2.07)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 12.48 + (((tickAnim - 17) / 2) * (59.5-(12.48)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.4-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (1.125-(0)));
            zz = -0.4 + (((tickAnim - 3) / 3) * (-0.38-(-0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 6) / 2) * (0-(1.125)));
            zz = -0.38 + (((tickAnim - 6) / 2) * (0-(-0.38)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -11.2326 + (((tickAnim - 0) / 2) * (-15.5-(-11.2326)));
            yy = -0.21651 + (((tickAnim - 0) / 2) * (0-(-0.21651)));
            zz = -1.01825 + (((tickAnim - 0) / 2) * (0-(-1.01825)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -15.5 + (((tickAnim - 2) / 7) * (35.5-(-15.5)));
            yy = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 35.5 + (((tickAnim - 9) / 7) * (5.83698-(35.5)));
            yy = 0 + (((tickAnim - 9) / 7) * (1.0826-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (-1.913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 5.83698 + (((tickAnim - 16) / 3) * (-11.2326-(5.83698)));
            yy = 1.0826 + (((tickAnim - 16) / 3) * (-0.21651-(1.0826)));
            zz = -1.913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 16) / 3) * (-1.01825-(-1.913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.53572 + (((tickAnim - 0) / 2) * (-12.25-(-7.53572)));
            yy = -0.01117 + (((tickAnim - 0) / 2) * (0-(-0.01117)));
            zz = 0.09545 + (((tickAnim - 0) / 2) * (0-(0.09545)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -12.25 + (((tickAnim - 2) / 7) * (7.5-(-12.25)));
            yy = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 7.5 + (((tickAnim - 9) / 2) * (24.70535-(7.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.01397-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0.11931-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 24.70535 + (((tickAnim - 11) / 5) * (11.32141-(24.70535)));
            yy = -0.01397 + (((tickAnim - 11) / 5) * (-0.05586-(-0.01397)));
            zz = 0.11931 + (((tickAnim - 11) / 5) * (0.47724-(0.11931)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 11.32141 + (((tickAnim - 16) / 3) * (-7.53572-(11.32141)));
            yy = -0.05586 + (((tickAnim - 16) / 3) * (-0.01117-(-0.05586)));
            zz = 0.47724 + (((tickAnim - 16) / 3) * (0.09545-(0.47724)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 2) * (0-(0.2)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (1-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 16) / 3) * (0.2-(1)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.19 + (((tickAnim - 0) / 2) * (27-(17.19)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 27 + (((tickAnim - 2) / 4) * (-2.54-(27)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -2.54 + (((tickAnim - 6) / 2) * (24.06-(-2.54)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 24.06 + (((tickAnim - 8) / 1) * (59.5-(24.06)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 59.5 + (((tickAnim - 9) / 2) * (71.82-(59.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 71.82 + (((tickAnim - 11) / 5) * (80.78-(71.82)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 80.78 + (((tickAnim - 16) / 3) * (17.19-(80.78)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (1.5-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (-0.38-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.5 + (((tickAnim - 16) / 2) * (1.3-(1.5)));
            zz = -0.38 + (((tickAnim - 16) / 2) * (-0.19-(-0.38)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 1.3 + (((tickAnim - 18) / 1) * (0-(1.3)));
            zz = -0.19 + (((tickAnim - 18) / 1) * (0-(-0.19)));
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
            xx = -28 + (((tickAnim - 0) / 8) * (32.75-(-28)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 32.75 + (((tickAnim - 8) / 6) * (-1.32798-(32.75)));
            yy = 0 + (((tickAnim - 8) / 6) * (6.1143-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (-17.4939-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -1.32798 + (((tickAnim - 14) / 5) * (-28-(-1.32798)));
            yy = 6.1143 + (((tickAnim - 14) / 5) * (0-(6.1143)));
            zz = -17.4939 + (((tickAnim - 14) / 5) * (0-(-17.4939)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 28.75 + (((tickAnim - 0) / 8) * (11.75-(28.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.75 + (((tickAnim - 8) / 3) * (41.97864-(11.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (3.275-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (13.8761-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 41.97864 + (((tickAnim - 11) / 6) * (-17.38774-(41.97864)));
            yy = 3.275 + (((tickAnim - 11) / 6) * (5.88275-(3.275)));
            zz = 13.8761 + (((tickAnim - 11) / 6) * (-5.62273-(13.8761)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -17.38774 + (((tickAnim - 17) / 2) * (28.75-(-17.38774)));
            yy = 5.88275 + (((tickAnim - 17) / 2) * (0-(5.88275)));
            zz = -5.62273 + (((tickAnim - 17) / 2) * (0-(-5.62273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (1.25-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0.425-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.25 + (((tickAnim - 14) / 3) * (0.1-(1.25)));
            zz = 0.425 + (((tickAnim - 14) / 3) * (0.26-(0.425)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 17) / 2) * (0-(0.1)));
            zz = 0.26 + (((tickAnim - 17) / 2) * (0-(0.26)));
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
            xx = 32.75 + (((tickAnim - 0) / 5) * (-1.32798-(32.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-6.11426-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (17.49388-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1.32798 + (((tickAnim - 5) / 4) * (-28-(-1.32798)));
            yy = -6.11426 + (((tickAnim - 5) / 4) * (0-(-6.11426)));
            zz = 17.49388 + (((tickAnim - 5) / 4) * (0-(17.49388)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -28 + (((tickAnim - 9) / 10) * (32.75-(-28)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 11.75 + (((tickAnim - 0) / 2) * (41.97864-(11.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (-3.27504-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-13.87614-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 41.97864 + (((tickAnim - 2) / 5) * (-17.38774-(41.97864)));
            yy = -3.27504 + (((tickAnim - 2) / 5) * (5.88275-(-3.27504)));
            zz = -13.87614 + (((tickAnim - 2) / 5) * (-5.62273-(-13.87614)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -17.38774 + (((tickAnim - 7) / 2) * (28.75-(-17.38774)));
            yy = 5.88275 + (((tickAnim - 7) / 2) * (0-(5.88275)));
            zz = -5.62273 + (((tickAnim - 7) / 2) * (0-(-5.62273)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 28.75 + (((tickAnim - 9) / 10) * (11.75-(28.75)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (1.25-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.25 + (((tickAnim - 5) / 2) * (0.1-(1.25)));
            zz = 0.425 + (((tickAnim - 5) / 2) * (0.26-(0.425)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 7) / 2) * (0-(0.1)));
            zz = 0.26 + (((tickAnim - 7) / 2) * (0-(0.26)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
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
            xx = 62.75 + (((tickAnim - 0) / 2) * (67.66-(62.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 67.66 + (((tickAnim - 2) / 3) * (71.29-(67.66)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 71.29 + (((tickAnim - 5) / 2) * (72.52-(71.29)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 72.52 + (((tickAnim - 7) / 2) * (0-(72.52)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (-23.12-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -23.12 + (((tickAnim - 14) / 5) * (62.75-(-23.12)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.38-(0)));
            zz = -0.45 + (((tickAnim - 0) / 2) * (-0.735-(-0.45)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.38 + (((tickAnim - 2) / 3) * (-0.05-(0.38)));
            zz = -0.735 + (((tickAnim - 2) / 3) * (-0.675-(-0.735)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 5) / 2) * (-0.03-(-0.05)));
            zz = -0.675 + (((tickAnim - 5) / 2) * (-0.55-(-0.675)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.03 + (((tickAnim - 7) / 2) * (0-(-0.03)));
            zz = -0.55 + (((tickAnim - 7) / 2) * (0-(-0.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (-0.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375/0.5))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-50))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-50))*1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375/0.5-100))*0.15);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375/0.5))*0.1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-100))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-100))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375/0.5-50))*-2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-150))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-150))*-3));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-18.89-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -18.89 + (((tickAnim - 4) / 4) * (62.75-(-18.89)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 62.75 + (((tickAnim - 8) / 3) * (67.66-(62.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 67.66 + (((tickAnim - 11) / 2) * (71.29-(67.66)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 71.29 + (((tickAnim - 13) / 4) * (72.52-(71.29)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 72.52 + (((tickAnim - 17) / 2) * (0-(72.52)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-0.45-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.38-(0)));
            zz = -0.45 + (((tickAnim - 8) / 3) * (-0.735-(-0.45)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.38 + (((tickAnim - 11) / 2) * (-0.05-(0.38)));
            zz = -0.735 + (((tickAnim - 11) / 2) * (-0.675-(-0.735)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.05 + (((tickAnim - 13) / 4) * (-0.03-(-0.05)));
            zz = -0.675 + (((tickAnim - 13) / 4) * (-0.55-(-0.675)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.03 + (((tickAnim - 17) / 2) * (0-(-0.03)));
            zz = -0.55 + (((tickAnim - 17) / 2) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375/0.5-80))*3), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-200))*-2), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-250))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375/0.5-50))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-50))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-100))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-50))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375/0.5-150))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-150))*10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-50))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375/0.5-200))*8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-200))*20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-50))*1));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEdentosuchus entity = (EntityPrehistoricFloraEdentosuchus) entitylivingbaseIn;
        int animCycle = 8;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-30))*9), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-20))*0.7);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5))*0.5);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.66689 + (((tickAnim - 0) / 4) * (40.23032-(-27.66689)));
            yy = -13.3269 + (((tickAnim - 0) / 4) * (-7.716-(-13.3269)));
            zz = -6.901 + (((tickAnim - 0) / 4) * (-0.6108-(-6.901)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 40.23032 + (((tickAnim - 4) / 2) * (1.12879-(40.23032)));
            yy = -7.716 + (((tickAnim - 4) / 2) * (-16.2159-(-7.716)));
            zz = -0.6108 + (((tickAnim - 4) / 2) * (-19.4815-(-0.6108)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.12879 + (((tickAnim - 6) / 2) * (-26.66689-(1.12879)));
            yy = -16.2159 + (((tickAnim - 6) / 2) * (-13.3269-(-16.2159)));
            zz = -19.4815 + (((tickAnim - 6) / 2) * (-6.901-(-19.4815)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6.5 + (((tickAnim - 0) / 4) * (12-(-6.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 12 + (((tickAnim - 4) / 2) * (27.1-(12)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 27.1 + (((tickAnim - 6) / 2) * (-6.5-(27.1)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 3) * (-0.275-(-0.45)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 3) * (1.025-(-0.275)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.025 + (((tickAnim - 6) / 2) * (-0.3-(1.025)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
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
            xx = 47.40521 + (((tickAnim - 0) / 2) * (-0.71979-(47.40521)));
            yy = 1.6579 + (((tickAnim - 0) / 2) * (1.6579-(1.6579)));
            zz = 6.5441 + (((tickAnim - 0) / 2) * (6.5441-(6.5441)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.71979 + (((tickAnim - 2) / 2) * (73.40521-(-0.71979)));
            yy = 1.6579 + (((tickAnim - 2) / 2) * (1.6579-(1.6579)));
            zz = 6.5441 + (((tickAnim - 2) / 2) * (-6.5441-(6.5441)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 73.40521 + (((tickAnim - 4) / 1) * (96.53021-(73.40521)));
            yy = 1.6579 + (((tickAnim - 4) / 1) * (1.6579-(1.6579)));
            zz = -6.5441 + (((tickAnim - 4) / 1) * (-6.5441-(-6.5441)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 96.53021 + (((tickAnim - 5) / 1) * (94.71397-(96.53021)));
            yy = 1.6579 + (((tickAnim - 5) / 1) * (5.32547-(1.6579)));
            zz = -6.5441 + (((tickAnim - 5) / 1) * (4.64161-(-6.5441)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 94.71397 + (((tickAnim - 6) / 2) * (13.28021-(94.71397)));
            yy = 5.32547 + (((tickAnim - 6) / 2) * (1.6579-(5.32547)));
            zz = 4.64161 + (((tickAnim - 6) / 2) * (6.5441-(4.64161)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 13.28021 + (((tickAnim - 8) / 0) * (36.65521-(13.28021)));
            yy = 1.6579 + (((tickAnim - 8) / 0) * (1.6579-(1.6579)));
            zz = 6.5441 + (((tickAnim - 8) / 0) * (6.5441-(6.5441)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 2) * (-0.125-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.125 + (((tickAnim - 2) / 1) * (0.385-(-0.125)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.385 + (((tickAnim - 3) / 1) * (0.15-(0.385)));
            zz = 0.2 + (((tickAnim - 3) / 1) * (-0.375-(0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 4) / 2) * (1.485-(0.15)));
            zz = -0.375 + (((tickAnim - 4) / 2) * (-0.44-(-0.375)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.485 + (((tickAnim - 6) / 2) * (0-(1.485)));
            zz = -0.44 + (((tickAnim - 6) / 2) * (0-(-0.44)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -27.66689 + (((tickAnim - 0) / 3) * (38.73032-(-27.66689)));
            yy = 13.3269 + (((tickAnim - 0) / 3) * (7.71601-(13.3269)));
            zz = 6.901 + (((tickAnim - 0) / 3) * (0.61082-(6.901)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 38.73032 + (((tickAnim - 3) / 3) * (1.83395-(38.73032)));
            yy = 7.71601 + (((tickAnim - 3) / 3) * (16.38773-(7.71601)));
            zz = 0.61082 + (((tickAnim - 3) / 3) * (19.21878-(0.61082)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.83395 + (((tickAnim - 6) / 2) * (-26.66689-(1.83395)));
            yy = 16.38773 + (((tickAnim - 6) / 2) * (13.3269-(16.38773)));
            zz = 19.21878 + (((tickAnim - 6) / 2) * (6.901-(19.21878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.5 + (((tickAnim - 0) / 3) * (15.27241-(-6.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.74918-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5.48423-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 15.27241 + (((tickAnim - 3) / 3) * (27.1-(15.27241)));
            yy = -4.74918 + (((tickAnim - 3) / 3) * (0-(-4.74918)));
            zz = 5.48423 + (((tickAnim - 3) / 3) * (0-(5.48423)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 27.1 + (((tickAnim - 6) / 2) * (-6.5-(27.1)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 3) * (-0.275-(-0.45)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 3) * (1.4-(-0.275)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.4 + (((tickAnim - 6) / 2) * (-0.3-(1.4)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 47.40521 + (((tickAnim - 0) / 2) * (-0.71979-(47.40521)));
            yy = 1.6579 + (((tickAnim - 0) / 2) * (1.6579-(1.6579)));
            zz = 6.5441 + (((tickAnim - 0) / 2) * (-6.5441-(6.5441)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.71979 + (((tickAnim - 2) / 1) * (73.40521-(-0.71979)));
            yy = 1.6579 + (((tickAnim - 2) / 1) * (1.6579-(1.6579)));
            zz = -6.5441 + (((tickAnim - 2) / 1) * (-6.5441-(-6.5441)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 73.40521 + (((tickAnim - 3) / 2) * (96.53021-(73.40521)));
            yy = 1.6579 + (((tickAnim - 3) / 2) * (1.6579-(1.6579)));
            zz = -6.5441 + (((tickAnim - 3) / 2) * (-6.5441-(-6.5441)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 96.53021 + (((tickAnim - 5) / 1) * (94.03021-(96.53021)));
            yy = 1.6579 + (((tickAnim - 5) / 1) * (1.6579-(1.6579)));
            zz = -6.5441 + (((tickAnim - 5) / 1) * (-6.5441-(-6.5441)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 94.03021 + (((tickAnim - 6) / 2) * (13.28021-(94.03021)));
            yy = 1.6579 + (((tickAnim - 6) / 2) * (1.6579-(1.6579)));
            zz = -6.5441 + (((tickAnim - 6) / 2) * (-6.5441-(-6.5441)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 13.28021 + (((tickAnim - 8) / 0) * (36.65521-(13.28021)));
            yy = 1.6579 + (((tickAnim - 8) / 0) * (1.6579-(1.6579)));
            zz = -6.5441 + (((tickAnim - 8) / 0) * (-6.5441-(-6.5441)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 2) * (-0.125-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.125 + (((tickAnim - 2) / 1) * (0.15-(-0.125)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.375-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 3) / 3) * (1.335-(0.15)));
            zz = -0.375 + (((tickAnim - 3) / 3) * (-0.44-(-0.375)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.335 + (((tickAnim - 6) / 2) * (0-(1.335)));
            zz = -0.44 + (((tickAnim - 6) / 2) * (0-(-0.44)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5+70))*10), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-20))*-9), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 39.92159 + (((tickAnim - 0) / 2) * (-8.87369-(39.92159)));
            yy = 5.86879 + (((tickAnim - 0) / 2) * (13.05994-(5.86879)));
            zz = -0.31147 + (((tickAnim - 0) / 2) * (-55.54863-(-0.31147)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -8.87369 + (((tickAnim - 2) / 2) * (-32.25-(-8.87369)));
            yy = 13.05994 + (((tickAnim - 2) / 2) * (0-(13.05994)));
            zz = -55.54863 + (((tickAnim - 2) / 2) * (0-(-55.54863)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -32.25 + (((tickAnim - 4) / 4) * (39.92159-(-32.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (5.86879-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-0.31147-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 26.00761 + (((tickAnim - 0) / 3) * (-24.84007-(26.00761)));
            yy = 1.13448 + (((tickAnim - 0) / 3) * (9.96438-(1.13448)));
            zz = 27.96622 + (((tickAnim - 0) / 3) * (33.14602-(27.96622)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -24.84007 + (((tickAnim - 3) / 1) * (30.25-(-24.84007)));
            yy = 9.96438 + (((tickAnim - 3) / 1) * (0-(9.96438)));
            zz = 33.14602 + (((tickAnim - 3) / 1) * (0-(33.14602)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 30.25 + (((tickAnim - 4) / 4) * (26.00761-(30.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (1.13448-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (27.96622-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
            yy = 0.025 + (((tickAnim - 0) / 3) * (0.535-(0.025)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.525-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.2 + (((tickAnim - 3) / 1) * (0-(0.2)));
            yy = 0.535 + (((tickAnim - 3) / 1) * (-0.45-(0.535)));
            zz = 0.525 + (((tickAnim - 3) / 1) * (0-(0.525)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.45 + (((tickAnim - 4) / 2) * (-0.26-(-0.45)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.26 + (((tickAnim - 6) / 2) * (0.025-(-0.26)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
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
            xx = 74.75 + (((tickAnim - 0) / 3) * (68.88-(74.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 68.88 + (((tickAnim - 3) / 1) * (26.5-(68.88)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 26.5 + (((tickAnim - 4) / 2) * (-29.38903-(26.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (-1.89829-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-13.87325-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -29.38903 + (((tickAnim - 6) / 2) * (74.75-(-29.38903)));
            yy = -1.89829 + (((tickAnim - 6) / 2) * (0-(-1.89829)));
            zz = -13.87325 + (((tickAnim - 6) / 2) * (0-(-13.87325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.525 + (((tickAnim - 0) / 3) * (-0.61-(-0.525)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.25-(0)));
            zz = -0.61 + (((tickAnim - 3) / 1) * (0-(-0.61)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 4) / 2) * (-0.55-(-0.25)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 6) / 2) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.525-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 39.92159 + (((tickAnim - 0) / 2) * (-10.42003-(39.92159)));
            yy = 5.86879 + (((tickAnim - 0) / 2) * (-22.1154-(5.86879)));
            zz = 0.3115 + (((tickAnim - 0) / 2) * (59.39881-(0.3115)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -10.42003 + (((tickAnim - 2) / 2) * (-32.25-(-10.42003)));
            yy = -22.1154 + (((tickAnim - 2) / 2) * (0-(-22.1154)));
            zz = 59.39881 + (((tickAnim - 2) / 2) * (0-(59.39881)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -32.25 + (((tickAnim - 4) / 4) * (39.92159-(-32.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (5.86879-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.3115-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11.75761 + (((tickAnim - 0) / 3) * (-29.5363-(11.75761)));
            yy = 1.13448 + (((tickAnim - 0) / 3) * (1.13901-(1.13448)));
            zz = -27.9662 + (((tickAnim - 0) / 3) * (-27.37826-(-27.9662)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -29.5363 + (((tickAnim - 3) / 1) * (30.25-(-29.5363)));
            yy = 1.13901 + (((tickAnim - 3) / 1) * (0-(1.13901)));
            zz = -27.37826 + (((tickAnim - 3) / 1) * (0-(-27.37826)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 30.25 + (((tickAnim - 4) / 4) * (11.75761-(30.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (1.13448-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-27.9662-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
            yy = 0.025 + (((tickAnim - 0) / 3) * (0.535-(0.025)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.525-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.2 + (((tickAnim - 3) / 1) * (0-(0.2)));
            yy = 0.535 + (((tickAnim - 3) / 1) * (-0.45-(0.535)));
            zz = 0.525 + (((tickAnim - 3) / 1) * (0-(0.525)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.45 + (((tickAnim - 4) / 4) * (0.025-(-0.45)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 74.75 + (((tickAnim - 0) / 3) * (68.88-(74.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 68.88 + (((tickAnim - 3) / 1) * (26.5-(68.88)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 26.5 + (((tickAnim - 4) / 2) * (-22.56349-(26.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (-9.71994-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (12.93448-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -22.56349 + (((tickAnim - 6) / 2) * (74.75-(-22.56349)));
            yy = -9.71994 + (((tickAnim - 6) / 2) * (0-(-9.71994)));
            zz = 12.93448 + (((tickAnim - 6) / 2) * (0-(12.93448)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.525 + (((tickAnim - 0) / 3) * (-0.61-(-0.525)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.25-(0)));
            zz = -0.61 + (((tickAnim - 3) / 1) * (0-(-0.61)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 4) / 2) * (-0.55-(-0.25)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 6) / 2) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.525-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-7.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-50))*8), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(0);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(0);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(0.425);
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(8.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-150))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(9.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5+20))*5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-100))*10), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-150))*20), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-200))*30), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


    }




        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEdentosuchus e = (EntityPrehistoricFloraEdentosuchus) entity;
        animator.update(entity);

            animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
            animator.startKeyframe(5);
            animator.rotate(this.body3, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) Math.toRadians(36), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(5);
            animator.startKeyframe(2);
            animator.rotate(this.body3, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.head, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(4);
            animator.resetKeyframe(4);

    }
}
