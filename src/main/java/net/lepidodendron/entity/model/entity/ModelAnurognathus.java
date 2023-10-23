package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnurognathid;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAnurognathus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer leftmembrane;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer rightmembrane;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;

    private ModelAnimator animator;

    public ModelAnurognathus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.1216F, -0.6774F);
        this.setRotateAngle(main, -0.2182F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 32, 24, -1.5F, -2.125F, 0.25F, 3, 4, 4, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -1.875F, 0.75F);
        this.main.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.2182F, 0.0F, 0.0F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 10, -2.5F, -0.5F, -6.5F, 5, 5, 7, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 18, 28, -2.0F, -0.2764F, -4.0848F, 4, 5, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 28, 32, -2.0F, -0.2764F, -2.0848F, 4, 1, 4, -0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 37, 0, -2.0F, -0.2764F, -5.0848F, 4, 3, 1, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 37, 0, -2.0F, 1.1236F, -4.8348F, 4, 3, 1, -0.02F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.5F, 0.4236F, -4.4848F);
        this.neck.addChild(Head);
        this.setRotateAngle(Head, 0.3491F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 18, 23, -3.0F, 1.2F, -4.0F, 5, 1, 4, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 36, 19, -2.5F, 1.2F, -5.0F, 4, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.075F, -2.175F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.6624F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 37, -2.0F, -1.9923F, -0.011F, 3, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.55F, -4.1F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 39, -2.0F, -1.9876F, -0.0198F, 3, 2, 1, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 1.25F, -5.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.192F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 3, -0.8F, -2.0F, -2.0F, 0, 2, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 3, 1.8F, -2.0F, -2.0F, 0, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -0.986F, -5.0221F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 0.05F, -1.3F, -0.9F, 0, 2, 2, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 2.95F, -1.3F, -0.9F, 0, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.25F, -5.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4538F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 32, -2.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.25F, 0.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, -3.0F, -2.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.15F, 0.0F);
        this.Head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 28, -3.0F, 0.0F, -4.0F, 5, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 16, -3.0F, -1.9F, -1.1F, 5, 2, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 4, -2.5F, 0.0F, -5.0F, 4, 1, 1, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.144F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 33, -2.5F, -1.0F, 0.05F, 4, 1, 4, 0.01F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.7625F, 0.85F, -3.5F);
        this.Head.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.2182F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0125F, 0.0F, 0.0F);
        this.eye.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-2.7625F, 0.85F, -3.5F);
        this.Head.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.2182F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0125F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(2.5F, 1.0F, -5.15F);
        this.upperbody.addChild(leftwing);
        this.setRotateAngle(leftwing, -0.0101F, -0.3093F, 0.2997F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 19, 17, -0.9F, 0.0F, -1.0F, 6, 1, 5, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(4.0F, 0.0F, 2.0F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, 0.2075F, 0.5788F, 0.3674F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 17, 10, 0.0F, 0.0F, -3.0F, 7, 1, 5, -0.01F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(7.0F, 0.5F, -3.0F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.0F, 1.5708F, 0.0F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 36, 8, -7.0F, -0.5F, -2.0F, 7, 1, 2, 0.02F, false));

        this.leftmembrane = new AdvancedModelRenderer(this);
        this.leftmembrane.setRotationPoint(4.0F, 0.5F, -4.0F);
        this.leftwing3.addChild(leftmembrane);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 0, 5, -20.0F, -0.5F, -1.0F, 16, 0, 5, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, 2.618F, 1.5272F, 2.7489F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.lefthand.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.4363F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 28, -1.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-2.5F, 1.0F, -5.15F);
        this.upperbody.addChild(rightwing);
        this.setRotateAngle(rightwing, -0.0101F, 0.3093F, -0.2997F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 19, 17, -5.1F, 0.0F, -1.0F, 6, 1, 5, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, 0.2075F, -0.5788F, -0.3674F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 17, 10, -7.0F, 0.0F, -3.0F, 7, 1, 5, -0.01F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-7.0F, 0.5F, -3.0F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.0F, -1.5708F, 0.0F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 36, 8, 0.0F, -0.5F, -2.0F, 7, 1, 2, 0.02F, true));

        this.rightmembrane = new AdvancedModelRenderer(this);
        this.rightmembrane.setRotationPoint(-4.0F, 0.5F, -4.0F);
        this.rightwing3.addChild(rightmembrane);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 0, 5, 4.0F, -0.5F, -1.0F, 16, 0, 5, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.5F, 0.0F, -0.25F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, 2.618F, -1.5272F, -2.7489F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.righthand.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.4363F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 28, 0.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.625F, 4.25F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 20, 36, -1.0F, -0.25F, -2.0F, 2, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 0.75F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 38, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.7875F, -0.375F, 2.4F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.5742F, 0.2213F, -0.3271F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 30, 37, -1.0375F, -0.75F, -1.0F, 2, 3, 2, 0.0F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 8, -0.1375F, -0.75F, -3.0F, 1, 3, 2, 0.0F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 0, 0.0375F, -0.75F, 1.0F, 0, 3, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.0375F, 2.25F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.933F, 0.1582F, -0.2095F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 11, 33, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 14, 19, 0.0F, -2.5F, 0.5F, 0, 2, 4, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, -0.25F, 4.25F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.4235F, -0.233F, 0.4733F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 36, 11, -1.5F, 0.0F, -2.75F, 3, 1, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.7875F, -0.375F, 2.4F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.5742F, -0.2213F, 0.3271F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 30, 37, -0.9625F, -0.75F, -1.0F, 2, 3, 2, 0.0F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 8, -0.8625F, -0.75F, -3.0F, 1, 3, 2, 0.0F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 0, -0.0375F, -0.75F, 1.0F, 0, 3, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0375F, 2.25F, 0.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.933F, -0.1582F, 0.2095F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 11, 33, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 14, 19, 0.0F, -2.5F, 0.5F, 0, 2, 4, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, -0.25F, 4.25F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.4235F, 0.233F, -0.4733F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 36, 11, -1.5F, 0.0F, -2.75F, 3, 1, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticSuspended(float f) {

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();

    }

    public void renderStaticDisplayCase(float f) {
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAnurognathid ee = (EntityPrehistoricFloraAnurognathid) entitylivingbaseIn;

        if (ee.getIsMoving() && ee.getFlyProgress() != 0 && ee.getAttachmentPos() == null ) {
            //animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else if (!ee.getHeadCollided() && ee.getAttachmentPos() != null) {
            animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        AdvancedModelRenderer[] wingLeft = {this.leftwing, this.leftwing2, this.leftwing3};
        AdvancedModelRenderer[] wingRight = {this.rightwing, this.rightwing2, this.rightwing3};

        AdvancedModelRenderer[] legLeft = {this.leftleg, this.leftleg2, this.leftleg3};
        AdvancedModelRenderer[] legRight = {this.rightleg, this.rightleg2, this.rightleg3};

        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2};

        EntityPrehistoricFloraAnurognathid entityAnurognathid = (EntityPrehistoricFloraAnurognathid) e;
        if (entityAnurognathid.getIsMoving() && entityAnurognathid.getFlyProgress() != 0 && entityAnurognathid.getAttachmentPos() == null) {
            //flight pose
            this.setRotateAngle(main, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(upperbody, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -1.6624F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -1.309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.192F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, -0.672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.4538F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, -0.144F, 0.0F, 0.0F);
            this.setRotateAngle(eye, 0.0F, 0.2182F, 0.0F);
            this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(eye2, 0.0F, -0.2182F, 0.0F);
            this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing, -0.0115F, -0.1304F, 0.088F);
            this.setRotateAngle(leftwing2, 0.0F, 0.3054F, 0.0F);
            this.setRotateAngle(leftwing3, 0.0F, 2.7489F, 0.0F);
            this.setRotateAngle(lefthand, 0.0218F, -0.0058F, 0.1304F);
            this.setRotateAngle(cube_r10, 0.0F, -0.4363F, 0.0F);
            this.setRotateAngle(rightwing, -0.0115F, 0.1304F, -0.088F);
            this.setRotateAngle(rightwing2, 0.0F, -0.3054F, 0.0F);
            this.setRotateAngle(rightwing3, 0.0F, -2.7489F, 0.0F);
            this.setRotateAngle(righthand, 0.0218F, 0.0058F, -0.1304F);
            this.setRotateAngle(cube_r11, 0.0F, 0.4363F, 0.0F);
            this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg, 0.3681F, 0.1134F, -1.3376F);
            this.setRotateAngle(leftleg2, -0.7148F, 0.1582F, -0.2095F);
            this.setRotateAngle(leftleg3, 2.2561F, -0.233F, 0.4733F);
            this.setRotateAngle(rightleg, 0.3681F, -0.1134F, 1.3376F);
            this.setRotateAngle(rightleg2, -0.7148F, -0.1582F, 0.2095F);
            this.setRotateAngle(rightleg3, 2.2561F, 0.233F, -0.4733F);


            float speed = 1.50F;
            float fixedY = 0; //The standard offset to centre the mob

            //Animations:
            this.chainFlap(wingLeft, speed, 0.35F, 0.3F, f2, 1F);
            this.chainFlap(wingRight, speed, -0.35F, -0.3F, f2, 1F);

            this.swing(leftwing3, speed, 0.4F, false, 2.0F, 0.12F, f2, 1F);
            this.swing(rightwing3, speed, -0.4F, false, 2.0F, -0.12F, f2, 1F);

            this.swing(leftwing, speed, 0.10F, false, 2.0F, 0.08F, f2, 1F);
            this.swing(rightwing, speed, -0.10F, false, 2.0F, -0.08F, f2, 1F);

            float floatMoveZ = this.moveBoxExtended(speed * 0.3F, 0.30F, false, 4, f2, 1);
            this.main.offsetZ = floatMoveZ;
            float floatMoveY = this.moveBoxExtended(speed * 0.3F, 0.70F, false, 4, f2, 1);
            this.main.offsetY = (floatMoveY) + fixedY;

            this.chainWaveExtended(legLeft, speed, 0.055F, 0.1F, 0F, f2, 1F);
            this.chainWaveExtended(legRight, speed, -0.055F, -0.1F, 3F, f2, 1F);
            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.5F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.15F, 2.0F, f2, 1F);

        }
        else {

        }


        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, Head);
    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnurognathid entity = (EntityPrehistoricFloraAnurognathid) entitylivingbaseIn;
        int animCycle = 40;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 2 + (((tickAnim - 0) / 10) * (-2-(2)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2 + (((tickAnim - 10) / 10) * (-2-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -2 + (((tickAnim - 20) / 10) * (0-(-2)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -0.5 + (((tickAnim - 8) / 7) * (0.5-(-0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0.5 + (((tickAnim - 15) / 5) * (0-(0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = -0.5 + (((tickAnim - 28) / 7) * (0.75-(-0.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0.75 + (((tickAnim - 35) / 5) * (0-(0.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 5 + (((tickAnim - 10) / 10) * (0-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 30) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -5 + (((tickAnim - 30) / 10) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2 + (((tickAnim - 0) / 10) * (2-(-2)));
            yy = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            zz = -1 + (((tickAnim - 0) / 10) * (1-(-1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (-2-(2)));
            yy = 2 + (((tickAnim - 10) / 10) * (0-(2)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2 + (((tickAnim - 20) / 10) * (2-(-2)));
            yy = 0 + (((tickAnim - 20) / 10) * (-2-(0)));
            zz = 1 + (((tickAnim - 20) / 10) * (0-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 30) / 10) * (-2-(2)));
            yy = -2 + (((tickAnim - 30) / 10) * (0-(-2)));
            zz = 0 + (((tickAnim - 30) / 10) * (-1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.75 + (((tickAnim - 0) / 3) * (0-(0.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0.38 + (((tickAnim - 0) / 3) * (0.5-(0.38)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (3-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0.5 + (((tickAnim - 3) / 10) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 3 + (((tickAnim - 13) / 10) * (0-(3)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 13) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (3-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 23) / 10) * (0-(-0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 33) / 7) * (0.75-(3)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0.38-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (30-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (10-(0)));
            yy = 30 + (((tickAnim - 7) / 3) * (30-(30)));
            zz = 0 + (((tickAnim - 7) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 10) / 2) * (10-(10)));
            yy = 30 + (((tickAnim - 10) / 2) * (30-(30)));
            zz = -10 + (((tickAnim - 10) / 2) * (-12-(-10)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 12) / 18) * (9.21789-(10)));
            yy = 30 + (((tickAnim - 12) / 18) * (-16.41303-(30)));
            zz = -12 + (((tickAnim - 12) / 18) * (-4.56657-(-12)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 9.21789 + (((tickAnim - 30) / 6) * (10-(9.21789)));
            yy = -16.41303 + (((tickAnim - 30) / 6) * (-30-(-16.41303)));
            zz = -4.56657 + (((tickAnim - 30) / 6) * (-10-(-4.56657)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 36) / 4) * (0-(10)));
            yy = -30 + (((tickAnim - 36) / 4) * (0-(-30)));
            zz = -10 + (((tickAnim - 36) / 4) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 7) / 3) * (20-(20)));
            yy = 10 + (((tickAnim - 7) / 3) * (10-(10)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 10) / 20) * (14.17-(20)));
            yy = 10 + (((tickAnim - 10) / 20) * (3.33-(10)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 14.17 + (((tickAnim - 30) / 10) * (0-(14.17)));
            yy = 3.33 + (((tickAnim - 30) / 10) * (0-(3.33)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (30-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 30 + (((tickAnim - 7) / 3) * (30-(30)));
            zz = -25 + (((tickAnim - 7) / 3) * (0-(-25)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-5-(0)));
            yy = 30 + (((tickAnim - 10) / 2) * (30-(30)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 12) / 28) * (0-(-5)));
            yy = 30 + (((tickAnim - 12) / 28) * (0-(30)));
            zz = 0 + (((tickAnim - 12) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 0) / 10) * (9.21789-(10)));
            yy = -6.77 + (((tickAnim - 0) / 10) * (16.413-(-6.77)));
            zz = 10 + (((tickAnim - 0) / 10) * (4.5666-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 9.21789 + (((tickAnim - 10) / 6) * (10-(9.21789)));
            yy = 16.413 + (((tickAnim - 10) / 6) * (30-(16.413)));
            zz = 4.5666 + (((tickAnim - 10) / 6) * (10-(4.5666)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 16) / 4) * (0-(10)));
            yy = 30 + (((tickAnim - 16) / 4) * (0-(30)));
            zz = 10 + (((tickAnim - 16) / 4) * (0-(10)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-30-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (10-(0)));
            yy = -30 + (((tickAnim - 27) / 3) * (-30-(-30)));
            zz = 0 + (((tickAnim - 27) / 3) * (10-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 10 + (((tickAnim - 30) / 2) * (10-(10)));
            yy = -30 + (((tickAnim - 30) / 2) * (-30-(-30)));
            zz = 10 + (((tickAnim - 30) / 2) * (12-(10)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 32) / 8) * (10-(10)));
            yy = -30 + (((tickAnim - 32) / 8) * (-6.77-(-30)));
            zz = 12 + (((tickAnim - 32) / 8) * (10-(12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 13.33 + (((tickAnim - 0) / 10) * (14.17-(13.33)));
            yy = -6.67 + (((tickAnim - 0) / 10) * (-3.33-(-6.67)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.17 + (((tickAnim - 10) / 10) * (0-(14.17)));
            yy = -3.33 + (((tickAnim - 10) / 10) * (0-(-3.33)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-10-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 27) / 3) * (20-(20)));
            yy = -10 + (((tickAnim - 27) / 3) * (-10-(-10)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 30) / 10) * (13.33-(20)));
            yy = -10 + (((tickAnim - 30) / 10) * (-6.67-(-10)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 20) * (0-(-20)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-30-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (25-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -30 + (((tickAnim - 27) / 3) * (-30-(-30)));
            zz = 25 + (((tickAnim - 27) / 3) * (0-(25)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (-5-(0)));
            yy = -30 + (((tickAnim - 30) / 2) * (-30-(-30)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 32) / 8) * (0-(-5)));
            yy = -30 + (((tickAnim - 32) / 8) * (-20-(-30)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 15 + (((tickAnim - 10) / 10) * (0-(15)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-15-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -15 + (((tickAnim - 30) / 10) * (0-(-15)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 2 + (((tickAnim - 10) / 3) * (2-(2)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 13) / 7) * (0-(2)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-2-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = -2 + (((tickAnim - 30) / 3) * (-2-(-2)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -2 + (((tickAnim - 33) / 7) * (0-(-2)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (50-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20 + (((tickAnim - 10) / 3) * (-18-(-20)));
            yy = 50 + (((tickAnim - 10) / 3) * (45-(50)));
            zz = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -18 + (((tickAnim - 13) / 12) * (6.58789-(-18)));
            yy = 45 + (((tickAnim - 13) / 12) * (20.35136-(45)));
            zz = -10 + (((tickAnim - 13) / 12) * (-8.7523-(-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.58789 + (((tickAnim - 25) / 5) * (18.40821-(6.58789)));
            yy = 20.35136 + (((tickAnim - 25) / 5) * (13.18922-(20.35136)));
            zz = -8.7523 + (((tickAnim - 25) / 5) * (-12.78022-(-8.7523)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 18.40821 + (((tickAnim - 30) / 6) * (7.5-(18.40821)));
            yy = 13.18922 + (((tickAnim - 30) / 6) * (0-(13.18922)));
            zz = -12.78022 + (((tickAnim - 30) / 6) * (0-(-12.78022)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 36) / 4) * (0-(7.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (-70-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20 + (((tickAnim - 10) / 3) * (-20-(-20)));
            yy = -70 + (((tickAnim - 10) / 3) * (-65-(-70)));
            zz = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 13) / 7) * (-31.15978-(-20)));
            yy = -65 + (((tickAnim - 13) / 7) * (-47.97175-(-65)));
            zz = -10 + (((tickAnim - 13) / 7) * (5.30496-(-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -31.15978 + (((tickAnim - 20) / 5) * (-32.59336-(-31.15978)));
            yy = -47.97175 + (((tickAnim - 20) / 5) * (-34.07088-(-47.97175)));
            zz = 5.30496 + (((tickAnim - 20) / 5) * (5.67487-(5.30496)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -32.59336 + (((tickAnim - 25) / 5) * (-33.02596-(-32.59336)));
            yy = -34.07088 + (((tickAnim - 25) / 5) * (-17.65307-(-34.07088)));
            zz = 5.67487 + (((tickAnim - 25) / 5) * (-0.20005-(5.67487)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -33.02596 + (((tickAnim - 30) / 6) * (2.5-(-33.02596)));
            yy = -17.65307 + (((tickAnim - 30) / 6) * (0-(-17.65307)));
            zz = -0.20005 + (((tickAnim - 30) / 6) * (0-(-0.20005)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 36) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (77.89072-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (-31.18906-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-30.70583-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 77.89072 + (((tickAnim - 10) / 3) * (75.95549-(77.89072)));
            yy = -31.18906 + (((tickAnim - 10) / 3) * (-39.17609-(-31.18906)));
            zz = -30.70583 + (((tickAnim - 10) / 3) * (-28.15613-(-30.70583)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 75.95549 + (((tickAnim - 13) / 12) * (28.59391-(75.95549)));
            yy = -39.17609 + (((tickAnim - 13) / 12) * (-33.58353-(-39.17609)));
            zz = -28.15613 + (((tickAnim - 13) / 12) * (-1.16592-(-28.15613)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 28.59391 + (((tickAnim - 25) / 11) * (22.5-(28.59391)));
            yy = -33.58353 + (((tickAnim - 25) / 11) * (0-(-33.58353)));
            zz = -1.16592 + (((tickAnim - 25) / 11) * (0-(-1.16592)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 22.5 + (((tickAnim - 36) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.95 + (((tickAnim - 0) / 5) * (6.58789-(-3.95)));
            yy = -30.92 + (((tickAnim - 0) / 5) * (-20.3514-(-30.92)));
            zz = 9.29 + (((tickAnim - 0) / 5) * (8.7523-(9.29)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 6.58789 + (((tickAnim - 5) / 5) * (18.40821-(6.58789)));
            yy = -20.3514 + (((tickAnim - 5) / 5) * (-13.1892-(-20.3514)));
            zz = 8.7523 + (((tickAnim - 5) / 5) * (12.7802-(8.7523)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 18.40821 + (((tickAnim - 10) / 6) * (7.5-(18.40821)));
            yy = -13.1892 + (((tickAnim - 10) / 6) * (0-(-13.1892)));
            zz = 12.7802 + (((tickAnim - 10) / 6) * (0-(12.7802)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 16) / 4) * (0-(7.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (-50-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (10-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -20 + (((tickAnim - 30) / 3) * (-18-(-20)));
            yy = -50 + (((tickAnim - 30) / 3) * (-45-(-50)));
            zz = 10 + (((tickAnim - 30) / 3) * (10-(10)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -18 + (((tickAnim - 33) / 7) * (-3.95-(-18)));
            yy = -45 + (((tickAnim - 33) / 7) * (-30.92-(-45)));
            zz = 10 + (((tickAnim - 33) / 7) * (9.29-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -31.15978 + (((tickAnim - 0) / 5) * (-32.59336-(-31.15978)));
            yy = 47.9718 + (((tickAnim - 0) / 5) * (34.0709-(47.9718)));
            zz = -5.305 + (((tickAnim - 0) / 5) * (-5.6749-(-5.305)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -32.59336 + (((tickAnim - 5) / 5) * (-33.02596-(-32.59336)));
            yy = 34.0709 + (((tickAnim - 5) / 5) * (17.6531-(34.0709)));
            zz = -5.6749 + (((tickAnim - 5) / 5) * (0.2001-(-5.6749)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -33.02596 + (((tickAnim - 10) / 6) * (2.5-(-33.02596)));
            yy = 17.6531 + (((tickAnim - 10) / 6) * (0-(17.6531)));
            zz = 0.2001 + (((tickAnim - 10) / 6) * (0-(0.2001)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 16) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (70-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (10-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -20 + (((tickAnim - 30) / 3) * (-20-(-20)));
            yy = 70 + (((tickAnim - 30) / 3) * (65-(70)));
            zz = 10 + (((tickAnim - 30) / 3) * (10-(10)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 33) / 7) * (-31.15978-(-20)));
            yy = 65 + (((tickAnim - 33) / 7) * (47.9718-(65)));
            zz = 10 + (((tickAnim - 33) / 7) * (-5.305-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 48.89 + (((tickAnim - 0) / 5) * (28.59391-(48.89)));
            yy = 35.98 + (((tickAnim - 0) / 5) * (33.5835-(35.98)));
            zz = 12.73 + (((tickAnim - 0) / 5) * (1.1659-(12.73)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 28.59391 + (((tickAnim - 5) / 11) * (22.5-(28.59391)));
            yy = 33.5835 + (((tickAnim - 5) / 11) * (0-(33.5835)));
            zz = 1.1659 + (((tickAnim - 5) / 11) * (0-(1.1659)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 16) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (77.89072-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (31.1891-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (30.7058-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 77.89072 + (((tickAnim - 30) / 3) * (75.95549-(77.89072)));
            yy = 31.1891 + (((tickAnim - 30) / 3) * (39.1761-(31.1891)));
            zz = 30.7058 + (((tickAnim - 30) / 3) * (28.1561-(30.7058)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 75.95549 + (((tickAnim - 33) / 7) * (48.89-(75.95549)));
            yy = 39.1761 + (((tickAnim - 33) / 7) * (35.98-(39.1761)));
            zz = 28.1561 + (((tickAnim - 33) / 7) * (12.73-(28.1561)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnurognathid e = (EntityPrehistoricFloraAnurognathid) entity;
        animator.update(entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(2);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(2),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(3), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(5),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(3);
    }

}
