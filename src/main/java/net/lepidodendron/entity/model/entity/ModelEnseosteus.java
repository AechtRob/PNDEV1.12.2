package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEnseosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backLeftFin2;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r30;


    private ModelAnimator animator;

    public ModelEnseosteus() {
        this.textureWidth = 58;
        this.textureHeight = 58;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 21, 0, -2.5F, -6.0F, -2.0F, 5, 6, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.1336F, -3.0863F, -8.4352F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 2.0327F, -0.2471F, 0.1003F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 31, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6941F, -3.2352F, -7.9631F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0728F, -0.2471F, 0.1003F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 51, -0.5F, -0.5F, -0.375F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.1336F, -3.0863F, -8.4352F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 2.0327F, 0.2471F, -0.1003F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 31, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.6941F, -3.2352F, -7.9631F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.0728F, 0.2471F, -0.1003F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 51, -0.5F, -0.5F, -0.375F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.4563F, -1.5693F, -6.2242F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5259F, -0.0918F, 0.2137F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 7, 0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0393F, -2.5689F, -7.934F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.0311F, -0.0829F, 0.2534F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 46, 0.0F, 0.0F, 0.0F, 1, 2, 2, -0.003F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0393F, -2.5689F, -7.934F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.202F, -0.0829F, 0.2534F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 50, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0393F, -2.5689F, -7.934F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.202F, 0.0829F, -0.2534F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 50, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.7535F, -1.4962F, -3.2399F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0611F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 39, 0.0F, -3.95F, 0.0F, 2, 5, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.7535F, -1.4962F, -3.2399F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0611F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 39, -2.0F, -3.95F, 0.0F, 2, 5, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.4563F, -1.5693F, -6.2242F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.5259F, 0.0918F, -0.2137F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 7, -1.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0393F, -2.5689F, -7.934F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.0311F, 0.0829F, -0.2534F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 46, -1.0F, 0.0F, 0.0F, 1, 2, 2, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -5.0099F, -7.7976F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 49, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -3.0073F, -7.4647F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6109F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 46, -1.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -5.8257F, -3.9924F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 0, -1.0F, -0.025F, -3.9F, 2, 2, 4, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -5.8799F, -3.9469F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 24, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1484F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 31, -1.0F, -2.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.7F, -0.9F, -2.7F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0154F, -0.1739F, 0.6532F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.frontLeftFin.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 15, -0.5F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.7F, -0.9F, -2.7F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0154F, 0.1739F, -0.6532F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.frontRightFin.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 15, -3.5F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.6357F, -5.8329F);
        this.main.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.0453F, -1.1789F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5831F, -0.2201F, 0.143F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 50, -1.0F, -0.625F, -1.225F, 0, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.0453F, -1.1789F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.5831F, 0.2201F, -0.143F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 37, 50, 1.0F, -0.625F, -1.225F, 0, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 1.0871F, -0.0518F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4363F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 19, -2.0F, -1.05F, -3.0F, 3, 1, 3, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.5054F, -3.7087F, -6.8055F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.1963F, -0.3054F);
        this.eye.cubeList.add(new ModelBox(eye, 11, 49, -0.5125F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 5, 51, -0.4875F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.5054F, -3.7087F, -6.8055F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.1963F, 0.3054F);
        this.eye2.cubeList.add(new ModelBox(eye2, 11, 49, -0.4875F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 5, 51, -0.5125F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.2555F, 1.555F);
        this.main.addChild(tail);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 3.2555F, 0.445F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 21, -1.5F, -2.05F, -0.35F, 3, 2, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, -2.7445F, 0.445F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.0036F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 39, -1.5F, 0.0F, -0.25F, 0, 4, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -2.7445F, 0.445F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0742F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 20, -1.5F, 0.025F, -0.25F, 4, 4, 6, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.9183F, 2.7327F, 2.835F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0718F, -0.3864F, 0.5532F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 26, 48, 0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.backLeftFin2 = new AdvancedModelRenderer(this);
        this.backLeftFin2.setRotationPoint(-0.9183F, 2.7327F, 2.835F);
        this.tail.addChild(backLeftFin2);
        this.setRotateAngle(backLeftFin2, 0.0718F, 0.3864F, -0.5532F);
        this.backLeftFin2.cubeList.add(new ModelBox(backLeftFin2, 26, 48, -3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, true));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9183F, 1.9827F, 2.835F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0361F, 0.3911F, -0.8362F);


        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.6823F, 5.3469F);
        this.tail.addChild(tail2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 3.5151F, -0.0703F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 38, 30, -0.5F, -2.05F, 0.175F, 2, 2, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, -1.6046F, 0.3282F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 21, 30, -0.5F, 0.0F, 0.0F, 3, 3, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.3625F, 0.5465F, 4.8662F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 46, 0.5875F, 0.0406F, 0.4098F, 1, 0, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 46, -2.3125F, 0.0406F, 0.4098F, 1, 0, 4, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.3625F, 2.1525F, -0.3079F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1614F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 38, 38, -0.5F, -2.075F, 0.175F, 1, 2, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.8625F, -1.3697F, -0.1064F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 38, -0.5F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.3625F, 0.1535F, 4.3338F);
        this.tail3.addChild(tail4);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, -1.131F, 0.0427F);
        this.tail4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.6545F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, 0.5F, 0.0F, -1.3F, 0, 9, 10, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 21, 11, 0.0F, 0.0F, -0.3F, 1, 1, 8, 0.0F, false));



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
        this.main.offsetX = 0.5F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
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
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.12F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetX = -0.06F;
        this.main.offsetZ = 0.03F;
        this.main.offsetY = -0.5F;
        this.main.render(0.01F);
        resetToDefaultPose();
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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.2F * still);
            this.chainSwing(fishTail, speed * still, 0.2F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

