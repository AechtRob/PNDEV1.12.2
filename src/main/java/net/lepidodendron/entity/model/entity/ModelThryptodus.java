package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraThryptodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelThryptodus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r31;

    private ModelAnimator animator;

    public ModelThryptodus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 21, -2.5F, -9.0F, -7.7F, 5, 6, 11, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 39, -3.0F, -9.5F, -13.7F, 6, 7, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, 0.0F, -15.2942F, -11.7735F, 0, 5, 15, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 33, 16, -2.0F, -10.4728F, -7.8084F, 4, 3, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0956F, -6.125F, -12.8904F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2225F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 63, 60, -0.15F, -2.5F, -7.0F, 2, 4, 7, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.8F, -7.8348F, -19.0049F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1564F, -0.2156F, -0.0337F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 44, -1.45F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 83, -1.35F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1392F, -8.406F, -22.498F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5155F, 0.1922F, -0.0278F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 21, 0.2F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 21, 0.2F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.2611F, -8.4424F, -21.6386F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.044F, 0.1308F, 0.0057F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 58, 44, -0.8F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 58, 44, -0.8F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.8F, -7.8348F, -19.0049F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1564F, 0.2156F, 0.0337F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 83, -0.65F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 44, -0.55F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -8.9475F, -21.2466F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6196F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 82, 65, -1.5F, -0.6F, 0.3F, 3, 2, 3, 0.005F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.1392F, -8.406F, -22.498F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5155F, -0.1922F, 0.0278F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 83, 21, -1.2F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.2611F, -8.4424F, -21.6386F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.044F, -0.1308F, -0.0057F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 44, -0.2F, 0.0F, -2.0F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -7.3612F, -22.976F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 83, -0.5F, -1.0F, -0.6F, 2, 1, 3, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -9.6513F, -22.1068F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1571F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 54, -0.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -9.6418F, -22.1295F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7156F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 83, -1.0F, 0.0043F, -1.9757F, 2, 2, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -10.2297F, -14.1449F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0218F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 79, -0.5F, 0.0F, -5.0F, 3, 3, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -10.5152F, -8.2586F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0393F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 53, -3.5F, 0.06F, -6.5519F, 4, 3, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, -0.7184F, -2.2981F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1004F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 60, -0.5F, -3.0F, 0.025F, 4, 3, 6, -0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -1.8158F, -14.1965F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3534F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 65, 44, -0.5F, -3.0F, -6.025F, 3, 3, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.8256F, -14.2709F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0916F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 0, -2.5F, -3.0F, 0.05F, 5, 3, 12, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(3.0956F, -6.125F, -12.8904F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.2225F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 63, 60, -1.85F, -2.5F, -7.0F, 2, 4, 7, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.9523F, -5.3025F, -13.1358F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0916F, 0.3054F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 33, 31, 0.0F, -3.0F, 0.0F, 0, 3, 12, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.9523F, -5.3025F, -13.1358F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0916F, -0.3054F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 33, 31, 0.0F, -3.0F, 0.0F, 0, 3, 12, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.8F, -1.9274F, 1.2219F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.3272F, 0.1396F, -0.2793F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 64, 0.41F, -1.0674F, 0.5027F, 0, 2, 9, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.8F, -1.9274F, 1.2219F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.3272F, -0.1396F, 0.2793F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 64, -0.41F, -1.0674F, 0.5027F, 0, 2, 9, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.375F, -18.2F);
        this.main.addChild(jaw);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.5F, -5.55F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4538F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 66, 10, -1.0F, -2.0F, 2.0F, 3, 2, 3, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.3767F, -3.7524F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.7767F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 83, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.5262F, -1.7171F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0698F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 79, 36, -1.0F, -0.025F, -2.775F, 2, 1, 5, -0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0049F, -9.957F, 2.8265F);
        this.main.addChild(tail);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0049F, -0.068F, -0.3765F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0567F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 31, -2.0F, 1.0F, 0.0F, 4, 6, 6, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0049F, -4.2122F, -0.05F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0654F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 82, 54, -0.005F, -0.075F, 0.05F, 0, 4, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.9951F, 8.8628F, -0.275F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.24F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 66, -0.5F, -3.025F, 0.975F, 3, 3, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.9951F, -0.4764F, -0.2572F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0305F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 70, -0.5F, 0.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.0243F, 2.0101F, 5.6484F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 64, 16, -1.4708F, -1.2031F, -0.3749F, 3, 4, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.4708F, 7.4277F, -5.7483F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3403F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 74, 72, -0.5F, -4.025F, 6.425F, 2, 4, 6, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.4708F, -2.2801F, -0.435F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0567F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 57, 72, -0.5F, 0.0F, 0.2F, 2, 4, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0292F, -5.8473F, -0.0733F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1047F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 83, 10, 0.0F, -0.075F, 0.05F, 0, 4, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0958F, -0.0982F, 5.3439F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 66, 0, -0.875F, -1.0799F, -0.3438F, 2, 2, 7, 0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.125F, -1.6351F, 0.0934F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0654F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 79, 27, -0.5F, -0.0679F, -0.3788F, 1, 1, 7, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.875F, 3.4536F, -0.0498F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3447F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 76, 1.5F, -3.075F, 0.025F, 1, 3, 7, -0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.125F, -5.0741F, 0.5327F);
        this.tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1047F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 17, 76, -0.005F, -0.075F, 0.05F, 0, 4, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.125F, -0.4549F, 6.0062F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 25, 39, -0.5F, -0.625F, 0.0F, 1, 2, 2, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 25, 47, 0.0F, -4.625F, 1.0F, 0, 10, 8, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-0.2351F, 7.875F, 3.525F);
        this.tail.addChild(bone);
        this.setRotateAngle(bone, -0.0436F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.51F, 1.3F, 4.975F);
        this.bone.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0524F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 42, 47, 0.99F, -2.0F, -5.0F, 0, 1, 11, 0.0F, false));

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
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(242);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.2F;
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
        ((EntityPrehistoricFloraThryptodus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.223F;
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
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.05F, true, 0, 0, f2, 0.5F);
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
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            //this.head.offsetY = -0.1F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

