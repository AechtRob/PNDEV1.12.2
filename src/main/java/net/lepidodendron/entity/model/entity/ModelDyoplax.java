package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDyoplax;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDyoplax extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
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

    private ModelAnimator animator;

    public ModelDyoplax() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 14.2875F, 5.0F);
        this.main.cubeList.add(new ModelBox(main, 23, 14, -2.0F, -1.0375F, -3.0F, 4, 4, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 38, 25, -1.0F, -1.4625F, -3.0F, 2, 1, 6, -0.001F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.0F, 0.6042F, -0.5455F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.0873F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 43, 44, -1.0F, -0.5F, -1.5F, 2, 5, 3, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(1.0F, 4.5F, -1.5F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.5236F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 52, -2.0F, 0.0F, 0.0F, 2, 5, 2, -0.001F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 4.6826F, 1.2435F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.4363F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 44, 18, -2.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.0F, 0.6042F, -0.5455F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.0873F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 43, 44, -1.0F, -0.5F, -1.5F, 2, 5, 3, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-1.0F, 4.5F, -1.5F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.5236F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 52, 0.0F, 0.0F, 0.0F, 2, 5, 2, -0.001F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 4.6826F, 1.2435F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.4363F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 44, 18, -0.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9375F, 2.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 19, 25, -1.5F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 15, 44, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.075F, 5.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 0, -1.0F, 0.075F, 0.0F, 2, 2, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 35, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.002F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.45F, 6.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 35, -0.5F, -0.025F, 0.0F, 1, 1, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.775F, 0.5F);
        this.tail3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 43, 0.0F, 0.0F, -0.5F, 0, 1, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 44, 10, -0.5F, -0.525F, 0.0F, 1, 1, 6, 0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0375F, -2.5F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.25F, -8.0F, 5, 5, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -1.5F, -0.5F, -8.0F, 3, 1, 8, -0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -7.25F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.1309F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 34, -2.0F, 0.0F, -4.0F, 4, 4, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 30, 44, -1.0F, -0.325F, -4.0F, 2, 1, 4, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.0F, 3.0381F, -2.1913F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.3927F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 9, 52, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(-0.5F, 3.5F, 1.0F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.7854F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 18, 52, -0.5F, 0.0F, -2.0F, 2, 4, 2, -0.001F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 3.3169F, -0.4612F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.3927F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 51, 33, -1.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.0F, 3.0381F, -2.1913F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.3927F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 9, 52, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.5F, 3.5F, 1.0F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.7854F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 18, 52, -1.5F, 0.0F, -2.0F, 2, 4, 2, -0.001F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 3.3169F, -0.4612F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.3927F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 51, 33, -2.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1544F, -3.017F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 24, -1.5F, 0.0F, -6.0F, 3, 3, 6, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.3F, 0.0F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 0, -1.0F, -0.075F, -4.975F, 2, 1, 4, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0033F, -5.983F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 56, 53, -0.5F, 0.85F, -5.525F, 1, 1, 2, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 54, 44, -0.5F, 0.85F, -3.8F, 1, 1, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 27, 53, -1.5F, 0.85F, -1.8F, 3, 1, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 55, 24, 0.4F, 1.15F, -5.475F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 55, 24, -0.4F, 1.15F, -5.475F, 0, 1, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.6475F, -3.9447F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1134F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 6, -0.5F, 0.0F, -1.6F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -0.15F, -0.025F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2007F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 53, -2.0F, 0.0F, -4.0F, 1, 1, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.2487F, -1.9848F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1178F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 6, -2.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.65F, 0.9951F, -2.3681F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1082F, -0.4476F, 0.4447F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 10, -0.7F, -0.5F, -0.4F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, 1.35F, -1.8F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 58, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.003F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 1.35F, -1.8F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 58, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.65F, 0.9951F, -2.3681F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1082F, 0.4476F, -0.4447F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 10, -0.3F, -0.5F, -0.4F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.85F, -0.025F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 55, 29, -0.5F, 0.0F, -5.475F, 1, 1, 2, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 57, -0.5F, 0.0F, -3.75F, 1, 1, 2, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 10, -1.5F, 0.0F, -1.75F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 48, 0.35F, -0.2F, -5.45F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 48, -0.35F, -0.2F, -5.45F, 0, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 51, 38, -1.0F, -1.25F, -1.9F, 2, 2, 3, -0.004F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5027F, 1.002F, -1.749F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 53, 0.0F, -1.0F, -3.0F, 1, 1, 3, -0.006F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5027F, 1.002F, -1.749F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3491F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 53, -1.0F, -1.0F, -3.0F, 1, 1, 3, -0.006F, false));

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
        this.main.offsetY = 0.2F;
        this.main.offsetX = 0.35F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.105F;
        this.main.render(0.01F);
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

        EntityPrehistoricFloraDyoplax EntityMegalosaurus = (EntityPrehistoricFloraDyoplax) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDyoplax entity = (EntityPrehistoricFloraDyoplax) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12.5 + (((tickAnim - 3) / 4) * (-8.75-(12.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -8.75 + (((tickAnim - 7) / 3) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.5 + (((tickAnim - 3) / 2) * (-22.4-(-18.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -22.4 + (((tickAnim - 5) / 2) * (0-(-22.4)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 3) * (0.475-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0.475 + (((tickAnim - 3) / 7) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4.25 + (((tickAnim - 3) / 2) * (26-(4.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 26 + (((tickAnim - 5) / 2) * (0-(26)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDyoplax entity = (EntityPrehistoricFloraDyoplax) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (36.63-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 36.63 + (((tickAnim - 8) / 2) * (28.5-(36.63)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.5 + (((tickAnim - 10) / 10) * (0-(28.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.13 + (((tickAnim - 5) / 3) * (11.19-(32.13)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11.19 + (((tickAnim - 8) / 2) * (22.25-(11.19)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22.25 + (((tickAnim - 10) / 10) * (0-(22.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (32.75-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.75 + (((tickAnim - 8) / 2) * (0-(32.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDyoplax entity = (EntityPrehistoricFloraDyoplax) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = -14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30 + (((tickAnim - 0) / 18) * (-2.1-(-14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -2.1 + (((tickAnim - 18) / 12) * (0-(-2.1)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.45-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0.45 + (((tickAnim - 12) / 18) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50 + (((tickAnim - 18) / 12) * (0-(33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (70.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 70.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-50 + (((tickAnim - 18) / 3) * (0-(70.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-50)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDyoplax entity = (EntityPrehistoricFloraDyoplax) entitylivingbaseIn;
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
        EntityPrehistoricFloraDyoplax entity = (EntityPrehistoricFloraDyoplax) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = -19.25 + (((tickAnim - 18) / 16) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 34) / 16) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.95-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            yy = -3.95 + (((tickAnim - 18) / 16) * (-3.95-(-3.95)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -3.95 + (((tickAnim - 34) / 16) * (0-(-3.95)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = -33.25 + (((tickAnim - 18) / 16) * (-33.25-(-33.25)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -33.25 + (((tickAnim - 34) / 16) * (0-(-33.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (52-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 52 + (((tickAnim - 18) / 16) * (52-(52)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 52 + (((tickAnim - 34) / 16) * (0-(52)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 5.75 + (((tickAnim - 18) / 16) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 34) / 16) * (0-(5.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 14 + (((tickAnim - 18) / 16) * (14-(14)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 34) / 16) * (0-(14)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 10.75 + (((tickAnim - 18) / 16) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 34) / 16) * (0-(10.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 5.5 + (((tickAnim - 18) / 16) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 5.5 + (((tickAnim - 34) / 16) * (0-(5.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 5.75 + (((tickAnim - 18) / 16) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 34) / 16) * (0-(5.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 10 + (((tickAnim - 18) / 16) * (10-(10)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 34) / 16) * (0-(10)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = -25.75 + (((tickAnim - 18) / 16) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -25.75 + (((tickAnim - 34) / 16) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 29.75 + (((tickAnim - 18) / 16) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 29.75 + (((tickAnim - 34) / 16) * (0-(29.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.075-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 16) * (0.1-(0.1)));
            zz = -0.075 + (((tickAnim - 18) / 16) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.1 + (((tickAnim - 34) / 16) * (0-(0.1)));
            zz = -0.075 + (((tickAnim - 34) / 16) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = -33.25 + (((tickAnim - 18) / 16) * (-33.25-(-33.25)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -33.25 + (((tickAnim - 34) / 16) * (0-(-33.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (52-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 52 + (((tickAnim - 18) / 16) * (52-(52)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 52 + (((tickAnim - 34) / 16) * (0-(52)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = -25.75 + (((tickAnim - 18) / 16) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -25.75 + (((tickAnim - 34) / 16) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 29.75 + (((tickAnim - 18) / 16) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 29.75 + (((tickAnim - 34) / 16) * (0-(29.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.075-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 16) * (0.1-(0.1)));
            zz = -0.075 + (((tickAnim - 18) / 16) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.1 + (((tickAnim - 34) / 16) * (0-(0.1)));
            zz = -0.075 + (((tickAnim - 34) / 16) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDyoplax entity = (EntityPrehistoricFloraDyoplax) entitylivingbaseIn;
        int animCycle = 26;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-90))*2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-50))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-90))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-100))*0.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 0) / 8) * (-37.57-(22.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -37.57 + (((tickAnim - 8) / 5) * (-24.75-(-37.57)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -24.75 + (((tickAnim - 13) / 14) * (22.5-(-24.75)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.75 + (((tickAnim - 0) / 3) * (46.59-(18.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 46.59 + (((tickAnim - 3) / 5) * (32.87-(46.59)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 32.87 + (((tickAnim - 8) / 5) * (0-(32.87)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (18.75-(0)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 14) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
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
            xx = 43.75 + (((tickAnim - 0) / 3) * (73.53-(43.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 73.53 + (((tickAnim - 3) / 5) * (64.32-(73.53)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 64.32 + (((tickAnim - 8) / 5) * (23-(64.32)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 23 + (((tickAnim - 13) / 4) * (5.76674-(23)));
            yy = 0 + (((tickAnim - 13) / 4) * (-1.89599-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (-0.6265-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 5.76674 + (((tickAnim - 17) / 10) * (43.75-(5.76674)));
            yy = -1.89599 + (((tickAnim - 17) / 10) * (0-(-1.89599)));
            zz = -0.6265 + (((tickAnim - 17) / 10) * (0-(-0.6265)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 3) * (0.33-(0.275)));
            zz = 0.125 + (((tickAnim - 0) / 3) * (-0.625-(0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.33 + (((tickAnim - 3) / 3) * (1.12-(0.33)));
            zz = -0.625 + (((tickAnim - 3) / 3) * (-0.36-(-0.625)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.12 + (((tickAnim - 6) / 2) * (0.885-(1.12)));
            zz = -0.36 + (((tickAnim - 6) / 2) * (0-(-0.36)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.885 + (((tickAnim - 8) / 5) * (-0.3-(0.885)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 13) / 4) * (0.535-(-0.3)));
            zz = 0 + (((tickAnim - 13) / 4) * (0.03-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            yy = 0.535 + (((tickAnim - 17) / 10) * (0.275-(0.535)));
            zz = 0.03 + (((tickAnim - 17) / 10) * (0.125-(0.03)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-90))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-50))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-90))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-150))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-90))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-200))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-150))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-90))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-250))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-90))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-150))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-100))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-90))*-4));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-250))*3), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-150))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-160))*4));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -29 + (((tickAnim - 0) / 13) * (26.4609-(-29)));
            yy = 0 + (((tickAnim - 0) / 13) * (-7.87355-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.65033-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 26.4609 + (((tickAnim - 13) / 6) * (-14.66879-(26.4609)));
            yy = -7.87355 + (((tickAnim - 13) / 6) * (10.07712-(-7.87355)));
            zz = -0.65033 + (((tickAnim - 13) / 6) * (-20.57385-(-0.65033)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -14.66879 + (((tickAnim - 19) / 6) * (-35-(-14.66879)));
            yy = 10.07712 + (((tickAnim - 19) / 6) * (0-(10.07712)));
            zz = -20.57385 + (((tickAnim - 19) / 6) * (0-(-20.57385)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -35 + (((tickAnim - 25) / 2) * (-29-(-35)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 17.75 + (((tickAnim - 0) / 13) * (15.25-(17.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 15.25 + (((tickAnim - 13) / 6) * (-43.58822-(15.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (-7.1715-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (14.343-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -43.58822 + (((tickAnim - 19) / 6) * (17-(-43.58822)));
            yy = -7.1715 + (((tickAnim - 19) / 6) * (0-(-7.1715)));
            zz = 14.343 + (((tickAnim - 19) / 6) * (0-(14.343)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 17 + (((tickAnim - 25) / 2) * (17.75-(17)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-0.13-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.46-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.14-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -0.13 + (((tickAnim - 15) / 4) * (-0.45-(-0.13)));
            yy = 0.46 + (((tickAnim - 15) / 4) * (0.15-(0.46)));
            zz = 0.14 + (((tickAnim - 15) / 4) * (-0.05-(0.14)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -0.45 + (((tickAnim - 19) / 6) * (0-(-0.45)));
            yy = 0.15 + (((tickAnim - 19) / 6) * (0-(0.15)));
            zz = -0.05 + (((tickAnim - 19) / 6) * (0-(-0.05)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
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
            xx = 11.5 + (((tickAnim - 0) / 5) * (-5.44-(11.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -5.44 + (((tickAnim - 5) / 8) * (46.25-(-5.44)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 46.25 + (((tickAnim - 13) / 2) * (90.86-(46.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 90.86 + (((tickAnim - 15) / 4) * (86-(90.86)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 86 + (((tickAnim - 19) / 5) * (41-(86)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 41 + (((tickAnim - 24) / 3) * (11.5-(41)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 2) * (0.72-(0.15)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.72 + (((tickAnim - 2) / 3) * (0.8-(0.72)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.8 + (((tickAnim - 5) / 8) * (0.45-(0.8)));
            zz = 0 + (((tickAnim - 5) / 8) * (-0.4-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 13) / 2) * (1.34-(0.45)));
            zz = -0.4 + (((tickAnim - 13) / 2) * (-1.26-(-0.4)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 1.34 + (((tickAnim - 15) / 4) * (0.6-(1.34)));
            zz = -1.26 + (((tickAnim - 15) / 4) * (-1.125-(-1.26)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 19) / 5) * (0.75-(0.6)));
            zz = -1.125 + (((tickAnim - 19) / 5) * (0-(-1.125)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 24) / 3) * (0.15-(0.75)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-540))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269-160))*-4));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -24.75 + (((tickAnim - 0) / 13) * (22.5-(-24.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 22.5 + (((tickAnim - 13) / 9) * (-37.57-(22.5)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -37.57 + (((tickAnim - 22) / 5) * (-24.75-(-37.57)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18.75 + (((tickAnim - 13) / 4) * (46.59-(18.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 46.59 + (((tickAnim - 17) / 5) * (32.87-(46.59)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 32.87 + (((tickAnim - 22) / 5) * (0-(32.87)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 13) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 14) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
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
            xx = 23 + (((tickAnim - 0) / 3) * (5.76674-(23)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.89599-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.6265-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 5.76674 + (((tickAnim - 3) / 10) * (43.75-(5.76674)));
            yy = -1.89599 + (((tickAnim - 3) / 10) * (0-(-1.89599)));
            zz = -0.6265 + (((tickAnim - 3) / 10) * (0-(-0.6265)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 43.75 + (((tickAnim - 13) / 4) * (73.53-(43.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 73.53 + (((tickAnim - 17) / 5) * (64.32-(73.53)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 64.32 + (((tickAnim - 22) / 5) * (23-(64.32)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 3) * (0.535-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.03-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.535 + (((tickAnim - 3) / 10) * (0.275-(0.535)));
            zz = 0.03 + (((tickAnim - 3) / 10) * (0.125-(0.03)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.275 + (((tickAnim - 13) / 4) * (0.33-(0.275)));
            zz = 0.125 + (((tickAnim - 13) / 4) * (-0.625-(0.125)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0.33 + (((tickAnim - 17) / 2) * (1.12-(0.33)));
            zz = -0.625 + (((tickAnim - 17) / 2) * (-0.36-(-0.625)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.12 + (((tickAnim - 19) / 3) * (0.885-(1.12)));
            zz = -0.36 + (((tickAnim - 19) / 3) * (0-(-0.36)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0.885 + (((tickAnim - 22) / 5) * (-0.3-(0.885)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 26.4609 + (((tickAnim - 0) / 6) * (-14.66879-(26.4609)));
            yy = 7.87355 + (((tickAnim - 0) / 6) * (-10.07712-(7.87355)));
            zz = -0.65033 + (((tickAnim - 0) / 6) * (20.57385-(-0.65033)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -14.66879 + (((tickAnim - 6) / 6) * (-35-(-14.66879)));
            yy = -10.07712 + (((tickAnim - 6) / 6) * (0-(-10.07712)));
            zz = 20.57385 + (((tickAnim - 6) / 6) * (0-(20.57385)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -35 + (((tickAnim - 12) / 1) * (-24.92101-(-35)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.87484-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-0.07226-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -24.92101 + (((tickAnim - 13) / 14) * (26.4609-(-24.92101)));
            yy = 0.87484 + (((tickAnim - 13) / 14) * (7.87355-(0.87484)));
            zz = -0.07226 + (((tickAnim - 13) / 14) * (-0.65033-(-0.07226)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.25 + (((tickAnim - 0) / 6) * (-43.58822-(15.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (7.1715-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-14.343-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -43.58822 + (((tickAnim - 6) / 6) * (17-(-43.58822)));
            yy = 7.1715 + (((tickAnim - 6) / 6) * (0-(7.1715)));
            zz = -14.343 + (((tickAnim - 6) / 6) * (0-(-14.343)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 17 + (((tickAnim - 12) / 1) * (15.06-(17)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 15.06 + (((tickAnim - 13) / 14) * (15.25-(15.06)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.13-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.46-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.14-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -0.13 + (((tickAnim - 2) / 4) * (0.45-(-0.13)));
            yy = 0.46 + (((tickAnim - 2) / 4) * (0.15-(0.46)));
            zz = 0.14 + (((tickAnim - 2) / 4) * (-0.05-(0.14)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0.45 + (((tickAnim - 6) / 6) * (0-(0.45)));
            yy = 0.15 + (((tickAnim - 6) / 6) * (0-(0.15)));
            zz = -0.05 + (((tickAnim - 6) / 6) * (0-(-0.05)));
        }
        else if (tickAnim >= 12 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 12) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 15) * (0-(0)));
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
            xx = 46.25 + (((tickAnim - 0) / 2) * (90.86-(46.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 90.86 + (((tickAnim - 2) / 4) * (86-(90.86)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 86 + (((tickAnim - 6) / 5) * (50.75-(86)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 50.75 + (((tickAnim - 11) / 2) * (8.1-(50.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 8.1 + (((tickAnim - 13) / 4) * (-0.19-(8.1)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = -0.19 + (((tickAnim - 17) / 10) * (46.25-(-0.19)));
            yy = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 2) * (1.34-(0.45)));
            zz = -0.4 + (((tickAnim - 0) / 2) * (-1.26-(-0.4)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 1.34 + (((tickAnim - 2) / 4) * (0.6-(1.34)));
            zz = -1.26 + (((tickAnim - 2) / 4) * (-1.125-(-1.26)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 6) / 5) * (0.825-(0.6)));
            zz = -1.125 + (((tickAnim - 6) / 5) * (-0.475-(-1.125)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.825 + (((tickAnim - 11) / 2) * (0-(0.825)));
            zz = -0.475 + (((tickAnim - 11) / 2) * (0-(-0.475)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0.55-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            yy = 0.55 + (((tickAnim - 17) / 10) * (0.45-(0.55)));
            zz = 0 + (((tickAnim - 17) / 10) * (-0.4-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*269/0.5-540))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDyoplax entity = (EntityPrehistoricFloraDyoplax) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*0.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -26.75168 + (((tickAnim - 0) / 8) * (41.25-(-26.75168)));
            yy = -10.91753 + (((tickAnim - 0) / 8) * (0-(-10.91753)));
            zz = 1.05849 + (((tickAnim - 0) / 8) * (0-(1.05849)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 41.25 + (((tickAnim - 8) / 4) * (-51.32242-(41.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (-14.8121-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.82857-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -51.32242 + (((tickAnim - 12) / 3) * (-26.75168-(-51.32242)));
            yy = -14.8121 + (((tickAnim - 12) / 3) * (-10.91753-(-14.8121)));
            zz = 0.82857 + (((tickAnim - 12) / 3) * (1.05849-(0.82857)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1 + (((tickAnim - 8) / 4) * (51.06-(-1)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 51.06 + (((tickAnim - 12) / 3) * (0-(51.06)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
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
            xx = 30 + (((tickAnim - 0) / 2) * (12.3-(30)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 12.3 + (((tickAnim - 2) / 3) * (12.28-(12.3)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12.28 + (((tickAnim - 5) / 3) * (80.25-(12.28)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 80.25 + (((tickAnim - 8) / 1) * (104.71672-(80.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (-1.31832-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-5.77415-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 104.71672 + (((tickAnim - 9) / 3) * (83.08-(104.71672)));
            yy = -1.31832 + (((tickAnim - 9) / 3) * (0-(-1.31832)));
            zz = -5.77415 + (((tickAnim - 9) / 3) * (0-(-5.77415)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 83.08 + (((tickAnim - 12) / 3) * (30-(83.08)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 2) * (0.045-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.12-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0.045 + (((tickAnim - 2) / 6) * (0.72-(0.045)));
            zz = -0.12 + (((tickAnim - 2) / 6) * (-0.6-(-0.12)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.72 + (((tickAnim - 8) / 4) * (1.22-(0.72)));
            zz = -0.6 + (((tickAnim - 8) / 4) * (-0.395-(-0.6)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.22 + (((tickAnim - 12) / 3) * (-0.275-(1.22)));
            zz = -0.395 + (((tickAnim - 12) / 3) * (0-(-0.395)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -26.75168 + (((tickAnim - 0) / 8) * (41.25-(-26.75168)));
            yy = 10.91753 + (((tickAnim - 0) / 8) * (0-(10.91753)));
            zz = -1.05849 + (((tickAnim - 0) / 8) * (0-(-1.05849)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 41.25 + (((tickAnim - 8) / 4) * (-51.32242-(41.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (14.8121-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.82857-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -51.32242 + (((tickAnim - 12) / 3) * (-26.75168-(-51.32242)));
            yy = 14.8121 + (((tickAnim - 12) / 3) * (10.91753-(14.8121)));
            zz = -0.82857 + (((tickAnim - 12) / 3) * (-1.05849-(-0.82857)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1 + (((tickAnim - 8) / 4) * (51.06-(-1)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 51.06 + (((tickAnim - 12) / 3) * (0-(51.06)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
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
            xx = 30 + (((tickAnim - 0) / 2) * (12.3-(30)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 12.3 + (((tickAnim - 2) / 3) * (12.28-(12.3)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12.28 + (((tickAnim - 5) / 3) * (80.25-(12.28)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 80.25 + (((tickAnim - 8) / 1) * (104.71672-(80.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (-1.31832-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-5.77415-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 104.71672 + (((tickAnim - 9) / 3) * (83.08-(104.71672)));
            yy = -1.31832 + (((tickAnim - 9) / 3) * (0-(-1.31832)));
            zz = -5.77415 + (((tickAnim - 9) / 3) * (0-(-5.77415)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 83.08 + (((tickAnim - 12) / 3) * (30-(83.08)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 2) * (0.045-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.12-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0.045 + (((tickAnim - 2) / 6) * (0.72-(0.045)));
            zz = -0.12 + (((tickAnim - 2) / 6) * (-0.6-(-0.12)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.72 + (((tickAnim - 8) / 4) * (1.22-(0.72)));
            zz = -0.6 + (((tickAnim - 8) / 4) * (-0.395-(-0.6)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.22 + (((tickAnim - 12) / 3) * (-0.275-(1.22)));
            zz = -0.395 + (((tickAnim - 12) / 3) * (0-(-0.395)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-8), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*12), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*12), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*8), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 52.4453 + (((tickAnim - 0) / 4) * (3.47307-(52.4453)));
            yy = -4.82922 + (((tickAnim - 0) / 4) * (13.52353-(-4.82922)));
            zz = 1.29717 + (((tickAnim - 0) / 4) * (-29.3449-(1.29717)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 3.47307 + (((tickAnim - 4) / 4) * (-39.5-(3.47307)));
            yy = 13.52353 + (((tickAnim - 4) / 4) * (0-(13.52353)));
            zz = -29.3449 + (((tickAnim - 4) / 4) * (0-(-29.3449)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -39.5 + (((tickAnim - 8) / 7) * (52.4453-(-39.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (-4.82922-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (1.29717-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 21.15888 + (((tickAnim - 0) / 4) * (-44.86212-(21.15888)));
            yy = 2.84124 + (((tickAnim - 0) / 4) * (-0.45546-(2.84124)));
            zz = 6.40007 + (((tickAnim - 0) / 4) * (28.60857-(6.40007)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -44.86212 + (((tickAnim - 4) / 4) * (25.75-(-44.86212)));
            yy = -0.45546 + (((tickAnim - 4) / 4) * (0-(-0.45546)));
            zz = 28.60857 + (((tickAnim - 4) / 4) * (0-(28.60857)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 25.75 + (((tickAnim - 8) / 7) * (21.15888-(25.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (2.84124-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (6.40007-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.375 + (((tickAnim - 4) / 4) * (0-(-0.375)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 59.75 + (((tickAnim - 0) / 4) * (85.38-(59.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 85.38 + (((tickAnim - 4) / 4) * (10-(85.38)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 8) / 4) * (-23.87-(10)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -23.87 + (((tickAnim - 12) / 3) * (59.75-(-23.87)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 2) * (1.155-(0.275)));
            zz = -0.925 + (((tickAnim - 0) / 2) * (-1.07-(-0.925)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.155 + (((tickAnim - 2) / 2) * (0.28-(1.155)));
            zz = -1.07 + (((tickAnim - 2) / 2) * (-1.285-(-1.07)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.28 + (((tickAnim - 4) / 4) * (1.85-(0.28)));
            zz = -1.285 + (((tickAnim - 4) / 4) * (0-(-1.285)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.85 + (((tickAnim - 8) / 4) * (0-(1.85)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0.275-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (-0.925-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 52.4453 + (((tickAnim - 0) / 4) * (3.47307-(52.4453)));
            yy = 4.82922 + (((tickAnim - 0) / 4) * (-13.52353-(4.82922)));
            zz = -1.29717 + (((tickAnim - 0) / 4) * (29.3449-(-1.29717)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 3.47307 + (((tickAnim - 4) / 4) * (-39.5-(3.47307)));
            yy = -13.52353 + (((tickAnim - 4) / 4) * (0-(-13.52353)));
            zz = 29.3449 + (((tickAnim - 4) / 4) * (0-(29.3449)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -39.5 + (((tickAnim - 8) / 7) * (52.4453-(-39.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (4.82922-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-1.29717-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 21.15888 + (((tickAnim - 0) / 4) * (-44.86212-(21.15888)));
            yy = -2.84124 + (((tickAnim - 0) / 4) * (0.45546-(-2.84124)));
            zz = -6.40007 + (((tickAnim - 0) / 4) * (-28.60857-(-6.40007)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -44.86212 + (((tickAnim - 4) / 4) * (25.75-(-44.86212)));
            yy = 0.45546 + (((tickAnim - 4) / 4) * (0-(0.45546)));
            zz = -28.60857 + (((tickAnim - 4) / 4) * (0-(-28.60857)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 25.75 + (((tickAnim - 8) / 7) * (21.15888-(25.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (-2.84124-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-6.40007-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.375 + (((tickAnim - 4) / 4) * (0-(0.375)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 59.75 + (((tickAnim - 0) / 4) * (85.38-(59.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 85.38 + (((tickAnim - 4) / 4) * (10-(85.38)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 8) / 4) * (-23.87-(10)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -23.87 + (((tickAnim - 12) / 3) * (59.75-(-23.87)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 2) * (1.155-(0.275)));
            zz = -0.925 + (((tickAnim - 0) / 2) * (-1.07-(-0.925)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.155 + (((tickAnim - 2) / 2) * (0.28-(1.155)));
            zz = -1.07 + (((tickAnim - 2) / 2) * (-1.285-(-1.07)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.28 + (((tickAnim - 4) / 4) * (1.85-(0.28)));
            zz = -1.285 + (((tickAnim - 4) / 4) * (0-(-1.285)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.85 + (((tickAnim - 8) / 4) * (0-(1.85)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-450))*8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDyoplax ee = (EntityPrehistoricFloraDyoplax) entitylivingbaseIn;

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
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDyoplax e = (EntityPrehistoricFloraDyoplax) entity;

    }
}
