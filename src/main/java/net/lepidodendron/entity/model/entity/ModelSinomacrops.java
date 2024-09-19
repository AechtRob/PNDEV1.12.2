package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnurognathid;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSinomacrops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer leftmembrane;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer rightmembrane;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer membraneLeg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer membraneLeg2;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;

    private ModelAnimator animator;

    public ModelSinomacrops() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.25F, -2.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 20, -1.5F, -2.0F, 2.5F, 3, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.3646F, 1.6762F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0087F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, -2.5F, -2.675F, -2.5F, 5, 5, 5, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(2.5F, -0.5F, 0.1F);
        this.main.addChild(leftwing);
        this.setRotateAngle(leftwing, 0.0602F, 0.1639F, 0.354F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 16, 16, -1.8962F, 0.0F, -1.0872F, 6, 1, 4, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(3.0038F, 0.0F, 1.9128F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, 0.0555F, 0.5648F, 0.1034F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 15, 10, 0.0F, 0.0F, -3.0F, 7, 1, 4, -0.01F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(7.0F, 0.5F, -3.0F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 1.7026F, 1.3956F, 1.5793F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 10, 21, -7.0F, -0.5F, -2.0F, 7, 1, 2, 0.02F, false));

        this.leftmembrane = new AdvancedModelRenderer(this);
        this.leftmembrane.setRotationPoint(4.0F, 0.5F, -4.0F);
        this.leftwing3.addChild(leftmembrane);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 0, 5, -21.0F, -0.5F, -1.0F, 17, 0, 5, 0.0F, false));
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 0, 0, -21.0F, -0.45F, -1.0F, 17, 0, 5, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.leftwing3.addChild(lefthand);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.lefthand.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 0, -1.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-2.5F, -0.5F, 0.1F);
        this.main.addChild(rightwing);
        this.setRotateAngle(rightwing, 0.0602F, -0.1639F, -0.354F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 16, 16, -4.1038F, 0.0F, -1.0872F, 6, 1, 4, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.0038F, 0.0F, 1.9128F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, 0.0555F, -0.5648F, -0.1034F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 15, 10, -7.0F, 0.0F, -3.0F, 7, 1, 4, -0.01F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-7.0F, 0.5F, -3.0F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 1.7026F, -1.3956F, -1.5793F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 10, 21, 0.0F, -0.5F, -2.0F, 7, 1, 2, 0.02F, true));

        this.rightmembrane = new AdvancedModelRenderer(this);
        this.rightmembrane.setRotationPoint(-4.0F, 0.5F, -4.0F);
        this.rightwing3.addChild(rightmembrane);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 0, 5, 4.0F, -0.5F, -1.0F, 17, 0, 5, 0.0F, true));
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 0, 0, 4.0F, -0.45F, -1.0F, 17, 0, 5, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.5F, 0.0F, -0.25F);
        this.rightwing3.addChild(righthand);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.righthand.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 0, 0.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 14, 24, -2.0F, -0.45F, -3.1F, 4, 4, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-1.0F, 0.9F, -2.925F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.432F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 33, 10, -1.5F, -0.5F, -1.5F, 5, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 28, -1.0F, -0.5F, -4.1F, 4, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 37, -1.0F, -1.5F, -3.5F, 4, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 15, -1.5F, -1.45F, -1.525F, 5, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, -0.7382F, -4.7441F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6501F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, -2.0F, -2.0038F, 0.0001F, 0, 2, 2, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 0.0F, -2.0038F, 0.0001F, 0, 2, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 35, -3.0F, -0.0038F, 0.0001F, 4, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, -0.868F, -4.5753F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.261F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 6, -1.95F, -1.625F, -1.125F, 0, 2, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 6, -0.05F, -1.625F, -1.125F, 0, 2, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 33, -2.5F, -0.125F, -1.175F, 3, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.8676F, -0.1356F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3883F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 32, -1.5F, 0.05F, -1.125F, 5, 1, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, -2.5F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1353F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 26, -1.0F, -0.05F, -0.675F, 4, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5074F, -0.5106F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 32, -1.5F, -0.0074F, -0.9894F, 5, 1, 2, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 19, -1.0F, -1.5074F, -0.9894F, 4, 2, 2, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 28, -1.0F, -0.0074F, -3.5894F, 4, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.9926F, -3.6894F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2749F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 26, -1.5F, -1.025F, -0.875F, 3, 1, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 1.4926F, -2.0894F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2793F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 35, -1.5F, -1.15F, -1.325F, 3, 1, 3, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(2.9125F, -0.9F, -2.2F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.2051F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 0, -0.4875F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));
        this.eye.cubeList.add(new ModelBox(eye, 0, 39, -0.5125F, -1.0F, -1.0F, 1, 2, 2, -0.01F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.9125F, -0.9F, -2.2F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.2051F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 0, -0.5125F, -0.5F, -0.5F, 1, 1, 1, -0.01F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 39, -0.4875F, -1.0F, -1.0F, 1, 2, 2, -0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.25F, 6.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 21, 32, -1.0F, -0.25F, -2.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3F, 1.925F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 38, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 8, 0, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 43, -1.5F, 0.0F, -2.0F, 3, 0, 8, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 38, 0.0F, -1.5F, -2.0F, 0, 3, 8, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.7875F, 0.0F, 4.65F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.0361F, -0.3911F, -0.691F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 28, 38, -1.0375F, -0.75F, -1.0F, 2, 3, 2, 0.0F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 0, 0.0375F, -0.75F, 1.0F, 0, 3, 2, 0.0F, false));

        this.membraneLeg = new AdvancedModelRenderer(this);
        this.membraneLeg.setRotationPoint(0.3625F, 0.75F, -1.0F);
        this.leftleg.addChild(membraneLeg);
        this.setRotateAngle(membraneLeg, 0.3273F, 0.1309F, -0.2478F);
        this.membraneLeg.cubeList.add(new ModelBox(membraneLeg, 36, 38, -0.5F, -1.5F, -2.0F, 1, 3, 2, -0.01F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.0375F, 2.25F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.22F, 0.1278F, -0.0285F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 9, 31, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 16, 27, 0.0F, -2.5F, 0.5F, 0, 2, 4, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, -0.25F, 4.25F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.3382F, -0.0042F, 0.7598F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 25, 21, -1.5F, 0.0F, -3.75F, 3, 1, 4, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.7875F, 0.0F, 4.65F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.0361F, 0.3911F, 0.691F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 28, 38, -0.9625F, -0.75F, -1.0F, 2, 3, 2, 0.0F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 0, -0.0375F, -0.75F, 1.0F, 0, 3, 2, 0.0F, true));

        this.membraneLeg2 = new AdvancedModelRenderer(this);
        this.membraneLeg2.setRotationPoint(-0.3625F, 0.75F, -1.0F);
        this.rightleg.addChild(membraneLeg2);
        this.setRotateAngle(membraneLeg2, 0.3273F, -0.1309F, 0.2478F);
        this.membraneLeg2.cubeList.add(new ModelBox(membraneLeg2, 36, 38, -0.5F, -1.5F, -2.0F, 1, 3, 2, -0.01F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0375F, 2.25F, 0.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.22F, -0.1278F, 0.0285F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 9, 31, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 16, 27, 0.0F, -2.5F, 0.5F, 0, 2, 4, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, -0.25F, 4.25F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.3382F, 0.0042F, -0.7598F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 25, 21, -1.5F, 0.0F, -3.75F, 3, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(main, -1.5F, 3.15F, 0.0F);
        this.setRotateAngle(neck, 0.2F, 0.3F, 0.3F);
        this.setRotateAngle(head, 0.3F, 0.0F, 0.1F);
        this.setRotateAngle(jaw, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(leftleg2, -0.8F, -0.0F, 0.2F);
        this.setRotateAngle(leftleg3, 1.5F, -1.5F, 0.0F);
        this.setRotateAngle(rightleg, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(rightleg2, -0.8F, 0.0F, -0.3F);
        this.setRotateAngle(rightleg3, 1.8F, 1.5F, 0.0F);
        this.setRotateAngle(leftwing, 0.05F, 0.2F, 0.08F);
        this.setRotateAngle(leftwing2, 0.0F, 0.3F, 0.1F);
        this.setRotateAngle(leftwing3, 0.0F, 2.0F, 0.1F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.05F, 0.2F, -0.08F);
        this.setRotateAngle(rightwing2, 0.0F, 0.3F, -0.1F);
        this.setRotateAngle(rightwing3, 0.0F, -2.7F, 0.1F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.main.offsetY = -0.2F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = -0.005F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -1.9F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, -0.3F, -1.2F);
        this.setRotateAngle(leftleg2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.0F, 0.3F, 1.2F);
        this.setRotateAngle(rightleg2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(leftwing2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(leftwing3, 0.0F, -3.15F, 0.2F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, 0.0F, -0.1F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(rightwing3, 0.0F, 3.15F, -0.2F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.main.offsetZ = 0.025F;
        this.main.offsetX = 0.0F;
        this.main.offsetY = -0.7F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, -0.3F, -1.2F);
        this.setRotateAngle(leftleg2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.0F, 0.3F, 1.2F);
        this.setRotateAngle(rightleg2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(leftwing2, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(leftwing3, 0.0F, -3.15F, 0.4F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(rightwing3, 0.0F, 3.15F, -0.4F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.main.offsetZ = -0.02F;
        this.main.offsetX = -0.0F;
        this.main.offsetY = 0.13F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.2F;
        this.main.offsetX = 0.0F;
        this.main.rotateAngleY = (float)Math.toRadians(235);
        this.main.rotateAngleX = (float)Math.toRadians(-1);
        this.main.rotateAngleZ = (float)Math.toRadians(-1);
        this.main.scaleChildren = true;
        float scaler = 0.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        if ((((EntityPrehistoricFloraAnurognathid)e).getPNType() == EntityPrehistoricFloraAnurognathid.Type.SINOMACROPS)) {
            tailFull = new AdvancedModelRenderer[]{this.tail, this.tail2, this.tail3};
        }

        EntityPrehistoricFloraAnurognathid entityAnurognathid = (EntityPrehistoricFloraAnurognathid) e;
        if (entityAnurognathid.getFlyProgress() != 0 && entityAnurognathid.getAttachmentPos() == null) {
            //flight pose
            this.setRotateAngle(cube_r1, -0.0087F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing, 0.0F, 0.1745F, 0.0F);
            this.setRotateAngle(leftwing2, 0.0F, 0.0436F, 0.0F);
            this.setRotateAngle(leftwing3, -3.0892F, 0.6101F, -3.104F);
            this.setRotateAngle(cube_r2, 0.0F, -0.4363F, 0.0F);
            this.setRotateAngle(rightwing, 0.0F, -0.1745F, 0.0F);
            this.setRotateAngle(rightwing2, 0.0F, -0.0436F, 0.0F);
            this.setRotateAngle(rightwing3, -3.0892F, -0.6101F, 3.104F);
            this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
            this.setRotateAngle(neck, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.5192F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.6501F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 1.261F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, -0.3883F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.1353F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.2749F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, -0.2793F, 0.0F, 0.0F);
            this.setRotateAngle(eye, 0.0F, 0.2051F, 0.0F);
            this.setRotateAngle(eye2, 0.0F, -0.2051F, 0.0F);
            this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg, 0.0F, 0.0F, -1.309F);
            this.setRotateAngle(membraneLeg, 0.3273F, 0.1309F, -0.2478F);
            this.setRotateAngle(leftleg2, -0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg3, 3.1416F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg, 0.0F, 0.0F, 1.309F);
            this.setRotateAngle(membraneLeg2, 0.3273F, -0.1309F, 0.2478F);
            this.setRotateAngle(rightleg2, -0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg3, 3.1416F, 0.0F, 0.0F);
            
            float speed = 1.50F;
            float fixedY = 0; //The standard offset to centre the mob

            //Animations:
            this.chainFlap(wingLeft, speed, 0.35F, 0.3F, f2, 1F);
            this.chainFlap(wingRight, speed, -0.35F, -0.3F, f2, 1F);

            this.swing(leftwing3, speed, 0.4F, false, 2.0F, 0.12F, f2, 1F);
            this.swing(rightwing3, speed, -0.4F, false, 2.0F, -0.12F, f2, 1F);

            this.swing(leftwing, speed, 0.10F, false, 2.0F, 0.08F, f2, 1F);
            this.swing(rightwing, speed, -0.10F, false, 2.0F, -0.08F, f2, 1F);

            float floatMoveZ = this.moveBoxExtended(speed * 0.3F, 0.25F, false, 4, f2, 1);
            this.main.offsetZ = floatMoveZ;
            float floatMoveY = this.moveBoxExtended(speed * 0.3F, 0.45F, false, 4, f2, 1);
            this.main.offsetY = (floatMoveY) + fixedY;

            this.chainWaveExtended(legLeft, speed, 0.055F, 0.1F, 0F, f2, 1F);
            this.chainWaveExtended(legRight, speed, -0.055F, -0.1F, 3F, f2, 1F);
            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.5F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.15F, 2.0F, f2, 1F);

        }
        else {

        }


        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



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
            xx = 0 + (((tickAnim - 0) / 7) * (-33.92909-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (4.24026-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-48.36328-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -33.92909 + (((tickAnim - 7) / 3) * (0-(-33.92909)));
            yy = 4.24026 + (((tickAnim - 7) / 3) * (30-(4.24026)));
            zz = -48.36328 + (((tickAnim - 7) / 3) * (0-(-48.36328)));
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
            xx = 0 + (((tickAnim - 20) / 7) * (-33.9291-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-4.2403-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (48.3633-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -33.9291 + (((tickAnim - 27) / 3) * (0-(-33.9291)));
            yy = -4.2403 + (((tickAnim - 27) / 3) * (-30-(-4.2403)));
            zz = 48.3633 + (((tickAnim - 27) / 3) * (0-(48.3633)));
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




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3 + (((tickAnim - 10) / 10) * (0-(-3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (3-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 3 + (((tickAnim - 30) / 10) * (0-(3)));
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
            zz = 0 + (((tickAnim - 4) / 6) * (-50-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20 + (((tickAnim - 10) / 3) * (-56.98071-(-20)));
            yy = 50 + (((tickAnim - 10) / 3) * (50.45094-(50)));
            zz = -50 + (((tickAnim - 10) / 3) * (-59.28214-(-50)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -56.98071 + (((tickAnim - 13) / 6) * (-24.99-(-56.98071)));
            yy = 50.45094 + (((tickAnim - 13) / 6) * (36.13-(50.45094)));
            zz = -59.28214 + (((tickAnim - 13) / 6) * (-42.74-(-59.28214)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -24.99 + (((tickAnim - 19) / 6) * (6.99661-(-24.99)));
            yy = 36.13 + (((tickAnim - 19) / 6) * (21.80405-(36.13)));
            zz = -42.74 + (((tickAnim - 19) / 6) * (-26.19712-(-42.74)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.99661 + (((tickAnim - 25) / 5) * (18.40821-(6.99661)));
            yy = 21.80405 + (((tickAnim - 25) / 5) * (13.18922-(21.80405)));
            zz = -26.19712 + (((tickAnim - 25) / 5) * (-12.78022-(-26.19712)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 18.40821 + (((tickAnim - 30) / 6) * (14.70597-(18.40821)));
            yy = 13.18922 + (((tickAnim - 30) / 6) * (9.45278-(13.18922)));
            zz = -12.78022 + (((tickAnim - 30) / 6) * (-9.3674-(-12.78022)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 14.70597 + (((tickAnim - 36) / 4) * (0-(14.70597)));
            yy = 9.45278 + (((tickAnim - 36) / 4) * (0-(9.45278)));
            zz = -9.3674 + (((tickAnim - 36) / 4) * (0-(-9.3674)));
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
            xx = -31.15978 + (((tickAnim - 20) / 5) * (-30.2633-(-31.15978)));
            yy = -47.97175 + (((tickAnim - 20) / 5) * (-28.67398-(-47.97175)));
            zz = 5.30496 + (((tickAnim - 20) / 5) * (-0.03205-(5.30496)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -30.2633 + (((tickAnim - 25) / 5) * (-30.01724-(-30.2633)));
            yy = -28.67398 + (((tickAnim - 25) / 5) * (-13.98782-(-28.67398)));
            zz = -0.03205 + (((tickAnim - 25) / 5) * (-3.63933-(-0.03205)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -30.01724 + (((tickAnim - 30) / 6) * (2.5-(-30.01724)));
            yy = -13.98782 + (((tickAnim - 30) / 6) * (0-(-13.98782)));
            zz = -3.63933 + (((tickAnim - 30) / 6) * (0-(-3.63933)));
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
            xx = 77.89072 + (((tickAnim - 10) / 3) * (71.20411-(77.89072)));
            yy = -31.18906 + (((tickAnim - 10) / 3) * (-59.0476-(-31.18906)));
            zz = -30.70583 + (((tickAnim - 10) / 3) * (-31.72391-(-30.70583)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 71.20411 + (((tickAnim - 13) / 6) * (51.8165-(71.20411)));
            yy = -59.0476 + (((tickAnim - 13) / 6) * (-55.47092-(-59.0476)));
            zz = -31.72391 + (((tickAnim - 13) / 6) * (-8.21071-(-31.72391)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 51.8165 + (((tickAnim - 19) / 6) * (21.53353-(51.8165)));
            yy = -55.47092 + (((tickAnim - 19) / 6) * (-42.36985-(-55.47092)));
            zz = -8.21071 + (((tickAnim - 19) / 6) * (10.18989-(-8.21071)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 21.53353 + (((tickAnim - 25) / 5) * (14.47959-(21.53353)));
            yy = -42.36985 + (((tickAnim - 25) / 5) * (-22.81453-(-42.36985)));
            zz = 10.18989 + (((tickAnim - 25) / 5) * (5.48687-(10.18989)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 14.47959 + (((tickAnim - 30) / 6) * (22.5-(14.47959)));
            yy = -22.81453 + (((tickAnim - 30) / 6) * (0-(-22.81453)));
            zz = 5.48687 + (((tickAnim - 30) / 6) * (0-(5.48687)));
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
            xx = -19.98 + (((tickAnim - 0) / 5) * (6.99661-(-19.98)));
            yy = -33.89 + (((tickAnim - 0) / 5) * (-21.804-(-33.89)));
            zz = 40.15 + (((tickAnim - 0) / 5) * (26.1971-(40.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 6.99661 + (((tickAnim - 5) / 5) * (18.40821-(6.99661)));
            yy = -21.804 + (((tickAnim - 5) / 5) * (-13.1892-(-21.804)));
            zz = 26.1971 + (((tickAnim - 5) / 5) * (12.7802-(26.1971)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 18.40821 + (((tickAnim - 10) / 6) * (14.70597-(18.40821)));
            yy = -13.1892 + (((tickAnim - 10) / 6) * (-9.4528-(-13.1892)));
            zz = 12.7802 + (((tickAnim - 10) / 6) * (9.3674-(12.7802)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 14.70597 + (((tickAnim - 16) / 4) * (0-(14.70597)));
            yy = -9.4528 + (((tickAnim - 16) / 4) * (0-(-9.4528)));
            zz = 9.3674 + (((tickAnim - 16) / 4) * (0-(9.3674)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (-50-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (50-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -20 + (((tickAnim - 30) / 3) * (-56.98071-(-20)));
            yy = -50 + (((tickAnim - 30) / 3) * (-50.4509-(-50)));
            zz = 50 + (((tickAnim - 30) / 3) * (59.2821-(50)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -56.98071 + (((tickAnim - 33) / 6) * (-24.99-(-56.98071)));
            yy = -50.4509 + (((tickAnim - 33) / 6) * (-36.13-(-50.4509)));
            zz = 59.2821 + (((tickAnim - 33) / 6) * (42.74-(59.2821)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -24.99 + (((tickAnim - 39) / 1) * (-20.42-(-24.99)));
            yy = -36.13 + (((tickAnim - 39) / 1) * (-34.08-(-36.13)));
            zz = 42.74 + (((tickAnim - 39) / 1) * (40.38-(42.74)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -31.15978 + (((tickAnim - 0) / 5) * (-30.2633-(-31.15978)));
            yy = 47.9718 + (((tickAnim - 0) / 5) * (28.674-(47.9718)));
            zz = -5.305 + (((tickAnim - 0) / 5) * (0.032-(-5.305)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -30.2633 + (((tickAnim - 5) / 5) * (-30.01724-(-30.2633)));
            yy = 28.674 + (((tickAnim - 5) / 5) * (13.9878-(28.674)));
            zz = 0.032 + (((tickAnim - 5) / 5) * (3.6393-(0.032)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -30.01724 + (((tickAnim - 10) / 6) * (2.5-(-30.01724)));
            yy = 13.9878 + (((tickAnim - 10) / 6) * (0-(13.9878)));
            zz = 3.6393 + (((tickAnim - 10) / 6) * (0-(3.6393)));
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
            xx = 47.08 + (((tickAnim - 0) / 5) * (21.53353-(47.08)));
            yy = 53.42 + (((tickAnim - 0) / 5) * (42.3698-(53.42)));
            zz = 5.33 + (((tickAnim - 0) / 5) * (-10.1899-(5.33)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.53353 + (((tickAnim - 5) / 5) * (14.47959-(21.53353)));
            yy = 42.3698 + (((tickAnim - 5) / 5) * (22.8145-(42.3698)));
            zz = -10.1899 + (((tickAnim - 5) / 5) * (-5.4869-(-10.1899)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 14.47959 + (((tickAnim - 10) / 6) * (22.5-(14.47959)));
            yy = 22.8145 + (((tickAnim - 10) / 6) * (0-(22.8145)));
            zz = -5.4869 + (((tickAnim - 10) / 6) * (0-(-5.4869)));
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
            xx = 77.89072 + (((tickAnim - 30) / 3) * (71.20411-(77.89072)));
            yy = 31.1891 + (((tickAnim - 30) / 3) * (59.0476-(31.1891)));
            zz = 30.7058 + (((tickAnim - 30) / 3) * (31.7239-(30.7058)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 71.20411 + (((tickAnim - 33) / 6) * (51.8165-(71.20411)));
            yy = 59.0476 + (((tickAnim - 33) / 6) * (55.4709-(59.0476)));
            zz = 31.7239 + (((tickAnim - 33) / 6) * (8.2107-(31.7239)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 51.8165 + (((tickAnim - 39) / 1) * (47.49-(51.8165)));
            yy = 55.4709 + (((tickAnim - 39) / 1) * (53.6-(55.4709)));
            zz = 8.2107 + (((tickAnim - 39) / 1) * (5.58-(8.2107)));
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
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(2);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(2),0,0);
        animator.rotate(this.head, (float) Math.toRadians(3), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(5),0,0);
        animator.rotate(this.head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(3);
    }

}
