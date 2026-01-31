package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTicinosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTicinosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
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
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
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

    private ModelAnimator animator;

    public ModelTicinosuchus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 12.5F, 6.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 16, -3.1114F, -2.0197F, -0.0587F, 6, 6, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 55, 58, -1.6114F, -2.3947F, 0.8913F, 3, 1, 5, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.8886F, 0.1303F, 4.4413F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2618F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 40, 51, -1.5F, -1.0F, -2.0F, 3, 7, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.0F, -2.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7723F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 63, 38, -1.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 5.0F, 3.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 67, 5, -1.0F, 0.0F, -2.0F, 2, 3, 2, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.3F, -0.5F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1876F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 28, 63, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.1114F, 0.1303F, 4.4413F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2618F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 40, 51, -1.5F, -1.0F, -2.0F, 3, 7, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.0F, -2.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7723F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 63, 38, -1.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 5.0F, 3.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6981F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 67, 5, -1.0F, 0.0F, -2.0F, 2, 3, 2, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.3F, -0.5F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1876F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 28, 63, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.1114F, -2.0197F, 4.9413F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 21, 40, -2.5F, 0.025F, 0.0F, 5, 5, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 65, 32, -1.0F, -0.375F, 0.8F, 2, 1, 4, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.175F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0698F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 16, -2.0F, 0.025F, 0.0F, 4, 4, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 20, -1.0F, -0.575F, 0.725F, 2, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1616F, 6.3332F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1527F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 46, 28, -1.5F, 0.025F, 0.0F, 3, 3, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.675F, 5.75F);
        this.tail3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0044F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 61, -0.5F, 0.0F, -6.025F, 1, 1, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.55F, 5.675F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1702F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 40, -1.0F, 0.8057F, -0.5183F, 2, 2, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.8057F, -0.5183F);
        this.tail4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0654F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 52, 0.0F, -0.95F, 0.45F, 1, 1, 7, 0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.7807F, 6.4817F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2051F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 41, -1.0F, 0.025F, 0.0F, 2, 2, 8, -0.003F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 21, 51, -0.5F, -0.275F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1527F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 48, 10, -0.5F, 0.025F, 0.0F, 1, 1, 8, -0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.1114F, -2.1197F, 0.9413F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, 0.0F, -8.0F, 6, 7, 8, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 29, 0, -1.5F, -0.25F, -8.0F, 3, 1, 8, 0.003F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 25, 28, -2.5F, 0.0F, -5.0F, 5, 6, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 55, 51, -1.5F, -0.2F, -5.0F, 3, 1, 5, -0.003F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.35F, 4.3415F, -3.4575F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.4014F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 15, 61, -1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 4.5F, 1.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6196F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 43, 63, -1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 4.1851F, -0.2071F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2182F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 29, 10, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.35F, 4.3415F, -3.4575F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.4014F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 15, 61, -1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 4.5F, 1.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6196F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 43, 63, -1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 4.1851F, -0.2071F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2182F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 29, 10, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.187F, -3.7956F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.1004F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 29, -2.0F, 0.0F, -5.0F, 4, 5, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 65, 26, -1.0F, -0.2F, -5.0F, 2, 1, 4, 0.003F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0087F, -4.4498F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0436F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 52, 0, -1.5F, 0.0F, -4.0F, 3, 4, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.25F, -4.0F);
        this.neck2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 65, 20, -1.0F, -0.3F, -0.2F, 2, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 63, 65, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 37, 71, -1.0F, 0.2615F, -5.8136F, 2, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 2.3252F, -4.13F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0916F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 63, 47, -0.5F, -1.0F, 2.075F, 3, 1, 2, 0.003F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 69, 0.0F, -0.975F, 0.55F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.6944F, -6.9412F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 70, -1.4F, 0.5F, 0.65F, 0, 1, 3, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 70, 0.4F, 0.5F, 0.65F, 0, 1, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 67, 0, -1.5F, 0.25F, 0.55F, 2, 1, 3, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.2615F, -5.8136F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.8727F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 71, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.7387F, -2.4122F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0894F, -0.2173F, -0.0193F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 71, -0.475F, -0.325F, -0.275F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.7387F, -2.4122F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0894F, 0.2173F, 0.0193F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 71, -0.525F, -0.325F, -0.275F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 65, -1.0F, 0.0F, -2.975F, 2, 2, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.6976F, -0.3883F);
        this.head.addChild(jaw);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.4565F, -3.7977F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2225F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 71, -1.0F, -1.05F, -2.475F, 2, 1, 1, -0.009F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.4565F, -3.7977F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3098F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 70, -0.8F, -1.275F, -2.3F, 0, 1, 3, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 70, 0.8F, -1.275F, -2.3F, 0, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.4632F, -3.6948F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2225F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 69, -1.0F, -1.025F, -1.975F, 2, 1, 2, -0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.1894F, -1.7501F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1789F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 70, -0.5F, -0.025F, -1.8F, 2, 1, 2, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.3724F, -3.7417F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0916F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 67, 15, -0.5F, -1.5F, 2.05F, 2, 2, 2, -0.01F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 67, 11, -1.0F, 0.0F, 2.075F, 3, 1, 2, 0.0F, false));

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

        EntityPrehistoricFloraTicinosuchus EntityMegalosaurus = (EntityPrehistoricFloraTicinosuchus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

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
        EntityPrehistoricFloraTicinosuchus entity = (EntityPrehistoricFloraTicinosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15.75 + (((tickAnim - 5) / 5) * (-7.5-(15.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 10) / 5) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.75 + (((tickAnim - 5) / 5) * (-6.75-(-13.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -6.75 + (((tickAnim - 10) / 5) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0.6-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.6 + (((tickAnim - 5) / 5) * (0-(0.6)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4.75 + (((tickAnim - 3) / 2) * (-10.5-(4.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10.5 + (((tickAnim - 5) / 3) * (-11.25-(-10.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.25 + (((tickAnim - 8) / 2) * (9.5-(-11.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 9.5 + (((tickAnim - 10) / 5) * (0-(9.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.75 + (((tickAnim - 5) / 3) * (31.75-(4.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31.75 + (((tickAnim - 8) / 2) * (0-(31.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTicinosuchus entity = (EntityPrehistoricFloraTicinosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.025 + (((tickAnim - 10) / 10) * (0-(0.025)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 10) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (-0.075-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.075 + (((tickAnim - 10) / 10) * (0-(-0.075)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (29.63-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 29.63 + (((tickAnim - 5) / 5) * (15.75-(29.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 15.75 + (((tickAnim - 10) / 3) * (28-(15.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 28 + (((tickAnim - 13) / 7) * (0-(28)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (-0.19-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.19 + (((tickAnim - 5) / 5) * (-0.1-(-0.19)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -0.1 + (((tickAnim - 10) / 3) * (-0.25-(-0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = -0.25 + (((tickAnim - 13) / 7) * (0-(-0.25)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 24.25 + (((tickAnim - 5) / 5) * (0-(24.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTicinosuchus entity = (EntityPrehistoricFloraTicinosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7 + (((tickAnim - 20) / 10) * (-7-(-7)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 30) / 20) * (0-(-7)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.9-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -4.2 + (((tickAnim - 20) / 10) * (-4.2-(-4.2)));
            zz = 1.9 + (((tickAnim - 20) / 10) * (1.9-(1.9)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -4.2 + (((tickAnim - 30) / 20) * (0-(-4.2)));
            zz = 1.9 + (((tickAnim - 30) / 20) * (0-(1.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -30.5 + (((tickAnim - 20) / 10) * (-30.5-(-30.5)));
            yy = -5 + (((tickAnim - 20) / 10) * (-5-(-5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -30.5 + (((tickAnim - 30) / 20) * (0-(-30.5)));
            yy = -5 + (((tickAnim - 30) / 20) * (0-(-5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.75 + (((tickAnim - 20) / 10) * (46.75-(46.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 46.75 + (((tickAnim - 30) / 20) * (0-(46.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9 + (((tickAnim - 20) / 10) * (-9-(-9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 30) / 20) * (0-(-9)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -30.5 + (((tickAnim - 20) / 10) * (-30.5-(-30.5)));
            yy = 5 + (((tickAnim - 20) / 10) * (5-(5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -30.5 + (((tickAnim - 30) / 20) * (0-(-30.5)));
            yy = 5 + (((tickAnim - 30) / 20) * (0-(5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.75 + (((tickAnim - 20) / 10) * (46.75-(46.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 46.75 + (((tickAnim - 30) / 20) * (0-(46.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9 + (((tickAnim - 20) / 10) * (-9-(-9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 30) / 20) * (0-(-9)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -11.75 + (((tickAnim - 20) / 10) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 30) / 20) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (9.25-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 20) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 2.75 + (((tickAnim - 8) / 12) * (17.75-(2.75)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.75 + (((tickAnim - 20) / 10) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 30) / 20) * (0-(17.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 11.75 + (((tickAnim - 8) / 12) * (21.25-(11.75)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21.25 + (((tickAnim - 20) / 10) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21.25 + (((tickAnim - 30) / 20) * (0-(21.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 14 + (((tickAnim - 8) / 12) * (-3.25-(14)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.25 + (((tickAnim - 20) / 10) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 30) / 20) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -11.25 + (((tickAnim - 8) / 12) * (-21-(-11.25)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21 + (((tickAnim - 20) / 10) * (-21-(-21)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 30) / 20) * (0-(-21)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 20) / 10) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 30) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 20) / 10) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 30) / 20) * (0-(8.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.01238-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (11.73955-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-5.55256-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.01238 + (((tickAnim - 20) / 10) * (-1.01238-(-1.01238)));
            yy = 11.73955 + (((tickAnim - 20) / 10) * (11.73955-(11.73955)));
            zz = -5.55256 + (((tickAnim - 20) / 10) * (-5.55256-(-5.55256)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.01238 + (((tickAnim - 30) / 20) * (0-(-1.01238)));
            yy = 11.73955 + (((tickAnim - 30) / 20) * (0-(11.73955)));
            zz = -5.55256 + (((tickAnim - 30) / 20) * (0-(-5.55256)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 20) / 10) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 30) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.19963-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-13.67246-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.31582-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21.19963 + (((tickAnim - 20) / 10) * (21.19963-(21.19963)));
            yy = -13.67246 + (((tickAnim - 20) / 10) * (-13.67246-(-13.67246)));
            zz = -3.31582 + (((tickAnim - 20) / 10) * (-3.31582-(-3.31582)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21.19963 + (((tickAnim - 30) / 20) * (0-(21.19963)));
            yy = -13.67246 + (((tickAnim - 30) / 20) * (0-(-13.67246)));
            zz = -3.31582 + (((tickAnim - 30) / 20) * (0-(-3.31582)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.01238-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.73955-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.55256-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.01238 + (((tickAnim - 20) / 10) * (-1.01238-(-1.01238)));
            yy = -11.73955 + (((tickAnim - 20) / 10) * (-11.73955-(-11.73955)));
            zz = 5.55256 + (((tickAnim - 20) / 10) * (5.55256-(5.55256)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.01238 + (((tickAnim - 30) / 20) * (0-(-1.01238)));
            yy = -11.73955 + (((tickAnim - 30) / 20) * (0-(-11.73955)));
            zz = 5.55256 + (((tickAnim - 30) / 20) * (0-(5.55256)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 20) / 10) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 30) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.19963-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (13.67246-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (3.31582-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21.19963 + (((tickAnim - 20) / 10) * (21.19963-(21.19963)));
            yy = 13.67246 + (((tickAnim - 20) / 10) * (13.67246-(13.67246)));
            zz = 3.31582 + (((tickAnim - 20) / 10) * (3.31582-(3.31582)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21.19963 + (((tickAnim - 30) / 20) * (0-(21.19963)));
            yy = 13.67246 + (((tickAnim - 30) / 20) * (0-(13.67246)));
            zz = 3.31582 + (((tickAnim - 30) / 20) * (0-(3.31582)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11 + (((tickAnim - 20) / 10) * (11-(11)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 11 + (((tickAnim - 30) / 20) * (0-(11)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 10) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.2 + (((tickAnim - 30) / 20) * (0-(0.2)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTicinosuchus entity = (EntityPrehistoricFloraTicinosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (35.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 35.25 + (((tickAnim - 10) / 13) * (-12.62-(35.25)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.62 + (((tickAnim - 23) / 2) * (0-(-12.62)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (35.25-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 35.25 + (((tickAnim - 35) / 13) * (-12.62-(35.25)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -12.62 + (((tickAnim - 48) / 2) * (0-(-12.62)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (25-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 25 + (((tickAnim - 18) / 7) * (0-(25)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (25-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 43) / 7) * (0-(25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 16 + (((tickAnim - 10) / 8) * (-37.5-(16)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -37.5 + (((tickAnim - 18) / 4) * (-37.5-(-37.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -37.5 + (((tickAnim - 22) / 3) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (16-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 16 + (((tickAnim - 35) / 8) * (-37.5-(16)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -37.5 + (((tickAnim - 43) / 4) * (-37.5-(-37.5)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -37.5 + (((tickAnim - 47) / 3) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (54-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 54 + (((tickAnim - 10) / 8) * (79.25-(54)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 79.25 + (((tickAnim - 18) / 4) * (79.25-(79.25)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 79.25 + (((tickAnim - 22) / 3) * (0-(79.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (54-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 54 + (((tickAnim - 35) / 8) * (79.25-(54)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 79.25 + (((tickAnim - 43) / 4) * (79.25-(79.25)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 79.25 + (((tickAnim - 47) / 3) * (0-(79.25)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.425-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0.65 + (((tickAnim - 10) / 8) * (1.035-(0.65)));
            zz = -0.425 + (((tickAnim - 10) / 8) * (-0.44-(-0.425)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.035 + (((tickAnim - 18) / 4) * (1.035-(1.035)));
            zz = -0.44 + (((tickAnim - 18) / 4) * (-0.44-(-0.44)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 1.035 + (((tickAnim - 22) / 3) * (0-(1.035)));
            zz = -0.44 + (((tickAnim - 22) / 3) * (0-(-0.44)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0.65-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (-0.425-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0.65 + (((tickAnim - 35) / 8) * (1.035-(0.65)));
            zz = -0.425 + (((tickAnim - 35) / 8) * (-0.44-(-0.425)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            yy = 1.035 + (((tickAnim - 43) / 4) * (1.035-(1.035)));
            zz = -0.44 + (((tickAnim - 43) / 4) * (-0.44-(-0.44)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 1.035 + (((tickAnim - 47) / 3) * (0-(1.035)));
            zz = -0.44 + (((tickAnim - 47) / 3) * (0-(-0.44)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);

    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTicinosuchus entity = (EntityPrehistoricFloraTicinosuchus) entitylivingbaseIn;
        int animCycle = 180;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -2.5 + (((tickAnim - 40) / 105) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -2.5 + (((tickAnim - 145) / 35) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.6-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = -0.6 + (((tickAnim - 40) / 105) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = -0.6 + (((tickAnim - 145) / 35) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 8.75 + (((tickAnim - 40) / 105) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 8.75 + (((tickAnim - 145) / 35) * (0-(8.75)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -3.25 + (((tickAnim - 40) / 105) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -3.25 + (((tickAnim - 145) / 35) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.98018-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.11895-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.32-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -2.98018 + (((tickAnim - 40) / 105) * (-2.98018-(-2.98018)));
            yy = -0.11895 + (((tickAnim - 40) / 105) * (-0.11895-(-0.11895)));
            zz = -0.32 + (((tickAnim - 40) / 105) * (-0.32-(-0.32)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -2.98018 + (((tickAnim - 145) / 35) * (0-(-2.98018)));
            yy = -0.11895 + (((tickAnim - 145) / 35) * (0-(-0.11895)));
            zz = -0.32 + (((tickAnim - 145) / 35) * (0-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 8.75 + (((tickAnim - 40) / 105) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 8.75 + (((tickAnim - 145) / 35) * (0-(8.75)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -3.25 + (((tickAnim - 40) / 105) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -3.25 + (((tickAnim - 145) / 35) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.98018-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.11895-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.32-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -2.98018 + (((tickAnim - 40) / 105) * (-2.98018-(-2.98018)));
            yy = -0.11895 + (((tickAnim - 40) / 105) * (-0.11895-(-0.11895)));
            zz = -0.32 + (((tickAnim - 40) / 105) * (-0.32-(-0.32)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -2.98018 + (((tickAnim - 145) / 35) * (0-(-2.98018)));
            yy = -0.11895 + (((tickAnim - 145) / 35) * (0-(-0.11895)));
            zz = -0.32 + (((tickAnim - 145) / 35) * (0-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-1.50301-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1.73875-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-0.19817-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 145) {
            xx = -1.50301 + (((tickAnim - 80) / 65) * (-1.5-(-1.50301)));
            yy = 1.73875 + (((tickAnim - 80) / 65) * (0-(1.73875)));
            zz = -0.19817 + (((tickAnim - 80) / 65) * (0-(-0.19817)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -1.5 + (((tickAnim - 145) / 35) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-3.55007-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (6.18108-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-0.92741-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 145) {
            xx = -3.55007 + (((tickAnim - 80) / 65) * (-3.5-(-3.55007)));
            yy = 6.18108 + (((tickAnim - 80) / 65) * (0-(6.18108)));
            zz = -0.92741 + (((tickAnim - 80) / 65) * (0-(-0.92741)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -3.5 + (((tickAnim - 145) / 35) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (4.22902-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (6.4895-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-0.37009-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 145) {
            xx = 4.22902 + (((tickAnim - 80) / 65) * (4.25-(4.22902)));
            yy = 6.4895 + (((tickAnim - 80) / 65) * (0-(6.4895)));
            zz = -0.37009 + (((tickAnim - 80) / 65) * (0-(-0.37009)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 4.25 + (((tickAnim - 145) / 35) * (0-(4.25)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (7.01195-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (6.24618-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.21899-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 96) {
            xx = 7.01195 + (((tickAnim - 80) / 16) * (7.03635-(7.01195)));
            yy = 6.24618 + (((tickAnim - 80) / 16) * (10.38858-(6.24618)));
            zz = 0.21899 + (((tickAnim - 80) / 16) * (0.3675-(0.21899)));
        }
        else if (tickAnim >= 96 && tickAnim < 145) {
            xx = 7.03635 + (((tickAnim - 96) / 49) * (7.01964-(7.03635)));
            yy = 10.38858 + (((tickAnim - 96) / 49) * (7.99509-(10.38858)));
            zz = 0.3675 + (((tickAnim - 96) / 49) * (0.28102-(0.3675)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 7.01964 + (((tickAnim - 145) / 35) * (0-(7.01964)));
            yy = 7.99509 + (((tickAnim - 145) / 35) * (0-(7.99509)));
            zz = 0.28102 + (((tickAnim - 145) / 35) * (0-(0.28102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 6.75 + (((tickAnim - 40) / 40) * (6.81291-(6.75)));
            yy = 0 + (((tickAnim - 40) / 40) * (5.87383-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (1.22615-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 107) {
            xx = 6.81291 + (((tickAnim - 80) / 27) * (7.38059-(6.81291)));
            yy = 5.87383 + (((tickAnim - 80) / 27) * (17.56197-(5.87383)));
            zz = 1.22615 + (((tickAnim - 80) / 27) * (3.79298-(1.22615)));
        }
        else if (tickAnim >= 107 && tickAnim < 145) {
            xx = 7.38059 + (((tickAnim - 107) / 38) * (6.82971-(7.38059)));
            yy = 17.56197 + (((tickAnim - 107) / 38) * (6.60792-(17.56197)));
            zz = 3.79298 + (((tickAnim - 107) / 38) * (1.38071-(3.79298)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 6.82971 + (((tickAnim - 145) / 35) * (0-(6.82971)));
            yy = 6.60792 + (((tickAnim - 145) / 35) * (0-(6.60792)));
            zz = 1.38071 + (((tickAnim - 145) / 35) * (0-(1.38071)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-14.25-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 80) / 16) * (0-(0)));
            yy = -14.25 + (((tickAnim - 80) / 16) * (15.75-(-14.25)));
            zz = 0 + (((tickAnim - 80) / 16) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 96) / 49) * (0-(0)));
            yy = 15.75 + (((tickAnim - 96) / 49) * (15.75-(15.75)));
            zz = 0 + (((tickAnim - 96) / 49) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            yy = 15.75 + (((tickAnim - 145) / 35) * (0-(15.75)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 1.5 + (((tickAnim - 40) / 105) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 1.5 + (((tickAnim - 145) / 35) * (0-(1.5)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -3.25 + (((tickAnim - 40) / 105) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -3.25 + (((tickAnim - 145) / 35) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -23.25 + (((tickAnim - 40) / 105) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 165) {
            xx = -23.25 + (((tickAnim - 145) / 20) * (20.04-(-23.25)));
            yy = 0 + (((tickAnim - 145) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 20) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 20.04 + (((tickAnim - 165) / 15) * (0-(20.04)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28.12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -28.12 + (((tickAnim - 20) / 20) * (15.25-(-28.12)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 15.25 + (((tickAnim - 40) / 105) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 165) {
            xx = 15.25 + (((tickAnim - 145) / 20) * (-38.21-(15.25)));
            yy = 0 + (((tickAnim - 145) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 20) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = -38.21 + (((tickAnim - 165) / 15) * (0-(-38.21)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (91-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 91 + (((tickAnim - 20) / 20) * (12.25-(91)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 12.25 + (((tickAnim - 40) / 105) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 165) {
            xx = 12.25 + (((tickAnim - 145) / 20) * (92.32-(12.25)));
            yy = 0 + (((tickAnim - 145) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 20) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 92.32 + (((tickAnim - 165) / 15) * (0-(92.32)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.655-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 1.655 + (((tickAnim - 20) / 20) * (0.2-(1.655)));
            zz = -1.5 + (((tickAnim - 20) / 20) * (0-(-1.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            yy = 0.2 + (((tickAnim - 40) / 105) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 145) / 20) * (0-(0)));
            yy = 0.2 + (((tickAnim - 145) / 20) * (1.265-(0.2)));
            zz = 0 + (((tickAnim - 145) / 20) * (-1.575-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 1.265 + (((tickAnim - 165) / 15) * (0-(1.265)));
            zz = -1.575 + (((tickAnim - 165) / 15) * (0-(-1.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 1.75 + (((tickAnim - 40) / 105) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 1.75 + (((tickAnim - 145) / 35) * (0-(1.75)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 16.75 + (((tickAnim - 40) / 105) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 16.75 + (((tickAnim - 145) / 35) * (0-(16.75)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            yy = -0.075 + (((tickAnim - 40) / 105) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            yy = -0.075 + (((tickAnim - 145) / 35) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -18 + (((tickAnim - 40) / 105) * (-18-(-18)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -18 + (((tickAnim - 145) / 35) * (0-(-18)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            yy = -0.35 + (((tickAnim - 40) / 105) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            yy = -0.35 + (((tickAnim - 145) / 35) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -5.25 + (((tickAnim - 40) / 20) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5.25 + (((tickAnim - 60) / 20) * (-4.5-(-5.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -4.5 + (((tickAnim - 80) / 25) * (-4.24686-(-4.5)));
            yy = 0 + (((tickAnim - 80) / 25) * (-9.63994-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (-0.3632-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 128) {
            xx = -4.24686 + (((tickAnim - 105) / 23) * (-4.24686-(-4.24686)));
            yy = -9.63994 + (((tickAnim - 105) / 23) * (-9.63994-(-9.63994)));
            zz = -0.3632 + (((tickAnim - 105) / 23) * (-0.3632-(-0.3632)));
        }
        else if (tickAnim >= 128 && tickAnim < 145) {
            xx = -4.24686 + (((tickAnim - 128) / 17) * (-6.99686-(-4.24686)));
            yy = -9.63994 + (((tickAnim - 128) / 17) * (-9.63994-(-9.63994)));
            zz = -0.3632 + (((tickAnim - 128) / 17) * (-0.3632-(-0.3632)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -6.99686 + (((tickAnim - 145) / 35) * (0-(-6.99686)));
            yy = -9.63994 + (((tickAnim - 145) / 35) * (0-(-9.63994)));
            zz = -0.3632 + (((tickAnim - 145) / 35) * (0-(-0.3632)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5 + (((tickAnim - 40) / 5) * (-4.25-(-5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 45) / 5) * (-5-(-4.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -5 + (((tickAnim - 50) / 5) * (-4.25-(-5)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -4.25 + (((tickAnim - 55) / 5) * (-5-(-4.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 60) / 20) * (-6-(-5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -6 + (((tickAnim - 80) / 13) * (-8.5781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(-6)));
            yy = 0 + (((tickAnim - 80) / 13) * (-7.0642-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (-0.18835-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 105) {
            xx = -8.5781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 93) / 12) * (-5.959-(-8.5781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            yy = -7.0642 + (((tickAnim - 93) / 12) * (-13.24538-(-7.0642)));
            zz = -0.18835 + (((tickAnim - 93) / 12) * (-0.35316-(-0.18835)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = -5.959 + (((tickAnim - 105) / 5) * (-5.459-(-5.959)));
            yy = -13.24538 + (((tickAnim - 105) / 5) * (-13.24538-(-13.24538)));
            zz = -0.35316 + (((tickAnim - 105) / 5) * (-0.35316-(-0.35316)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -5.459 + (((tickAnim - 110) / 5) * (-5.959-(-5.459)));
            yy = -13.24538 + (((tickAnim - 110) / 5) * (-13.24538-(-13.24538)));
            zz = -0.35316 + (((tickAnim - 110) / 5) * (-0.35316-(-0.35316)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = -5.959 + (((tickAnim - 115) / 5) * (-5.459-(-5.959)));
            yy = -13.24538 + (((tickAnim - 115) / 5) * (-13.24538-(-13.24538)));
            zz = -0.35316 + (((tickAnim - 115) / 5) * (-0.35316-(-0.35316)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = -5.459 + (((tickAnim - 120) / 5) * (-5.959-(-5.459)));
            yy = -13.24538 + (((tickAnim - 120) / 5) * (-13.24538-(-13.24538)));
            zz = -0.35316 + (((tickAnim - 120) / 5) * (-0.35316-(-0.35316)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = -5.959 + (((tickAnim - 125) / 5) * (-5.959-(-5.959)));
            yy = -13.24538 + (((tickAnim - 125) / 5) * (-13.24538-(-13.24538)));
            zz = -0.35316 + (((tickAnim - 125) / 5) * (-0.35316-(-0.35316)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -5.959 + (((tickAnim - 130) / 15) * (-7.959-(-5.959)));
            yy = -13.24538 + (((tickAnim - 130) / 15) * (-13.24538-(-13.24538)));
            zz = -0.35316 + (((tickAnim - 130) / 15) * (-0.35316-(-0.35316)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = -7.959 + (((tickAnim - 145) / 35) * (0-(-7.959)));
            yy = -13.24538 + (((tickAnim - 145) / 35) * (0-(-13.24538)));
            zz = -0.35316 + (((tickAnim - 145) / 35) * (0-(-0.35316)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 11.5 + (((tickAnim - 40) / 5) * (9.5-(11.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 45) / 5) * (11.5-(9.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 11.5 + (((tickAnim - 50) / 5) * (9.5-(11.5)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 9.5 + (((tickAnim - 55) / 5) * (11.5-(9.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 11.5 + (((tickAnim - 60) / 20) * (10.5-(11.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 10.5 + (((tickAnim - 80) / 13) * (4.5183+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-10))*10-(10.5)));
            yy = 0 + (((tickAnim - 80) / 13) * (-3.37745-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (-0.78302-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 110) {
            xx = 4.5183+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-10))*10 + (((tickAnim - 93) / 17) * (8.83122-(4.5183+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-10))*10)));
            yy = -3.37745 + (((tickAnim - 93) / 17) * (-6.33271-(-3.37745)));
            zz = -0.78302 + (((tickAnim - 93) / 17) * (-1.46817-(-0.78302)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 8.83122 + (((tickAnim - 110) / 5) * (10.58122-(8.83122)));
            yy = -6.33271 + (((tickAnim - 110) / 5) * (-6.33271-(-6.33271)));
            zz = -1.46817 + (((tickAnim - 110) / 5) * (-1.46817-(-1.46817)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 10.58122 + (((tickAnim - 115) / 5) * (8.83122-(10.58122)));
            yy = -6.33271 + (((tickAnim - 115) / 5) * (-6.33271-(-6.33271)));
            zz = -1.46817 + (((tickAnim - 115) / 5) * (-1.46817-(-1.46817)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 8.83122 + (((tickAnim - 120) / 5) * (10.58122-(8.83122)));
            yy = -6.33271 + (((tickAnim - 120) / 5) * (-6.33271-(-6.33271)));
            zz = -1.46817 + (((tickAnim - 120) / 5) * (-1.46817-(-1.46817)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 10.58122 + (((tickAnim - 125) / 5) * (10.58122-(10.58122)));
            yy = -6.33271 + (((tickAnim - 125) / 5) * (-6.33271-(-6.33271)));
            zz = -1.46817 + (((tickAnim - 125) / 5) * (-1.46817-(-1.46817)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 10.58122 + (((tickAnim - 130) / 15) * (16.08122-(10.58122)));
            yy = -6.33271 + (((tickAnim - 130) / 15) * (-6.33271-(-6.33271)));
            zz = -1.46817 + (((tickAnim - 130) / 15) * (-1.46817-(-1.46817)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 16.08122 + (((tickAnim - 145) / 35) * (0-(16.08122)));
            yy = -6.33271 + (((tickAnim - 145) / 35) * (0-(-6.33271)));
            zz = -1.46817 + (((tickAnim - 145) / 35) * (0-(-1.46817)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 0) / 145) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 145) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (3.75-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = 3.75 + (((tickAnim - 87) / 6) * (0-(3.75)));
            yy = 0 + (((tickAnim - 87) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 6) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 93) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 37) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 130) / 5) * (3.75-(0)));
            yy = 0 + (((tickAnim - 130) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 5) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = 3.75 + (((tickAnim - 135) / 5) * (0-(3.75)));
            yy = 0 + (((tickAnim - 135) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTicinosuchus entity = (EntityPrehistoricFloraTicinosuchus) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.24532-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.36919-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.45387-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -4.24532 + (((tickAnim - 18) / 15) * (0-(-4.24532)));
            yy = 0.36919 + (((tickAnim - 18) / 15) * (0-(0.36919)));
            zz = 1.45387 + (((tickAnim - 18) / 15) * (0-(1.45387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.8768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.05232-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (3.99966-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -4.8768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*5 + (((tickAnim - 18) / 15) * (0-(-4.8768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*5)));
            yy = -0.05232 + (((tickAnim - 18) / 15) * (0-(-0.05232)));
            zz = 3.99966 + (((tickAnim - 18) / 15) * (0-(3.99966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0.25 + (((tickAnim - 18) / 15) * (0-(0.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0.325 + (((tickAnim - 18) / 15) * (0-(0.325)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-9.11-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -9.11 + (((tickAnim - 8) / 10) * (5.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130+50))*-15-(-9.11)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 5.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130+50))*-15 + (((tickAnim - 18) / 7) * (9.38-(5.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130+50))*-15)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 9.38 + (((tickAnim - 25) / 8) * (0-(9.38)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.55-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0.55 + (((tickAnim - 8) / 17) * (-0.08-(0.55)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = -0.08 + (((tickAnim - 25) / 8) * (0-(-0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 18) / 15) * (0-(17.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(0);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(0);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(0);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTicinosuchus entity = (EntityPrehistoricFloraTicinosuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+80))*10), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+50))*2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+150))*-2.5);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -41.18187 + (((tickAnim - 0) / 7) * (49.75-(-41.18187)));
            yy = -9.08316 + (((tickAnim - 0) / 7) * (0-(-9.08316)));
            zz = 0.38498 + (((tickAnim - 0) / 7) * (0-(0.38498)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 49.75 + (((tickAnim - 7) / 6) * (-41.18187-(49.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (-9.08316-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.38498-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 24 + (((tickAnim - 0) / 2) * (-22.44-(24)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -22.44 + (((tickAnim - 2) / 5) * (0-(-22.44)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (32.39-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.39 + (((tickAnim - 8) / 2) * (32.39-(32.39)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 32.39 + (((tickAnim - 10) / 1) * (32.39-(32.39)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 32.39 + (((tickAnim - 11) / 2) * (24-(32.39)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.75 + (((tickAnim - 0) / 2) * (15.38-(0.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 15.38 + (((tickAnim - 2) / 5) * (16.25-(15.38)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 16.25 + (((tickAnim - 7) / 3) * (-39.36-(16.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -39.36 + (((tickAnim - 10) / 3) * (0.75-(-39.36)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 2) / 1) * (-0.305-(-0.4)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.305 + (((tickAnim - 3) / 2) * (0.85-(-0.305)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 5) / 2) * (0-(0.85)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.75 + (((tickAnim - 0) / 2) * (19-(18.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19 + (((tickAnim - 2) / 1) * (-4.42-(19)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.42 + (((tickAnim - 3) / 2) * (3.43-(-4.42)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.43 + (((tickAnim - 5) / 2) * (37.29-(3.43)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 37.29 + (((tickAnim - 7) / 1) * (82.67-(37.29)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 82.67 + (((tickAnim - 8) / 2) * (89.04-(82.67)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 89.04 + (((tickAnim - 10) / 3) * (18.75-(89.04)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 2) / 1) * (0.505-(-0.35)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.505 + (((tickAnim - 3) / 2) * (1.15-(0.505)));
            zz = -0.2 + (((tickAnim - 3) / 2) * (0.5-(-0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.15 + (((tickAnim - 5) / 5) * (0.275-(1.15)));
            zz = 0.5 + (((tickAnim - 5) / 5) * (-0.8-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 3) * (0-(0.275)));
            zz = -0.8 + (((tickAnim - 10) / 3) * (0-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -41.18187 + (((tickAnim - 0) / 7) * (49.75-(-41.18187)));
            yy = 9.08316 + (((tickAnim - 0) / 7) * (0-(9.08316)));
            zz = -0.38498 + (((tickAnim - 0) / 7) * (0-(-0.38498)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 49.75 + (((tickAnim - 7) / 6) * (-41.18187-(49.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (9.08316-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.38498-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 24 + (((tickAnim - 0) / 2) * (-22.44-(24)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -22.44 + (((tickAnim - 2) / 5) * (0-(-22.44)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (32.39-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.39 + (((tickAnim - 8) / 2) * (32.39-(32.39)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 32.39 + (((tickAnim - 10) / 1) * (32.39-(32.39)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 32.39 + (((tickAnim - 11) / 2) * (24-(32.39)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.75 + (((tickAnim - 0) / 2) * (15.38-(0.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 15.38 + (((tickAnim - 2) / 5) * (16.25-(15.38)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 16.25 + (((tickAnim - 7) / 3) * (-39.36-(16.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -39.36 + (((tickAnim - 10) / 3) * (0.75-(-39.36)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 2) / 1) * (-0.305-(-0.4)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.305 + (((tickAnim - 3) / 2) * (0.85-(-0.305)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 5) / 2) * (0-(0.85)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.75 + (((tickAnim - 0) / 2) * (19-(18.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19 + (((tickAnim - 2) / 1) * (-4.42-(19)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.42 + (((tickAnim - 3) / 2) * (3.43-(-4.42)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.43 + (((tickAnim - 5) / 2) * (37.29-(3.43)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 37.29 + (((tickAnim - 7) / 1) * (82.67-(37.29)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 82.67 + (((tickAnim - 8) / 2) * (89.04-(82.67)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 89.04 + (((tickAnim - 10) / 3) * (18.75-(89.04)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 2) / 1) * (0.505-(-0.35)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.505 + (((tickAnim - 3) / 2) * (1.15-(0.505)));
            zz = -0.2 + (((tickAnim - 3) / 2) * (0.5-(-0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.15 + (((tickAnim - 5) / 5) * (0.275-(1.15)));
            zz = 0.5 + (((tickAnim - 5) / 5) * (-0.8-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 3) * (0-(0.275)));
            zz = -0.8 + (((tickAnim - 10) / 3) * (0-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+20))*-8), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*-10), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-150))*-15), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-200))*-18), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-250))*-22), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*-10), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-220))*-7), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 41.69874 + (((tickAnim - 0) / 3) * (-1.44743-(41.69874)));
            yy = 3.69123 + (((tickAnim - 0) / 3) * (7.83213-(3.69123)));
            zz = -1.54924 + (((tickAnim - 0) / 3) * (-17.52603-(-1.54924)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -1.44743 + (((tickAnim - 3) / 4) * (-34-(-1.44743)));
            yy = 7.83213 + (((tickAnim - 3) / 4) * (0-(7.83213)));
            zz = -17.52603 + (((tickAnim - 3) / 4) * (0-(-17.52603)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -34 + (((tickAnim - 7) / 6) * (41.69874-(-34)));
            yy = 0 + (((tickAnim - 7) / 6) * (3.69123-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-1.54924-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 21.74771 + (((tickAnim - 0) / 3) * (-39.25114-(21.74771)));
            yy = 4.67656 + (((tickAnim - 0) / 3) * (2.33828-(4.67656)));
            zz = 12.14324 + (((tickAnim - 0) / 3) * (6.07162-(12.14324)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -39.25114 + (((tickAnim - 3) / 4) * (10.25-(-39.25114)));
            yy = 2.33828 + (((tickAnim - 3) / 4) * (0-(2.33828)));
            zz = 6.07162 + (((tickAnim - 3) / 4) * (0-(6.07162)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 10.25 + (((tickAnim - 7) / 2) * (6.75-(10.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.75 + (((tickAnim - 9) / 4) * (21.74771-(6.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (4.67656-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (12.14324-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 85.25 + (((tickAnim - 0) / 1) * (91.63-(85.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 91.63 + (((tickAnim - 1) / 2) * (101.75-(91.63)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 101.75 + (((tickAnim - 3) / 4) * (23.25-(101.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 23.25 + (((tickAnim - 7) / 1) * (-2.67-(23.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -2.67 + (((tickAnim - 8) / 1) * (-12.25-(-2.67)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -12.25 + (((tickAnim - 9) / 1) * (-11.44-(-12.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11.44 + (((tickAnim - 10) / 3) * (85.25-(-11.44)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 2.375 + (((tickAnim - 0) / 1) * (1.505-(2.375)));
            zz = -1.575 + (((tickAnim - 0) / 1) * (-1.58-(-1.575)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 1) / 6) * (0-(0)));
            yy = 1.505 + (((tickAnim - 1) / 6) * (0.6-(1.505)));
            zz = -1.58 + (((tickAnim - 1) / 6) * (-0.15-(-1.58)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 7) / 1) * (2.025-(0.6)));
            zz = -0.15 + (((tickAnim - 7) / 1) * (0-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.025 + (((tickAnim - 8) / 1) * (1.575-(2.025)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.575 + (((tickAnim - 9) / 1) * (1.495-(1.575)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 1.495 + (((tickAnim - 10) / 1) * (1.755-(1.495)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.755 + (((tickAnim - 11) / 2) * (2.375-(1.755)));
            zz = 0 + (((tickAnim - 11) / 2) * (-1.575-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.4332 + (((tickAnim - 0) / 3) * (-1.44743-(43.4332)));
            yy = -4.39936 + (((tickAnim - 0) / 3) * (-7.83213-(-4.39936)));
            zz = 1.7833 + (((tickAnim - 0) / 3) * (17.52603-(1.7833)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -1.44743 + (((tickAnim - 3) / 4) * (-34-(-1.44743)));
            yy = -7.83213 + (((tickAnim - 3) / 4) * (0-(-7.83213)));
            zz = 17.52603 + (((tickAnim - 3) / 4) * (0-(17.52603)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -34 + (((tickAnim - 7) / 6) * (43.4332-(-34)));
            yy = 0 + (((tickAnim - 7) / 6) * (-4.39936-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (1.7833-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.74771 + (((tickAnim - 0) / 3) * (-39.25114-(13.74771)));
            yy = -4.67656 + (((tickAnim - 0) / 3) * (2.33828-(-4.67656)));
            zz = -12.14324 + (((tickAnim - 0) / 3) * (6.07162-(-12.14324)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -39.25114 + (((tickAnim - 3) / 4) * (10.25-(-39.25114)));
            yy = 2.33828 + (((tickAnim - 3) / 4) * (0-(2.33828)));
            zz = 6.07162 + (((tickAnim - 3) / 4) * (0-(6.07162)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 10.25 + (((tickAnim - 7) / 2) * (6.75-(10.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.75 + (((tickAnim - 9) / 4) * (13.74771-(6.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (-4.67656-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-12.14324-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 85.25 + (((tickAnim - 0) / 1) * (91.63-(85.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 91.63 + (((tickAnim - 1) / 2) * (101.75-(91.63)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 101.75 + (((tickAnim - 3) / 4) * (23.25-(101.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 23.25 + (((tickAnim - 7) / 1) * (-2.67-(23.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -2.67 + (((tickAnim - 8) / 1) * (-12.25-(-2.67)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -12.25 + (((tickAnim - 9) / 1) * (-11.44-(-12.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11.44 + (((tickAnim - 10) / 3) * (85.25-(-11.44)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 2.375 + (((tickAnim - 0) / 1) * (1.505-(2.375)));
            zz = -1.575 + (((tickAnim - 0) / 1) * (-1.58-(-1.575)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 1) / 6) * (0-(0)));
            yy = 1.505 + (((tickAnim - 1) / 6) * (0.6-(1.505)));
            zz = -1.58 + (((tickAnim - 1) / 6) * (-0.15-(-1.58)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 7) / 1) * (2.025-(0.6)));
            zz = -0.15 + (((tickAnim - 7) / 1) * (0-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.025 + (((tickAnim - 8) / 1) * (1.575-(2.025)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.575 + (((tickAnim - 9) / 1) * (1.495-(1.575)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 1.495 + (((tickAnim - 10) / 1) * (1.755-(1.495)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.755 + (((tickAnim - 11) / 2) * (2.375-(1.755)));
            zz = 0 + (((tickAnim - 11) / 2) * (-1.575-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-150))*7), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-250))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTicinosuchus entity = (EntityPrehistoricFloraTicinosuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.75 + (((tickAnim - 0) / 10) * (-37.48955-(22.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.96624-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.1359-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -37.48955 + (((tickAnim - 10) / 4) * (-26-(-37.48955)));
            yy = -2.96624 + (((tickAnim - 10) / 4) * (0-(-2.96624)));
            zz = 1.1359 + (((tickAnim - 10) / 4) * (0-(1.1359)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -26 + (((tickAnim - 14) / 16) * (22.75-(-26)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 34 + (((tickAnim - 3) / 4) * (34-(34)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 34 + (((tickAnim - 7) / 7) * (-6-(34)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 14) / 16) * (0-(-6)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 22.25 + (((tickAnim - 0) / 7) * (-40.25-(22.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -40.25 + (((tickAnim - 7) / 7) * (32.75-(-40.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 32.75 + (((tickAnim - 14) / 6) * (11.75-(32.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11.75 + (((tickAnim - 20) / 10) * (22.25-(11.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.1 + (((tickAnim - 14) / 6) * (0-(0.1)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 47 + (((tickAnim - 0) / 3) * (83.15-(47)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 83.15 + (((tickAnim - 3) / 7) * (61.08-(83.15)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 61.08 + (((tickAnim - 10) / 4) * (0-(61.08)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (47-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.88 + (((tickAnim - 0) / 3) * (0.15-(1.88)));
            zz = -0.05 + (((tickAnim - 0) / 3) * (-1.155-(-0.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 3) / 7) * (0.745-(0.15)));
            zz = -1.155 + (((tickAnim - 3) / 7) * (-0.765-(-1.155)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.745 + (((tickAnim - 10) / 4) * (0-(0.745)));
            zz = -0.765 + (((tickAnim - 10) / 4) * (0-(-0.765)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0.335-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.335 + (((tickAnim - 18) / 2) * (0.375-(0.335)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 20) / 5) * (1.805-(0.375)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.28-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.805 + (((tickAnim - 25) / 5) * (1.88-(1.805)));
            zz = 0.28 + (((tickAnim - 25) / 5) * (-0.05-(0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -26 + (((tickAnim - 0) / 16) * (22.75-(-26)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 22.75 + (((tickAnim - 16) / 10) * (-38.16455-(22.75)));
            yy = 0 + (((tickAnim - 16) / 10) * (2.96624-(0)));
            zz = 0 + (((tickAnim - 16) / 10) * (-1.1359-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -38.16455 + (((tickAnim - 26) / 4) * (-26-(-38.16455)));
            yy = 2.96624 + (((tickAnim - 26) / 4) * (0-(2.96624)));
            zz = -1.1359 + (((tickAnim - 26) / 4) * (0-(-1.1359)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -6 + (((tickAnim - 0) / 16) * (0-(-6)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (34-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 34 + (((tickAnim - 19) / 4) * (34-(34)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 34 + (((tickAnim - 23) / 7) * (-6-(34)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 32.75 + (((tickAnim - 0) / 6) * (11.75-(32.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 11.75 + (((tickAnim - 6) / 10) * (22.25-(11.75)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 22.25 + (((tickAnim - 16) / 7) * (-40.25-(22.25)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -40.25 + (((tickAnim - 23) / 7) * (32.75-(-40.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 6) * (0-(0.1)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 6) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 24) * (0.1-(0)));
            zz = 0 + (((tickAnim - 6) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 6) / 10) * (47-(0)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 47 + (((tickAnim - 16) / 2) * (83.15-(47)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 83.15 + (((tickAnim - 18) / 8) * (61.08-(83.15)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 61.08 + (((tickAnim - 26) / 4) * (0-(61.08)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.335-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.335 + (((tickAnim - 3) / 3) * (0.375-(0.335)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 6) / 5) * (1.805-(0.375)));
            zz = 0 + (((tickAnim - 6) / 5) * (0.28-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 1.805 + (((tickAnim - 11) / 5) * (1.88-(1.805)));
            zz = 0.28 + (((tickAnim - 11) / 5) * (-0.05-(0.28)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.88 + (((tickAnim - 16) / 2) * (0.15-(1.88)));
            zz = -0.05 + (((tickAnim - 16) / 2) * (-1.155-(-0.05)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0.15 + (((tickAnim - 18) / 8) * (0.745-(0.15)));
            zz = -1.155 + (((tickAnim - 18) / 8) * (-0.765-(-1.155)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.745 + (((tickAnim - 26) / 4) * (0-(0.745)));
            zz = -0.765 + (((tickAnim - 26) / 4) * (0-(-0.765)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -35.38932 + (((tickAnim - 0) / 9) * (0-(-35.38932)));
            yy = 10.47152 + (((tickAnim - 0) / 9) * (0-(10.47152)));
            zz = -6.73517 + (((tickAnim - 0) / 9) * (0-(-6.73517)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (24.40263-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (-3.61018-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (3.08897-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 24.40263 + (((tickAnim - 15) / 8) * (-6.45319-(24.40263)));
            yy = -3.61018 + (((tickAnim - 15) / 8) * (6.7347-(-3.61018)));
            zz = 3.08897 + (((tickAnim - 15) / 8) * (-12.62109-(3.08897)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -6.45319 + (((tickAnim - 23) / 7) * (-35.38932-(-6.45319)));
            yy = 6.7347 + (((tickAnim - 23) / 7) * (10.47152-(6.7347)));
            zz = -12.62109 + (((tickAnim - 23) / 7) * (-6.73517-(-12.62109)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 11.5 + (((tickAnim - 0) / 15) * (19.25-(11.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 19.25 + (((tickAnim - 15) / 8) * (-42.12-(19.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -42.12 + (((tickAnim - 23) / 7) * (11.5-(-42.12)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 23.4467 + (((tickAnim - 0) / 7) * (-5.5-(23.4467)));
            yy = -12.19858 + (((tickAnim - 0) / 7) * (0-(-12.19858)));
            zz = 0.20035 + (((tickAnim - 0) / 7) * (0-(0.20035)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -5.5 + (((tickAnim - 7) / 8) * (55.75-(-5.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 55.75 + (((tickAnim - 15) / 2) * (95-(55.75)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 95 + (((tickAnim - 17) / 6) * (104-(95)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 104 + (((tickAnim - 23) / 7) * (23.4467-(104)));
            yy = 0 + (((tickAnim - 23) / 7) * (-12.19858-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0.20035-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.225 + (((tickAnim - 0) / 2) * (0.17-(-0.225)));
            yy = 0.3 + (((tickAnim - 0) / 2) * (0.21-(0.3)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.17 + (((tickAnim - 2) / 1) * (0.12-(0.17)));
            yy = 0.21 + (((tickAnim - 2) / 1) * (0.12-(0.21)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.12 + (((tickAnim - 3) / 4) * (0-(0.12)));
            yy = 0.12 + (((tickAnim - 3) / 4) * (0.35-(0.12)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 7) / 4) * (1.865-(0.35)));
            zz = 0 + (((tickAnim - 7) / 4) * (-0.44-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1.865 + (((tickAnim - 11) / 4) * (1.525-(1.865)));
            zz = -0.44 + (((tickAnim - 11) / 4) * (-0.875-(-0.44)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 1.525 + (((tickAnim - 15) / 2) * (1.675-(1.525)));
            zz = -0.875 + (((tickAnim - 15) / 2) * (-1.58-(-0.875)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.675 + (((tickAnim - 17) / 2) * (1.665-(1.675)));
            zz = -1.58 + (((tickAnim - 17) / 2) * (-1.735-(-1.58)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.665 + (((tickAnim - 19) / 4) * (0.705-(1.665)));
            zz = -1.735 + (((tickAnim - 19) / 4) * (-1.645-(-1.735)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (-0.225-(0)));
            yy = 0.705 + (((tickAnim - 23) / 7) * (0.3-(0.705)));
            zz = -1.645 + (((tickAnim - 23) / 7) * (0-(-1.645)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 24.49526 + (((tickAnim - 0) / 8) * (-6.45319-(24.49526)));
            yy = 1.21569 + (((tickAnim - 0) / 8) * (-6.7347-(1.21569)));
            zz = -0.88938 + (((tickAnim - 0) / 8) * (12.62109-(-0.88938)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -6.45319 + (((tickAnim - 8) / 7) * (-35.38932-(-6.45319)));
            yy = -6.7347 + (((tickAnim - 8) / 7) * (-10.47152-(-6.7347)));
            zz = 12.62109 + (((tickAnim - 8) / 7) * (6.73517-(12.62109)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -35.38932 + (((tickAnim - 15) / 9) * (0-(-35.38932)));
            yy = -10.47152 + (((tickAnim - 15) / 9) * (0-(-10.47152)));
            zz = 6.73517 + (((tickAnim - 15) / 9) * (0-(6.73517)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (24.49526-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (1.21569-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (-0.88938-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 19.25 + (((tickAnim - 0) / 8) * (-42.12-(19.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -42.12 + (((tickAnim - 8) / 7) * (11.5-(-42.12)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 11.5 + (((tickAnim - 15) / 15) * (19.25-(11.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 55.75 + (((tickAnim - 0) / 2) * (95-(55.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 95 + (((tickAnim - 2) / 6) * (104-(95)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 104 + (((tickAnim - 8) / 7) * (23.4467-(104)));
            yy = 0 + (((tickAnim - 8) / 7) * (12.19858-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0.20035-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 23.4467 + (((tickAnim - 15) / 7) * (-5.5-(23.4467)));
            yy = 12.19858 + (((tickAnim - 15) / 7) * (0-(12.19858)));
            zz = 0.20035 + (((tickAnim - 15) / 7) * (0-(0.20035)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -5.5 + (((tickAnim - 22) / 8) * (55.75-(-5.5)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.525 + (((tickAnim - 0) / 2) * (1.675-(1.525)));
            zz = -0.875 + (((tickAnim - 0) / 2) * (-1.58-(-0.875)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.675 + (((tickAnim - 2) / 2) * (1.665-(1.675)));
            zz = -1.58 + (((tickAnim - 2) / 2) * (-1.735-(-1.58)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.665 + (((tickAnim - 4) / 4) * (0.705-(1.665)));
            zz = -1.735 + (((tickAnim - 4) / 4) * (-1.645-(-1.735)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0.225-(0)));
            yy = 0.705 + (((tickAnim - 8) / 7) * (0.3-(0.705)));
            zz = -1.645 + (((tickAnim - 8) / 7) * (0-(-1.645)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0.225 + (((tickAnim - 15) / 2) * (0.17-(0.225)));
            yy = 0.3 + (((tickAnim - 15) / 2) * (0.21-(0.3)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.17 + (((tickAnim - 17) / 1) * (0.12-(0.17)));
            yy = 0.21 + (((tickAnim - 17) / 1) * (0.12-(0.21)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.12 + (((tickAnim - 18) / 4) * (0-(0.12)));
            yy = 0.12 + (((tickAnim - 18) / 4) * (0.35-(0.12)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 22) / 4) * (1.865-(0.35)));
            zz = 0 + (((tickAnim - 22) / 4) * (-0.44-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 1.865 + (((tickAnim - 26) / 4) * (1.525-(1.865)));
            zz = -0.44 + (((tickAnim - 26) / 4) * (-0.875-(-0.44)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-90))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+40))*0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*-0.3);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-3));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-190))*4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*3));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-300))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*3));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-300))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*2), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*3));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*2), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*-2), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-2));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-2));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-6), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*15), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-4));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTicinosuchus ee = (EntityPrehistoricFloraTicinosuchus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTicinosuchus e = (EntityPrehistoricFloraTicinosuchus) entity;

    }
}
