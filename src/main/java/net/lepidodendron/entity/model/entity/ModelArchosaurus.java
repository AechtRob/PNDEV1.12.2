package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArchosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArchosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Archosaurus;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended rightThigh;
    private final AdvancedModelRendererExtended rightTibia;
    private final AdvancedModelRendererExtended rightFoot;
    private final AdvancedModelRendererExtended leftThigh;
    private final AdvancedModelRendererExtended leftTibia;
    private final AdvancedModelRendererExtended leftFoot;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended Body1;
    private final AdvancedModelRendererExtended upperBody;
    private final AdvancedModelRendererExtended leftBicep;
    private final AdvancedModelRendererExtended leftForearm;
    private final AdvancedModelRendererExtended leftHand;
    private final AdvancedModelRendererExtended rightBicep;
    private final AdvancedModelRendererExtended rightForearm;
    private final AdvancedModelRendererExtended rightHand;
    private final AdvancedModelRendererExtended Neck1;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;

    private ModelAnimator animator;

    public ModelArchosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Archosaurus = new AdvancedModelRendererExtended(this);
        this.Archosaurus.setRotationPoint(0.0F, 6.0F, -18.0F);
        this.setRotateAngle(Archosaurus, 0.1309F, 0.0F, 0.0F);


        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 1.0F, 26.0F);
        this.Archosaurus.addChild(Body2);
        this.setRotateAngle(Body2, -0.1329F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 42, 51, -3.5F, -5.5F, -1.0F, 7, 10, 16, 0.0F, false));

        this.rightThigh = new AdvancedModelRendererExtended(this);
        this.rightThigh.setRotationPoint(-3.5F, -2.5F, 6.0F);
        this.Body2.addChild(rightThigh);
        this.setRotateAngle(rightThigh, -0.4512F, 0.3546F, 0.1582F);
        this.rightThigh.cubeList.add(new ModelBox(rightThigh, 80, 85, -4.0F, 0.0F, -4.0F, 5, 13, 8, 0.0F, true));

        this.rightTibia = new AdvancedModelRendererExtended(this);
        this.rightTibia.setRotationPoint(-1.5F, 11.0F, -4.0F);
        this.rightThigh.addChild(rightTibia);
        this.setRotateAngle(rightTibia, 0.6068F, 0.0749F, -0.1074F);
        this.rightTibia.cubeList.add(new ModelBox(rightTibia, 0, 0, -2.0F, 1.0F, 0.0F, 4, 13, 7, -0.01F, true));

        this.rightFoot = new AdvancedModelRendererExtended(this);
        this.rightFoot.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.rightTibia.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.1329F, -0.173F, 0.023F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 72, 42, -2.5F, -1.0F, -11.5F, 5, 3, 16, 0.0F, true));

        this.leftThigh = new AdvancedModelRendererExtended(this);
        this.leftThigh.setRotationPoint(3.5F, -2.5F, 6.0F);
        this.Body2.addChild(leftThigh);
        this.setRotateAngle(leftThigh, -0.4076F, -0.3546F, -0.1582F);
        this.leftThigh.cubeList.add(new ModelBox(leftThigh, 80, 85, -1.0F, 0.0F, -4.0F, 5, 13, 8, 0.0F, false));

        this.leftTibia = new AdvancedModelRendererExtended(this);
        this.leftTibia.setRotationPoint(1.5F, 11.0F, -4.0F);
        this.leftThigh.addChild(leftTibia);
        this.setRotateAngle(leftTibia, 0.6068F, -0.0749F, 0.1074F);
        this.leftTibia.cubeList.add(new ModelBox(leftTibia, 0, 0, -2.0F, 1.0F, 0.0F, 4, 13, 7, -0.01F, false));

        this.leftFoot = new AdvancedModelRendererExtended(this);
        this.leftFoot.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.leftTibia.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.1329F, 0.173F, -0.023F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 72, 42, -2.5F, -1.0F, -11.5F, 5, 3, 16, 0.0F, false));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, -5.5F, 15.0F);
        this.Body2.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1397F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 34, -2.5F, 0.0F, 0.0F, 5, 9, 24, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 4.5F, 23.75F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0894F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 41, 13, -2.0F, -3.9237F, -1.7483F, 4, 8, 21, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0763F, 19.2517F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1013F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 70, 0, -1.5F, -3.3473F, -1.9696F, 3, 6, 18, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, -0.3473F, 16.0304F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0613F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 67, -1.0F, -2.3473F, -1.9696F, 2, 4, 20, 0.0F, false));

        this.Body1 = new AdvancedModelRendererExtended(this);
        this.Body1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Body2.addChild(Body1);
        this.setRotateAngle(Body1, 0.1309F, 0.0F, 0.0F);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -4.5F, -5.5F, -22.0F, 9, 12, 22, 0.0F, false));

        this.upperBody = new AdvancedModelRendererExtended(this);
        this.upperBody.setRotationPoint(0.0F, -1.75F, -20.0F);
        this.Body1.addChild(upperBody);
        this.setRotateAngle(upperBody, -0.0873F, 0.0F, 0.0F);
        this.upperBody.cubeList.add(new ModelBox(upperBody, 44, 77, -3.5F, -3.25F, -10.0F, 7, 11, 11, 0.0F, false));

        this.leftBicep = new AdvancedModelRendererExtended(this);
        this.leftBicep.setRotationPoint(3.5F, 2.25F, -6.5F);
        this.upperBody.addChild(leftBicep);
        this.setRotateAngle(leftBicep, 0.2403F, 0.1313F, -0.3244F);
        this.leftBicep.cubeList.add(new ModelBox(leftBicep, 0, 67, -0.5F, 0.0F, -2.5F, 3, 9, 5, 0.0F, false));

        this.leftForearm = new AdvancedModelRendererExtended(this);
        this.leftForearm.setRotationPoint(1.5F, 8.0F, 1.5F);
        this.leftBicep.addChild(leftForearm);
        this.setRotateAngle(leftForearm, -0.4085F, 0.1185F, 0.2854F);
        this.leftForearm.cubeList.add(new ModelBox(leftForearm, 72, 42, -2.0F, 0.0F, -4.0F, 3, 11, 4, -0.01F, false));

        this.leftHand = new AdvancedModelRendererExtended(this);
        this.leftHand.setRotationPoint(0.0F, 10.0F, -2.0F);
        this.leftForearm.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0873F, -0.2182F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 34, 42, -2.5F, 0.0F, -6.0F, 4, 2, 8, 0.0F, false));

        this.rightBicep = new AdvancedModelRendererExtended(this);
        this.rightBicep.setRotationPoint(-3.5F, 2.25F, -6.5F);
        this.upperBody.addChild(rightBicep);
        this.setRotateAngle(rightBicep, 0.3276F, -0.1313F, 0.3244F);
        this.rightBicep.cubeList.add(new ModelBox(rightBicep, 0, 67, -2.5F, 0.0F, -2.5F, 3, 9, 5, 0.0F, true));

        this.rightForearm = new AdvancedModelRendererExtended(this);
        this.rightForearm.setRotationPoint(-1.5F, 8.0F, 1.5F);
        this.rightBicep.addChild(rightForearm);
        this.setRotateAngle(rightForearm, -0.4085F, -0.1185F, -0.2854F);
        this.rightForearm.cubeList.add(new ModelBox(rightForearm, 72, 42, -1.0F, 0.0F, -4.0F, 3, 11, 4, -0.01F, true));

        this.rightHand = new AdvancedModelRendererExtended(this);
        this.rightHand.setRotationPoint(0.0F, 10.0F, -2.0F);
        this.rightForearm.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.2182F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 34, 42, -1.5F, 0.0F, -6.0F, 4, 2, 8, 0.0F, true));

        this.Neck1 = new AdvancedModelRendererExtended(this);
        this.Neck1.setRotationPoint(0.0F, 1.75F, -8.0F);
        this.upperBody.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.0443F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 0, 91, -3.0F, -4.5F, -8.0F, 6, 8, 8, 0.0F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, -0.5F, -5.5F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.132F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 78, 67, -2.5F, -4.0653F, -10.5043F, 5, 8, 10, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, -0.0653F, -8.5043F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 34, -3.0F, -4.0F, -6.0F, 6, 6, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(2.5F, 1.5F, -6.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0068F, 0.1449F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 91, -1.0F, -4.0F, -7.0F, 1, 4, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(2.5F, 2.0F, -6.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.1449F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 77, -1.0F, -1.0F, -7.0F, 1, 1, 7, -0.01F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-2.5F, 2.0F, -6.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, -0.1449F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 69, 78, 0.0F, -1.0F, -7.0F, 1, 1, 7, -0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-2.5F, 1.5F, -6.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0068F, -0.1449F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 94, 0, 0.0F, -4.0F, -7.0F, 1, 4, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -1.93F, -15.79F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9425F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 52, -1.5F, 0.0F, -4.0F, 3, 2, 4, -0.02F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, -11.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 0, -1.5F, -1.0F, -6.0F, 3, 1, 4, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 70, -1.5F, -4.0F, -6.0F, 3, 3, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2077F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 0, -1.5F, 0.0F, -10.0F, 3, 3, 10, -0.01F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 11, -1.5F, 0.0F, -6.0F, 3, 1, 6, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 0, -1.5F, -4.0F, -7.0F, 3, 4, 7, 0.0F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 46, -3.0F, 0.0F, -6.0F, 6, 2, 6, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 91, 33, -2.5F, -4.0F, -4.0F, 5, 4, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(2.0F, 2.0F, -6.0F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.088F, 0.1449F, -0.0115F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 13, -2.5F, -2.0F, -7.0F, 3, 2, 7, -0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-2.0F, 2.0F, -6.0F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.088F, -0.1449F, 0.0115F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 24, -0.5F, -2.0F, -7.0F, 3, 2, 7, -0.01F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-2.0F, 2.0F, -6.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 42, 0.5F, -3.0F, -7.0F, 3, 1, 7, -0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 24, 0.5F, -2.0F, -7.0F, 3, 2, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Archosaurus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Jaw.rotateAngleX = (float)Math.toRadians(30);
        this.Neck1.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Archosaurus, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body1, 0.18F, -0.05F, 0.0F);
        this.setRotateAngle(Body2, -0.05F, -0.05F, 0.0F);
        this.setRotateAngle(upperBody, -0.05F, -0.05F, 0.0F);
        this.setRotateAngle(Neck1, 0.0F, 0.15F, 0.0F);
        this.setRotateAngle(Neck2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Jaw, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, -0.1F, -0.1F, 0.0F);
        this.setRotateAngle(Tail3, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(Tail4, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(leftThigh, -0.3F, -0.2F, -0.3F);
        this.setRotateAngle(leftTibia, 0.3F, 0.0F, 0.3F);
        this.setRotateAngle(leftFoot, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(rightThigh, 0.3F, 0.2F, 0.3F);
        this.setRotateAngle(rightTibia, 1.0F, 0.2F, -0.3F);
        this.setRotateAngle(rightFoot, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftBicep, 0.5F, 0.2F, -0.3F);
        this.setRotateAngle(leftForearm, 0.2F, 0.2F, 0.3F);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightBicep, -0.2F, -0.2F, 0.3F);
        this.setRotateAngle(rightForearm, -0.2F, 0.0F, -0.3F);
        this.setRotateAngle(rightHand, 0.25F, 0.0F, 0.0F);
        this.Archosaurus.offsetX = -0.03F;
        this.Archosaurus.offsetY = -0.035F;
        this.Archosaurus.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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
        //this.Archosaurus.offsetY = 1.00F;

        EntityPrehistoricFloraArchosaurus Archosaurus = (EntityPrehistoricFloraArchosaurus) e;
        float masterSpeed = Archosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 5, Neck1);
        this.faceTarget(f3, f4, 5, Neck2);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        Archosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (Archosaurus.getAnimation() == Archosaurus.LAY_ANIMATION) {
            this.swing(Neck1, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck1, 0.5F * 2, 0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Archosaurus.getIsMoving()) { //Not moving
            this.swing(Neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainWave(Tail, (0.06F*0.9F), -0.06F, -0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Archosaurus.getIsFast()) {
            speed = speed * 2;
        }

        this.leftBicep.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.rightBicep.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.leftThigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.rightThigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(leftBicep, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(rightBicep, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(leftThigh, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(rightThigh, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(leftBicep, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(rightBicep, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(leftThigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(rightThigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(leftForearm, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(rightForearm, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(leftTibia, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(rightTibia, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(leftForearm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(rightForearm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(leftTibia, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(rightTibia, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(leftHand, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(rightHand, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(leftFoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(rightFoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Body2, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.swing(Body2, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(Body1, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(upperBody, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(upperBody, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        if (Archosaurus.getAnimation() != Archosaurus.ATTACK_ANIMATION
                && Archosaurus.getAnimation() != Archosaurus.EAT_ANIMATION) {
            this.swing(Neck1, speed, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
            this.walk(Neck1, speed * 2, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
        }

        //this.chainWave(Tail, (speed*0.6F), -0.085F, -0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.leftTibia.offsetY = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.8), false, 3.0F, f2, 1);
        this.rightTibia.offsetY = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.8), false, 0.0F, f2, 1);

        this.swing(leftThigh, speed, -0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(rightThigh, speed, -0.12F, false, 5.0F,0.06F, f2, 1.0F);

        this.Body2.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 2.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraArchosaurus e = (EntityPrehistoricFloraArchosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(28.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(2);
        animator.rotate(this.Neck1, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(4);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck1, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck1, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
