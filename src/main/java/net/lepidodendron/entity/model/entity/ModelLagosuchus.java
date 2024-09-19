package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLagosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLagosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLegs;
    private final AdvancedModelRenderer leftLegs2;
    private final AdvancedModelRenderer leftLegs3;
    private final AdvancedModelRenderer leftLegs4;
    private final AdvancedModelRenderer rightLegs;
    private final AdvancedModelRenderer rightLegs2;
    private final AdvancedModelRenderer rightLegs3;
    private final AdvancedModelRenderer rightLegs4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;


    private ModelAnimator animator;

    public ModelLagosuchus() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 24, -1.5F, -10.925F, -1.0F, 3, 3, 3, 0.0F, false));

        this.leftLegs = new AdvancedModelRenderer(this);
        this.leftLegs.setRotationPoint(2.5F, -9.9671F, 0.1566F);
        this.main.addChild(leftLegs);
        this.setRotateAngle(leftLegs, -0.2618F, 0.0F, 0.0F);
        this.leftLegs.cubeList.add(new ModelBox(leftLegs, 0, 30, -2.0F, -0.25F, -0.75F, 2, 4, 2, 0.0F, false));

        this.leftLegs2 = new AdvancedModelRenderer(this);
        this.leftLegs2.setRotationPoint(-0.5F, 3.5174F, -0.5283F);
        this.leftLegs.addChild(leftLegs2);
        this.setRotateAngle(leftLegs2, 0.7854F, 0.0F, 0.0F);
        this.leftLegs2.cubeList.add(new ModelBox(leftLegs2, 0, 9, -1.0F, 0.0F, -0.25F, 1, 5, 1, 0.001F, false));
        this.leftLegs2.cubeList.add(new ModelBox(leftLegs2, 0, 0, -1.0F, 0.0F, 0.25F, 1, 5, 1, 0.0F, false));

        this.leftLegs3 = new AdvancedModelRenderer(this);
        this.leftLegs3.setRotationPoint(0.0F, 4.6384F, 0.8586F);
        this.leftLegs2.addChild(leftLegs3);
        this.setRotateAngle(leftLegs3, -0.6981F, 0.0F, 0.0F);
        this.leftLegs3.cubeList.add(new ModelBox(leftLegs3, 8, 16, -1.0F, 0.125F, -0.55F, 1, 3, 1, -0.001F, false));

        this.leftLegs4 = new AdvancedModelRenderer(this);
        this.leftLegs4.setRotationPoint(-0.5F, 2.2985F, 0.2826F);
        this.leftLegs3.addChild(leftLegs4);
        this.setRotateAngle(leftLegs4, 0.1745F, 0.0F, 0.0F);
        this.leftLegs4.cubeList.add(new ModelBox(leftLegs4, 12, 26, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.rightLegs = new AdvancedModelRenderer(this);
        this.rightLegs.setRotationPoint(-2.5F, -9.9671F, 0.1566F);
        this.main.addChild(rightLegs);
        this.setRotateAngle(rightLegs, -0.2618F, 0.0F, 0.0F);
        this.rightLegs.cubeList.add(new ModelBox(rightLegs, 0, 30, 0.0F, -0.25F, -0.75F, 2, 4, 2, 0.0F, true));

        this.rightLegs2 = new AdvancedModelRenderer(this);
        this.rightLegs2.setRotationPoint(0.5F, 3.5174F, -0.5283F);
        this.rightLegs.addChild(rightLegs2);
        this.setRotateAngle(rightLegs2, 0.7854F, 0.0F, 0.0F);
        this.rightLegs2.cubeList.add(new ModelBox(rightLegs2, 0, 9, 0.0F, 0.0F, -0.25F, 1, 5, 1, 0.001F, true));
        this.rightLegs2.cubeList.add(new ModelBox(rightLegs2, 0, 0, 0.0F, 0.0F, 0.25F, 1, 5, 1, 0.0F, true));

        this.rightLegs3 = new AdvancedModelRenderer(this);
        this.rightLegs3.setRotationPoint(0.0F, 4.6384F, 0.8586F);
        this.rightLegs2.addChild(rightLegs3);
        this.setRotateAngle(rightLegs3, -0.6981F, 0.0F, 0.0F);
        this.rightLegs3.cubeList.add(new ModelBox(rightLegs3, 8, 16, 0.0F, 0.125F, -0.55F, 1, 3, 1, -0.001F, true));

        this.rightLegs4 = new AdvancedModelRenderer(this);
        this.rightLegs4.setRotationPoint(0.5F, 2.2985F, 0.2826F);
        this.rightLegs3.addChild(rightLegs4);
        this.setRotateAngle(rightLegs4, 0.1745F, 0.0F, 0.0F);
        this.rightLegs4.cubeList.add(new ModelBox(rightLegs4, 12, 26, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -10.725F, 2.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 17, 19, -1.0F, 0.0F, -0.5F, 2, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.85F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 17, -0.5F, -0.75F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 16, -0.5F, -0.25F, 0.0F, 1, 1, 6, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.5F, -0.15F, 5.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 3, 0.0F, -0.5F, 0.0F, 1, 1, 6, -0.002F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, 0.0F, 5.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 12, 10, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5F, 6.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 20, 10, -0.5F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -10.35F, -2.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.825F, -4.6F, 4, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, -1.5F, 1.9F, -4.6F, 3, 1, 6, 0.002F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.75F, -3.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 22, 0, -1.5F, -0.15F, -3.925F, 3, 3, 3, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.5F, 2.35F, -2.925F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.9223F, 0.3189F, -0.2333F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 20, 10, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 2.75F, 0.25F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8743F, -0.1021F, 0.2565F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 16, 17, -0.5F, 0.0F, -0.75F, 1, 3, 1, -0.001F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.5F, 2.7027F, -0.165F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.5033F, 0.1509F, 0.2666F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 22, 6, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.5F, 2.35F, -2.925F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.9223F, -0.3189F, 0.2333F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 20, 10, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 2.75F, 0.25F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8743F, 0.1021F, -0.2565F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 16, 17, -0.5F, 0.0F, -0.75F, 1, 3, 1, -0.001F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.5F, 2.7027F, -0.165F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.5033F, -0.1509F, -0.2666F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 22, 6, 0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5687F, -2.352F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.8727F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 27, 11, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.5891F, -1.5002F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0436F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 27, 7, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 22, 26, -1.0F, 0.3F, -3.0F, 2, 1, 3, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3399F, -2.994F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.6545F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 26, 20, -1.0F, -0.475F, -2.5F, 2, 1, 3, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 3, -0.5F, -0.475F, -3.75F, 1, 1, 2, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.0798F, -0.822F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 19, -0.5F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 20, -0.5F, 0.0F, 0.4F, 2, 1, 1, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.0798F, -0.822F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 0, -0.5F, 0.0F, -2.0F, 2, 1, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.475F, -3.05F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.175F, -1.35F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 13, -1.1F, -0.575F, -0.675F, 2, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 13, -0.9F, -0.575F, -0.675F, 2, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, -0.25F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 10, -0.5F, -0.475F, -3.425F, 1, 1, 2, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 16, -1.0F, -0.475F, -2.25F, 2, 1, 3, -0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.525F, -1.25F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, -0.5F, -1.0F, 0.0F, 1, 1, 2, -0.004F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(body2, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.5F, 0.0F, 0.0F);
        this.body2.offsetY = -0.0F;
        this.body2.offsetX = 0.0F;
        this.body2.offsetZ = -0.15F;
        this.body2.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(body, -0.1F, 0.0F, -0.05F);
        this.setRotateAngle(body2, 0.1F, -0.05F, -0.05F);
        this.setRotateAngle(neck, -0.8F, 0.05F, -0.0F);
        this.setRotateAngle(neck2, -0.2F, 0.05F, -0.1F);
        this.setRotateAngle(head, 1.3F, 0.0F, -0.5F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(leftLegs, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLegs, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 1.5F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 1.5F, -0.15F, 0.0F);
        this.main.offsetX = 0.0F;
        this.main.offsetY = -0.011F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.30F;
        this.main.offsetX = 1.2F;
        this.main.rotateAngleY = (float)Math.toRadians(130);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, -0.3F, 3.5F, 0.0F);
        this.setRotateAngle(body, -0.1F, 0.0F, -0.05F);
        this.setRotateAngle(body2, 0.1F, -0.05F, -0.05F);
        this.setRotateAngle(neck, -0.8F, 0.05F, -0.0F);
        this.setRotateAngle(neck2, -0.2F, 0.05F, -0.1F);
        this.setRotateAngle(head, 1.3F, 0.0F, -0.9F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.05F, 0.4F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.35F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, 0.3F, 0.0F);
        this.setRotateAngle(tail5, 0.1F, 0.3F, 0.0F);
        this.setRotateAngle(leftLegs, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLegs, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 1.5F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 1.5F, -0.15F, 0.0F);
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

        EntityPrehistoricFloraLagosuchus entityLagosuchus = (EntityPrehistoricFloraLagosuchus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.body2, this.neck, this.neck2, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityLagosuchus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityLagosuchus.getAnimation() == entityLagosuchus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityLagosuchus.isReallyInWater()) {

                if (f3 == 0.0F || !entityLagosuchus.getIsMoving()) {
                    if (entityLagosuchus.getAnimation() != entityLagosuchus.EAT_ANIMATION
                            && entityLagosuchus.getAnimation() != entityLagosuchus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityLagosuchus.getIsFast()) { //Running


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
        EntityPrehistoricFloraLagosuchus ee = (EntityPrehistoricFloraLagosuchus) entitylivingbaseIn;

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
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLagosuchus entity = (EntityPrehistoricFloraLagosuchus) entitylivingbaseIn;

        int animCycle = 85;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -18.5 + (((tickAnim - 8) / 1) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -18.5 + (((tickAnim - 9) / 4) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -18.5 + (((tickAnim - 13) / 5) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -18.5 + (((tickAnim - 18) / 7) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -18.5 + (((tickAnim - 25) / 7) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -18.5 + (((tickAnim - 32) / 13) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 45) / 5) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -18.5 + (((tickAnim - 50) / 5) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -5 + (((tickAnim - 65) / 10) * (-5-(-5)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 75) / 5) * (-5-(-5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -5 + (((tickAnim - 80) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -2 + (((tickAnim - 8) / 1) * (-2-(-2)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 9) / 4) * (-2-(-2)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 13) / 5) * (-2-(-2)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -2 + (((tickAnim - 18) / 7) * (-2-(-2)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -2 + (((tickAnim - 25) / 20) * (-2-(-2)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 45) / 5) * (-2-(-2)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -2 + (((tickAnim - 50) / 5) * (-25.25-(-2)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -25.25 + (((tickAnim - 55) / 5) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -25.25 + (((tickAnim - 60) / 5) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -25.25 + (((tickAnim - 65) / 10) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -25.25 + (((tickAnim - 75) / 5) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -25.25 + (((tickAnim - 80) / 5) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs, leftLegs.rotateAngleX + (float) Math.toRadians(xx), leftLegs.rotateAngleY + (float) Math.toRadians(yy), leftLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (7.19376-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (-0.11176-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0.13135-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 7.19376 + (((tickAnim - 53) / 2) * (-10.61249-(7.19376)));
            yy = -0.11176 + (((tickAnim - 53) / 2) * (-0.22352-(-0.11176)));
            zz = 0.13135 + (((tickAnim - 53) / 2) * (0.2627-(0.13135)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -10.61249 + (((tickAnim - 55) / 5) * (-10.61249-(-10.61249)));
            yy = -0.22352 + (((tickAnim - 55) / 5) * (-0.22352-(-0.22352)));
            zz = 0.2627 + (((tickAnim - 55) / 5) * (0.2627-(0.2627)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -10.61249 + (((tickAnim - 60) / 5) * (-17.36249-(-10.61249)));
            yy = -0.22352 + (((tickAnim - 60) / 5) * (-0.22352-(-0.22352)));
            zz = 0.2627 + (((tickAnim - 60) / 5) * (0.2627-(0.2627)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -17.36249 + (((tickAnim - 65) / 10) * (-17.36249-(-17.36249)));
            yy = -0.22352 + (((tickAnim - 65) / 10) * (-0.22352-(-0.22352)));
            zz = 0.2627 + (((tickAnim - 65) / 10) * (0.2627-(0.2627)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -17.36249 + (((tickAnim - 75) / 5) * (-17.36249-(-17.36249)));
            yy = -0.22352 + (((tickAnim - 75) / 5) * (-0.22352-(-0.22352)));
            zz = 0.2627 + (((tickAnim - 75) / 5) * (0.2627-(0.2627)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -17.36249 + (((tickAnim - 80) / 3) * (41.56876-(-17.36249)));
            yy = -0.22352 + (((tickAnim - 80) / 3) * (-0.11176-(-0.22352)));
            zz = 0.2627 + (((tickAnim - 80) / 3) * (0.13135-(0.2627)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 41.56876 + (((tickAnim - 83) / 2) * (0-(41.56876)));
            yy = -0.11176 + (((tickAnim - 83) / 2) * (0-(-0.11176)));
            zz = 0.13135 + (((tickAnim - 83) / 2) * (0-(0.13135)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs2, leftLegs2.rotateAngleX + (float) Math.toRadians(xx), leftLegs2.rotateAngleY + (float) Math.toRadians(yy), leftLegs2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0.35-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (-0.1-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0.35 + (((tickAnim - 53) / 7) * (0-(0.35)));
            zz = -0.1 + (((tickAnim - 53) / 7) * (0-(-0.1)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs2.rotationPointX = this.leftLegs2.rotationPointX + (float)(xx);
        this.leftLegs2.rotationPointY = this.leftLegs2.rotationPointY - (float)(yy);
        this.leftLegs2.rotationPointZ = this.leftLegs2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (-40.12-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -40.12 + (((tickAnim - 53) / 2) * (20.75-(-40.12)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 20.75 + (((tickAnim - 55) / 5) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 20.75 + (((tickAnim - 60) / 5) * (32.25-(20.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 32.25 + (((tickAnim - 65) / 10) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 32.25 + (((tickAnim - 75) / 5) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 32.25 + (((tickAnim - 80) / 3) * (-40.37-(32.25)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = -40.37 + (((tickAnim - 83) / 2) * (0-(-40.37)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs3, leftLegs3.rotateAngleX + (float) Math.toRadians(xx), leftLegs3.rotateAngleY + (float) Math.toRadians(yy), leftLegs3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLegs3.rotationPointX = this.leftLegs3.rotationPointX + (float)(0);
        this.leftLegs3.rotationPointY = this.leftLegs3.rotationPointY - (float)(0);
        this.leftLegs3.rotationPointZ = this.leftLegs3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.25 + (((tickAnim - 8) / 1) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.25 + (((tickAnim - 9) / 4) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.25 + (((tickAnim - 13) / 5) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 20.25 + (((tickAnim - 18) / 7) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 20.25 + (((tickAnim - 25) / 20) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 20.25 + (((tickAnim - 45) / 5) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 20.25 + (((tickAnim - 50) / 3) * (74-(20.25)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 74 + (((tickAnim - 53) / 2) * (12.75-(74)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 12.75 + (((tickAnim - 55) / 5) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 12.75 + (((tickAnim - 60) / 5) * (17.25-(12.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 17.25 + (((tickAnim - 65) / 10) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 17.25 + (((tickAnim - 75) / 5) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 17.25 + (((tickAnim - 80) / 3) * (84.13-(17.25)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 84.13 + (((tickAnim - 83) / 2) * (0-(84.13)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs4, leftLegs4.rotateAngleX + (float) Math.toRadians(xx), leftLegs4.rotateAngleY + (float) Math.toRadians(yy), leftLegs4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 1) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 8) / 1) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 9) / 4) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 9) / 4) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 13) / 5) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 13) / 5) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.35 + (((tickAnim - 18) / 7) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 18) / 7) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 25) / 20) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 25) / 20) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 45) / 5) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 45) / 5) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 50) / 3) * (0.18-(0.35)));
            zz = -0.125 + (((tickAnim - 50) / 3) * (-0.61-(-0.125)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0.18 + (((tickAnim - 53) / 2) * (0-(0.18)));
            zz = -0.61 + (((tickAnim - 53) / 2) * (0-(-0.61)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (-0.85-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = -0.85 + (((tickAnim - 83) / 2) * (0-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs4.rotationPointX = this.leftLegs4.rotationPointX + (float)(xx);
        this.leftLegs4.rotationPointY = this.leftLegs4.rotationPointY - (float)(yy);
        this.leftLegs4.rotationPointZ = this.leftLegs4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -2 + (((tickAnim - 8) / 1) * (-2-(-2)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 9) / 4) * (-2-(-2)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 13) / 5) * (-2-(-2)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -2 + (((tickAnim - 18) / 7) * (-2-(-2)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -2 + (((tickAnim - 25) / 20) * (-2-(-2)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 45) / 5) * (-2-(-2)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -2 + (((tickAnim - 50) / 5) * (0-(-2)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs, rightLegs.rotateAngleX + (float) Math.toRadians(xx), rightLegs.rotateAngleY + (float) Math.toRadians(yy), rightLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.25 + (((tickAnim - 8) / 1) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.25 + (((tickAnim - 9) / 4) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.25 + (((tickAnim - 13) / 5) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 20.25 + (((tickAnim - 18) / 7) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 20.25 + (((tickAnim - 25) / 20) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 20.25 + (((tickAnim - 45) / 5) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 20.25 + (((tickAnim - 50) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs4, rightLegs4.rotateAngleX + (float) Math.toRadians(xx), rightLegs4.rotateAngleY + (float) Math.toRadians(yy), rightLegs4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 1) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 8) / 1) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 9) / 4) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 9) / 4) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 13) / 5) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 13) / 5) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.35 + (((tickAnim - 18) / 7) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 18) / 7) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 25) / 20) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 25) / 20) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 45) / 5) * (0.35-(0.35)));
            zz = -0.125 + (((tickAnim - 45) / 5) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 50) / 5) * (0-(0.35)));
            zz = -0.125 + (((tickAnim - 50) / 5) * (0-(-0.125)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs4.rotationPointX = this.rightLegs4.rotationPointX + (float)(xx);
        this.rightLegs4.rotationPointY = this.rightLegs4.rotationPointY - (float)(yy);
        this.rightLegs4.rotationPointZ = this.rightLegs4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12 + (((tickAnim - 8) / 5) * (26.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(12)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 26.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 13) / 5) * (0.25565-(26.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 13) / 5) * (1.70851-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.37888-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.25565 + (((tickAnim - 18) / 4) * (1.6806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(0.25565)));
            yy = 1.70851 + (((tickAnim - 18) / 4) * (1.70851-(1.70851)));
            zz = 0.37888 + (((tickAnim - 18) / 4) * (0.37888-(0.37888)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 1.6806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 22) / 10) * (0.25807-(1.6806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 1.70851 + (((tickAnim - 22) / 10) * (-8.0414-(1.70851)));
            zz = 0.37888 + (((tickAnim - 22) / 10) * (0.33516-(0.37888)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0.25807 + (((tickAnim - 32) / 13) * (0.25602-(0.25807)));
            yy = -8.0414 + (((tickAnim - 32) / 13) * (-3.54144-(-8.0414)));
            zz = 0.33516 + (((tickAnim - 32) / 13) * (0.35544-(0.33516)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.25602 + (((tickAnim - 45) / 5) * (0.25566-(0.25602)));
            yy = -3.54144 + (((tickAnim - 45) / 5) * (-1.79146-(-3.54144)));
            zz = 0.35544 + (((tickAnim - 45) / 5) * (0.36327-(0.35544)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0.25566 + (((tickAnim - 50) / 5) * (9.55121-(0.25566)));
            yy = -1.79146 + (((tickAnim - 50) / 5) * (10.3769+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(-1.79146)));
            zz = 0.36327 + (((tickAnim - 50) / 5) * (1.64603-(0.36327)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 9.55121 + (((tickAnim - 55) / 5) * (9.50221-(9.55121)));
            yy = 10.3769+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 55) / 5) * (0.92081-(10.3769+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            zz = 1.64603 + (((tickAnim - 55) / 5) * (0.8173-(1.64603)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 9.50221 + (((tickAnim - 60) / 5) * (2.25252-(9.50221)));
            yy = 0.92081 + (((tickAnim - 60) / 5) * (-1.32745-(0.92081)));
            zz = 0.8173 + (((tickAnim - 60) / 5) * (0.72888-(0.8173)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 2.25252 + (((tickAnim - 65) / 10) * (0.26047-(2.25252)));
            yy = -1.32745 + (((tickAnim - 65) / 10) * (-6.07473-(-1.32745)));
            zz = 0.72888 + (((tickAnim - 65) / 10) * (0.58521-(0.72888)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0.26047 + (((tickAnim - 75) / 5) * (0.25975-(0.26047)));
            yy = -6.07473 + (((tickAnim - 75) / 5) * (-4.32475-(-6.07473)));
            zz = 0.58521 + (((tickAnim - 75) / 5) * (0.59319-(0.58521)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0.25975 + (((tickAnim - 80) / 5) * (0-(0.25975)));
            yy = -4.32475 + (((tickAnim - 80) / 5) * (0-(-4.32475)));
            zz = 0.59319 + (((tickAnim - 80) / 5) * (0-(0.59319)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 11.25 + (((tickAnim - 8) / 1) * (12-(11.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 12 + (((tickAnim - 9) / 4) * (12-(12)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 12 + (((tickAnim - 13) / 5) * (2.26601-(12)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.66234-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.68904-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 2.26601 + (((tickAnim - 18) / 4) * (2.26601-(2.26601)));
            yy = 2.66234 + (((tickAnim - 18) / 4) * (2.66234-(2.66234)));
            zz = 0.68904 + (((tickAnim - 18) / 4) * (0.68904-(0.68904)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 2.26601 + (((tickAnim - 22) / 3) * (2.26601-(2.26601)));
            yy = 2.66234 + (((tickAnim - 22) / 3) * (2.66234-(2.66234)));
            zz = 0.68904 + (((tickAnim - 22) / 3) * (0.68904-(0.68904)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 2.26601 + (((tickAnim - 25) / 7) * (2.33144-(2.26601)));
            yy = 2.66234 + (((tickAnim - 25) / 7) * (-9.79419-(2.66234)));
            zz = 0.68904 + (((tickAnim - 25) / 7) * (-0.35662-(0.68904)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 2.33144 + (((tickAnim - 32) / 13) * (2.26398-(2.33144)));
            yy = -9.79419 + (((tickAnim - 32) / 13) * (-2.07126-(-9.79419)));
            zz = -0.35662 + (((tickAnim - 32) / 13) * (0.29457-(-0.35662)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 2.26398 + (((tickAnim - 45) / 5) * (2.26231-(2.26398)));
            yy = -2.07126 + (((tickAnim - 45) / 5) * (1.41666-(-2.07126)));
            zz = 0.29457 + (((tickAnim - 45) / 5) * (0.58516-(0.29457)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 2.26231 + (((tickAnim - 50) / 5) * (2.39389-(2.26231)));
            yy = 1.41666 + (((tickAnim - 50) / 5) * (13.3744-(1.41666)));
            zz = 0.58516 + (((tickAnim - 50) / 5) * (1.60178-(0.58516)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 2.39389 + (((tickAnim - 55) / 5) * (2.32222-(2.39389)));
            yy = 13.3744 + (((tickAnim - 55) / 5) * (9.13965-(13.3744)));
            zz = 1.60178 + (((tickAnim - 55) / 5) * (1.23488-(1.60178)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 2.32222 + (((tickAnim - 60) / 5) * (-1.46583-(2.32222)));
            yy = 9.13965 + (((tickAnim - 60) / 5) * (5.65193-(9.13965)));
            zz = 1.23488 + (((tickAnim - 60) / 5) * (0.93941-(1.23488)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -1.46583 + (((tickAnim - 65) / 10) * (-1.47058-(-1.46583)));
            yy = 5.65193 + (((tickAnim - 65) / 10) * (-1.34693-(5.65193)));
            zz = 0.93941 + (((tickAnim - 65) / 10) * (0.81334-(0.93941)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -1.47058 + (((tickAnim - 75) / 5) * (-1.46936-(-1.47058)));
            yy = -1.34693 + (((tickAnim - 75) / 5) * (-3.09665-(-1.34693)));
            zz = 0.81334 + (((tickAnim - 75) / 5) * (0.78186-(0.81334)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -1.46936 + (((tickAnim - 80) / 5) * (0-(-1.46936)));
            yy = -3.09665 + (((tickAnim - 80) / 5) * (0-(-3.09665)));
            zz = 0.78186 + (((tickAnim - 80) / 5) * (0-(0.78186)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10.5 + (((tickAnim - 8) / 1) * (13.5-(10.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 13.5 + (((tickAnim - 9) / 4) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 13.5 + (((tickAnim - 13) / 5) * (-2.24409-(13.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (1.42247-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.47605-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.24409 + (((tickAnim - 18) / 2) * (-6.49409-(-2.24409)));
            yy = 1.42247 + (((tickAnim - 18) / 2) * (1.42247-(1.42247)));
            zz = 0.47605 + (((tickAnim - 18) / 2) * (0.47605-(0.47605)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -6.49409 + (((tickAnim - 20) / 2) * (-6.49409-(-6.49409)));
            yy = 1.42247 + (((tickAnim - 20) / 2) * (1.42247-(1.42247)));
            zz = 0.47605 + (((tickAnim - 20) / 2) * (0.47605-(0.47605)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -6.49409 + (((tickAnim - 22) / 3) * (-6.49409-(-6.49409)));
            yy = 1.42247 + (((tickAnim - 22) / 3) * (1.42247-(1.42247)));
            zz = 0.47605 + (((tickAnim - 22) / 3) * (0.47605-(0.47605)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -6.49409 + (((tickAnim - 25) / 7) * (-6.50991-(-6.49409)));
            yy = 1.42247 + (((tickAnim - 25) / 7) * (8.42007-(1.42247)));
            zz = 0.47605 + (((tickAnim - 25) / 7) * (0.29201-(0.47605)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -6.50991 + (((tickAnim - 32) / 6) * (-6.51363-(-6.50991)));
            yy = 8.42007 + (((tickAnim - 32) / 6) * (-9.32385-(8.42007)));
            zz = 0.29201 + (((tickAnim - 32) / 6) * (0.75844-(0.29201)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -6.51363 + (((tickAnim - 38) / 7) * (-6.52329-(-6.51363)));
            yy = -9.32385 + (((tickAnim - 38) / 7) * (-11.32315-(-9.32385)));
            zz = 0.75844 + (((tickAnim - 38) / 7) * (0.81231-(0.75844)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -6.52329 + (((tickAnim - 45) / 5) * (-6.53495-(-6.52329)));
            yy = -11.32315 + (((tickAnim - 45) / 5) * (-13.32244-(-11.32315)));
            zz = 0.81231 + (((tickAnim - 45) / 5) * (0.86693-(0.81231)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -6.53495 + (((tickAnim - 50) / 5) * (-6.50991-(-6.53495)));
            yy = -13.32244 + (((tickAnim - 50) / 5) * (8.42007-(-13.32244)));
            zz = 0.86693 + (((tickAnim - 50) / 5) * (0.29201-(0.86693)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -6.50991 + (((tickAnim - 55) / 5) * (-6.5494-(-6.50991)));
            yy = 8.42007 + (((tickAnim - 55) / 5) * (15.41758-(8.42007)));
            zz = 0.29201 + (((tickAnim - 55) / 5) * (0.10115-(0.29201)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -6.5494 + (((tickAnim - 60) / 5) * (-6.5238-(-6.5494)));
            yy = 15.41758 + (((tickAnim - 60) / 5) * (11.41902-(15.41758)));
            zz = 0.10115 + (((tickAnim - 60) / 5) * (0.2114-(0.10115)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -6.5238 + (((tickAnim - 65) / 10) * (-6.49974-(-6.5238)));
            yy = 11.41902 + (((tickAnim - 65) / 10) * (5.17119-(11.41902)));
            zz = 0.2114 + (((tickAnim - 65) / 10) * (0.37795-(0.2114)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -6.49974 + (((tickAnim - 75) / 5) * (-6.49364-(-6.49974)));
            yy = 5.17119 + (((tickAnim - 75) / 5) * (0.17289-(5.17119)));
            zz = 0.37795 + (((tickAnim - 75) / 5) * (0.50864-(0.37795)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -6.49364 + (((tickAnim - 80) / 5) * (0-(-6.49364)));
            yy = 0.17289 + (((tickAnim - 80) / 5) * (0-(0.17289)));
            zz = 0.50864 + (((tickAnim - 80) / 5) * (0-(0.50864)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5.75 + (((tickAnim - 9) / 4) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -5.75 + (((tickAnim - 13) / 3) * (7.99975-(-5.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.4992-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.02835-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 7.99975 + (((tickAnim - 16) / 2) * (4.74951-(7.99975)));
            yy = 0.4992 + (((tickAnim - 16) / 2) * (0.99839-(0.4992)));
            zz = -0.02835 + (((tickAnim - 16) / 2) * (-0.0567-(-0.02835)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 4.74951 + (((tickAnim - 18) / 2) * (-2.00049-(4.74951)));
            yy = 0.99839 + (((tickAnim - 18) / 2) * (0.99839-(0.99839)));
            zz = -0.0567 + (((tickAnim - 18) / 2) * (-0.0567-(-0.0567)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -2.00049 + (((tickAnim - 20) / 2) * (-2.00049-(-2.00049)));
            yy = 0.99839 + (((tickAnim - 20) / 2) * (0.99839-(0.99839)));
            zz = -0.0567 + (((tickAnim - 20) / 2) * (-0.0567-(-0.0567)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -2.00049 + (((tickAnim - 22) / 3) * (-2.00049-(-2.00049)));
            yy = 0.99839 + (((tickAnim - 22) / 3) * (0.99839-(0.99839)));
            zz = -0.0567 + (((tickAnim - 22) / 3) * (-0.0567-(-0.0567)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -2.00049 + (((tickAnim - 25) / 7) * (-1.99287-(-2.00049)));
            yy = 0.99839 + (((tickAnim - 25) / 7) * (9.99805-(0.99839)));
            zz = -0.0567 + (((tickAnim - 25) / 7) * (0.02265-(-0.0567)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -1.99287 + (((tickAnim - 32) / 13) * (-1.95942-(-1.99287)));
            yy = 9.99805 + (((tickAnim - 32) / 13) * (-22.50067-(9.99805)));
            zz = 0.02265 + (((tickAnim - 32) / 13) * (-0.27229-(0.02265)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -1.95942 + (((tickAnim - 45) / 5) * (-1.93034-(-1.95942)));
            yy = -22.50067 + (((tickAnim - 45) / 5) * (-28.75038-(-22.50067)));
            zz = -0.27229 + (((tickAnim - 45) / 5) * (-0.33941-(-0.27229)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -1.93034 + (((tickAnim - 50) / 3) * (-10.9616-(-1.93034)));
            yy = -28.75038 + (((tickAnim - 50) / 3) * (-19.37578-(-28.75038)));
            zz = -0.33941 + (((tickAnim - 50) / 3) * (-0.24644-(-0.33941)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -10.9616 + (((tickAnim - 53) / 2) * (-1.99286-(-10.9616)));
            yy = -19.37578 + (((tickAnim - 53) / 2) * (-10.00119-(-19.37578)));
            zz = -0.24644 + (((tickAnim - 53) / 2) * (-0.15348-(-0.24644)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -1.99286 + (((tickAnim - 55) / 5) * (-2.00057-(-1.99286)));
            yy = -10.00119 + (((tickAnim - 55) / 5) * (-0.00157-(-10.00119)));
            zz = -0.15348 + (((tickAnim - 55) / 5) * (-0.06542-(-0.15348)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -2.00057 + (((tickAnim - 60) / 3) * (7.0007-(-2.00057)));
            yy = -0.00157 + (((tickAnim - 60) / 3) * (3.33164-(-0.00157)));
            zz = -0.06542 + (((tickAnim - 60) / 3) * (-0.03629-(-0.06542)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 7.0007 + (((tickAnim - 63) / 12) * (-1.99626-(7.0007)));
            yy = 3.33164 + (((tickAnim - 63) / 12) * (7.49814-(3.33164)));
            zz = -0.03629 + (((tickAnim - 63) / 12) * (0.00033-(-0.03629)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -1.99626 + (((tickAnim - 75) / 5) * (-2.00034-(-1.99626)));
            yy = 7.49814 + (((tickAnim - 75) / 5) * (1.74836-(7.49814)));
            zz = 0.00033 + (((tickAnim - 75) / 5) * (-0.05016-(0.00033)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -2.00034 + (((tickAnim - 80) / 5) * (0-(-2.00034)));
            yy = 1.74836 + (((tickAnim - 80) / 5) * (0-(1.74836)));
            zz = -0.05016 + (((tickAnim - 80) / 5) * (0-(-0.05016)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -14.5 + (((tickAnim - 9) / 4) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -14.5 + (((tickAnim - 13) / 3) * (11.24579-(-14.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.8248-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.29216-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 11.24579 + (((tickAnim - 16) / 2) * (15.99159-(11.24579)));
            yy = 0.8248 + (((tickAnim - 16) / 2) * (1.64959-(0.8248)));
            zz = -0.29216 + (((tickAnim - 16) / 2) * (-0.58432-(-0.29216)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15.99159 + (((tickAnim - 18) / 2) * (-1.25841-(15.99159)));
            yy = 1.64959 + (((tickAnim - 18) / 2) * (1.64959-(1.64959)));
            zz = -0.58432 + (((tickAnim - 18) / 2) * (-0.58432-(-0.58432)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -1.25841 + (((tickAnim - 20) / 2) * (-1.25841-(-1.25841)));
            yy = 1.64959 + (((tickAnim - 20) / 2) * (1.64959-(1.64959)));
            zz = -0.58432 + (((tickAnim - 20) / 2) * (-0.58432-(-0.58432)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -1.25841 + (((tickAnim - 22) / 3) * (-1.25841-(-1.25841)));
            yy = 1.64959 + (((tickAnim - 22) / 3) * (1.64959-(1.64959)));
            zz = -0.58432 + (((tickAnim - 22) / 3) * (-0.58432-(-0.58432)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -1.25841 + (((tickAnim - 25) / 7) * (-1.93389-(-1.25841)));
            yy = 1.64959 + (((tickAnim - 25) / 7) * (25.49569-(1.64959)));
            zz = -0.58432 + (((tickAnim - 25) / 7) * (-3.40001-(-0.58432)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -1.93389 + (((tickAnim - 32) / 13) * (-2.72525-(-1.93389)));
            yy = 25.49569 + (((tickAnim - 32) / 13) * (-35.84221-(25.49569)));
            zz = -3.40001 + (((tickAnim - 32) / 13) * (4.13819-(-3.40001)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -2.72525 + (((tickAnim - 45) / 5) * (-4.14653-(-2.72525)));
            yy = -35.84221 + (((tickAnim - 45) / 5) * (-46.72474-(-35.84221)));
            zz = 4.13819 + (((tickAnim - 45) / 5) * (6.2825-(4.13819)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -4.14653 + (((tickAnim - 50) / 3) * (-19.00449-(-4.14653)));
            yy = -46.72474 + (((tickAnim - 50) / 3) * (-39.53833-(-46.72474)));
            zz = 6.2825 + (((tickAnim - 50) / 3) * (5.12067-(6.2825)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -19.00449 + (((tickAnim - 53) / 7) * (-1.57835-(-19.00449)));
            yy = -39.53833 + (((tickAnim - 53) / 7) * (-17.9791-(-39.53833)));
            zz = 5.12067 + (((tickAnim - 53) / 7) * (1.63521-(5.12067)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -1.57835 + (((tickAnim - 60) / 3) * (11.36985-(-1.57835)));
            yy = -17.9791 + (((tickAnim - 60) / 3) * (-2.57392-(-17.9791)));
            zz = 1.63521 + (((tickAnim - 60) / 3) * (-0.09971-(1.63521)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 11.36985 + (((tickAnim - 63) / 12) * (-15.60465-(11.36985)));
            yy = -2.57392 + (((tickAnim - 63) / 12) * (10.09835-(-2.57392)));
            zz = -0.09971 + (((tickAnim - 63) / 12) * (-1.52211-(-0.09971)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -15.60465 + (((tickAnim - 75) / 5) * (-1.35465-(-15.60465)));
            yy = 10.09835 + (((tickAnim - 75) / 5) * (10.09835-(10.09835)));
            zz = -1.52211 + (((tickAnim - 75) / 5) * (-1.52211-(-1.52211)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -1.35465 + (((tickAnim - 80) / 3) * (-0.66256-(-1.35465)));
            yy = 10.09835 + (((tickAnim - 80) / 3) * (-2.91181-(10.09835)));
            zz = -1.52211 + (((tickAnim - 80) / 3) * (0.02883-(-1.52211)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = -0.66256 + (((tickAnim - 83) / 2) * (0-(-0.66256)));
            yy = -2.91181 + (((tickAnim - 83) / 2) * (0-(-2.91181)));
            zz = 0.02883 + (((tickAnim - 83) / 2) * (0-(0.02883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -8.75 + (((tickAnim - 9) / 4) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.75 + (((tickAnim - 13) / 5) * (-8.75074-(-8.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.74127-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.1141-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -8.75074 + (((tickAnim - 18) / 7) * (-8.75074-(-8.75074)));
            yy = 0.74127 + (((tickAnim - 18) / 7) * (0.74127-(0.74127)));
            zz = -0.1141 + (((tickAnim - 18) / 7) * (-0.1141-(-0.1141)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -8.75074 + (((tickAnim - 25) / 7) * (-8.76788-(-8.75074)));
            yy = 0.74127 + (((tickAnim - 25) / 7) * (-0.96963-(0.74127)));
            zz = -0.1141 + (((tickAnim - 25) / 7) * (-1.36806-(-0.1141)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -8.76788 + (((tickAnim - 32) / 18) * (-7.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-8.76788)));
            yy = -0.96963 + (((tickAnim - 32) / 18) * (-0.96963-(-0.96963)));
            zz = -1.36806 + (((tickAnim - 32) / 18) * (-1.36806-(-1.36806)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -7.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 50) / 5) * (3.23212-(-7.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -0.96963 + (((tickAnim - 50) / 5) * (-0.96963-(-0.96963)));
            zz = -1.36806 + (((tickAnim - 50) / 5) * (-1.36806-(-1.36806)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 3.23212 + (((tickAnim - 55) / 5) * (3.23212-(3.23212)));
            yy = -0.96963 + (((tickAnim - 55) / 5) * (-0.96963-(-0.96963)));
            zz = -1.36806 + (((tickAnim - 55) / 5) * (-1.36806-(-1.36806)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 3.23212 + (((tickAnim - 60) / 5) * (-11.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(3.23212)));
            yy = -0.96963 + (((tickAnim - 60) / 5) * (-0.96963-(-0.96963)));
            zz = -1.36806 + (((tickAnim - 60) / 5) * (-1.36806-(-1.36806)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -11.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 65) / 10) * (-11.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.5))*0.5-(-11.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = -0.96963 + (((tickAnim - 65) / 10) * (-0.96963-(-0.96963)));
            zz = -1.36806 + (((tickAnim - 65) / 10) * (-1.36806-(-1.36806)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -11.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.5))*0.5 + (((tickAnim - 75) / 5) * (-6.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-11.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.5))*0.5)));
            yy = -0.96963 + (((tickAnim - 75) / 5) * (-0.96963-(-0.96963)));
            zz = -1.36806 + (((tickAnim - 75) / 5) * (-1.36806-(-1.36806)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -6.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 80) / 5) * (0-(-6.5679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = -0.96963 + (((tickAnim - 80) / 5) * (0-(-0.96963)));
            zz = -1.36806 + (((tickAnim - 80) / 5) * (0-(-1.36806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -15.75 + (((tickAnim - 9) / 4) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -15.75 + (((tickAnim - 13) / 5) * (-15.7135-(-15.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (1.86606-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (1.06898-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -15.7135 + (((tickAnim - 18) / 7) * (-15.7135-(-15.7135)));
            yy = 1.86606 + (((tickAnim - 18) / 7) * (1.86606-(1.86606)));
            zz = 1.06898 + (((tickAnim - 18) / 7) * (1.06898-(1.06898)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -15.7135 + (((tickAnim - 25) / 7) * (-15.76715-(-15.7135)));
            yy = 1.86606 + (((tickAnim - 25) / 7) * (-1.54255-(1.86606)));
            zz = 1.06898 + (((tickAnim - 25) / 7) * (-0.34653-(1.06898)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -15.76715 + (((tickAnim - 32) / 13) * (-15.76715-(-15.76715)));
            yy = -1.54255 + (((tickAnim - 32) / 13) * (-1.54255-(-1.54255)));
            zz = -0.34653 + (((tickAnim - 32) / 13) * (-0.34653-(-0.34653)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -15.76715 + (((tickAnim - 45) / 5) * (-15.76715-(-15.76715)));
            yy = -1.54255 + (((tickAnim - 45) / 5) * (-1.54255-(-1.54255)));
            zz = -0.34653 + (((tickAnim - 45) / 5) * (-0.34653-(-0.34653)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -15.76715 + (((tickAnim - 50) / 5) * (-2.76715-(-15.76715)));
            yy = -1.54255 + (((tickAnim - 50) / 5) * (-1.54255-(-1.54255)));
            zz = -0.34653 + (((tickAnim - 50) / 5) * (-0.34653-(-0.34653)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -2.76715 + (((tickAnim - 55) / 5) * (-2.76715-(-2.76715)));
            yy = -1.54255 + (((tickAnim - 55) / 5) * (-1.54255-(-1.54255)));
            zz = -0.34653 + (((tickAnim - 55) / 5) * (-0.34653-(-0.34653)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -2.76715 + (((tickAnim - 60) / 5) * (-2.76715-(-2.76715)));
            yy = -1.54255 + (((tickAnim - 60) / 5) * (-1.54255-(-1.54255)));
            zz = -0.34653 + (((tickAnim - 60) / 5) * (-0.34653-(-0.34653)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -2.76715 + (((tickAnim - 65) / 10) * (-2.76715-(-2.76715)));
            yy = -1.54255 + (((tickAnim - 65) / 10) * (-1.54255-(-1.54255)));
            zz = -0.34653 + (((tickAnim - 65) / 10) * (-0.34653-(-0.34653)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -2.76715 + (((tickAnim - 75) / 5) * (-2.76715-(-2.76715)));
            yy = -1.54255 + (((tickAnim - 75) / 5) * (-1.54255-(-1.54255)));
            zz = -0.34653 + (((tickAnim - 75) / 5) * (-0.34653-(-0.34653)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -2.76715 + (((tickAnim - 80) / 5) * (0-(-2.76715)));
            yy = -1.54255 + (((tickAnim - 80) / 5) * (0-(-1.54255)));
            zz = -0.34653 + (((tickAnim - 80) / 5) * (0-(-0.34653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 9) / 4) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 13) / 5) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 18) / 7) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            yy = -0.325 + (((tickAnim - 25) / 35) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 60) / 5) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (36-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 36 + (((tickAnim - 9) / 4) * (36-(36)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 36 + (((tickAnim - 13) / 5) * (36-(36)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 36 + (((tickAnim - 18) / 7) * (36-(36)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 36 + (((tickAnim - 25) / 20) * (36-(36)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 36 + (((tickAnim - 45) / 5) * (36-(36)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 36 + (((tickAnim - 50) / 5) * (0-(36)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (12-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 12 + (((tickAnim - 65) / 10) * (12-(12)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 12 + (((tickAnim - 75) / 5) * (12-(12)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 12 + (((tickAnim - 80) / 5) * (0-(12)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 32.5 + (((tickAnim - 9) / 4) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 32.5 + (((tickAnim - 13) / 5) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 32.5 + (((tickAnim - 18) / 7) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 32.5 + (((tickAnim - 25) / 20) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 32.5 + (((tickAnim - 45) / 5) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            yy = 32.5 + (((tickAnim - 50) / 25) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 32.5 + (((tickAnim - 75) / 5) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 32.5 + (((tickAnim - 80) / 5) * (0-(32.5)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 37.75 + (((tickAnim - 9) / 4) * (37.75-(37.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 37.75 + (((tickAnim - 13) / 5) * (37.75-(37.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 37.75 + (((tickAnim - 18) / 7) * (37.75-(37.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 37.75 + (((tickAnim - 25) / 20) * (37.75-(37.75)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 37.75 + (((tickAnim - 45) / 5) * (37.75-(37.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 37.75 + (((tickAnim - 50) / 5) * (0-(37.75)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (13.5-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 13.5 + (((tickAnim - 65) / 10) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 13.5 + (((tickAnim - 75) / 5) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 13.5 + (((tickAnim - 80) / 5) * (0-(13.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-1.6082-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-19.34966-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (3.16828-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -1.6082 + (((tickAnim - 9) / 4) * (-1.6082-(-1.6082)));
            yy = -19.34966 + (((tickAnim - 9) / 4) * (-19.34966-(-19.34966)));
            zz = 3.16828 + (((tickAnim - 9) / 4) * (3.16828-(3.16828)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -1.6082 + (((tickAnim - 13) / 5) * (-1.6082-(-1.6082)));
            yy = -19.34966 + (((tickAnim - 13) / 5) * (-19.34966-(-19.34966)));
            zz = 3.16828 + (((tickAnim - 13) / 5) * (3.16828-(3.16828)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -1.6082 + (((tickAnim - 18) / 7) * (-1.6082-(-1.6082)));
            yy = -19.34966 + (((tickAnim - 18) / 7) * (-19.34966-(-19.34966)));
            zz = 3.16828 + (((tickAnim - 18) / 7) * (3.16828-(3.16828)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -1.6082 + (((tickAnim - 25) / 20) * (-1.6082-(-1.6082)));
            yy = -19.34966 + (((tickAnim - 25) / 20) * (-19.34966-(-19.34966)));
            zz = 3.16828 + (((tickAnim - 25) / 20) * (3.16828-(3.16828)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -1.6082 + (((tickAnim - 45) / 5) * (-1.6082-(-1.6082)));
            yy = -19.34966 + (((tickAnim - 45) / 5) * (-19.34966-(-19.34966)));
            zz = 3.16828 + (((tickAnim - 45) / 5) * (3.16828-(3.16828)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -1.6082 + (((tickAnim - 50) / 25) * (-1.6082-(-1.6082)));
            yy = -19.34966 + (((tickAnim - 50) / 25) * (-19.34966-(-19.34966)));
            zz = 3.16828 + (((tickAnim - 50) / 25) * (3.16828-(3.16828)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -1.6082 + (((tickAnim - 75) / 5) * (-1.6082-(-1.6082)));
            yy = -19.34966 + (((tickAnim - 75) / 5) * (-19.34966-(-19.34966)));
            zz = 3.16828 + (((tickAnim - 75) / 5) * (3.16828-(3.16828)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -1.6082 + (((tickAnim - 80) / 5) * (0-(-1.6082)));
            yy = -19.34966 + (((tickAnim - 80) / 5) * (0-(-19.34966)));
            zz = 3.16828 + (((tickAnim - 80) / 5) * (0-(3.16828)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.98178-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (13.51346-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (14.5396-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 7.98178 + (((tickAnim - 8) / 1) * (7.98178-(7.98178)));
            yy = 13.51346 + (((tickAnim - 8) / 1) * (13.51346-(13.51346)));
            zz = 14.5396 + (((tickAnim - 8) / 1) * (14.5396-(14.5396)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 7.98178 + (((tickAnim - 9) / 4) * (7.98178-(7.98178)));
            yy = 13.51346 + (((tickAnim - 9) / 4) * (13.51346-(13.51346)));
            zz = 14.5396 + (((tickAnim - 9) / 4) * (14.5396-(14.5396)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.98178 + (((tickAnim - 13) / 5) * (7.98178-(7.98178)));
            yy = 13.51346 + (((tickAnim - 13) / 5) * (13.51346-(13.51346)));
            zz = 14.5396 + (((tickAnim - 13) / 5) * (14.5396-(14.5396)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 7.98178 + (((tickAnim - 18) / 7) * (7.98178-(7.98178)));
            yy = 13.51346 + (((tickAnim - 18) / 7) * (13.51346-(13.51346)));
            zz = 14.5396 + (((tickAnim - 18) / 7) * (14.5396-(14.5396)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 7.98178 + (((tickAnim - 25) / 7) * (6.08518-(7.98178)));
            yy = 13.51346 + (((tickAnim - 25) / 7) * (5.495-(13.51346)));
            zz = 14.5396 + (((tickAnim - 25) / 7) * (-0.773-(14.5396)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 6.08518 + (((tickAnim - 32) / 13) * (6.08518-(6.08518)));
            yy = 5.495 + (((tickAnim - 32) / 13) * (5.495-(5.495)));
            zz = -0.773 + (((tickAnim - 32) / 13) * (-0.773-(-0.773)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 6.08518 + (((tickAnim - 45) / 5) * (6.08518-(6.08518)));
            yy = 5.495 + (((tickAnim - 45) / 5) * (5.495-(5.495)));
            zz = -0.773 + (((tickAnim - 45) / 5) * (-0.773-(-0.773)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 6.08518 + (((tickAnim - 50) / 5) * (-6.91482-(6.08518)));
            yy = 5.495 + (((tickAnim - 50) / 5) * (5.495-(5.495)));
            zz = -0.773 + (((tickAnim - 50) / 5) * (-0.773-(-0.773)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -6.91482 + (((tickAnim - 55) / 5) * (-6.91482-(-6.91482)));
            yy = 5.495 + (((tickAnim - 55) / 5) * (5.495-(5.495)));
            zz = -0.773 + (((tickAnim - 55) / 5) * (-0.773-(-0.773)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -6.91482 + (((tickAnim - 60) / 5) * (0-(-6.91482)));
            yy = 5.495 + (((tickAnim - 60) / 5) * (0-(5.495)));
            zz = -0.773 + (((tickAnim - 60) / 5) * (0-(-0.773)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.425-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.425 + (((tickAnim - 8) / 1) * (0.425-(0.425)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.425 + (((tickAnim - 9) / 4) * (0.425-(0.425)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0.425 + (((tickAnim - 13) / 5) * (0.425-(0.425)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.425 + (((tickAnim - 18) / 7) * (0.425-(0.425)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0.425 + (((tickAnim - 25) / 7) * (0.2-(0.425)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0.2 + (((tickAnim - 32) / 13) * (0.2-(0.2)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.2 + (((tickAnim - 45) / 5) * (0.2-(0.2)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0.2 + (((tickAnim - 50) / 5) * (0-(0.2)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -14.5 + (((tickAnim - 9) / 4) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -14.5 + (((tickAnim - 13) / 5) * (-14.29536-(-14.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.22252-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (10.52039-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -14.29536 + (((tickAnim - 18) / 7) * (-14.29536-(-14.29536)));
            yy = 2.22252 + (((tickAnim - 18) / 7) * (2.22252-(2.22252)));
            zz = 10.52039 + (((tickAnim - 18) / 7) * (10.52039-(10.52039)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -14.29536 + (((tickAnim - 25) / 7) * (-14.96382-(-14.29536)));
            yy = 2.22252 + (((tickAnim - 25) / 7) * (-1.68323-(2.22252)));
            zz = 10.52039 + (((tickAnim - 25) / 7) * (2.667-(10.52039)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -14.96382 + (((tickAnim - 32) / 13) * (-14.96382-(-14.96382)));
            yy = -1.68323 + (((tickAnim - 32) / 13) * (-1.68323-(-1.68323)));
            zz = 2.667 + (((tickAnim - 32) / 13) * (2.667-(2.667)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -14.96382 + (((tickAnim - 45) / 5) * (-14.96382-(-14.96382)));
            yy = -1.68323 + (((tickAnim - 45) / 5) * (-1.68323-(-1.68323)));
            zz = 2.667 + (((tickAnim - 45) / 5) * (2.667-(2.667)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -14.96382 + (((tickAnim - 50) / 5) * (-23.25-(-14.96382)));
            yy = -1.68323 + (((tickAnim - 50) / 5) * (0-(-1.68323)));
            zz = 2.667 + (((tickAnim - 50) / 5) * (0-(2.667)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -23.25 + (((tickAnim - 55) / 5) * (-23.42323-(-23.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (-0.10096-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (-7.98493-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -23.42323 + (((tickAnim - 60) / 5) * (-14.25-(-23.42323)));
            yy = -0.10096 + (((tickAnim - 60) / 5) * (0-(-0.10096)));
            zz = -7.98493 + (((tickAnim - 60) / 5) * (0-(-7.98493)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -14.25 + (((tickAnim - 65) / 10) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -14.25 + (((tickAnim - 75) / 5) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -14.25 + (((tickAnim - 80) / 5) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0.125 + (((tickAnim - 16) / 2) * (0-(0.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0.15-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0.15 + (((tickAnim - 28) / 4) * (0-(0.15)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0.375-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0.375 + (((tickAnim - 63) / 2) * (0-(0.375)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (53.37826-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.5135-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (10.97522-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 53.37826 + (((tickAnim - 8) / 1) * (53.37826-(53.37826)));
            yy = 1.5135 + (((tickAnim - 8) / 1) * (1.5135-(1.5135)));
            zz = 10.97522 + (((tickAnim - 8) / 1) * (10.97522-(10.97522)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 53.37826 + (((tickAnim - 9) / 4) * (53.37826-(53.37826)));
            yy = 1.5135 + (((tickAnim - 9) / 4) * (1.5135-(1.5135)));
            zz = 10.97522 + (((tickAnim - 9) / 4) * (10.97522-(10.97522)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 53.37826 + (((tickAnim - 13) / 5) * (53.63357-(53.37826)));
            yy = 1.5135 + (((tickAnim - 13) / 5) * (1.33308-(1.5135)));
            zz = 10.97522 + (((tickAnim - 13) / 5) * (21.2268-(10.97522)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 53.63357 + (((tickAnim - 18) / 7) * (53.63357-(53.63357)));
            yy = 1.33308 + (((tickAnim - 18) / 7) * (1.33308-(1.33308)));
            zz = 21.2268 + (((tickAnim - 18) / 7) * (21.2268-(21.2268)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 53.63357 + (((tickAnim - 25) / 7) * (51.72915-(53.63357)));
            yy = 1.33308 + (((tickAnim - 25) / 7) * (1.57092-(1.33308)));
            zz = 21.2268 + (((tickAnim - 25) / 7) * (-45.29695-(21.2268)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 51.72915 + (((tickAnim - 32) / 13) * (51.72915-(51.72915)));
            yy = 1.57092 + (((tickAnim - 32) / 13) * (1.57092-(1.57092)));
            zz = -45.29695 + (((tickAnim - 32) / 13) * (-45.29695-(-45.29695)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 51.72915 + (((tickAnim - 45) / 5) * (51.72915-(51.72915)));
            yy = 1.57092 + (((tickAnim - 45) / 5) * (1.57092-(1.57092)));
            zz = -45.29695 + (((tickAnim - 45) / 5) * (-45.29695-(-45.29695)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 51.72915 + (((tickAnim - 50) / 5) * (34.49281-(51.72915)));
            yy = 1.57092 + (((tickAnim - 50) / 5) * (-8.50117-(1.57092)));
            zz = -45.29695 + (((tickAnim - 50) / 5) * (-31.34188-(-45.29695)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 34.49281 + (((tickAnim - 55) / 5) * (35.31246-(34.49281)));
            yy = -8.50117 + (((tickAnim - 55) / 5) * (-10.08943-(-8.50117)));
            zz = -31.34188 + (((tickAnim - 55) / 5) * (-36.41267-(-31.34188)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 35.31246 + (((tickAnim - 60) / 3) * (55.06667-(35.31246)));
            yy = -10.08943 + (((tickAnim - 60) / 3) * (-17.91017-(-10.08943)));
            zz = -36.41267 + (((tickAnim - 60) / 3) * (-26.09287-(-36.41267)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 55.06667 + (((tickAnim - 63) / 2) * (47.81012-(55.06667)));
            yy = -17.91017 + (((tickAnim - 63) / 2) * (-17.84631-(-17.91017)));
            zz = -26.09287 + (((tickAnim - 63) / 2) * (-21.58189-(-26.09287)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 47.81012 + (((tickAnim - 65) / 10) * (47.81012-(47.81012)));
            yy = -17.84631 + (((tickAnim - 65) / 10) * (-17.84631-(-17.84631)));
            zz = -21.58189 + (((tickAnim - 65) / 10) * (-21.58189-(-21.58189)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 47.81012 + (((tickAnim - 75) / 5) * (47.81012-(47.81012)));
            yy = -17.84631 + (((tickAnim - 75) / 5) * (-17.84631-(-17.84631)));
            zz = -21.58189 + (((tickAnim - 75) / 5) * (-21.58189-(-21.58189)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 47.81012 + (((tickAnim - 80) / 5) * (0-(47.81012)));
            yy = -17.84631 + (((tickAnim - 80) / 5) * (0-(-17.84631)));
            zz = -21.58189 + (((tickAnim - 80) / 5) * (0-(-21.58189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0.125 + (((tickAnim - 16) / 2) * (0-(0.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0.15-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0.15 + (((tickAnim - 28) / 4) * (0-(0.15)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0.025-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0.025 + (((tickAnim - 63) / 2) * (0-(0.025)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (15.25-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 15.25 + (((tickAnim - 20) / 2) * (0-(15.25)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 22) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 38) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (5.5-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 5.5 + (((tickAnim - 65) / 3) * (12-(5.5)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 12 + (((tickAnim - 68) / 2) * (0-(12)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (5.5-(0)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 5.5 + (((tickAnim - 75) / 5) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 5.5 + (((tickAnim - 80) / 5) * (0-(5.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLagosuchus entity = (EntityPrehistoricFloraLagosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 4.5 + (((tickAnim - 5) / 7) * (-9-(4.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -9 + (((tickAnim - 12) / 4) * (2-(-9)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55-120))*1-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 16) / 4) * (0-(2)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55-120))*1 + (((tickAnim - 16) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55-120))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 5.75 + (((tickAnim - 5) / 7) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 5.75 + (((tickAnim - 12) / 4) * (1-(5.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.65-70))*2-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 16) / 4) * (0-(1)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.65-70))*2 + (((tickAnim - 16) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.65-70))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 5.25 + (((tickAnim - 3) / 4) * (0-(5.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (8.75-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 8.75 + (((tickAnim - 12) / 4) * (13.38-(8.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75-30))*3-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 13.38 + (((tickAnim - 16) / 4) * (0-(13.38)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75-30))*3 + (((tickAnim - 16) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75-30))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 4.25 + (((tickAnim - 3) / 4) * (0-(4.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-12-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -12 + (((tickAnim - 11) / 5) * (-6-(-12)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*5-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -6 + (((tickAnim - 16) / 4) * (0-(-6)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*5 + (((tickAnim - 16) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -12.25 + (((tickAnim - 3) / 7) * (8.75-(-12.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 8.75 + (((tickAnim - 10) / 6) * (-16.62-(8.75)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75+30))*7-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -16.62 + (((tickAnim - 16) / 4) * (0-(-16.62)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75+30))*7 + (((tickAnim - 16) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75+30))*7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.25 + (((tickAnim - 3) / 4) * (32.25-(9.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 32.25 + (((tickAnim - 7) / 5) * (0-(32.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.1-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.1 + (((tickAnim - 16) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLagosuchus entity = (EntityPrehistoricFloraLagosuchus) entitylivingbaseIn;

        int animCycle = 8;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 2.75 + (((tickAnim - 2) / 4) * (0-(2.75)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.075-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0.075 + (((tickAnim - 2) / 4) * (-0.125-(0.075)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -0.125 + (((tickAnim - 6) / 2) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 4.5 + (((tickAnim - 2) / 4) * (-6.5-(4.5)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.5 + (((tickAnim - 6) / 2) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.05-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (-0.075-(0)));
            zz = 0.05 + (((tickAnim - 2) / 4) * (-0.225-(0.05)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.075 + (((tickAnim - 6) / 2) * (0-(-0.075)));
            zz = -0.225 + (((tickAnim - 6) / 2) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -3 + (((tickAnim - 2) / 3) * (22.25-(-3)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.25 + (((tickAnim - 5) / 3) * (0-(22.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0.15 + (((tickAnim - 2) / 6) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -7.25 + (((tickAnim - 2) / 3) * (-1.5-(-7.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.5 + (((tickAnim - 5) / 3) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.025-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 2) / 3) * (0-(0.05)));
            zz = 0.025 + (((tickAnim - 2) / 3) * (-0.45-(0.025)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -0.45 + (((tickAnim - 5) / 3) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 8.5 + (((tickAnim - 2) / 3) * (-29-(8.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -29 + (((tickAnim - 5) / 3) * (0-(-29)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.075-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0.075 + (((tickAnim - 2) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 9.5 + (((tickAnim - 2) / 3) * (43.25-(9.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 43.25 + (((tickAnim - 5) / 2) * (0-(43.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLagosuchus entity = (EntityPrehistoricFloraLagosuchus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -17.5 + (((tickAnim - 10) / 30) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 40) / 10) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.175-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.85-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = -5.175 + (((tickAnim - 10) / 30) * (-5.175-(-5.175)));
            zz = 0.85 + (((tickAnim - 10) / 30) * (0.85-(0.85)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -5.175 + (((tickAnim - 40) / 10) * (0-(-5.175)));
            zz = 0.85 + (((tickAnim - 40) / 10) * (0-(0.85)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-35.39037-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-15.0582-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12.1338-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -35.39037 + (((tickAnim - 10) / 30) * (-35.39037-(-35.39037)));
            yy = -15.0582 + (((tickAnim - 10) / 30) * (-15.0582-(-15.0582)));
            zz = -12.1338 + (((tickAnim - 10) / 30) * (-12.1338-(-12.1338)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -35.39037 + (((tickAnim - 40) / 10) * (0-(-35.39037)));
            yy = -15.0582 + (((tickAnim - 40) / 10) * (0-(-15.0582)));
            zz = -12.1338 + (((tickAnim - 40) / 10) * (0-(-12.1338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs, leftLegs.rotateAngleX + (float) Math.toRadians(xx), leftLegs.rotateAngleY + (float) Math.toRadians(yy), leftLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (42.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 42.75 + (((tickAnim - 10) / 30) * (42.75-(42.75)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 42.75 + (((tickAnim - 40) / 10) * (0-(42.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs2, leftLegs2.rotateAngleX + (float) Math.toRadians(xx), leftLegs2.rotateAngleY + (float) Math.toRadians(yy), leftLegs2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = -0.2 + (((tickAnim - 10) / 30) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -0.2 + (((tickAnim - 40) / 10) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs2.rotationPointX = this.leftLegs2.rotationPointX + (float)(xx);
        this.leftLegs2.rotationPointY = this.leftLegs2.rotationPointY - (float)(yy);
        this.leftLegs2.rotationPointZ = this.leftLegs2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-65.18111-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.1665-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -65.18111 + (((tickAnim - 10) / 30) * (-65.18111-(-65.18111)));
            yy = 1.1 + (((tickAnim - 10) / 30) * (1.1-(1.1)));
            zz = 7.1665 + (((tickAnim - 10) / 30) * (7.1665-(7.1665)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -65.18111 + (((tickAnim - 40) / 10) * (0-(-65.18111)));
            yy = 1.1 + (((tickAnim - 40) / 10) * (0-(1.1)));
            zz = 7.1665 + (((tickAnim - 40) / 10) * (0-(7.1665)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs3, leftLegs3.rotateAngleX + (float) Math.toRadians(xx), leftLegs3.rotateAngleY + (float) Math.toRadians(yy), leftLegs3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0.675 + (((tickAnim - 10) / 30) * (0.675-(0.675)));
            zz = -0.25 + (((tickAnim - 10) / 30) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.675 + (((tickAnim - 40) / 10) * (0-(0.675)));
            zz = -0.25 + (((tickAnim - 40) / 10) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs3.rotationPointX = this.leftLegs3.rotationPointX + (float)(xx);
        this.leftLegs3.rotationPointY = this.leftLegs3.rotationPointY - (float)(yy);
        this.leftLegs3.rotationPointZ = this.leftLegs3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (74.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 74.5 + (((tickAnim - 10) / 30) * (74.5-(74.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 74.5 + (((tickAnim - 40) / 10) * (0-(74.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs4, leftLegs4.rotateAngleX + (float) Math.toRadians(xx), leftLegs4.rotateAngleY + (float) Math.toRadians(yy), leftLegs4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.6-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 5) / 5) * (0-(0.075)));
            zz = -0.6 + (((tickAnim - 5) / 5) * (-0.95-(-0.6)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = -0.95 + (((tickAnim - 10) / 30) * (-0.95-(-0.95)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -0.95 + (((tickAnim - 40) / 5) * (-0.57-(-0.95)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = -0.57 + (((tickAnim - 45) / 5) * (0-(-0.57)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs4.rotationPointX = this.leftLegs4.rotationPointX + (float)(xx);
        this.leftLegs4.rotationPointY = this.leftLegs4.rotationPointY - (float)(yy);
        this.leftLegs4.rotationPointZ = this.leftLegs4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-35.39037-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (15.05818-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (12.1338-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -35.39037 + (((tickAnim - 10) / 30) * (-35.39037-(-35.39037)));
            yy = 15.05818 + (((tickAnim - 10) / 30) * (15.05818-(15.05818)));
            zz = 12.1338 + (((tickAnim - 10) / 30) * (12.1338-(12.1338)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -35.39037 + (((tickAnim - 40) / 10) * (0-(-35.39037)));
            yy = 15.05818 + (((tickAnim - 40) / 10) * (0-(15.05818)));
            zz = 12.1338 + (((tickAnim - 40) / 10) * (0-(12.1338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs, rightLegs.rotateAngleX + (float) Math.toRadians(xx), rightLegs.rotateAngleY + (float) Math.toRadians(yy), rightLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (42.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 42.75 + (((tickAnim - 10) / 30) * (42.75-(42.75)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 42.75 + (((tickAnim - 40) / 10) * (0-(42.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs2, rightLegs2.rotateAngleX + (float) Math.toRadians(xx), rightLegs2.rotateAngleY + (float) Math.toRadians(yy), rightLegs2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = -0.2 + (((tickAnim - 10) / 30) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -0.2 + (((tickAnim - 40) / 10) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs2.rotationPointX = this.rightLegs2.rotationPointX + (float)(xx);
        this.rightLegs2.rotationPointY = this.rightLegs2.rotationPointY - (float)(yy);
        this.rightLegs2.rotationPointZ = this.rightLegs2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-65.18111-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.10002-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-7.1665-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -65.18111 + (((tickAnim - 10) / 30) * (-65.18111-(-65.18111)));
            yy = -1.10002 + (((tickAnim - 10) / 30) * (-1.10002-(-1.10002)));
            zz = -7.1665 + (((tickAnim - 10) / 30) * (-7.1665-(-7.1665)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -65.18111 + (((tickAnim - 40) / 10) * (0-(-65.18111)));
            yy = -1.10002 + (((tickAnim - 40) / 10) * (0-(-1.10002)));
            zz = -7.1665 + (((tickAnim - 40) / 10) * (0-(-7.1665)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs3, rightLegs3.rotateAngleX + (float) Math.toRadians(xx), rightLegs3.rotateAngleY + (float) Math.toRadians(yy), rightLegs3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0.675 + (((tickAnim - 10) / 30) * (0.675-(0.675)));
            zz = -0.25 + (((tickAnim - 10) / 30) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.675 + (((tickAnim - 40) / 10) * (0-(0.675)));
            zz = -0.25 + (((tickAnim - 40) / 10) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs3.rotationPointX = this.rightLegs3.rotationPointX + (float)(xx);
        this.rightLegs3.rotationPointY = this.rightLegs3.rotationPointY - (float)(yy);
        this.rightLegs3.rotationPointZ = this.rightLegs3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (74.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 74.5 + (((tickAnim - 10) / 30) * (74.5-(74.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 74.5 + (((tickAnim - 40) / 10) * (0-(74.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs4, rightLegs4.rotateAngleX + (float) Math.toRadians(xx), rightLegs4.rotateAngleY + (float) Math.toRadians(yy), rightLegs4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.7-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 5) / 5) * (0-(0.15)));
            zz = -0.7 + (((tickAnim - 5) / 5) * (-0.95-(-0.7)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = -0.95 + (((tickAnim - 10) / 30) * (-0.95-(-0.95)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -0.95 + (((tickAnim - 40) / 5) * (-0.545-(-0.95)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = -0.545 + (((tickAnim - 45) / 5) * (0-(-0.545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs4.rotationPointX = this.rightLegs4.rotationPointX + (float)(xx);
        this.rightLegs4.rotationPointY = this.rightLegs4.rotationPointY - (float)(yy);
        this.rightLegs4.rotationPointZ = this.rightLegs4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.10155-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-9.67662-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.19965-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -7.10155 + (((tickAnim - 10) / 30) * (-7.10155-(-7.10155)));
            yy = -9.67662 + (((tickAnim - 10) / 30) * (-9.67662-(-9.67662)));
            zz = 1.19965 + (((tickAnim - 10) / 30) * (1.19965-(1.19965)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7.10155 + (((tickAnim - 40) / 10) * (0-(-7.10155)));
            yy = -9.67662 + (((tickAnim - 40) / 10) * (0-(-9.67662)));
            zz = 1.19965 + (((tickAnim - 40) / 10) * (0-(1.19965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.43269-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-15.69792-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-8.82343-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 2.43269 + (((tickAnim - 10) / 30) * (2.43269-(2.43269)));
            yy = -15.69792 + (((tickAnim - 10) / 30) * (-15.69792-(-15.69792)));
            zz = -8.82343 + (((tickAnim - 10) / 30) * (-8.82343-(-8.82343)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.43269 + (((tickAnim - 40) / 10) * (0-(2.43269)));
            yy = -15.69792 + (((tickAnim - 40) / 10) * (0-(-15.69792)));
            zz = -8.82343 + (((tickAnim - 40) / 10) * (0-(-8.82343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.98495-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.72028-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.39405-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 12.98495 + (((tickAnim - 10) / 30) * (12.98495-(12.98495)));
            yy = 0.72028 + (((tickAnim - 10) / 30) * (0.72028-(0.72028)));
            zz = -2.39405 + (((tickAnim - 10) / 30) * (-2.39405-(-2.39405)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.98495 + (((tickAnim - 40) / 10) * (0-(12.98495)));
            yy = 0.72028 + (((tickAnim - 40) / 10) * (0-(0.72028)));
            zz = -2.39405 + (((tickAnim - 40) / 10) * (0-(-2.39405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = -25 + (((tickAnim - 10) / 30) * (-25-(-25)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -25 + (((tickAnim - 40) / 10) * (0-(-25)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-33.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = -33.5 + (((tickAnim - 10) / 30) * (-33.5-(-33.5)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -33.5 + (((tickAnim - 40) / 10) * (0-(-33.5)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -17.25 + (((tickAnim - 10) / 30) * (-17.25-(-17.25)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 40) / 10) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.35144-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (6.44814-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (6.5945-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0.35144 + (((tickAnim - 10) / 30) * (0.35144-(0.35144)));
            yy = 6.44814 + (((tickAnim - 10) / 30) * (6.44814-(6.44814)));
            zz = 6.5945 + (((tickAnim - 10) / 30) * (6.5945-(6.5945)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.35144 + (((tickAnim - 40) / 10) * (0-(0.35144)));
            yy = 6.44814 + (((tickAnim - 40) / 10) * (0-(6.44814)));
            zz = 6.5945 + (((tickAnim - 40) / 10) * (0-(6.5945)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.04066-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-36.97896-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (61.06416-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0.04066 + (((tickAnim - 10) / 30) * (0.04066-(0.04066)));
            yy = -36.97896 + (((tickAnim - 10) / 30) * (-36.97896-(-36.97896)));
            zz = 61.06416 + (((tickAnim - 10) / 30) * (61.06416-(61.06416)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.04066 + (((tickAnim - 40) / 10) * (0-(0.04066)));
            yy = -36.97896 + (((tickAnim - 40) / 10) * (0-(-36.97896)));
            zz = 61.06416 + (((tickAnim - 40) / 10) * (0-(61.06416)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -17.25 + (((tickAnim - 10) / 30) * (-17.25-(-17.25)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 40) / 10) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.35144-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.4481-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-6.5945-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0.35144 + (((tickAnim - 10) / 30) * (0.35144-(0.35144)));
            yy = -6.4481 + (((tickAnim - 10) / 30) * (-6.4481-(-6.4481)));
            zz = -6.5945 + (((tickAnim - 10) / 30) * (-6.5945-(-6.5945)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.35144 + (((tickAnim - 40) / 10) * (0-(0.35144)));
            yy = -6.4481 + (((tickAnim - 40) / 10) * (0-(-6.4481)));
            zz = -6.5945 + (((tickAnim - 40) / 10) * (0-(-6.5945)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.04066-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (36.979-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-61.0642-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0.04066 + (((tickAnim - 10) / 30) * (0.04066-(0.04066)));
            yy = 36.979 + (((tickAnim - 10) / 30) * (36.979-(36.979)));
            zz = -61.0642 + (((tickAnim - 10) / 30) * (-61.0642-(-61.0642)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.04066 + (((tickAnim - 40) / 10) * (0-(0.04066)));
            yy = 36.979 + (((tickAnim - 40) / 10) * (0-(36.979)));
            zz = -61.0642 + (((tickAnim - 40) / 10) * (0-(-61.0642)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 21 + (((tickAnim - 10) / 14) * (27.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75+50))*5-(21)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 27.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75+50))*5 + (((tickAnim - 24) / 16) * (21-(27.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75+50))*5)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 21 + (((tickAnim - 40) / 10) * (0-(21)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 10) / 14) * (-4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*-15-(0)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*-15 + (((tickAnim - 24) / 16) * (0-(-4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*-15)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 10) / 14) * (10.75-(0)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 10.75 + (((tickAnim - 24) / 16) * (0-(10.75)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLagosuchus entity = (EntityPrehistoricFloraLagosuchus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = -8.25 + (((tickAnim - 10) / 33) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 43) / 7) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.975-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            yy = -2.975 + (((tickAnim - 10) / 33) * (-2.975-(-2.975)));
            zz = 1.2 + (((tickAnim - 10) / 33) * (1.2-(1.2)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = -2.975 + (((tickAnim - 43) / 7) * (0-(-2.975)));
            zz = 1.2 + (((tickAnim - 43) / 7) * (0-(1.2)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-7.97743-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-30.70539-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-6.30655-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = -7.97743 + (((tickAnim - 10) / 33) * (-7.97743-(-7.97743)));
            yy = -30.70539 + (((tickAnim - 10) / 33) * (-30.70539-(-30.70539)));
            zz = -6.30655 + (((tickAnim - 10) / 33) * (-6.30655-(-6.30655)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -7.97743 + (((tickAnim - 43) / 7) * (0-(-7.97743)));
            yy = -30.70539 + (((tickAnim - 43) / 7) * (0-(-30.70539)));
            zz = -6.30655 + (((tickAnim - 43) / 7) * (0-(-6.30655)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs, leftLegs.rotateAngleX + (float) Math.toRadians(xx), leftLegs.rotateAngleY + (float) Math.toRadians(yy), leftLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (43.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 43.25 + (((tickAnim - 10) / 33) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 43.25 + (((tickAnim - 43) / 7) * (0-(43.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs2, leftLegs2.rotateAngleX + (float) Math.toRadians(xx), leftLegs2.rotateAngleY + (float) Math.toRadians(yy), leftLegs2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-69.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = -69.75 + (((tickAnim - 10) / 33) * (-69.75-(-69.75)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -69.75 + (((tickAnim - 43) / 7) * (0-(-69.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs3, leftLegs3.rotateAngleX + (float) Math.toRadians(xx), leftLegs3.rotateAngleY + (float) Math.toRadians(yy), leftLegs3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 40.75 + (((tickAnim - 10) / 33) * (40.75-(40.75)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 40.75 + (((tickAnim - 43) / 7) * (0-(40.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs4, leftLegs4.rotateAngleX + (float) Math.toRadians(xx), leftLegs4.rotateAngleY + (float) Math.toRadians(yy), leftLegs4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.97743-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (30.7054-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (6.3066-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = -7.97743 + (((tickAnim - 10) / 33) * (-7.97743-(-7.97743)));
            yy = 30.7054 + (((tickAnim - 10) / 33) * (30.7054-(30.7054)));
            zz = 6.3066 + (((tickAnim - 10) / 33) * (6.3066-(6.3066)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -7.97743 + (((tickAnim - 43) / 7) * (0-(-7.97743)));
            yy = 30.7054 + (((tickAnim - 43) / 7) * (0-(30.7054)));
            zz = 6.3066 + (((tickAnim - 43) / 7) * (0-(6.3066)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs, rightLegs.rotateAngleX + (float) Math.toRadians(xx), rightLegs.rotateAngleY + (float) Math.toRadians(yy), rightLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (43.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 43.25 + (((tickAnim - 10) / 33) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 43.25 + (((tickAnim - 43) / 7) * (0-(43.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs2, rightLegs2.rotateAngleX + (float) Math.toRadians(xx), rightLegs2.rotateAngleY + (float) Math.toRadians(yy), rightLegs2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-69.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = -69.75 + (((tickAnim - 10) / 33) * (-69.75-(-69.75)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -69.75 + (((tickAnim - 43) / 7) * (0-(-69.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs3, rightLegs3.rotateAngleX + (float) Math.toRadians(xx), rightLegs3.rotateAngleY + (float) Math.toRadians(yy), rightLegs3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 40.75 + (((tickAnim - 10) / 33) * (40.75-(40.75)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 40.75 + (((tickAnim - 43) / 7) * (0-(40.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs4, rightLegs4.rotateAngleX + (float) Math.toRadians(xx), rightLegs4.rotateAngleY + (float) Math.toRadians(yy), rightLegs4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11 + (((tickAnim - 10) / 3) * (-7.75-(-11)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -7.75 + (((tickAnim - 13) / 5) * (-4.5-(-7.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -4.5 + (((tickAnim - 18) / 6) * (3-(-4.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 24) / 9) * (9.5-(3)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 9.5 + (((tickAnim - 33) / 3) * (5.5-(9.5)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 5.5 + (((tickAnim - 36) / 7) * (0-(5.5)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -6.5 + (((tickAnim - 10) / 3) * (-8.5-(-6.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.5 + (((tickAnim - 13) / 5) * (-9.75-(-8.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -9.75 + (((tickAnim - 18) / 6) * (-2.5-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -2.5 + (((tickAnim - 24) / 9) * (9-(-2.5)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 9 + (((tickAnim - 33) / 3) * (10.25-(9)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 10.25 + (((tickAnim - 36) / 7) * (3.75-(10.25)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 43) / 7) * (0-(3.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.5 + (((tickAnim - 10) / 3) * (2.25-(4.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.25 + (((tickAnim - 13) / 5) * (-3-(2.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -3 + (((tickAnim - 18) / 6) * (-9.25-(-3)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -9.25 + (((tickAnim - 24) / 9) * (-13.25-(-9.25)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -13.25 + (((tickAnim - 33) / 10) * (7.54808-(-13.25)));
            yy = 0 + (((tickAnim - 33) / 10) * (-1.72837-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (2.29164-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 7.54808 + (((tickAnim - 43) / 7) * (0-(7.54808)));
            yy = -1.72837 + (((tickAnim - 43) / 7) * (0-(-1.72837)));
            zz = 2.29164 + (((tickAnim - 43) / 7) * (0-(2.29164)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.75 + (((tickAnim - 10) / 3) * (9.25-(12.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 9.25 + (((tickAnim - 13) / 5) * (6-(9.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 6 + (((tickAnim - 18) / 6) * (-10.75-(6)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -10.75 + (((tickAnim - 24) / 9) * (-22.5-(-10.75)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -22.5 + (((tickAnim - 33) / 10) * (-5.51995-(-22.5)));
            yy = 0 + (((tickAnim - 33) / 10) * (-6.03762-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (5.94335-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -5.51995 + (((tickAnim - 43) / 7) * (0-(-5.51995)));
            yy = -6.03762 + (((tickAnim - 43) / 7) * (0-(-6.03762)));
            zz = 5.94335 + (((tickAnim - 43) / 7) * (0-(5.94335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (11.5-(20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.5 + (((tickAnim - 13) / 5) * (5.25-(11.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 5.25 + (((tickAnim - 18) / 6) * (-4.75-(5.25)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -4.75 + (((tickAnim - 24) / 9) * (-17.75-(-4.75)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -17.75 + (((tickAnim - 33) / 3) * (-8-(-17.75)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -8 + (((tickAnim - 36) / 7) * (10.5-(-8)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 43) / 7) * (0-(10.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = -3.5 + (((tickAnim - 10) / 33) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 43) / 7) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 12.75 + (((tickAnim - 10) / 33) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 43) / 7) * (0-(12.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-53.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -53.5 + (((tickAnim - 10) / 3) * (0-(-53.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-53.5-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -53.5 + (((tickAnim - 17) / 3) * (0-(-53.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-53.5-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -53.5 + (((tickAnim - 23) / 2) * (0-(-53.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-7.80733-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (10.18588-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (1.30731-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -7.80733 + (((tickAnim - 12) / 1) * (0-(-7.80733)));
            yy = 10.18588 + (((tickAnim - 12) / 1) * (0-(10.18588)));
            zz = 1.30731 + (((tickAnim - 12) / 1) * (0-(1.30731)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (-7.80733-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (10.18588-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (1.30731-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -7.80733 + (((tickAnim - 18) / 2) * (0-(-7.80733)));
            yy = 10.18588 + (((tickAnim - 18) / 2) * (0-(10.18588)));
            zz = 1.30731 + (((tickAnim - 18) / 2) * (0-(1.30731)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-51.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -51.75 + (((tickAnim - 10) / 3) * (32.5-(-51.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 32.5 + (((tickAnim - 13) / 4) * (-51.75-(32.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = -51.75 + (((tickAnim - 17) / 3) * (32.5-(-51.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 32.5 + (((tickAnim - 20) / 3) * (-51.75-(32.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = -51.75 + (((tickAnim - 23) / 2) * (0-(-51.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-50-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -50 + (((tickAnim - 13) / 4) * (0-(-50)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (-50-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -50 + (((tickAnim - 20) / 3) * (0-(-50)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (2.76177-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-25.09966-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-13.43866-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 2.76177 + (((tickAnim - 15) / 2) * (0-(2.76177)));
            yy = -25.09966 + (((tickAnim - 15) / 2) * (0-(-25.09966)));
            zz = -13.43866 + (((tickAnim - 15) / 2) * (0-(-13.43866)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (2.76177-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (-25.09966-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (-13.43866-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 2.76177 + (((tickAnim - 22) / 1) * (0-(2.76177)));
            yy = -25.09966 + (((tickAnim - 22) / 1) * (0-(-25.09966)));
            zz = -13.43866 + (((tickAnim - 22) / 1) * (0-(-13.43866)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (44-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 44 + (((tickAnim - 13) / 4) * (0-(44)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (44-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 44 + (((tickAnim - 20) / 3) * (0-(44)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 28 + (((tickAnim - 10) / 13) * (28-(28)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 28 + (((tickAnim - 23) / 7) * (-1.57207-(28)));
            yy = 0 + (((tickAnim - 23) / 7) * (-12.07964-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (6.02637-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -1.57207 + (((tickAnim - 30) / 3) * (-1.57207-(-1.57207)));
            yy = -12.07964 + (((tickAnim - 30) / 3) * (-12.07964-(-12.07964)));
            zz = 6.02637 + (((tickAnim - 30) / 3) * (6.02637-(6.02637)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -1.57207 + (((tickAnim - 33) / 6) * (-1.57207-(-1.57207)));
            yy = -12.07964 + (((tickAnim - 33) / 6) * (-12.07964-(-12.07964)));
            zz = 6.02637 + (((tickAnim - 33) / 6) * (6.02637-(6.02637)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -1.57207 + (((tickAnim - 39) / 4) * (-1.57207-(-1.57207)));
            yy = -12.07964 + (((tickAnim - 39) / 4) * (-12.07964-(-12.07964)));
            zz = 6.02637 + (((tickAnim - 39) / 4) * (6.02637-(6.02637)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -1.57207 + (((tickAnim - 43) / 7) * (0-(-1.57207)));
            yy = -12.07964 + (((tickAnim - 43) / 7) * (0-(-12.07964)));
            zz = 6.02637 + (((tickAnim - 43) / 7) * (0-(6.02637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 20.5 + (((tickAnim - 10) / 13) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 20.5 + (((tickAnim - 23) / 7) * (2.62592-(20.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (-12.74928-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-11.5271-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 2.62592 + (((tickAnim - 30) / 3) * (2.62592-(2.62592)));
            yy = -12.74928 + (((tickAnim - 30) / 3) * (-12.74928-(-12.74928)));
            zz = -11.5271 + (((tickAnim - 30) / 3) * (-11.5271-(-11.5271)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 2.62592 + (((tickAnim - 33) / 6) * (2.62592-(2.62592)));
            yy = -12.74928 + (((tickAnim - 33) / 6) * (12.7493-(-12.74928)));
            zz = -11.5271 + (((tickAnim - 33) / 6) * (11.5271-(-11.5271)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 2.62592 + (((tickAnim - 39) / 4) * (2.62592-(2.62592)));
            yy = 12.7493 + (((tickAnim - 39) / 4) * (12.7493-(12.7493)));
            zz = 11.5271 + (((tickAnim - 39) / 4) * (11.5271-(11.5271)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 2.62592 + (((tickAnim - 43) / 7) * (0-(2.62592)));
            yy = 12.7493 + (((tickAnim - 43) / 7) * (0-(12.7493)));
            zz = 11.5271 + (((tickAnim - 43) / 7) * (0-(11.5271)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0.175 + (((tickAnim - 10) / 13) * (0.175-(0.175)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.175 + (((tickAnim - 23) / 7) * (0-(0.175)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 19.5 + (((tickAnim - 10) / 13) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 19.5 + (((tickAnim - 23) / 7) * (0-(19.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 30) / 3) * (-5-(-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = -5 + (((tickAnim - 33) / 6) * (5-(-5)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 39) / 4) * (5-(5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 5 + (((tickAnim - 43) / 7) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0.25 + (((tickAnim - 10) / 13) * (0.25-(0.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0.25 + (((tickAnim - 23) / 7) * (0-(0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);

    }


    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLagosuchus entity = (EntityPrehistoricFloraLagosuchus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 3) / 5) * (9.75-(-4.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 9.75 + (((tickAnim - 8) / 5) * (0-(9.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (1.25-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 17) / 3) * (0-(1.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.64-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.64 + (((tickAnim - 3) / 5) * (-7-(4.64)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -7 + (((tickAnim - 8) / 5) * (-1-(-7)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -1 + (((tickAnim - 13) / 4) * (4.5-(-1)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 4.5 + (((tickAnim - 17) / 3) * (0-(4.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.97-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -4.97 + (((tickAnim - 3) / 5) * (2.75-(-4.97)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.75 + (((tickAnim - 8) / 5) * (-7-(2.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -7 + (((tickAnim - 13) / 4) * (1-(-7)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 17) / 3) * (0-(1)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-14.14-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -14.14 + (((tickAnim - 3) / 5) * (4.75-(-14.14)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 4.75 + (((tickAnim - 8) / 5) * (-8.75-(4.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -8.75 + (((tickAnim - 13) / 4) * (-3.5-(-8.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 17) / 3) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-11.53-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11.53 + (((tickAnim - 3) / 5) * (-1.25-(-11.53)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.25 + (((tickAnim - 8) / 2) * (8-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 8 + (((tickAnim - 10) / 3) * (-7.75-(8)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -7.75 + (((tickAnim - 13) / 1) * (-12.4-(-7.75)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -12.4 + (((tickAnim - 14) / 3) * (-11.5-(-12.4)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -11.5 + (((tickAnim - 17) / 3) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (15.95-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 15.95 + (((tickAnim - 2) / 1) * (-9.25-(15.95)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -9.25 + (((tickAnim - 3) / 5) * (-18-(-9.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18 + (((tickAnim - 8) / 2) * (10.88-(-18)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10.88 + (((tickAnim - 10) / 3) * (9.75-(10.88)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.75 + (((tickAnim - 13) / 1) * (-17.45-(9.75)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -17.45 + (((tickAnim - 14) / 3) * (-14.5-(-17.45)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -14.5 + (((tickAnim - 17) / 3) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.75 + (((tickAnim - 3) / 5) * (13-(-7.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 13 + (((tickAnim - 8) / 5) * (0-(13)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.475 + (((tickAnim - 8) / 5) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -4.75 + (((tickAnim - 3) / 5) * (3.75-(-4.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 3.75 + (((tickAnim - 8) / 5) * (0-(3.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -12 + (((tickAnim - 3) / 5) * (17.75-(-12)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 17.75 + (((tickAnim - 8) / 8) * (0-(17.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -37.75 + (((tickAnim - 8) / 8) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 31.25 + (((tickAnim - 8) / 12) * (0-(31.25)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.25 + (((tickAnim - 3) / 5) * (22.03391-(-7.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (-2.59713-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-7.97356-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 22.03391 + (((tickAnim - 8) / 8) * (0-(22.03391)));
            yy = -2.59713 + (((tickAnim - 8) / 8) * (0-(-2.59713)));
            zz = -7.97356 + (((tickAnim - 8) / 8) * (0-(-7.97356)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-39.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -39.5 + (((tickAnim - 8) / 8) * (0-(-39.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 31 + (((tickAnim - 8) / 12) * (0-(31)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 15.25 + (((tickAnim - 3) / 5) * (27.52291-(15.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.26059-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.20921-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 27.52291 + (((tickAnim - 8) / 5) * (0-(27.52291)));
            yy = -0.26059 + (((tickAnim - 8) / 5) * (0-(-0.26059)));
            zz = -0.20921 + (((tickAnim - 8) / 5) * (0-(-0.20921)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.75 + (((tickAnim - 3) / 5) * (33.5-(20.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 33.5 + (((tickAnim - 8) / 5) * (0-(33.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0.1 + (((tickAnim - 8) / 12) * (0-(0.1)));
            zz = -0.175 + (((tickAnim - 8) / 12) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 24 + (((tickAnim - 3) / 6) * (26.61-(24)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 26.61 + (((tickAnim - 9) / 4) * (-15.5-(26.61)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -15.5 + (((tickAnim - 13) / 3) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.5 + (((tickAnim - 18) / 2) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 34.25 + (((tickAnim - 7) / 1) * (0-(34.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (19-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 19 + (((tickAnim - 13) / 3) * (0-(19)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (9.5-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 9.5 + (((tickAnim - 18) / 2) * (0-(9.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }







    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLagosuchus entity = (EntityPrehistoricFloraLagosuchus) entitylivingbaseIn;

        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+50))*5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+20))*4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45))*3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.503-20))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.503-20))*0.3);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -24.25 + (((tickAnim - 0) / 6) * (20.5-(-24.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 20.5 + (((tickAnim - 6) / 4) * (-7.546-(20.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (-4.61958-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (1.91505-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.546 + (((tickAnim - 10) / 3) * (-24.25-(-7.546)));
            yy = -4.61958 + (((tickAnim - 10) / 3) * (0-(-4.61958)));
            zz = 1.91505 + (((tickAnim - 10) / 3) * (0-(1.91505)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs, leftLegs.rotateAngleX + (float) Math.toRadians(xx), leftLegs.rotateAngleY + (float) Math.toRadians(yy), leftLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -28.5 + (((tickAnim - 0) / 6) * (7.25-(-28.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 7.25 + (((tickAnim - 6) / 1) * (33.57-(7.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 33.57 + (((tickAnim - 7) / 3) * (-35.62-(33.57)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -35.62 + (((tickAnim - 10) / 3) * (-28.5-(-35.62)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs2, leftLegs2.rotateAngleX + (float) Math.toRadians(xx), leftLegs2.rotateAngleY + (float) Math.toRadians(yy), leftLegs2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (1.175-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 10) / 3) * (0-(1.175)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs2.rotationPointX = this.leftLegs2.rotationPointX + (float)(xx);
        this.leftLegs2.rotationPointY = this.leftLegs2.rotationPointY - (float)(yy);
        this.leftLegs2.rotationPointZ = this.leftLegs2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 22.75 + (((tickAnim - 0) / 6) * (29.25-(22.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 29.25 + (((tickAnim - 6) / 2) * (-61.56-(29.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -61.56 + (((tickAnim - 8) / 2) * (-34.89-(-61.56)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -34.89 + (((tickAnim - 10) / 3) * (28.25-(-34.89)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs3, leftLegs3.rotateAngleX + (float) Math.toRadians(xx), leftLegs3.rotateAngleY + (float) Math.toRadians(yy), leftLegs3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.55 + (((tickAnim - 6) / 7) * (0-(0.55)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs3.rotationPointX = this.leftLegs3.rotationPointX + (float)(xx);
        this.leftLegs3.rotationPointY = this.leftLegs3.rotationPointY - (float)(yy);
        this.leftLegs3.rotationPointZ = this.leftLegs3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.25 + (((tickAnim - 0) / 3) * (-5.5-(25.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.5 + (((tickAnim - 3) / 3) * (42.75-(-5.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 42.75 + (((tickAnim - 6) / 4) * (88.38-(42.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 88.38 + (((tickAnim - 10) / 3) * (25.25-(88.38)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs4, leftLegs4.rotateAngleX + (float) Math.toRadians(xx), leftLegs4.rotateAngleY + (float) Math.toRadians(yy), leftLegs4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.91-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.91 + (((tickAnim - 1) / 2) * (0.775-(0.91)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.775 + (((tickAnim - 3) / 1) * (0.49-(0.775)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.275-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.49 + (((tickAnim - 4) / 2) * (0-(0.49)));
            zz = 0.275 + (((tickAnim - 4) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.61-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -0.61 + (((tickAnim - 8) / 2) * (-0.895-(-0.61)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -0.895 + (((tickAnim - 10) / 3) * (0-(-0.895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs4.rotationPointX = this.leftLegs4.rotationPointX + (float)(xx);
        this.leftLegs4.rotationPointY = this.leftLegs4.rotationPointY - (float)(yy);
        this.leftLegs4.rotationPointZ = this.leftLegs4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 28 + (((tickAnim - 0) / 4) * (-2.81181-(28)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.5577-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.63497-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -2.81181 + (((tickAnim - 4) / 2) * (-31.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10-(-2.81181)));
            yy = 1.5577 + (((tickAnim - 4) / 2) * (0-(1.5577)));
            zz = -0.63497 + (((tickAnim - 4) / 2) * (0-(-0.63497)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -31.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10 + (((tickAnim - 6) / 7) * (28-(-31.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs, rightLegs.rotateAngleX + (float) Math.toRadians(xx), rightLegs.rotateAngleY + (float) Math.toRadians(yy), rightLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 7.5 + (((tickAnim - 0) / 1) * (10.84-(7.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 10.84 + (((tickAnim - 1) / 2) * (-39.55-(10.84)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -39.55 + (((tickAnim - 3) / 3) * (-28.5-(-39.55)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -28.5 + (((tickAnim - 6) / 7) * (0.5-(-28.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs2, rightLegs2.rotateAngleX + (float) Math.toRadians(xx), rightLegs2.rotateAngleY + (float) Math.toRadians(yy), rightLegs2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 1) / 2) * (1.45-(0.325)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.45 + (((tickAnim - 3) / 3) * (0-(1.45)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs2.rotationPointX = this.rightLegs2.rotationPointX + (float)(xx);
        this.rightLegs2.rotationPointY = this.rightLegs2.rotationPointY - (float)(yy);
        this.rightLegs2.rotationPointZ = this.rightLegs2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 30 + (((tickAnim - 0) / 2) * (-49.18-(30)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -49.18 + (((tickAnim - 2) / 1) * (-36.18-(-49.18)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -36.18 + (((tickAnim - 3) / 3) * (24-(-36.18)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 24 + (((tickAnim - 6) / 3) * (20.13-(24)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.13 + (((tickAnim - 9) / 4) * (30-(20.13)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs3, rightLegs3.rotateAngleX + (float) Math.toRadians(xx), rightLegs3.rotateAngleY + (float) Math.toRadians(yy), rightLegs3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.35-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.05 + (((tickAnim - 2) / 1) * (0.05-(0.05)));
            zz = 0.35 + (((tickAnim - 2) / 1) * (0.35-(0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 3) / 3) * (0-(0.05)));
            zz = 0.35 + (((tickAnim - 3) / 3) * (0-(0.35)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs3.rotationPointX = this.rightLegs3.rotationPointX + (float)(xx);
        this.rightLegs3.rotationPointY = this.rightLegs3.rotationPointY - (float)(yy);
        this.rightLegs3.rotationPointZ = this.rightLegs3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 42.75 + (((tickAnim - 0) / 2) * (76.25-(42.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 76.25 + (((tickAnim - 2) / 1) * (76.5-(76.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 76.5 + (((tickAnim - 3) / 1) * (70.92-(76.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 70.92 + (((tickAnim - 4) / 2) * (25.25-(70.92)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 25.25 + (((tickAnim - 6) / 3) * (-9.75-(25.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -9.75 + (((tickAnim - 9) / 4) * (42.75-(-9.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs4, rightLegs4.rotateAngleX + (float) Math.toRadians(xx), rightLegs4.rotateAngleY + (float) Math.toRadians(yy), rightLegs4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.775-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -0.775 + (((tickAnim - 2) / 1) * (-0.8-(-0.775)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -0.8 + (((tickAnim - 3) / 3) * (0-(-0.8)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.065-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.065 + (((tickAnim - 8) / 1) * (0.675-(1.065)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.675 + (((tickAnim - 9) / 4) * (0-(0.675)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs4.rotationPointX = this.rightLegs4.rotationPointX + (float)(xx);
        this.rightLegs4.rotationPointY = this.rightLegs4.rotationPointY - (float)(yy);
        this.rightLegs4.rotationPointZ = this.rightLegs4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225))*-5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+30))*9), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+20))*-4), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+90))*-12), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+20))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-90))*-7), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-150))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+40))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-90))*-10), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+40))*-18), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+60))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+50))*15), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-20))*-28), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+80))*5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+120))*-3.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-50))*2));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.503+20))*0.15);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+180))*-1), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-90))*3));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.503+40))*0.15);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-150))*-7), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-90))*-3));
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(0);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.503-80))*0.1);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -18.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7 + (((tickAnim - 0) / 6) * (-37.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7-(-18.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3 + (((tickAnim - 0) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -37.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7 + (((tickAnim - 6) / 7) * (-18.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7-(-37.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3 + (((tickAnim - 6) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(26), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-150))*-7), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-90))*-3));
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(0);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.503-50))*0.1);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7 + (((tickAnim - 0) / 6) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7-(-29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3 + (((tickAnim - 0) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7 + (((tickAnim - 6) / 7) * (-29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.225-180))*-7)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3 + (((tickAnim - 6) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.45-90))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(27.5), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(14+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+180))*5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-220))*5));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.503+40))*0.2);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-18.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+180))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-390))*5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(8.25), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-220))*5));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraLagosuchus entity = (EntityPrehistoricFloraLagosuchus) entitylivingbaseIn;

        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188+20))*2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376+20))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376-10))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-40))*-0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-20))*0.2);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -24.25 + (((tickAnim - 0) / 11) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(-24.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 11) / 8) * (-10.09868-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 11) / 8) * (-3.39679-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (1.58974-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.09868 + (((tickAnim - 19) / 4) * (-24.25-(-10.09868)));
            yy = -3.39679 + (((tickAnim - 19) / 4) * (0-(-3.39679)));
            zz = 1.58974 + (((tickAnim - 19) / 4) * (0-(1.58974)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs, leftLegs.rotateAngleX + (float) Math.toRadians(xx), leftLegs.rotateAngleY + (float) Math.toRadians(yy), leftLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -9.75 + (((tickAnim - 0) / 11) * (13.75-(-9.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 13.75 + (((tickAnim - 11) / 2) * (11.27-(13.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.27 + (((tickAnim - 13) / 5) * (-13.75-(11.27)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -13.75 + (((tickAnim - 18) / 5) * (-9.75-(-13.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs2, leftLegs2.rotateAngleX + (float) Math.toRadians(xx), leftLegs2.rotateAngleY + (float) Math.toRadians(yy), leftLegs2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (-0.015-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.015 + (((tickAnim - 13) / 5) * (0-(-0.015)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs2.rotationPointX = this.leftLegs2.rotationPointX + (float)(xx);
        this.leftLegs2.rotationPointY = this.leftLegs2.rotationPointY - (float)(yy);
        this.leftLegs2.rotationPointZ = this.leftLegs2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 18 + (((tickAnim - 0) / 11) * (1.5-(18)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 1.5 + (((tickAnim - 11) / 3) * (-49.95-(1.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -49.95 + (((tickAnim - 14) / 4) * (-53.88-(-49.95)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -53.88 + (((tickAnim - 18) / 5) * (18-(-53.88)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs3, leftLegs3.rotateAngleX + (float) Math.toRadians(xx), leftLegs3.rotateAngleY + (float) Math.toRadians(yy), leftLegs3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.075-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            yy = 0.075 + (((tickAnim - 11) / 12) * (0-(0.075)));
            zz = 0.075 + (((tickAnim - 11) / 12) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs3.rotationPointX = this.leftLegs3.rotationPointX + (float)(xx);
        this.leftLegs3.rotationPointY = this.leftLegs3.rotationPointY - (float)(yy);
        this.leftLegs3.rotationPointZ = this.leftLegs3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13.75 + (((tickAnim - 0) / 5) * (0.75-(13.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.75 + (((tickAnim - 5) / 6) * (49.5-(0.75)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 49.5 + (((tickAnim - 11) / 2) * (71.62-(49.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 71.62 + (((tickAnim - 13) / 5) * (85.58-(71.62)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 85.58 + (((tickAnim - 18) / 5) * (13.75-(85.58)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegs4, leftLegs4.rotateAngleX + (float) Math.toRadians(xx), leftLegs4.rotateAngleY + (float) Math.toRadians(yy), leftLegs4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.68-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0.68 + (((tickAnim - 3) / 8) * (0.425-(0.68)));
            zz = -0.12 + (((tickAnim - 3) / 8) * (-0.4-(-0.12)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 11) / 2) * (0.675-(0.425)));
            zz = -0.4 + (((tickAnim - 11) / 2) * (-0.695-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 13) / 5) * (0.06-(0.675)));
            zz = -0.695 + (((tickAnim - 13) / 5) * (-0.575-(-0.695)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.06 + (((tickAnim - 18) / 5) * (0-(0.06)));
            zz = -0.575 + (((tickAnim - 18) / 5) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegs4.rotationPointX = this.leftLegs4.rotationPointX + (float)(xx);
        this.leftLegs4.rotationPointY = this.leftLegs4.rotationPointY - (float)(yy);
        this.leftLegs4.rotationPointZ = this.leftLegs4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 7.25 + (((tickAnim - 0) / 6) * (-11.17358-(7.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (3.36642-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-1.65314-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -11.17358 + (((tickAnim - 6) / 4) * (-24.25-(-11.17358)));
            yy = 3.36642 + (((tickAnim - 6) / 4) * (0-(3.36642)));
            zz = -1.65314 + (((tickAnim - 6) / 4) * (0-(-1.65314)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -24.25 + (((tickAnim - 10) / 11) * (17.25-(-24.25)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 17.25 + (((tickAnim - 21) / 2) * (7.25-(17.25)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs, rightLegs.rotateAngleX + (float) Math.toRadians(xx), rightLegs.rotateAngleY + (float) Math.toRadians(yy), rightLegs.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 32 + (((tickAnim - 0) / 5) * (-7.62-(32)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.62 + (((tickAnim - 5) / 5) * (-9.75-(-7.62)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -9.75 + (((tickAnim - 10) / 11) * (13.75-(-9.75)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 13.75 + (((tickAnim - 21) / 2) * (32-(13.75)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs2, rightLegs2.rotateAngleX + (float) Math.toRadians(xx), rightLegs2.rotateAngleY + (float) Math.toRadians(yy), rightLegs2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs2.rotationPointX = this.rightLegs2.rotationPointX + (float)(xx);
        this.rightLegs2.rotationPointY = this.rightLegs2.rotationPointY - (float)(yy);
        this.rightLegs2.rotationPointZ = this.rightLegs2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -36.5 + (((tickAnim - 0) / 5) * (-55.62-(-36.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -55.62 + (((tickAnim - 5) / 5) * (18-(-55.62)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 18 + (((tickAnim - 10) / 5) * (-0.5-(18)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -0.5 + (((tickAnim - 15) / 6) * (-8-(-0.5)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -8 + (((tickAnim - 21) / 2) * (-36.5-(-8)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs3, rightLegs3.rotateAngleX + (float) Math.toRadians(xx), rightLegs3.rotateAngleY + (float) Math.toRadians(yy), rightLegs3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs3.rotationPointX = this.rightLegs3.rotationPointX + (float)(xx);
        this.rightLegs3.rotationPointY = this.rightLegs3.rotationPointY - (float)(yy);
        this.rightLegs3.rotationPointZ = this.rightLegs3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 80.25 + (((tickAnim - 0) / 5) * (75.22-(80.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 75.22 + (((tickAnim - 5) / 5) * (13.75-(75.22)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 13.75 + (((tickAnim - 10) / 5) * (4.44-(13.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.44 + (((tickAnim - 15) / 3) * (10.22-(4.44)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 10.22 + (((tickAnim - 18) / 3) * (51.5-(10.22)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 51.5 + (((tickAnim - 21) / 2) * (80.25-(51.5)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegs4, rightLegs4.rotateAngleX + (float) Math.toRadians(xx), rightLegs4.rotateAngleY + (float) Math.toRadians(yy), rightLegs4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 5) * (0.12-(0.125)));
            zz = -0.875 + (((tickAnim - 0) / 5) * (-0.825-(-0.875)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.12 + (((tickAnim - 5) / 5) * (0-(0.12)));
            zz = -0.825 + (((tickAnim - 5) / 5) * (0-(-0.825)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.615-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.615 + (((tickAnim - 14) / 4) * (0.165-(0.615)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.165 + (((tickAnim - 18) / 3) * (0.125-(0.165)));
            zz = 0 + (((tickAnim - 18) / 3) * (-0.4-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 21) / 2) * (0.125-(0.125)));
            zz = -0.4 + (((tickAnim - 21) / 2) * (-0.875-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegs4.rotationPointX = this.rightLegs4.rotationPointX + (float)(xx);
        this.rightLegs4.rotationPointY = this.rightLegs4.rotationPointY - (float)(yy);
        this.rightLegs4.rotationPointZ = this.rightLegs4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-20))*3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376+40))*-7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376-10))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188+70))*0.8), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376+50))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376+10))*4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188+20))*-5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376-50))*-13), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376-10))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188+40))*-5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376-80))*-18), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376-10))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-70))*-10), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376-100))*-25), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.376-10))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-40))*1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-50))*0.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-20))*-0.02);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-70))*1), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-90))*0.5));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-50))*0.02);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-70))*2), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-90))*0.5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-130))*-7), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-90))*2));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-300))*-7), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-90))*2));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-70))*-2), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-90))*-0.5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-130))*-7), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-90))*-2));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-300))*-7), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-90))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-100))*-1.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-120))*-0.8));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-100))*-2.8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-120))*0.3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.188-100))*3.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.375-120))*0.2));



}

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLagosuchus e = (EntityPrehistoricFloraLagosuchus) entity;
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
