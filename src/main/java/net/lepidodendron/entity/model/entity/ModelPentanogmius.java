package net.lepidodendron.entity.model.entity;

import com.sun.javafx.runtime.async.AbstractRemoteResource;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBananogmius;
import net.lepidodendron.entity.EntityPrehistoricFloraPentanogmius;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPentanogmius extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelPentanogmius() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 28, -3.0F, -12.0F, -7.7F, 6, 10, 11, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 31, 0, -3.0F, -11.0F, -13.7F, 6, 8, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, 0.0F, -23.4942F, -11.7735F, 0, 12, 15, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 31, 15, -2.5F, -13.0728F, -7.3834F, 5, 2, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -13.0728F, 0.6166F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 20, -1.5F, 0.0F, 0.0F, 5, 2, 3, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.3F, -8.8598F, -18.4549F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1564F, -0.2156F, -0.0337F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 83, 86, -0.95F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.25F, -8.8598F, -18.4549F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1564F, -0.2156F, -0.0337F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 20, -1.05F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.3F, -8.8598F, -18.4549F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1564F, 0.2156F, 0.0337F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 83, 86, -1.05F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.25F, -8.8598F, -18.4549F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1564F, 0.2156F, 0.0337F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 88, 20, -0.95F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -8.7225F, -21.2466F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4145F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 79, 56, -1.5F, -1.0F, 0.0F, 3, 2, 4, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.7696F, -8.7231F, -21.2582F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4826F, -0.1695F, 0.0147F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 82, -1.0F, 0.0F, 0.05F, 1, 1, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.7611F, -8.7174F, -21.3636F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.044F, -0.1308F, -0.0057F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 87, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.7696F, -8.7231F, -21.2582F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4826F, 0.1695F, -0.0147F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 45, 82, 0.0F, 0.0F, 0.05F, 1, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.7611F, -8.7174F, -21.3636F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.044F, 0.1308F, 0.0057F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 87, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -7.6362F, -23.201F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 70, 82, -0.5F, -1.0F, -0.6F, 3, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -10.6556F, -19.0921F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4363F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 83, 82, -0.5F, 0.0F, -5.0F, 3, 1, 2, -0.003F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 81, 50, -0.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -12.1591F, -14.3235F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 73, -0.5F, 0.0F, -5.0F, 4, 3, 5, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0F, -12.0F, -14.0F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 50, -0.5F, -0.2F, -0.3F, 5, 3, 7, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.7774F, -2.3031F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 47, -2.5F, -2.0F, 0.025F, 5, 2, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.0392F, -8.2974F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 58, 11, -2.5F, -2.0F, 0.025F, 5, 2, 6, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -1.8158F, -14.1965F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4363F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 0, -0.5F, -3.0F, -7.025F, 3, 3, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -1.0F, -8.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 52, 37, -1.5F, -3.0F, -6.275F, 5, 3, 6, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.7455F, -7.0F, -19.6276F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.192F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 61, -0.15F, -2.5F, 0.0F, 2, 5, 7, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.7455F, -7.0F, -19.6276F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.192F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 61, -1.85F, -2.5F, 0.0F, 2, 5, 7, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.975F, -6.0F, -12.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.3054F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 40, 61, 0.0F, -3.0F, 0.0F, 0, 3, 8, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.975F, -6.0F, -12.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -0.3054F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 40, 61, 0.0F, -3.0F, 0.0F, 0, 3, 8, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.9F, -18.2F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 75, 35, -1.5F, -0.5F, -5.55F, 3, 1, 6, -0.006F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.5F, -5.55F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.4538F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 82, -1.0F, -2.0F, 2.0F, 3, 2, 3, -0.003F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 79, 63, -1.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0049F, -9.957F, 3.2265F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 25, 50, 0.0049F, 5.4628F, 2.3F, 0, 6, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 76, 67, 0.0049F, -9.5372F, 0.0F, 0, 8, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 35, 47, -2.4951F, -1.043F, -0.2265F, 5, 7, 6, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.4951F, 8.4878F, -0.275F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3403F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 26, -0.5F, -3.025F, -0.025F, 4, 3, 7, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.4951F, -2.7764F, -0.0322F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1702F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 61, -0.5F, 0.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0049F, 7.4878F, 1.225F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.6766F, 0.5392F, -0.3911F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 9, 83, 0.5F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9951F, 7.4878F, 1.225F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.6766F, -0.5392F, 0.3911F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 9, 83, -0.5F, -0.5F, -0.5F, 0, 1, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.0243F, 2.0101F, 5.6484F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 75, 20, 0.0042F, 1.9527F, 0.0016F, 0, 8, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 57, 77, 0.0042F, -9.0473F, 0.0016F, 0, 7, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 58, 56, -1.9708F, -2.053F, -0.3749F, 4, 4, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.9708F, 6.4777F, -5.9234F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3403F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 70, -0.5F, -3.025F, 6.425F, 3, 3, 6, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.9708F, -3.8551F, -0.26F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2313F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 74, -0.5F, 0.0F, 0.2F, 3, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0042F, -0.0982F, 5.3439F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 81, 8, 0.025F, 1.2786F, 0.0002F, 0, 6, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 80, 0.025F, -6.7214F, 0.0002F, 0, 5, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 57, 67, -1.475F, -1.7049F, -0.2188F, 3, 3, 6, 0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.475F, -1.6351F, 4.1684F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1353F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 81, 43, 0.5F, -0.15F, -4.225F, 2, 1, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.475F, 2.6036F, -0.0498F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2531F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 77, 0, 1.5F, -2.075F, 0.025F, 2, 2, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.025F, -0.4549F, 5.2812F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 83, -1.0F, -1.25F, 0.0F, 2, 3, 2, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 35, 26, 0.0F, -6.25F, 1.0F, 0, 12, 8, 0.0F, false));

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
        ((EntityPrehistoricFloraPentanogmius)e).tailBuffer.applyChainSwingBuffer(fishTail);

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
            this.main.offsetY = -0.1F;
            this.main.offsetX = -0.7F;
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

