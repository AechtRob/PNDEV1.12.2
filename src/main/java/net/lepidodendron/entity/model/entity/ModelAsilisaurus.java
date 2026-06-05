package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAsilisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAsilisaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontLeftLeg4;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer frontRightLeg4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer backRightLeg4;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backLeftLeg4;

    private ModelAnimator animator;

    public ModelAsilisaurus() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 9.6F, 2.3333F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(-0.3333F, -1.85F, 1.0F);
        this.root.addChild(hips);
        this.hips.cubeList.add(new ModelBox(hips, 0, 17, -2.1667F, -1.15F, -2.8333F, 5, 7, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.1667F, -0.95F, 1.6667F);
        this.hips.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 22, 20, -1.5F, 0.0F, 0.0F, 4, 4, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2F, 6.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 9, -1.0F, 0.0F, 0.0F, 3, 3, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2F, 7.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 31, -0.5F, 0.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 6.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 21, 0, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.1667F, -1.4F, -1.8333F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, 0.0F, -9.0F, 6, 8, 9, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, -8.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 30, -2.0F, 0.0F, -5.0F, 5, 7, 5, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(3.0F, 4.875F, -2.85F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.5672F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 0, 42, -1.5F, -0.75F, -1.5F, 3, 6, 3, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.5F, 5.0F, 0.25F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.829F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 0, 0, -1.5F, -0.75F, -1.5F, 2, 7, 2, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 5.4F, -0.775F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.2182F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 0, 17, -1.5F, 0.0F, -0.5F, 2, 2, 1, -0.001F, false));

        this.frontLeftLeg4 = new AdvancedModelRenderer(this);
        this.frontLeftLeg4.setRotationPoint(-0.5F, 1.4F, 0.4F);
        this.frontLeftLeg3.addChild(frontLeftLeg4);
        this.frontLeftLeg4.cubeList.add(new ModelBox(frontLeftLeg4, 44, 37, -1.0F, -0.2607F, -1.9889F, 2, 1, 2, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.0F, 4.875F, -2.85F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.5672F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 0, 42, -1.5F, -0.75F, -1.5F, 3, 6, 3, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.5F, 5.0F, 0.25F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.829F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 0, 0, -0.5F, -0.75F, -1.5F, 2, 7, 2, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 5.4F, -0.775F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.2182F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 0, 17, -0.5F, 0.0F, -0.5F, 2, 2, 1, -0.001F, true));

        this.frontRightLeg4 = new AdvancedModelRenderer(this);
        this.frontRightLeg4.setRotationPoint(0.5F, 1.4F, 0.4F);
        this.frontRightLeg3.addChild(frontRightLeg4);
        this.frontRightLeg4.cubeList.add(new ModelBox(frontRightLeg4, 44, 37, -1.0F, -0.2607F, -1.9889F, 2, 1, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -3.5F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 16, 40, -1.5F, -0.3007F, -4.0463F, 4, 4, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1993F, -2.7963F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3927F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 33, 35, -1.0F, 0.0F, -5.0F, 3, 3, 5, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 37, 20, -1.0F, 2.5F, -4.9F, 3, 1, 5, -0.001F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0064F, -4.9664F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.384F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 40, 27, -1.0F, 0.1064F, -3.8336F, 3, 2, 4, -0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 2.0564F, -0.0336F);
        this.neck3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1004F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 43, -1.5F, -0.6F, -3.0F, 3, 2, 3, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.5064F, -3.9586F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 44, 17, -1.0F, 0.25F, -1.1F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 48, -0.5F, 0.25F, -2.9F, 2, 1, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 48, -0.5F, -0.5F, -2.9F, 2, 1, 2, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 3, 0.0F, 0.05F, -5.4F, 1, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 44, 33, 0.0F, 0.25F, -5.4F, 1, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.9F, 0.5F, -3.65F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.1F, 0.5F, -3.65F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.7F, -3.175F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 48, -0.5F, 0.0855F, -2.32F, 1, 1, 3, 0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.075F, -1.45F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2094F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 5, -0.5F, 0.0321F, -1.7792F, 2, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.1218F, -0.9103F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0876F, -0.0869F, -0.0076F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 20, -0.6F, -0.5F, -0.6F, 1, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, -0.1218F, -0.9103F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0876F, 0.0869F, 0.0076F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 20, -0.4F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.5F, 0.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 31, -0.5F, 0.25F, -1.775F, 3, 2, 2, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.25F, -3.9F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 17, -0.475F, 0.075F, -1.525F, 0, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 17, 0.475F, 0.075F, -1.525F, 0, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0463F, 0.1421F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 41, 0, -1.0F, 0.0037F, -1.2421F, 3, 1, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 15, 30, -0.5F, -1.4963F, -1.9921F, 2, 2, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.0037F, -1.2421F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3316F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 20, -1.5F, -1.0F, 0.0F, 3, 1, 2, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 1.0037F, -1.0421F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 16, -1.25F, -1.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 0, -0.75F, -1.25F, -3.35F, 0, 1, 1, 0.001F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 16, 0.25F, -1.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 20, -1.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 0, -0.25F, -1.25F, -3.35F, 0, 1, 1, 0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 17, -1.0F, -1.0F, -3.6F, 1, 1, 2, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.5037F, -4.0421F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 23, -0.5F, -0.6F, -1.475F, 1, 1, 1, -0.002F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.1667F, 1.85F, 0.1667F);
        this.hips.addChild(backRightLeg);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 36, 5, -1.75F, -1.0F, -2.0F, 3, 8, 4, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.75F, 6.4F, -0.9F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.9599F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 32, 43, -0.5F, -0.2833F, -0.9208F, 2, 7, 3, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.5F, 6.0F, 0.7F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.624F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 21, 0, -1.0F, -0.2833F, -0.9207F, 2, 5, 2, -0.001F, true));

        this.backRightLeg4 = new AdvancedModelRenderer(this);
        this.backRightLeg4.setRotationPoint(0.0F, 4.2F, -0.4F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.setRotateAngle(backRightLeg4, -0.336F, 0.0F, 0.0F);
        this.backRightLeg4.cubeList.add(new ModelBox(backRightLeg4, 31, 0, -1.5F, 0.0167F, -3.0208F, 3, 1, 4, 0.0F, true));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.8333F, 1.85F, 0.1667F);
        this.hips.addChild(backLeftLeg);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 36, 5, -1.25F, -1.0F, -2.0F, 3, 8, 4, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.75F, 6.4F, -0.9F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.9599F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 32, 43, -1.5F, -0.2833F, -0.9208F, 2, 7, 3, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(-0.5F, 6.0F, 0.7F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.624F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 21, 0, -1.0F, -0.2833F, -0.9207F, 2, 5, 2, -0.001F, false));

        this.backLeftLeg4 = new AdvancedModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.0F, 4.2F, -0.4F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.setRotateAngle(backLeftLeg4, -0.336F, 0.0F, 0.0F);
        this.backLeftLeg4.cubeList.add(new ModelBox(backLeftLeg4, 31, 0, -1.5F, 0.0167F, -3.0208F, 3, 1, 4, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.1F;
        this.root.offsetX = 0.2F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.render(0.01F);
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

        EntityPrehistoricFloraAsilisaurus entityAsilisaurus = (EntityPrehistoricFloraAsilisaurus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityAsilisaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityAsilisaurus.getAnimation() == entityAsilisaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityAsilisaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityAsilisaurus.getIsMoving()) {
                    if (entityAsilisaurus.getAnimation() != entityAsilisaurus.EAT_ANIMATION
                        && entityAsilisaurus.getAnimation() != entityAsilisaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAsilisaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraAsilisaurus ee = (EntityPrehistoricFloraAsilisaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The graze anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAsilisaurus entity = (EntityPrehistoricFloraAsilisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(10.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-320))*15), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAsilisaurus entity = (EntityPrehistoricFloraAsilisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-51.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -51.75 + (((tickAnim - 15) / 13) * (23.75-(-51.75)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 23.75 + (((tickAnim - 28) / 12) * (-19.79-(23.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19.79 + (((tickAnim - 40) / 10) * (0-(-19.79)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 18 + (((tickAnim - 15) / 13) * (0-(18)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (37.5-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 40) / 10) * (0-(37.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(0);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(0);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-66.94-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -66.94 + (((tickAnim - 10) / 5) * (-56.75-(-66.94)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -56.75 + (((tickAnim - 15) / 13) * (0-(-56.75)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (-66.5-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -66.5 + (((tickAnim - 40) / 10) * (0-(-66.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (98.28-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 98.28 + (((tickAnim - 10) / 5) * (120.5-(98.28)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 120.5 + (((tickAnim - 15) / 3) * (82.89-(120.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 82.89 + (((tickAnim - 18) / 10) * (135.75-(82.89)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 135.75 + (((tickAnim - 28) / 12) * (138.15-(135.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 138.15 + (((tickAnim - 40) / 10) * (0-(138.15)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAsilisaurus entity = (EntityPrehistoricFloraAsilisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 29 + (((tickAnim - 15) / 20) * (29-(29)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 35) / 15) * (0-(29)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-45.05418-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.14942-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.37897-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -45.05418 + (((tickAnim - 15) / 20) * (-45.05418-(-45.05418)));
            yy = -0.14942 + (((tickAnim - 15) / 20) * (-0.14942-(-0.14942)));
            zz = 4.37897 + (((tickAnim - 15) / 20) * (4.37897-(4.37897)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -45.05418 + (((tickAnim - 35) / 15) * (0-(-45.05418)));
            yy = -0.14942 + (((tickAnim - 35) / 15) * (0-(-0.14942)));
            zz = 4.37897 + (((tickAnim - 35) / 15) * (0-(4.37897)));
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
            zz = 0 + (((tickAnim - 0) / 15) * (0.825-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.825 + (((tickAnim - 15) / 20) * (0.825-(0.825)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.825 + (((tickAnim - 35) / 15) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 42 + (((tickAnim - 15) / 20) * (42-(42)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 42 + (((tickAnim - 35) / 15) * (0-(42)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 29 + (((tickAnim - 15) / 20) * (29-(29)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 35) / 15) * (0-(29)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-45.05418-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.14942-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.37897-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -45.05418 + (((tickAnim - 15) / 20) * (-45.05418-(-45.05418)));
            yy = -0.14942 + (((tickAnim - 15) / 20) * (-0.14942-(-0.14942)));
            zz = 4.37897 + (((tickAnim - 15) / 20) * (4.37897-(4.37897)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -45.05418 + (((tickAnim - 35) / 15) * (0-(-45.05418)));
            yy = -0.14942 + (((tickAnim - 35) / 15) * (0-(-0.14942)));
            zz = 4.37897 + (((tickAnim - 35) / 15) * (0-(4.37897)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.825-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.825 + (((tickAnim - 15) / 20) * (0.825-(0.825)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.825 + (((tickAnim - 35) / 15) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 42 + (((tickAnim - 15) / 20) * (42-(42)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 42 + (((tickAnim - 35) / 15) * (0-(42)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -24.5 + (((tickAnim - 15) / 20) * (-24.5-(-24.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -24.5 + (((tickAnim - 35) / 15) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.925-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.55 + (((tickAnim - 15) / 20) * (-2.55-(-2.55)));
            zz = 4.925 + (((tickAnim - 15) / 20) * (4.925-(4.925)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.55 + (((tickAnim - 35) / 15) * (0-(-2.55)));
            zz = 4.925 + (((tickAnim - 35) / 15) * (0-(4.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12 + (((tickAnim - 15) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 35) / 15) * (0-(12)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15.5 + (((tickAnim - 15) / 20) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 15.5 + (((tickAnim - 35) / 15) * (0-(15.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 15) / 20) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 35) / 15) * (0-(10.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 15) / 20) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 35) / 15) * (0-(12.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -46.75 + (((tickAnim - 15) / 20) * (-46.75-(-46.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -46.75 + (((tickAnim - 35) / 15) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 34.5 + (((tickAnim - 15) / 20) * (34.5-(34.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 35) / 15) * (0-(34.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.575 + (((tickAnim - 15) / 20) * (-0.575-(-0.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.25 + (((tickAnim - 15) / 20) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 35) / 15) * (0-(13.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -46.75 + (((tickAnim - 15) / 20) * (-46.75-(-46.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -46.75 + (((tickAnim - 35) / 15) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 34.5 + (((tickAnim - 15) / 20) * (34.5-(34.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 35) / 15) * (0-(34.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.575 + (((tickAnim - 15) / 20) * (-0.575-(-0.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.25 + (((tickAnim - 15) / 20) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 35) / 15) * (0-(13.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg4, frontRightLeg4.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg4.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAsilisaurus entity = (EntityPrehistoricFloraAsilisaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 5.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*50 + (((tickAnim - 3) / 1) * (6.25-(5.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*50)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.25 + (((tickAnim - 4) / 4) * (61.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(6.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 61.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 8) / 2) * (0-(61.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.53-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.53 + (((tickAnim - 3) / 1) * (15.25-(2.53)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 15.25 + (((tickAnim - 4) / 2) * (22-(15.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22 + (((tickAnim - 6) / 2) * (53.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(22)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 53.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 8) / 2) * (0-(53.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 16.25 + (((tickAnim - 3) / 1) * (-11.5-(16.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -11.5 + (((tickAnim - 4) / 2) * (-20.5-(-11.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.5 + (((tickAnim - 6) / 2) * (23.75-(-20.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23.75 + (((tickAnim - 8) / 2) * (0-(23.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.87-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 6.87 + (((tickAnim - 3) / 1) * (-11-(6.87)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -11 + (((tickAnim - 4) / 2) * (-18.5-(-11)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -18.5 + (((tickAnim - 6) / 2) * (8.75-(-18.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.75 + (((tickAnim - 8) / 2) * (0-(8.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.25 + (((tickAnim - 3) / 1) * (33.75-(2.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 33.75 + (((tickAnim - 4) / 2) * (0-(33.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAsilisaurus entity = (EntityPrehistoricFloraAsilisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.25 + (((tickAnim - 10) / 10) * (0-(12.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.75 + (((tickAnim - 10) / 10) * (0-(6.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14.5 + (((tickAnim - 10) / 10) * (0-(-14.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.25 + (((tickAnim - 10) / 10) * (0-(-30.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25.25 + (((tickAnim - 10) / 10) * (0-(25.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19.25 + (((tickAnim - 10) / 10) * (0-(19.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25.37-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25.37 + (((tickAnim - 5) / 3) * (30.62-(25.37)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 30.62 + (((tickAnim - 8) / 2) * (19-(30.62)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 19 + (((tickAnim - 10) / 3) * (19.42-(19)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19.42 + (((tickAnim - 13) / 7) * (0-(19.42)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16 + (((tickAnim - 10) / 10) * (0-(16)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.87-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 13.87 + (((tickAnim - 5) / 3) * (-19.29-(13.87)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -19.29 + (((tickAnim - 8) / 2) * (0-(-19.29)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (16-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 16 + (((tickAnim - 13) / 7) * (0-(16)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0.1-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.1 + (((tickAnim - 5) / 5) * (0-(0.1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.4-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0.4 + (((tickAnim - 13) / 7) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (21.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21.5 + (((tickAnim - 8) / 2) * (0-(21.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14.5 + (((tickAnim - 10) / 10) * (0-(-14.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.25 + (((tickAnim - 10) / 10) * (0-(-30.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25.25 + (((tickAnim - 10) / 10) * (0-(25.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg4, frontRightLeg4.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg4.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAsilisaurus entity = (EntityPrehistoricFloraAsilisaurus) entitylivingbaseIn;
        int animCycle = 77;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -9 + (((tickAnim - 5) / 10) * (7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-9)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 15) / 5) * (38-(7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 67) {
            xx = 38 + (((tickAnim - 20) / 47) * (38-(38)));
            yy = 0 + (((tickAnim - 20) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 47) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 38 + (((tickAnim - 67) / 11) * (0-(38)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = -22.75 + (((tickAnim - 15) / 52) * (-22.75-(-22.75)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = -22.75 + (((tickAnim - 67) / 11) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (28.25-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 28.25 + (((tickAnim - 15) / 52) * (28.25-(28.25)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 28.25 + (((tickAnim - 67) / 11) * (0-(28.25)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -9 + (((tickAnim - 5) / 10) * (7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-9)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 15) / 5) * (38-(7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 67) {
            xx = 38 + (((tickAnim - 20) / 47) * (38-(38)));
            yy = 0 + (((tickAnim - 20) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 47) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 38 + (((tickAnim - 67) / 11) * (0-(38)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = -22.75 + (((tickAnim - 15) / 52) * (-22.75-(-22.75)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = -22.75 + (((tickAnim - 67) / 11) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (28.25-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 28.25 + (((tickAnim - 15) / 52) * (28.25-(28.25)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 28.25 + (((tickAnim - 67) / 11) * (0-(28.25)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 8.5 + (((tickAnim - 5) / 10) * (-13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(8.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 15) / 5) * (-44-(-13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 67) {
            xx = -44 + (((tickAnim - 20) / 47) * (-44-(-44)));
            yy = 0 + (((tickAnim - 20) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 47) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = -44 + (((tickAnim - 67) / 11) * (0-(-44)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (1.55-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (6-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.55 + (((tickAnim - 15) / 5) * (1.55-(1.55)));
            zz = 6 + (((tickAnim - 15) / 5) * (6-(6)));
        }
        else if (tickAnim >= 20 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 20) / 47) * (0-(0)));
            yy = 1.55 + (((tickAnim - 20) / 47) * (1.55-(1.55)));
            zz = 6 + (((tickAnim - 20) / 47) * (6-(6)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            yy = 1.55 + (((tickAnim - 67) / 11) * (0-(1.55)));
            zz = 6 + (((tickAnim - 67) / 11) * (0-(6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 20.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 15) / 5) * (-10-(20.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 67) {
            xx = -10 + (((tickAnim - 20) / 47) * (-10-(-10)));
            yy = 0 + (((tickAnim - 20) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 47) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = -10 + (((tickAnim - 67) / 11) * (0-(-10)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-43.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -43.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 15) / 5) * (3.25-(-43.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 67) {
            xx = 3.25 + (((tickAnim - 20) / 47) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 20) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 47) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 3.25 + (((tickAnim - 67) / 11) * (0-(3.25)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -8.75 + (((tickAnim - 5) / 7) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (21.25-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 67) {
            xx = 21.25 + (((tickAnim - 16) / 51) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 16) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 51) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = 21.25 + (((tickAnim - 67) / 4) * (0-(21.25)));
            yy = 0 + (((tickAnim - 67) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 71) / 2) * (-7-(0)));
            yy = 0 + (((tickAnim - 71) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 2) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -7 + (((tickAnim - 73) / 5) * (0-(-7)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (39.75-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 39.75 + (((tickAnim - 15) / 52) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = 39.75 + (((tickAnim - 67) / 4) * (21.25-(39.75)));
            yy = 0 + (((tickAnim - 67) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = 21.25 + (((tickAnim - 71) / 2) * (0-(21.25)));
            yy = 0 + (((tickAnim - 71) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 2) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 13 + (((tickAnim - 5) / 10) * (-95.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-100-(13)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -95.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-100 + (((tickAnim - 15) / 5) * (-8.75-(-95.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-100)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 67) {
            xx = -8.75 + (((tickAnim - 20) / 47) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 20) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 47) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -8.75 + (((tickAnim - 67) / 6) * (14.13-(-8.75)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 14.13 + (((tickAnim - 73) / 5) * (0-(14.13)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 8.25 + (((tickAnim - 5) / 10) * (-4.25-(8.25)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = -4.25 + (((tickAnim - 15) / 52) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -4.25 + (((tickAnim - 67) / 6) * (21.12-(-4.25)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 21.12 + (((tickAnim - 73) / 5) * (0-(21.12)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -34.75 + (((tickAnim - 5) / 4) * (-31-(-34.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -31 + (((tickAnim - 9) / 6) * (41.75-(-31)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 41.75 + (((tickAnim - 15) / 52) * (41.75-(41.75)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 41.75 + (((tickAnim - 67) / 6) * (-58.94-(41.75)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -58.94 + (((tickAnim - 73) / 5) * (0-(-58.94)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -43.75 + (((tickAnim - 5) / 4) * (36-(-43.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 36 + (((tickAnim - 9) / 6) * (-14-(36)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = -14 + (((tickAnim - 15) / 52) * (-14-(-14)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -14 + (((tickAnim - 67) / 6) * (30.37-(-14)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 30.37 + (((tickAnim - 73) / 5) * (0-(30.37)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-9-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -9 + (((tickAnim - 9) / 6) * (47.25-(-9)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 47.25 + (((tickAnim - 15) / 52) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 47.25 + (((tickAnim - 67) / 6) * (-14.08-(47.25)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -14.08 + (((tickAnim - 73) / 5) * (0-(-14.08)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0.41-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.41 + (((tickAnim - 9) / 6) * (-0.275-(0.41)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 52) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            yy = -0.275 + (((tickAnim - 67) / 6) * (-0.785-(-0.275)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            yy = -0.785 + (((tickAnim - 73) / 5) * (0-(-0.785)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (48.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 48.25 + (((tickAnim - 5) / 2) * (34.42-(48.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 34.42 + (((tickAnim - 7) / 8) * (105.5-(34.42)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 105.5 + (((tickAnim - 15) / 52) * (105.5-(105.5)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 105.5 + (((tickAnim - 67) / 6) * (24.83-(105.5)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 24.83 + (((tickAnim - 73) / 5) * (0-(24.83)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.535-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.535 + (((tickAnim - 7) / 8) * (-0.525-(0.535)));
            zz = -0.1 + (((tickAnim - 7) / 8) * (-0.575-(-0.1)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            yy = -0.525 + (((tickAnim - 15) / 52) * (-0.525-(-0.525)));
            zz = -0.575 + (((tickAnim - 15) / 52) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            yy = -0.525 + (((tickAnim - 67) / 11) * (0-(-0.525)));
            zz = -0.575 + (((tickAnim - 67) / 11) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg4.rotationPointX = this.frontLeftLeg4.rotationPointX + (float)(xx);
        this.frontLeftLeg4.rotationPointY = this.frontLeftLeg4.rotationPointY - (float)(yy);
        this.frontLeftLeg4.rotationPointZ = this.frontLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -7 + (((tickAnim - 5) / 10) * (-33.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-7)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -33.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 15) / 5) * (-3.25-(-33.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -3.25 + (((tickAnim - 20) / 5) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.25 + (((tickAnim - 25) / 5) * (-6.85837-(-3.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (-2.47464-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (-6.55003-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -6.85837 + (((tickAnim - 30) / 13) * (-6.85837-(-6.85837)));
            yy = -2.47464 + (((tickAnim - 30) / 13) * (-2.47464-(-2.47464)));
            zz = -6.55003 + (((tickAnim - 30) / 13) * (-6.55003-(-6.55003)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -6.85837 + (((tickAnim - 43) / 10) * (-3.97548-(-6.85837)));
            yy = -2.47464 + (((tickAnim - 43) / 10) * (1.11817-(-2.47464)));
            zz = -6.55003 + (((tickAnim - 43) / 10) * (2.51257-(-6.55003)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -3.97548 + (((tickAnim - 53) / 7) * (-3.97548-(-3.97548)));
            yy = 1.11817 + (((tickAnim - 53) / 7) * (1.11817-(1.11817)));
            zz = 2.51257 + (((tickAnim - 53) / 7) * (2.51257-(2.51257)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -3.97548 + (((tickAnim - 60) / 7) * (-3.97548-(-3.97548)));
            yy = 1.11817 + (((tickAnim - 60) / 7) * (1.11817-(1.11817)));
            zz = 2.51257 + (((tickAnim - 60) / 7) * (2.51257-(2.51257)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -3.97548 + (((tickAnim - 67) / 6) * (-4.52903-(-3.97548)));
            yy = 1.11817 + (((tickAnim - 67) / 6) * (0.43006-(1.11817)));
            zz = 2.51257 + (((tickAnim - 67) / 6) * (0.96637-(2.51257)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -4.52903 + (((tickAnim - 73) / 5) * (0-(-4.52903)));
            yy = 0.43006 + (((tickAnim - 73) / 5) * (0-(0.43006)));
            zz = 0.96637 + (((tickAnim - 73) / 5) * (0-(0.96637)));
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
            zz = 0 + (((tickAnim - 0) / 30) * (0.125-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0.125 + (((tickAnim - 30) / 13) * (0.125-(0.125)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0.125 + (((tickAnim - 43) / 10) * (0-(0.125)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -18.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 15) / 5) * (11.5-(-18.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 11.5 + (((tickAnim - 20) / 3) * (14.25-(11.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 14.25 + (((tickAnim - 23) / 2) * (11.5-(14.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 11.5 + (((tickAnim - 25) / 3) * (14.25-(11.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 14.25 + (((tickAnim - 28) / 2) * (11.5-(14.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 11.5 + (((tickAnim - 30) / 3) * (13.5-(11.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 13.5 + (((tickAnim - 33) / 10) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 13.5 + (((tickAnim - 43) / 3) * (12.00868-(13.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (-0.36516-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (-2.47369-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 12.00868 + (((tickAnim - 46) / 7) * (11.5077-(12.00868)));
            yy = -0.36516 + (((tickAnim - 46) / 7) * (0.19609-(-0.36516)));
            zz = -2.47369 + (((tickAnim - 46) / 7) * (4.49573-(-2.47369)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 11.5077 + (((tickAnim - 53) / 7) * (11.5077-(11.5077)));
            yy = 0.19609 + (((tickAnim - 53) / 7) * (0.19609-(0.19609)));
            zz = 4.49573 + (((tickAnim - 53) / 7) * (4.49573-(4.49573)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 11.5077 + (((tickAnim - 60) / 7) * (11.5077-(11.5077)));
            yy = 0.19609 + (((tickAnim - 60) / 7) * (0.19609-(0.19609)));
            zz = 4.49573 + (((tickAnim - 60) / 7) * (4.49573-(4.49573)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 11.5077 + (((tickAnim - 67) / 11) * (0-(11.5077)));
            yy = 0.19609 + (((tickAnim - 67) / 11) * (0-(0.19609)));
            zz = 4.49573 + (((tickAnim - 67) / 11) * (0-(4.49573)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0.25 + (((tickAnim - 5) / 10) * (-0.6-(0.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -0.6 + (((tickAnim - 15) / 5) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -0.6 + (((tickAnim - 20) / 5) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = -0.6 + (((tickAnim - 25) / 5) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 30 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 30) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 48) * (0-(0)));
            zz = -0.6 + (((tickAnim - 30) / 48) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -19.75 + (((tickAnim - 5) / 10) * (23.5-(-19.75)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 23.5 + (((tickAnim - 15) / 5) * (23.5-(23.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 23.5 + (((tickAnim - 20) / 3) * (18.5-(23.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 18.5 + (((tickAnim - 23) / 2) * (23.5-(18.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 23.5 + (((tickAnim - 25) / 3) * (18.5-(23.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 18.5 + (((tickAnim - 28) / 2) * (23.5-(18.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 23.5 + (((tickAnim - 30) / 3) * (23.5003-(23.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (-2.99412-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-1.26403-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 23.5003 + (((tickAnim - 33) / 13) * (23.5003-(23.5003)));
            yy = -2.99412 + (((tickAnim - 33) / 13) * (-2.99412-(-2.99412)));
            zz = -1.26403 + (((tickAnim - 33) / 13) * (-1.26403-(-1.26403)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 23.5003 + (((tickAnim - 46) / 7) * (19.86552-(23.5003)));
            yy = -2.99412 + (((tickAnim - 46) / 7) * (4.34609-(-2.99412)));
            zz = -1.26403 + (((tickAnim - 46) / 7) * (-1.47307-(-1.26403)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 19.86552 + (((tickAnim - 53) / 7) * (19.86552-(19.86552)));
            yy = 4.34609 + (((tickAnim - 53) / 7) * (4.34609-(4.34609)));
            zz = -1.47307 + (((tickAnim - 53) / 7) * (-1.47307-(-1.47307)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 19.86552 + (((tickAnim - 60) / 2) * (22.11552-(19.86552)));
            yy = 4.34609 + (((tickAnim - 60) / 2) * (4.34609-(4.34609)));
            zz = -1.47307 + (((tickAnim - 60) / 2) * (-1.47307-(-1.47307)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 22.11552 + (((tickAnim - 62) / 1) * (19.86552-(22.11552)));
            yy = 4.34609 + (((tickAnim - 62) / 1) * (4.34609-(4.34609)));
            zz = -1.47307 + (((tickAnim - 62) / 1) * (-1.47307-(-1.47307)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 19.86552 + (((tickAnim - 63) / 2) * (22.11552-(19.86552)));
            yy = 4.34609 + (((tickAnim - 63) / 2) * (4.34609-(4.34609)));
            zz = -1.47307 + (((tickAnim - 63) / 2) * (-1.47307-(-1.47307)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 22.11552 + (((tickAnim - 65) / 2) * (19.86552-(22.11552)));
            yy = 4.34609 + (((tickAnim - 65) / 2) * (4.34609-(4.34609)));
            zz = -1.47307 + (((tickAnim - 65) / 2) * (-1.47307-(-1.47307)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 19.86552 + (((tickAnim - 67) / 6) * (-19.85942-(19.86552)));
            yy = 4.34609 + (((tickAnim - 67) / 6) * (1.67157-(4.34609)));
            zz = -1.47307 + (((tickAnim - 67) / 6) * (-0.56657-(-1.47307)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -19.85942 + (((tickAnim - 73) / 5) * (0-(-19.85942)));
            yy = 1.67157 + (((tickAnim - 73) / 5) * (0-(1.67157)));
            zz = -0.56657 + (((tickAnim - 73) / 5) * (0-(-0.56657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (16.25-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 16.25 + (((tickAnim - 15) / 5) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 16.25 + (((tickAnim - 20) / 3) * (22.75-(16.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 22.75 + (((tickAnim - 23) / 2) * (16.25-(22.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 16.25 + (((tickAnim - 25) / 3) * (22.75-(16.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 22.75 + (((tickAnim - 28) / 2) * (16.25-(22.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 16.25 + (((tickAnim - 30) / 3) * (16.71254-(16.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (-8.45096-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-6.25424-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 16.71254 + (((tickAnim - 33) / 13) * (16.71254-(16.71254)));
            yy = -8.45096 + (((tickAnim - 33) / 13) * (-8.45096-(-8.45096)));
            zz = -6.25424 + (((tickAnim - 33) / 13) * (-6.25424-(-6.25424)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 16.71254 + (((tickAnim - 46) / 3) * (16.81115-(16.71254)));
            yy = -8.45096 + (((tickAnim - 46) / 3) * (36.1778-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-8.45096)));
            zz = -6.25424 + (((tickAnim - 46) / 3) * (38.8469+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-6.25424)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 16.81115 + (((tickAnim - 49) / 4) * (17.13011-(16.81115)));
            yy = 36.1778-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 49) / 4) * (3.09596-(36.1778-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 38.8469+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 49) / 4) * (6.7012-(38.8469+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 17.13011 + (((tickAnim - 53) / 7) * (17.13011-(17.13011)));
            yy = 3.09596 + (((tickAnim - 53) / 7) * (3.09596-(3.09596)));
            zz = 6.7012 + (((tickAnim - 53) / 7) * (6.7012-(6.7012)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 17.13011 + (((tickAnim - 60) / 2) * (14.63011-(17.13011)));
            yy = 3.09596 + (((tickAnim - 60) / 2) * (3.09596-(3.09596)));
            zz = 6.7012 + (((tickAnim - 60) / 2) * (6.7012-(6.7012)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 14.63011 + (((tickAnim - 62) / 1) * (17.13011-(14.63011)));
            yy = 3.09596 + (((tickAnim - 62) / 1) * (3.09596-(3.09596)));
            zz = 6.7012 + (((tickAnim - 62) / 1) * (6.7012-(6.7012)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 17.13011 + (((tickAnim - 63) / 2) * (14.63011-(17.13011)));
            yy = 3.09596 + (((tickAnim - 63) / 2) * (3.09596-(3.09596)));
            zz = 6.7012 + (((tickAnim - 63) / 2) * (6.7012-(6.7012)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 14.63011 + (((tickAnim - 65) / 2) * (17.13011-(14.63011)));
            yy = 3.09596 + (((tickAnim - 65) / 2) * (3.09596-(3.09596)));
            zz = 6.7012 + (((tickAnim - 65) / 2) * (6.7012-(6.7012)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 17.13011 + (((tickAnim - 67) / 11) * (0-(17.13011)));
            yy = 3.09596 + (((tickAnim - 67) / 11) * (0-(3.09596)));
            zz = 6.7012 + (((tickAnim - 67) / 11) * (0-(6.7012)));
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
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 15) / 5) * (-0.15-(-0.15)));
            zz = 0.25 + (((tickAnim - 15) / 5) * (0.25-(0.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 20) / 5) * (-0.15-(-0.15)));
            zz = 0.25 + (((tickAnim - 20) / 5) * (0.25-(0.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 25) / 5) * (-0.15-(-0.15)));
            zz = 0.25 + (((tickAnim - 25) / 5) * (0.25-(0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 30) / 48) * (0-(0)));
            yy = -0.15 + (((tickAnim - 30) / 48) * (0-(-0.15)));
            zz = 0.25 + (((tickAnim - 30) / 48) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (3.75-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 3.75 + (((tickAnim - 28) / 2) * (0-(3.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -34.75 + (((tickAnim - 5) / 4) * (-31-(-34.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -31 + (((tickAnim - 9) / 6) * (41.75-(-31)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 41.75 + (((tickAnim - 15) / 52) * (41.75-(41.75)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 41.75 + (((tickAnim - 67) / 6) * (-58.94-(41.75)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -58.94 + (((tickAnim - 73) / 5) * (0-(-58.94)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -43.75 + (((tickAnim - 5) / 4) * (36-(-43.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 36 + (((tickAnim - 9) / 6) * (-14-(36)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = -14 + (((tickAnim - 15) / 52) * (-14-(-14)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -14 + (((tickAnim - 67) / 6) * (30.37-(-14)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 30.37 + (((tickAnim - 73) / 5) * (0-(30.37)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-9-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -9 + (((tickAnim - 9) / 6) * (47.25-(-9)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 47.25 + (((tickAnim - 15) / 52) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 47.25 + (((tickAnim - 67) / 6) * (-14.08-(47.25)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -14.08 + (((tickAnim - 73) / 5) * (0-(-14.08)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0.41-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.41 + (((tickAnim - 9) / 6) * (-0.275-(0.41)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 52) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            yy = -0.275 + (((tickAnim - 67) / 6) * (-0.785-(-0.275)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            yy = -0.785 + (((tickAnim - 73) / 5) * (0-(-0.785)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (48.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 48.25 + (((tickAnim - 5) / 2) * (33.42-(48.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 33.42 + (((tickAnim - 7) / 8) * (105.5-(33.42)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 105.5 + (((tickAnim - 15) / 52) * (105.5-(105.5)));
            yy = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 52) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 105.5 + (((tickAnim - 67) / 6) * (24.83-(105.5)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 24.83 + (((tickAnim - 73) / 5) * (0-(24.83)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg4, frontRightLeg4.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg4.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.535-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.535 + (((tickAnim - 7) / 8) * (-0.525-(0.535)));
            zz = -0.1 + (((tickAnim - 7) / 8) * (-0.575-(-0.1)));
        }
        else if (tickAnim >= 15 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 15) / 52) * (0-(0)));
            yy = -0.525 + (((tickAnim - 15) / 52) * (-0.525-(-0.525)));
            zz = -0.575 + (((tickAnim - 15) / 52) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            yy = -0.525 + (((tickAnim - 67) / 11) * (0-(-0.525)));
            zz = -0.575 + (((tickAnim - 67) / 11) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg4.rotationPointX = this.frontRightLeg4.rotationPointX + (float)(xx);
        this.frontRightLeg4.rotationPointY = this.frontRightLeg4.rotationPointY - (float)(yy);
        this.frontRightLeg4.rotationPointZ = this.frontRightLeg4.rotationPointZ + (float)(zz);


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAsilisaurus entity = (EntityPrehistoricFloraAsilisaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -47.25 + (((tickAnim - 0) / 5) * (31-(-47.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 5) / 5) * (-47.25-(31)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.75 + (((tickAnim - 0) / 5) * (14.5-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 14.5 + (((tickAnim - 5) / 2) * (36.17-(14.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 36.17 + (((tickAnim - 7) / 3) * (-3.75-(36.17)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.425-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 2) * (0-(0.3)));
            zz = -0.425 + (((tickAnim - 8) / 2) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -6.25 + (((tickAnim - 0) / 1) * (-17.33-(-6.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -17.33 + (((tickAnim - 1) / 1) * (-2.014-(-17.33)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-1 + (((tickAnim - 1) / 1) * (-0.27362-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4 + (((tickAnim - 1) / 1) * (1.09446-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -2.014 + (((tickAnim - 2) / 3) * (-23.25-(-2.014)));
            yy = -0.27362 + (((tickAnim - 2) / 3) * (0-(-0.27362)));
            zz = 1.09446 + (((tickAnim - 2) / 3) * (0-(1.09446)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -23.25 + (((tickAnim - 5) / 3) * (-97.33-(-23.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -97.33 + (((tickAnim - 8) / 2) * (-6.25-(-97.33)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 8) / 2) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 59.41616 + (((tickAnim - 0) / 1) * (60.03308-(59.41616)));
            yy = 2.62734 + (((tickAnim - 0) / 1) * (1.31367-(2.62734)));
            zz = -3.65465 + (((tickAnim - 0) / 1) * (-1.82732-(-3.65465)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 60.03308 + (((tickAnim - 1) / 1) * (31.15-(60.03308)));
            yy = 1.31367 + (((tickAnim - 1) / 1) * (0-(1.31367)));
            zz = -1.82732 + (((tickAnim - 1) / 1) * (0-(-1.82732)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 31.15 + (((tickAnim - 2) / 1) * (53.99-(31.15)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 53.99 + (((tickAnim - 3) / 2) * (140.5-(53.99)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 140.5 + (((tickAnim - 5) / 2) * (172.25-(140.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 172.25 + (((tickAnim - 7) / 1) * (172.25-(172.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 172.25 + (((tickAnim - 8) / 2) * (59.41616-(172.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (2.62734-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-3.65465-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.865-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.02-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.865 + (((tickAnim - 3) / 2) * (0-(0.865)));
            zz = 0.02 + (((tickAnim - 3) / 2) * (0-(0.02)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.97-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.445-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.97 + (((tickAnim - 7) / 1) * (-0.97-(-0.97)));
            zz = 0.445 + (((tickAnim - 7) / 1) * (0.445-(0.445)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.97 + (((tickAnim - 8) / 2) * (0-(-0.97)));
            zz = 0.445 + (((tickAnim - 8) / 2) * (0-(0.445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 31 + (((tickAnim - 0) / 5) * (-47.25-(31)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -47.25 + (((tickAnim - 5) / 5) * (31-(-47.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 14.5 + (((tickAnim - 0) / 2) * (36.17-(14.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 36.17 + (((tickAnim - 2) / 3) * (-3.75-(36.17)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.75 + (((tickAnim - 5) / 5) * (14.5-(-3.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 3) * (0.3-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 2) * (0-(0.3)));
            zz = -0.425 + (((tickAnim - 3) / 2) * (0-(-0.425)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
            xx = -23.25 + (((tickAnim - 0) / 3) * (-97.33-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -97.33 + (((tickAnim - 3) / 2) * (-6.25-(-97.33)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -6.25 + (((tickAnim - 5) / 1) * (-17.33-(-6.25)));
            yy = 0 + (((tickAnim - 5) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-1-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -17.33 + (((tickAnim - 6) / 1) * (-2.014-(-17.33)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-1 + (((tickAnim - 6) / 1) * (-0.27362-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4 + (((tickAnim - 6) / 1) * (1.09446-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -2.014 + (((tickAnim - 7) / 3) * (-23.25-(-2.014)));
            yy = -0.27362 + (((tickAnim - 7) / 3) * (0-(-0.27362)));
            zz = 1.09446 + (((tickAnim - 7) / 3) * (0-(1.09446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 3) / 2) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 140.5 + (((tickAnim - 0) / 2) * (172.25-(140.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 172.25 + (((tickAnim - 2) / 1) * (172.25-(172.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 172.25 + (((tickAnim - 3) / 2) * (59.41616-(172.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (-2.62734-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (3.65465-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 59.41616 + (((tickAnim - 5) / 1) * (60.03308-(59.41616)));
            yy = -2.62734 + (((tickAnim - 5) / 1) * (-1.31367-(-2.62734)));
            zz = 3.65465 + (((tickAnim - 5) / 1) * (1.82732-(3.65465)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 60.03308 + (((tickAnim - 6) / 1) * (31.15-(60.03308)));
            yy = -1.31367 + (((tickAnim - 6) / 1) * (0-(-1.31367)));
            zz = 1.82732 + (((tickAnim - 6) / 1) * (0-(1.82732)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 31.15 + (((tickAnim - 7) / 1) * (53.99-(31.15)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 53.99 + (((tickAnim - 8) / 2) * (140.5-(53.99)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.97-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.445-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.97 + (((tickAnim - 2) / 1) * (-0.97-(-0.97)));
            zz = 0.445 + (((tickAnim - 2) / 1) * (0.445-(0.445)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.97 + (((tickAnim - 3) / 2) * (0-(-0.97)));
            zz = 0.445 + (((tickAnim - 3) / 2) * (0-(0.445)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.865-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.02-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.865 + (((tickAnim - 8) / 2) * (0-(0.865)));
            zz = 0.02 + (((tickAnim - 8) / 2) * (0-(0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-9.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-80))*6), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-6));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-80))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-20))*-1);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(4.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*4), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-3), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*7), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*12), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-220))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*17), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-220))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*-4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(6-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-120))*-7), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-110))*7));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*6), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5));


        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(13.3591786726-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*6), frontLeftLeg.rotateAngleY + (float) Math.toRadians(3.4866772539-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*1), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(3.5859396164+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-1));


        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(-38.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-210))*8), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(14.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*12), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(148.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*15), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.frontLeftLeg4.rotationPointX = this.frontLeftLeg4.rotationPointX + (float)(0);
        this.frontLeftLeg4.rotationPointY = this.frontLeftLeg4.rotationPointY - (float)(-0.325);
        this.frontLeftLeg4.rotationPointZ = this.frontLeftLeg4.rotationPointZ + (float)(-0.65);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(9-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*6), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*4), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(7.7157-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*9), neck2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-3.9693), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-4.7155));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.25);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-12.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*7), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(2-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*-9), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(13.3591786726-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*6), frontRightLeg.rotateAngleY + (float) Math.toRadians(-3.4866772539-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-1), frontRightLeg.rotateAngleZ + (float) Math.toRadians(-3.5859396164+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-1));


        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(-38.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-210))*8), frontRightLeg2.rotateAngleY + (float) Math.toRadians(0), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(14.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*12), frontRightLeg3.rotateAngleY + (float) Math.toRadians(0), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontRightLeg4, frontRightLeg4.rotateAngleX + (float) Math.toRadians(148.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*15), frontRightLeg4.rotateAngleY + (float) Math.toRadians(0), frontRightLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.frontRightLeg4.rotationPointX = this.frontRightLeg4.rotationPointX + (float)(0);
        this.frontRightLeg4.rotationPointY = this.frontRightLeg4.rotationPointY - (float)(-0.325);
        this.frontRightLeg4.rotationPointZ = this.frontRightLeg4.rotationPointZ + (float)(-0.65);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraAsilisaurus entity = (EntityPrehistoricFloraAsilisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 8) * (17.25-(-21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 17.25 + (((tickAnim - 8) / 6) * (63.29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(17.25)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 63.29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 14) / 3) * (-42.25-(63.29-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -42.25 + (((tickAnim - 17) / 3) * (-21-(-42.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 0) / 8) * (0-(5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (32.3-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 32.3 + (((tickAnim - 12) / 2) * (36.11-(32.3)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 36.11 + (((tickAnim - 14) / 3) * (-0.25-(36.11)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 17) / 3) * (5-(-0.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -5.58 + (((tickAnim - 0) / 8) * (0-(-5.58)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (-86.82-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -86.82 + (((tickAnim - 14) / 3) * (-10.25-(-86.82)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -10.25 + (((tickAnim - 17) / 3) * (-5.58-(-10.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.26-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.4-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.26 + (((tickAnim - 12) / 2) * (-0.475-(-0.26)));
            zz = 0.4 + (((tickAnim - 12) / 2) * (0-(0.4)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.475 + (((tickAnim - 14) / 3) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20.75 + (((tickAnim - 0) / 4) * (33.35-(20.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 33.35 + (((tickAnim - 4) / 2) * (33.42-(33.35)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 33.42 + (((tickAnim - 6) / 2) * (68.5-(33.42)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 68.5 + (((tickAnim - 8) / 2) * (132.08-(68.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 132.08 + (((tickAnim - 10) / 2) * (133.7-(132.08)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 133.7 + (((tickAnim - 12) / 2) * (143.89-(133.7)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 143.89 + (((tickAnim - 14) / 3) * (51.25-(143.89)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 51.25 + (((tickAnim - 17) / 1) * (34.75-(51.25)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 34.75 + (((tickAnim - 18) / 2) * (20.75-(34.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 4) * (0.475-(0.85)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 4) / 4) * (0-(0.475)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0.075-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0.075 + (((tickAnim - 14) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0.83-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0.83 + (((tickAnim - 18) / 0) * (1.18-(0.83)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.18 + (((tickAnim - 18) / 2) * (0.85-(1.18)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18 + (((tickAnim - 0) / 5) * (4.385-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(18)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.385-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 5) / 3) * (-70.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(4.385-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -70.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 8) / 12) * (18-(-70.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (32.3-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 32.3 + (((tickAnim - 3) / 1) * (36.11-(32.3)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 36.11 + (((tickAnim - 4) / 4) * (-6.75-(36.11)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 8) / 12) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-86.82-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -86.82 + (((tickAnim - 5) / 3) * (-2.5-(-86.82)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 8) / 12) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.26-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.4-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.26 + (((tickAnim - 3) / 2) * (-0.475-(-0.26)));
            zz = 0.4 + (((tickAnim - 3) / 2) * (0-(0.4)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.475 + (((tickAnim - 5) / 3) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 68.5 + (((tickAnim - 0) / 2) * (114.955-(68.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 114.955 + (((tickAnim - 2) / 1) * (136.45-(114.955)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 136.45 + (((tickAnim - 3) / 2) * (143.89-(136.45)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 143.89 + (((tickAnim - 5) / 3) * (51.25-(143.89)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 51.25 + (((tickAnim - 8) / 4) * (22.76-(51.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 22.76 + (((tickAnim - 12) / 2) * (33.67-(22.76)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 33.67 + (((tickAnim - 14) / 2) * (33.35-(33.67)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 33.35 + (((tickAnim - 16) / 2) * (33.42-(33.35)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 33.42 + (((tickAnim - 18) / 2) * (68.5-(33.42)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.075-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.375-(0)));
            zz = 0.075 + (((tickAnim - 5) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 1) * (-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*8-(0.375)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = -6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*8 + (((tickAnim - 9) / 7) * (0.25-(-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*8)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 16) / 4) * (0-(0.25)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*3), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-10))*-0.8);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*3), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*3), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*9), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*10), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-6), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*5), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*6), body2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -55.5 + (((tickAnim - 0) / 3) * (-64.4678-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-55.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.08237-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.19447-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -64.4678-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 3) / 10) * (20-(-64.4678-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = -0.08237 + (((tickAnim - 3) / 10) * (0-(-0.08237)));
            zz = 0.19447 + (((tickAnim - 3) / 10) * (0-(0.19447)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 13) / 7) * (-55.5-(20)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 0) / 3) * (23.06-(-15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 23.06 + (((tickAnim - 3) / 2) * (4.37-(23.06)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.37 + (((tickAnim - 5) / 3) * (12.98-(4.37)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.98 + (((tickAnim - 8) / 5) * (29-(12.98)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 29 + (((tickAnim - 13) / 2) * (31.9-(29)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 31.9 + (((tickAnim - 15) / 5) * (-15-(31.9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.55 + (((tickAnim - 3) / 4) * (0.545-(-0.55)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.545 + (((tickAnim - 7) / 6) * (0-(0.545)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (1.05-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.05 + (((tickAnim - 18) / 2) * (0-(1.05)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            xx = 11.75 + (((tickAnim - 0) / 3) * (11.5-(11.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 11.5 + (((tickAnim - 3) / 5) * (12.04-(11.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.04 + (((tickAnim - 8) / 5) * (14-(12.04)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 14 + (((tickAnim - 13) / 3) * (42.44-(14)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 42.44 + (((tickAnim - 16) / 2) * (11.75-(42.44)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 11.75 + (((tickAnim - 18) / 2) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 5) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (-0.04-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.04 + (((tickAnim - 8) / 5) * (-0.575-(-0.04)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.575 + (((tickAnim - 13) / 3) * (0.055-(-0.575)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.055 + (((tickAnim - 16) / 2) * (0-(0.055)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            xx = 126 + (((tickAnim - 0) / 3) * (11.75-(126)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11.75 + (((tickAnim - 3) / 2) * (7.79276-(11.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.40152-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.15826-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7.79276 + (((tickAnim - 5) / 2) * (-16.41448-(7.79276)));
            yy = -0.40152 + (((tickAnim - 5) / 2) * (-0.80304-(-0.40152)));
            zz = 0.15826 + (((tickAnim - 5) / 2) * (0.31651-(0.15826)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -16.41448 + (((tickAnim - 7) / 7) * (132.70581-(-16.41448)));
            yy = -0.80304 + (((tickAnim - 7) / 7) * (0.93368-(-0.80304)));
            zz = 0.31651 + (((tickAnim - 7) / 7) * (2.32561-(0.31651)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 132.70581 + (((tickAnim - 14) / 2) * (152.37-(132.70581)));
            yy = 0.93368 + (((tickAnim - 14) / 2) * (0-(0.93368)));
            zz = 2.32561 + (((tickAnim - 14) / 2) * (0-(2.32561)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 152.37 + (((tickAnim - 16) / 2) * (161.75-(152.37)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 161.75 + (((tickAnim - 18) / 2) * (126-(161.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 3) * (-0.275-(-0.5)));
            zz = -0.8 + (((tickAnim - 0) / 3) * (0-(-0.8)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 2) * (-0.1-(-0.275)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 5) / 2) * (-0.125-(-0.1)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.125 + (((tickAnim - 7) / 1) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (-0.47-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (-0.7-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.47 + (((tickAnim - 14) / 2) * (-0.325-(-0.47)));
            zz = -0.7 + (((tickAnim - 14) / 2) * (-0.695-(-0.7)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 16) / 2) * (-0.5-(-0.325)));
            zz = -0.695 + (((tickAnim - 16) / 2) * (-0.8-(-0.695)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 18) / 2) * (-0.5-(-0.5)));
            zz = -0.8 + (((tickAnim - 18) / 2) * (-0.8-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg4.rotationPointX = this.frontLeftLeg4.rotationPointX + (float)(xx);
        this.frontLeftLeg4.rotationPointY = this.frontLeftLeg4.rotationPointY - (float)(yy);
        this.frontLeftLeg4.rotationPointZ = this.frontLeftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*5), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-3), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-5), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-5), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.225);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.65 + (((tickAnim - 0) / 4) * (20-(-1.65)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 4) / 6) * (-33-(20)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -33 + (((tickAnim - 10) / 4) * (-112.2452-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(-33)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.26868-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0.58453-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -112.2452-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 14) / 6) * (-1.65-(-112.2452-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = -0.26868 + (((tickAnim - 14) / 6) * (0-(-0.26868)));
            zz = 0.58453 + (((tickAnim - 14) / 6) * (0-(0.58453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 12.98 + (((tickAnim - 0) / 4) * (18.5-(12.98)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 18.5 + (((tickAnim - 4) / 6) * (-41.5-(18.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -41.5 + (((tickAnim - 10) / 4) * (40.05-(-41.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 40.05 + (((tickAnim - 14) / 3) * (15.23-(40.05)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 15.23 + (((tickAnim - 17) / 3) * (12.98-(15.23)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0.975-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0.625-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 17) / 3) * (0-(0.975)));
            zz = 0.625 + (((tickAnim - 17) / 3) * (0-(0.625)));
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
            xx = 12.04 + (((tickAnim - 0) / 4) * (14-(12.04)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 14 + (((tickAnim - 4) / 3) * (58.94-(14)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 58.94 + (((tickAnim - 7) / 3) * (11.75-(58.94)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 11.75 + (((tickAnim - 10) / 4) * (9.59-(11.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 9.59 + (((tickAnim - 14) / 6) * (12.04-(9.59)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.04-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.04 + (((tickAnim - 2) / 2) * (-0.575-(-0.04)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = -0.575 + (((tickAnim - 4) / 6) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.275 + (((tickAnim - 14) / 6) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 48.83552 + (((tickAnim - 0) / 4) * (114.86324-(48.83552)));
            yy = -0.80304 + (((tickAnim - 0) / 4) * (0.4995-(-0.80304)));
            zz = 0.31651 + (((tickAnim - 0) / 4) * (1.82334-(0.31651)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 114.86324 + (((tickAnim - 4) / 3) * (142.70581-(114.86324)));
            yy = 0.4995 + (((tickAnim - 4) / 3) * (0.93368-(0.4995)));
            zz = 1.82334 + (((tickAnim - 4) / 3) * (2.32561-(1.82334)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 142.70581 + (((tickAnim - 7) / 3) * (129-(142.70581)));
            yy = 0.93368 + (((tickAnim - 7) / 3) * (0-(0.93368)));
            zz = 2.32561 + (((tickAnim - 7) / 3) * (0-(2.32561)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 129 + (((tickAnim - 10) / 4) * (6.80647-(129)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.3346-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0.13188-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 6.80647 + (((tickAnim - 14) / 3) * (-0.82394-(6.80647)));
            yy = -0.3346 + (((tickAnim - 14) / 3) * (-0.53536-(-0.3346)));
            zz = 0.13188 + (((tickAnim - 14) / 3) * (0.21101-(0.13188)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -0.82394 + (((tickAnim - 17) / 3) * (48.83552-(-0.82394)));
            yy = -0.53536 + (((tickAnim - 17) / 3) * (-0.80304-(-0.53536)));
            zz = 0.21101 + (((tickAnim - 17) / 3) * (0.31651-(0.21101)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg4, frontRightLeg4.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg4.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 2) * (0-(0.675)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (-0.31-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (-0.72-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.31 + (((tickAnim - 4) / 3) * (-0.47-(-0.31)));
            zz = -0.72 + (((tickAnim - 4) / 3) * (-0.7-(-0.72)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.47 + (((tickAnim - 7) / 3) * (-0.375-(-0.47)));
            zz = -0.7 + (((tickAnim - 7) / 3) * (-0.725-(-0.7)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 10) / 2) * (-0.47-(-0.375)));
            zz = -0.725 + (((tickAnim - 10) / 2) * (-0.615-(-0.725)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.47 + (((tickAnim - 12) / 2) * (-0.59-(-0.47)));
            zz = -0.615 + (((tickAnim - 12) / 2) * (0.105-(-0.615)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.59 + (((tickAnim - 14) / 3) * (-0.225-(-0.59)));
            zz = 0.105 + (((tickAnim - 14) / 3) * (0-(0.105)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 17) / 3) * (0.675-(-0.225)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg4.rotationPointX = this.frontRightLeg4.rotationPointX + (float)(xx);
        this.frontRightLeg4.rotationPointY = this.frontRightLeg4.rotationPointY - (float)(yy);
        this.frontRightLeg4.rotationPointZ = this.frontRightLeg4.rotationPointZ + (float)(zz);



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAsilisaurus e = (EntityPrehistoricFloraAsilisaurus) entity;
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
