package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAegirosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelAegirosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    private ModelAnimator animator;

    public ModelAegirosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.1151F, -2.5294F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -1.1151F, -2.6706F, 4, 3, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -2.1151F, 3.5294F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 46, -0.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.3383F, -3.0951F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2662F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 6, -0.5F, -1.0F, -3.0F, 2, 1, 3, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.5927F, -2.4421F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 47, -0.5F, 0.0F, -1.0F, 3, 1, 1, -0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -1.9843F, 0.5323F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 35, -0.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -2.1151F, 3.5294F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 34, -0.5F, 0.0F, -3.0F, 3, 1, 3, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.2968F, -1.437F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 42, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 3.2944F, 2.2564F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 28, -0.5F, -2.0F, -4.0F, 3, 2, 4, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 3.3849F, 4.3294F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 40, -0.5F, -2.0F, -2.075F, 3, 2, 2, 0.003F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.481F, 1.6474F, -0.3674F);
        this.main.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2956F, -0.0779F, -0.6661F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 38, 6, -0.5179F, 0.0245F, -0.625F, 1, 1, 1, 0.0F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 31, 47, 0.0179F, 0.3755F, -0.875F, 0, 4, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.481F, 1.6474F, -0.3674F);
        this.main.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.2956F, 0.0779F, 0.6661F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 38, 6, -0.4821F, 0.0245F, -0.625F, 1, 1, 1, 0.0F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 31, 47, -0.0179F, 0.3755F, -0.875F, 0, 4, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2425F, 4.0125F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, -2.0F, -0.8726F, 0.017F, 4, 3, 4, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -1.6638F, 1.1033F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 49, -0.5F, -1.975F, 0.5F, 0, 2, 2, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -1.8726F, -0.483F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 16, -0.5F, 0.025F, 0.6F, 3, 1, 4, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 3.6252F, 0.267F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 9, -0.5F, -2.0F, -0.025F, 3, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6367F, 3.7959F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 30, -1.5F, -1.0093F, -0.0789F, 3, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.8841F, 0.2785F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 35, 42, -0.5F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 2.4664F, 0.4369F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 36, -0.5F, -2.0F, -0.025F, 2, 2, 3, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(0.8566F, 1.4772F, 1.1585F);
        this.tail2.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.514F, 0.165F, -0.5028F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 17, 49, -0.5F, -0.25F, -0.5F, 1, 2, 1, 0.0F, false));
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 12, 49, 0.0F, 0.45F, -0.75F, 0, 2, 2, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-0.8566F, 1.4772F, 1.1585F);
        this.tail2.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.514F, -0.165F, 0.5028F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 17, 49, -0.5F, -0.25F, -0.5F, 1, 2, 1, 0.0F, true));
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 12, 49, 0.0F, 0.45F, -0.75F, 0, 2, 2, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1418F, 2.7019F);
        this.tail2.addChild(tail3);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.9675F, 0.0191F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 0, -0.5F, 0.0F, 0.0F, 2, 2, 3, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.5821F, 0.5541F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 20, -0.5F, -1.0F, -0.425F, 1, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0401F, 2.6554F);
        this.tail3.addChild(tail4);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.3659F, 4.0164F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 39, 36, -0.5F, -1.0F, -4.0F, 1, 1, 4, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.8076F, 0.0638F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 39, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0639F, 3.7624F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 17, 11, 0.0F, -4.1686F, -0.5236F, 0, 9, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 3.3749F, 1.0279F);
        this.tail5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6109F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 25, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.1535F, 1.2835F);
        this.tail5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.2217F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 47, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.3564F, 0.3014F);
        this.tail5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.0036F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 49, -0.5F, -0.4F, -0.8F, 1, 1, 2, -0.006F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 7.8849F, 2.5294F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 43, 16, -1.5F, -8.0F, -7.0F, 3, 1, 2, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 45, -1.5F, -8.7F, -7.0F, 3, 1, 2, -0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 49, 3, 0.675F, -8.45F, -6.75F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 49, 3, -1.675F, -8.45F, -6.75F, 1, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -8.3863F, -8.7545F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0916F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 11, -0.5F, 0.0F, -6.3F, 1, 1, 7, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -7.0F, -7.0F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2051F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 45, 30, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -7.0146F, -5.9356F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 45, -1.5F, -0.0104F, -1.0644F, 3, 1, 2, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 46, 42, -1.0F, -0.9104F, -1.0644F, 2, 1, 2, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.1876F, -0.2906F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0567F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 49, 0, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -0.0104F, -1.1395F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2051F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 43, 11, -0.5F, 0.0F, -1.925F, 2, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.5945F, -3.0099F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0087F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 17, 26, -0.5F, -0.9903F, -5.99F, 1, 1, 6, -0.003F, false));
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
        this.main.offsetY = -0.25F;
        this.main.offsetX = 0.1F;
        this.main.offsetZ = 2.0F;
        this.main.scaleChildren = true;
        this.main.rotateAngleY = (float)Math.toRadians(268);
        this.main.rotateAngleX = (float)Math.toRadians(20);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        float scaler = 0.7F;
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
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.2662F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0916F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.2051F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.0567F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.2051F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3272F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 0.5062F, 0.2551F, -0.8259F);
        this.setRotateAngle(leftLeg, 0.514F, 0.165F, -0.5028F);
        this.setRotateAngle(main, -0.1745F, 0.048F, -0.1134F);
        this.setRotateAngle(rightArm, 0.1421F, -0.1491F, 0.4783F);
        this.setRotateAngle(rightLeg, 0.514F, -0.165F, 0.5028F);
        this.setRotateAngle(tail, -0.0611F, -0.1091F, 0.0F);
        this.setRotateAngle(tail2, 0.0076F, -0.1395F, -0.0396F);
        this.setRotateAngle(tail3, 0.0F, 0.2356F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.3316F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.2662F, 0.0F);
        this.main.offsetY = -0F;
        this.main.offsetX = -0F;
        this.main.offsetZ = 0.1F;
        this.main.render(-0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(jaw, 0.3272F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 0.5062F, 0.2551F, -0.8259F);
        this.setRotateAngle(leftLeg, 0.514F, 0.165F, -0.5028F);
        this.setRotateAngle(main, -0.1745F, 0.048F, -0.1134F);
        this.setRotateAngle(rightArm, 0.1421F, -0.1491F, 0.4783F);
        this.setRotateAngle(rightLeg, 0.514F, -0.165F, 0.5028F);
        this.setRotateAngle(tail, -0.0611F, -0.1091F, 0.0F);
        this.setRotateAngle(tail2, 0.0076F, -0.1395F, -0.0396F);
        this.setRotateAngle(tail3, 0.0F, 0.2356F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.3316F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.2662F, 0.0F);
        this.main.offsetY = -0.3F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {

        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Mixosaurus.offsetY = 1F;
        //this.Mixosaurus.offsetZ = 1.0F;
        if(e.isInWater()) {

            //this.Mixosaurus.offsetY = -0.2F;

        }

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] neckHead = {this.head};


        float speed = 0.24F;
        EntityPrehistoricFloraAegirosaurus ee = (EntityPrehistoricFloraAegirosaurus) e;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        ((EntityPrehistoricFloraAegirosaurus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        //if (e.isInWater()) {

         if(!e.isInWater()) {

             this.bob(main, -speed, 1.5F, false, f2, 1);

         }

         /*   if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.585F * still, -1.85, f2, 0.6F * still);
            } else {
                this.chainSwing(fishTail, speed * still, 0.855F * still, -1.55, f2, 0.6F * still);
            }
            */
        //Animation values need tweaking
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(neckHead, speed * still, 0.15F, 0, f2, 0.5F *still);
        }

        //this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(leftArm, (float) (speed * 0.75), 0.25F, false, -3, 0, f2, 1);
        this.swing(leftArm, (float) (speed * 0.75), 0.15F, false, -3, 0, f2, 1);
        this.flap(rightArm, (float) (speed * 0.75), 0.25F, true, 3, 0, f2, 1);
        this.swing(rightArm, (float) (speed * 0.75), 0.15F, true, 3, 0, f2, 1);
        this.flap(leftLeg, (float) (speed * 0.75), 0.25F, false, -3, 0, f2, 1);
        this.swing(leftLeg, (float) (speed * 0.75), 0.15F, false, -3, 0, f2, 1);
        this.flap(rightLeg, (float) (speed * 0.75), 0.25F, true, 3, 0, f2, 1);
        this.swing(rightLeg, (float) (speed * 0.75), 0.15F, true, 3, 0, f2, 1);
        //}

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

//        animator.setAnimation(e.ROAR_ANIMATION);
//        animator.startKeyframe(5);
//        animator.move(this.head, 0,0,-0.2F);
//        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(5);
//        animator.resetKeyframe(2);

    }
}

