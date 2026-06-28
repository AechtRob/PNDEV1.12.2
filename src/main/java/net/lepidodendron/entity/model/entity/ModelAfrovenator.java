package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAfrovenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAfrovenator extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer bone9;
    private final AdvancedModelRenderer bone11;
    private final AdvancedModelRenderer bone12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer bone10;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;



    private ModelAnimator animator;

    public ModelAfrovenator() {
        this.textureWidth = 122;
        this.textureHeight = 122;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -3.5F, -1.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.5F, 1.5F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 29, -4.5F, -6.5F, -5.5F, 9, 13, 11, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, 0.8F, 1.0F);
        this.hip.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3054F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 75, -3.5F, -2.0F, -3.0F, 6, 13, 8, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 10.9F, -2.7F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6981F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 86, 0, -3.0F, -0.1027F, -0.2363F, 5, 12, 5, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 11.8F, 4.2F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6109F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 106, -2.5F, 0.0F, -2.9F, 4, 7, 3, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 7.2F, -0.9F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2182F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 48, 101, -3.0F, -2.0F, -3.9F, 5, 3, 5, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 21, 104, -3.0F, -2.0F, -3.0F, 5, 3, 4, -0.005F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, 0.8F, 1.0F);
        this.hip.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3054F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 75, -2.5F, -2.0F, -3.0F, 6, 13, 8, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 10.9F, -2.7F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6981F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 86, 0, -2.0F, -0.1027F, -0.2363F, 5, 12, 5, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 11.8F, 4.2F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 106, -1.5F, 0.0F, -2.9F, 4, 7, 3, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 7.2F, -0.9F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2182F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 48, 101, -2.0F, -2.0F, -3.9F, 5, 3, 5, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 21, 104, -2.0F, -2.0F, -3.0F, 5, 3, 4, -0.005F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -2.7F, -12.0F, 10, 14, 14, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 3.0F, -13.0F);
        this.body.addChild(chest);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 54, -4.5F, -6.2F, -3.3F, 9, 12, 8, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(4.5F, 4.2F, -1.5F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.4899F, 0.1932F, -0.102F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 90, 100, -1.0F, -1.5F, -1.0F, 2, 3, 7, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, -1.1F, 5.8F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.1794F, -0.0334F, 0.0807F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 103, 68, -1.0F, -0.7609F, -0.3062F, 2, 3, 6, -0.003F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.0F, 1.7391F, 5.6938F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1745F, -0.1745F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 103, 78, -2.0F, -2.5F, 0.0F, 2, 3, 6, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-4.5F, 4.2F, -1.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.4899F, -0.1932F, 0.102F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 90, 100, -1.0F, -1.5F, -1.0F, 2, 3, 7, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, -1.1F, 5.8F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.1794F, 0.0334F, -0.0807F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 103, 68, -1.0F, -0.7609F, -0.3062F, 2, 3, 6, -0.003F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.0F, 1.7391F, 5.6938F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1745F, 0.1745F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 103, 78, 0.0F, -2.5F, 0.0F, 2, 3, 6, 0.0F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.chest.addChild(neck3);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.neck3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 78, 50, -3.0F, -4.0F, -4.1F, 6, 9, 8, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.neck3.addChild(neck2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.8F, -2.7F);
        this.neck2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.8465F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 82, 21, -2.5F, 0.0622F, -0.0686F, 5, 7, 8, -0.005F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.neck2.addChild(neck);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.0F, -7.5F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2793F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 100, -2.0F, -2.1F, 2.77F, 4, 2, 6, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.5F, -3.3F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3142F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 90, -2.0F, 0.2F, -0.1F, 4, 8, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.5F, -3.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 93, 89, -2.5F, -2.25F, -4.25F, 5, 5, 5, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 82, 37, -1.5F, 0.05F, -11.5F, 3, 2, 8, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 69, 109, -1.0F, 0.03F, -13.25F, 2, 2, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.55F, -11.25F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 109, -1.0F, -2.0F, -2.07F, 2, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.55F, -13.25F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 57, -0.5F, -0.5F, 0.75F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.05F, -10.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 108, -1.0F, -2.05F, 2.05F, 2, 2, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 109, 108, -1.0F, -1.9F, 0.05F, 2, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.05F, -4.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.2566F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 107, 7, -1.5F, -1.9F, -0.55F, 3, 2, 4, -0.05F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.25F, -3.25F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1484F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 107, 0, -2.0F, 0.0F, -0.2F, 4, 2, 4, 0.01F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, -13.25F);
        this.head.addChild(bone2);
        this.setRotateAngle(bone2, 0.4363F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 109, 32, -1.0F, 0.0F, 0.0F, 2, 2, 2, -0.01F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, -0.2618F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 48, 90, -1.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(1.0F, 0.1F, 0.3F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.1309F, 0.1309F, 0.2182F);
        this.bone4.cubeList.add(new ModelBox(bone4, 109, 21, -1.0F, 0.0F, 0.0F, 1, 3, 3, -0.01F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, -0.1309F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 68, 21, 0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, 0.3491F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 21, 97, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.01F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(-1.0F, 0.1F, 0.3F);
        this.bone3.addChild(bone7);
        this.setRotateAngle(bone7, 0.1309F, -0.1309F, -0.2182F);
        this.bone7.cubeList.add(new ModelBox(bone7, 109, 21, 0.0F, 0.0F, 0.0F, 1, 3, 3, -0.01F, true));

        this.bone8 = new AdvancedModelRenderer(this);
        this.bone8.setRotationPoint(1.0F, 0.0F, 3.0F);
        this.bone7.addChild(bone8);
        this.setRotateAngle(bone8, -0.1309F, 0.0F, 0.0F);
        this.bone8.cubeList.add(new ModelBox(bone8, 68, 21, -1.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, true));

        this.bone9 = new AdvancedModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.bone8.addChild(bone9);
        this.setRotateAngle(bone9, 0.3491F, 0.0F, 0.0F);
        this.bone9.cubeList.add(new ModelBox(bone9, 21, 97, -1.0F, 0.0F, 0.0F, 1, 3, 2, 0.01F, true));

        this.bone11 = new AdvancedModelRenderer(this);
        this.bone11.setRotationPoint(0.0F, 2.55F, -11.5F);
        this.head.addChild(bone11);
        this.setRotateAngle(bone11, -0.0611F, 0.0F, 0.0F);
        this.bone11.cubeList.add(new ModelBox(bone11, 109, 28, -1.5F, -1.0F, -0.04F, 3, 1, 2, -0.02F, false));

        this.bone12 = new AdvancedModelRenderer(this);
        this.bone12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone11.addChild(bone12);
        this.setRotateAngle(bone12, 0.0873F, 0.0F, 0.0F);
        this.bone12.cubeList.add(new ModelBox(bone12, 105, 37, -1.5F, -1.0F, -0.07F, 3, 1, 6, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 97, -2.5F, 0.25F, -4.23F, 5, 3, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 70, 89, -1.5F, 0.25F, -11.5F, 3, 2, 8, -0.03F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 107, 62, -1.0F, 0.0F, -10.45F, 2, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 109, 100, -1.0F, 0.28F, -13.25F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 54, -0.5F, 0.02F, -12.45F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.25F, -5.45F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6545F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 107, 45, -1.5F, 0.0F, -0.25F, 3, 2, 4, -0.04F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.25F, -4.0F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2793F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 107, 52, -2.0F, -2.0F, -0.23F, 4, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.25F, -4.2F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3054F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 21, -2.5F, -3.0F, 0.0F, 5, 3, 4, -0.01F, false));

        this.bone10 = new AdvancedModelRenderer(this);
        this.bone10.setRotationPoint(0.0F, 2.25F, -8.05F);
        this.jaw.addChild(bone10);
        this.setRotateAngle(bone10, -0.2443F, 0.0F, 0.0F);
        this.bone10.cubeList.add(new ModelBox(bone10, 107, 14, -1.5F, -2.0F, 0.0F, 3, 2, 4, -0.04F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.3F, -13.2F);
        this.jaw.addChild(bone);
        this.setRotateAngle(bone, -0.48F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 109, 104, -1.0F, -1.03F, 0.0F, 2, 1, 2, -0.02F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, -0.75F, -3.23F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 77, 67, -2.5F, -0.5F, -1.025F, 5, 1, 2, 0.03F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -0.8F, 7.2F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.1004F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 49, 0, -3.0F, -2.0F, -1.0F, 7, 9, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 41, 50, -2.0F, -2.0F, -1.0F, 5, 7, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.5F, 0.0F, 12.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 70, 71, -1.0F, -2.0F, -1.0F, 4, 5, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 35, 71, -1.0F, -2.0F, -1.0F, 3, 4, 14, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.3F, 12.7F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2182F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 41, 29, -0.5F, -2.0F, -1.0F, 2, 2, 18, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }
    public void renderStaticWall(float f) {
        this.chest.offsetZ = 0.05F;
        this.chest.offsetY = -0.025F;
        this.chest.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hip.offsetY = -0.16F;
        this.hip.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = 0.60F;
        this.hip.offsetX = 0.0F;
        this.hip.rotateAngleY = (float)Math.toRadians(220);
        this.hip.rotateAngleX = (float)Math.toRadians(12);
        this.hip.rotateAngleZ = (float)Math.toRadians(-2);
        this.hip.scaleChildren = true;
        float scaler = 0.6F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
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

        EntityPrehistoricFloraAfrovenator EntityAfrovenator = (EntityPrehistoricFloraAfrovenator) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.rightArm, this.rightArm2, this.rightArm3};
        AdvancedModelRenderer[] ArmR = {this.leftArm, this.leftArm2, this.leftArm3};

        EntityAfrovenator.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityAfrovenator.getAnimation() == EntityAfrovenator.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityAfrovenator.isReallyInWater()) {

                if (f3 == 0.0F || !EntityAfrovenator.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.rightArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.leftArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityAfrovenator.getIsFast()) { //Running


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
        EntityPrehistoricFloraAfrovenator ee = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAfrovenator entity = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -9 + (((tickAnim - 3) / 5) * (19.75-(-9)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 19.75 + (((tickAnim - 8) / 5) * (0-(19.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 3) / 5) * (7-(-3)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 7 + (((tickAnim - 8) / 5) * (0-(7)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.575-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 8) / 5) * (0-(0.325)));
            zz = -0.575 + (((tickAnim - 8) / 5) * (0-(-0.575)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 16.25 + (((tickAnim - 3) / 5) * (-6.25-(16.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6.25 + (((tickAnim - 8) / 5) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.65-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 5) * (-0.1-(-0.175)));
            zz = 0.65 + (((tickAnim - 3) / 5) * (-0.2-(0.65)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 5) * (0-(-0.1)));
            zz = -0.2 + (((tickAnim - 8) / 5) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-20.7296-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.20495-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.39773-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -20.7296 + (((tickAnim - 8) / 1) * (0-(-20.7296)));
            yy = -0.20495 + (((tickAnim - 8) / 1) * (0-(-0.20495)));
            zz = 0.39773 + (((tickAnim - 8) / 1) * (0-(0.39773)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (33-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 33 + (((tickAnim - 8) / 1) * (0-(33)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAfrovenator entity = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -19.25 + (((tickAnim - 18) / 15) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 33) / 17) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-6.425-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (6.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -6.425 + (((tickAnim - 18) / 15) * (-6.425-(-6.425)));
            zz = 6.2 + (((tickAnim - 18) / 15) * (6.2-(6.2)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -6.425 + (((tickAnim - 33) / 17) * (0-(-6.425)));
            zz = 6.2 + (((tickAnim - 33) / 17) * (0-(6.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -14.5 + (((tickAnim - 18) / 15) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 33) / 17) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38.25 + (((tickAnim - 18) / 15) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38.25 + (((tickAnim - 33) / 17) * (0-(38.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.75 + (((tickAnim - 18) / 15) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 33) / 17) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 20.5 + (((tickAnim - 18) / 15) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 33) / 17) * (0-(20.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -14.5 + (((tickAnim - 18) / 15) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 33) / 17) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38.25 + (((tickAnim - 18) / 15) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38.25 + (((tickAnim - 33) / 17) * (0-(38.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.75 + (((tickAnim - 18) / 15) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 33) / 17) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 20.5 + (((tickAnim - 18) / 15) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 33) / 17) * (0-(20.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.25 + (((tickAnim - 18) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 33) / 17) * (0-(7.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.75 + (((tickAnim - 18) / 15) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 33) / 17) * (0-(6.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 18) / 15) * (5-(5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 33) / 17) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -3.5 + (((tickAnim - 18) / 15) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 33) / 17) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 2.75 + (((tickAnim - 18) / 15) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 33) / 17) * (0-(2.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.75 + (((tickAnim - 18) / 15) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 33) / 17) * (0-(7.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.5 + (((tickAnim - 18) / 15) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 33) / 17) * (0-(6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 19.75 + (((tickAnim - 18) / 15) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 19.75 + (((tickAnim - 33) / 17) * (0-(19.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 20) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 20) / 5) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 25) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 25) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 25) / 5) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 30) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAfrovenator entity = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -16.5 + (((tickAnim - 13) / 20) * (28.75-(-16.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 28.75 + (((tickAnim - 33) / 7) * (2.43-(28.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 2.43 + (((tickAnim - 40) / 5) * (-10.53-(2.43)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -10.53 + (((tickAnim - 45) / 5) * (0-(-10.53)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (8.97-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 8.97 + (((tickAnim - 7) / 6) * (-4.75-(8.97)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -4.75 + (((tickAnim - 13) / 20) * (10-(-4.75)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 33) / 7) * (25.21-(10)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 25.21 + (((tickAnim - 40) / 5) * (30.35-(25.21)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 30.35 + (((tickAnim - 45) / 5) * (0-(30.35)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-36.03-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -36.03 + (((tickAnim - 7) / 6) * (14-(-36.03)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 13) / 20) * (0-(14)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -1.75 + (((tickAnim - 40) / 5) * (-38.75-(-1.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -38.75 + (((tickAnim - 45) / 5) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            yy = -0.35 + (((tickAnim - 13) / 20) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (45.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 45.75 + (((tickAnim - 7) / 6) * (7.5-(45.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 7.5 + (((tickAnim - 13) / 9) * (-12.25-(7.5)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -12.25 + (((tickAnim - 22) / 11) * (42-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 42 + (((tickAnim - 33) / 7) * (75.60963-(42)));
            yy = 0 + (((tickAnim - 33) / 7) * (-1.66878-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (-3.61587-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 75.60963 + (((tickAnim - 40) / 5) * (88.30481-(75.60963)));
            yy = -1.66878 + (((tickAnim - 40) / 5) * (-0.83439-(-1.66878)));
            zz = -3.61587 + (((tickAnim - 40) / 5) * (-1.80793-(-3.61587)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 88.30481 + (((tickAnim - 45) / 5) * (0-(88.30481)));
            yy = -0.83439 + (((tickAnim - 45) / 5) * (0-(-0.83439)));
            zz = -1.80793 + (((tickAnim - 45) / 5) * (0-(-1.80793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (2.425-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0.55-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 2.425 + (((tickAnim - 40) / 10) * (0-(2.425)));
            zz = 0.55 + (((tickAnim - 40) / 10) * (0-(0.55)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (10.83-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 10.83 + (((tickAnim - 7) / 6) * (0-(10.83)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (-34.33-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -34.33 + (((tickAnim - 27) / 6) * (-14.25-(-34.33)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -14.25 + (((tickAnim - 33) / 7) * (25.11-(-14.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.11 + (((tickAnim - 40) / 10) * (0-(25.11)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 11) * (0.2-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.2 + (((tickAnim - 33) / 7) * (-0.315-(0.2)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.315 + (((tickAnim - 40) / 10) * (0-(-0.315)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAfrovenator entity = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -19.25 + (((tickAnim - 18) / 15) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 33) / 17) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-6.425-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (6.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -6.425 + (((tickAnim - 18) / 15) * (-6.425-(-6.425)));
            zz = 6.2 + (((tickAnim - 18) / 15) * (6.2-(6.2)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -6.425 + (((tickAnim - 33) / 17) * (0-(-6.425)));
            zz = 6.2 + (((tickAnim - 33) / 17) * (0-(6.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -14.5 + (((tickAnim - 18) / 15) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 33) / 17) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38.25 + (((tickAnim - 18) / 15) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38.25 + (((tickAnim - 33) / 17) * (0-(38.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.75 + (((tickAnim - 18) / 15) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 33) / 17) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 20.5 + (((tickAnim - 18) / 15) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 33) / 17) * (0-(20.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -14.5 + (((tickAnim - 18) / 15) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 33) / 17) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38.25 + (((tickAnim - 18) / 15) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38.25 + (((tickAnim - 33) / 17) * (0-(38.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.75 + (((tickAnim - 18) / 15) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 33) / 17) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 20.5 + (((tickAnim - 18) / 15) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 33) / 17) * (0-(20.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.25 + (((tickAnim - 18) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 33) / 17) * (0-(7.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.75 + (((tickAnim - 18) / 15) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 33) / 17) * (0-(6.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 18) / 15) * (5-(5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 33) / 17) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -3.5 + (((tickAnim - 18) / 15) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 33) / 17) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 2.75 + (((tickAnim - 18) / 15) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 33) / 17) * (0-(2.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.75 + (((tickAnim - 18) / 15) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 33) / 17) * (0-(7.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.5 + (((tickAnim - 18) / 15) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 33) / 17) * (0-(6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 19.75 + (((tickAnim - 18) / 15) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 19.75 + (((tickAnim - 33) / 17) * (0-(19.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 20) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 20) / 5) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 25) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 25) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 25) / 5) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 30) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAfrovenator entity = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-15.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -15.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 7) / 8) * (-5-(-15.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 15) / 10) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -5 + (((tickAnim - 25) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-7.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = -7.5 + (((tickAnim - 7) / 8) * (-8.1-(-7.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -8.1 + (((tickAnim - 15) / 10) * (-8.1-(-8.1)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = -8.1 + (((tickAnim - 25) / 20) * (0-(-8.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 18.5 + (((tickAnim - 7) / 8) * (4.5-(18.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 4.5 + (((tickAnim - 15) / 10) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.5 + (((tickAnim - 25) / 10) * (28.75-(4.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 28.75 + (((tickAnim - 35) / 10) * (0-(28.75)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (29-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 29 + (((tickAnim - 11) / 4) * (0-(29)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (31.5-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 31.5 + (((tickAnim - 30) / 5) * (-3.75-(31.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -3.75 + (((tickAnim - 35) / 10) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 12 + (((tickAnim - 7) / 5) * (-42.2-(12)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -42.2 + (((tickAnim - 12) / 3) * (0-(-42.2)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (-13-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -13 + (((tickAnim - 35) / 10) * (0-(-13)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (33.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 33.5 + (((tickAnim - 7) / 2) * (81.5-(33.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 81.5 + (((tickAnim - 9) / 3) * (81.61-(81.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 81.61 + (((tickAnim - 12) / 3) * (0-(81.61)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (54.5-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 54.5 + (((tickAnim - 30) / 5) * (17.5-(54.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 35) / 5) * (-4.25-(17.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -4.25 + (((tickAnim - 40) / 5) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (2.4-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.275-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 2.4 + (((tickAnim - 12) / 3) * (0-(2.4)));
            zz = 0.275 + (((tickAnim - 12) / 3) * (0-(0.275)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 35) / 5) * (-0.675-(-0.75)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -0.675 + (((tickAnim - 40) / 5) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (-44.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -44.5 + (((tickAnim - 7) / 2) * (38.25-(-44.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 38.25 + (((tickAnim - 9) / 3) * (38.86-(38.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 38.86 + (((tickAnim - 12) / 1) * (0-(38.86)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -31.75 + (((tickAnim - 27) / 3) * (22.75-(-31.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 22.75 + (((tickAnim - 30) / 3) * (-36.06-(22.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -36.06 + (((tickAnim - 33) / 2) * (-23.75-(-36.06)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -23.75 + (((tickAnim - 35) / 5) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 7) / 2) * (-0.175-(0.425)));
            zz = 0 + (((tickAnim - 7) / 2) * (0.625-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 9) / 3) * (-0.3-(-0.175)));
            zz = 0.625 + (((tickAnim - 9) / 3) * (0.61-(0.625)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.3 + (((tickAnim - 12) / 1) * (0-(-0.3)));
            zz = 0.61 + (((tickAnim - 12) / 1) * (0-(0.61)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 30) / 5) * (0.025-(-0.175)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.025 + (((tickAnim - 35) / 5) * (0-(0.025)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -14 + (((tickAnim - 3) / 4) * (-12.5-(-14)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -12.5 + (((tickAnim - 7) / 8) * (5.5-(-12.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5.5 + (((tickAnim - 15) / 10) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 5.5 + (((tickAnim - 25) / 10) * (-8.75-(5.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -8.75 + (((tickAnim - 35) / 10) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 13.5 + (((tickAnim - 3) / 4) * (-11-(13.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -11 + (((tickAnim - 7) / 8) * (0-(-11)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 35) / 5) * (31-(-10)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 31 + (((tickAnim - 40) / 5) * (0-(31)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -29.5 + (((tickAnim - 3) / 4) * (-8.5-(-29.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -8.5 + (((tickAnim - 7) / 8) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (3.75-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 3.75 + (((tickAnim - 35) / 5) * (-20.13-(3.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -20.13 + (((tickAnim - 40) / 5) * (0-(-20.13)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (44.87-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 44.87 + (((tickAnim - 3) / 4) * (21.75-(44.87)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 21.75 + (((tickAnim - 7) / 8) * (0-(21.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 17 + (((tickAnim - 35) / 5) * (44-(17)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 44 + (((tickAnim - 40) / 5) * (0-(44)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-14.51-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -14.51-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 11) / 14) * (-8.8-(-14.51-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -8.8 + (((tickAnim - 25) / 20) * (0-(-8.8)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 2.75 + (((tickAnim - 25) / 20) * (0-(2.75)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-12.63305-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.33193-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-29.15284-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = -12.63305 + (((tickAnim - 7) / 18) * (-30.13169-(-12.63305)));
            yy = -2.33193 + (((tickAnim - 7) / 18) * (3.23923-(-2.33193)));
            zz = -29.15284 + (((tickAnim - 7) / 18) * (-55.78478-(-29.15284)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -30.13169 + (((tickAnim - 25) / 20) * (0-(-30.13169)));
            yy = 3.23923 + (((tickAnim - 25) / 20) * (0-(3.23923)));
            zz = -55.78478 + (((tickAnim - 25) / 20) * (0-(-55.78478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-12.60805-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (2.33193-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (29.82784-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = -12.60805 + (((tickAnim - 7) / 18) * (-30.13169-(-12.60805)));
            yy = 2.33193 + (((tickAnim - 7) / 18) * (-3.23923-(2.33193)));
            zz = 29.82784 + (((tickAnim - 7) / 18) * (55.78478-(29.82784)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -30.13169 + (((tickAnim - 25) / 20) * (0-(-30.13169)));
            yy = -3.23923 + (((tickAnim - 25) / 20) * (0-(-3.23923)));
            zz = 55.78478 + (((tickAnim - 25) / 20) * (0-(55.78478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -11.25 + (((tickAnim - 7) / 4) * (13.75-(-11.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 13.75 + (((tickAnim - 11) / 4) * (0-(13.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 5 + (((tickAnim - 25) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -4.25 + (((tickAnim - 7) / 4) * (12.75-(-4.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 12.75 + (((tickAnim - 11) / 4) * (10.25-(12.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 10.25 + (((tickAnim - 15) / 10) * (13.75-(10.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 13.75 + (((tickAnim - 25) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.085-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.43-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.085 + (((tickAnim - 7) / 4) * (1.4-(0.085)));
            zz = -0.43 + (((tickAnim - 7) / 4) * (-1.425-(-0.43)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1.4 + (((tickAnim - 11) / 4) * (0-(1.4)));
            zz = -1.425 + (((tickAnim - 11) / 4) * (0-(-1.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7.79-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -7.79 + (((tickAnim - 7) / 4) * (-7.5-(-7.79)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -7.5 + (((tickAnim - 11) / 14) * (-10.14-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -10.14 + (((tickAnim - 25) / 20) * (0-(-10.14)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -5.75 + (((tickAnim - 11) / 7) * (2.88-(-5.75)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 2.88 + (((tickAnim - 18) / 7) * (2.88-(2.88)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 2.88 + (((tickAnim - 25) / 20) * (0-(2.88)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 25.5 + (((tickAnim - 7) / 4) * (0-(25.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (22.71589-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 22.71589 + (((tickAnim - 15) / 10) * (37-(22.71589)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 37 + (((tickAnim - 25) / 10) * (0-(37)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 3.5 + (((tickAnim - 7) / 4) * (0-(3.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -5 + (((tickAnim - 7) / 4) * (0-(-5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -4.5 + (((tickAnim - 7) / 4) * (10.25-(-4.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 10.25 + (((tickAnim - 11) / 4) * (24.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30-(10.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = 24.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 15) / 30) * (0-(24.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
            yy = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -5.25 + (((tickAnim - 7) / 8) * (11.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(-5.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = 11.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 15) / 30) * (0-(11.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -5.75 + (((tickAnim - 7) / 1) * (2.3-(-5.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.3 + (((tickAnim - 8) / 7) * (65.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(2.3)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = 65.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 15) / 30) * (0-(65.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAfrovenator entity = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -1.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*2 + (((tickAnim - 0) / 30) * (37.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-1.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*2)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-0.5 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 37.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 30) / 30) * (23.807-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-40-(37.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 30) / 30) * (1.33947-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-0.5 + (((tickAnim - 30) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-0.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 23.807-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-40 + (((tickAnim - 60) / 20) * (0-(23.807-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-40)));
            yy = 1.33947 + (((tickAnim - 60) / 20) * (0-(1.33947)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-250))*-0.8 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-250))*-0.8-(0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-250))*-0.8)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -9.5 + (((tickAnim - 30) / 30) * (-15.8664-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-15-(-9.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0.74982-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-250))*-0.8 + (((tickAnim - 30) / 30) * (-1.25011-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-250))*-0.8)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -15.8664-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-15 + (((tickAnim - 60) / 20) * (0-(-15.8664-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-15)));
            yy = 0.74982 + (((tickAnim - 60) / 20) * (0-(0.74982)));
            zz = -1.25011 + (((tickAnim - 60) / 20) * (0-(-1.25011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-200))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-200))*-1 + (((tickAnim - 30) / 30) * (-7-(11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-200))*-1)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -7 + (((tickAnim - 60) / 20) * (0-(-7)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.425-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = -0.175 + (((tickAnim - 30) / 30) * (-0.67-(-0.175)));
            zz = 0.425 + (((tickAnim - 30) / 30) * (0.38-(0.425)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = -0.67 + (((tickAnim - 60) / 20) * (0-(-0.67)));
            zz = 0.38 + (((tickAnim - 60) / 20) * (0-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 4.75 + (((tickAnim - 30) / 30) * (-6-(4.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -6 + (((tickAnim - 60) / 20) * (0-(-6)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-3 + (((tickAnim - 0) / 30) * (3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-1-(3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-3)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-1 + (((tickAnim - 30) / 30) * (12.907-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-5-(3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*520-100))*-1)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 12.907-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-5 + (((tickAnim - 60) / 20) * (0-(12.907-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAfrovenator entity = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 25) / 10) * (-10-(-7.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 35) / 15) * (0-(-10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 1.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10 + (((tickAnim - 25) / 10) * (-0.25-(1.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.25 + (((tickAnim - 35) / 15) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 35) / 15) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 25) / 25) * (0-(7.75)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.3-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0.3 + (((tickAnim - 25) / 25) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15.5 + (((tickAnim - 25) / 10) * (22-(15.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 22 + (((tickAnim - 35) / 8) * (0-(22)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 0) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 25) * (0.3425-(1)));
            zz = 1 + (((tickAnim - 0) / 25) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 25) / 10) * (1-(1)));
            yy = 0.3425 + (((tickAnim - 25) / 10) * (0.0175-(0.3425)));
            zz = 1 + (((tickAnim - 25) / 10) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 35) / 8) * (1-(1)));
            yy = 0.0175 + (((tickAnim - 35) / 8) * (1-(0.0175)));
            zz = 1 + (((tickAnim - 35) / 8) * (1-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 43) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 43) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 43) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAfrovenator entity = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-90))*3), hip.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-90))*1), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-65))*2.5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(-0.2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-20))*1);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-80))*-1.2);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -11.90358 + (((tickAnim - 0) / 18) * (29-(-11.90358)));
            yy = -2.04568 + (((tickAnim - 0) / 18) * (0-(-2.04568)));
            zz = 4.01567 + (((tickAnim - 0) / 18) * (0-(4.01567)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 29 + (((tickAnim - 18) / 2) * (-8.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*50-(29)));
            yy = 0 + (((tickAnim - 18) / 2) * (4.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*10-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (4.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-10-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -8.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*50 + (((tickAnim - 20) / 18) * (-11.90358-(-8.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*50)));
            yy = 4.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*10 + (((tickAnim - 20) / 18) * (-2.04568-(4.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*10)));
            zz = 4.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-10 + (((tickAnim - 20) / 18) * (4.01567-(4.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5.25 + (((tickAnim - 0) / 3) * (-2.53-(-5.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = -2.53 + (((tickAnim - 3) / 15) * (29.375-(-2.53)));
            yy = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 15) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 29.375 + (((tickAnim - 18) / 5) * (68.42-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*100-(29.375)));
            yy = 0 + (((tickAnim - 18) / 5) * (2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 68.42-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*100 + (((tickAnim - 23) / 15) * (-5.25-(68.42-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*100)));
            yy = 2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5 + (((tickAnim - 23) / 15) * (0-(2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5)));
            zz = -2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5 + (((tickAnim - 23) / 15) * (0-(-2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2 + (((tickAnim - 0) / 3) * (-8.48-(-2)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = -8.48 + (((tickAnim - 3) / 11) * (0-(-8.48)));
            yy = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 11) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (-9.83-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -9.83-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50 + (((tickAnim - 28) / 4) * (-62.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(-9.83-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -62.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 32) / 6) * (-2-(-62.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 2) * (-0.325-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            yy = -0.325 + (((tickAnim - 5) / 9) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 14) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 24) * (0-(0)));
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
            xx = 17.05813 + (((tickAnim - 0) / 3) * (16.42369-(17.05813)));
            yy = 3.90436 + (((tickAnim - 0) / 3) * (2.92578-(3.90436)));
            zz = -0.91747 + (((tickAnim - 0) / 3) * (-1.48973-(-0.91747)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 16.42369 + (((tickAnim - 3) / 2) * (4.68991-(16.42369)));
            yy = 2.92578 + (((tickAnim - 3) / 2) * (2.16378-(2.92578)));
            zz = -1.48973 + (((tickAnim - 3) / 2) * (-1.93535-(-1.48973)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 4.68991 + (((tickAnim - 5) / 13) * (48.75-(4.68991)));
            yy = 2.16378 + (((tickAnim - 5) / 13) * (0-(2.16378)));
            zz = -1.93535 + (((tickAnim - 5) / 13) * (0-(-1.93535)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 48.75 + (((tickAnim - 18) / 5) * (86.04194-(48.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (1.17726-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.51806-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 86.04194 + (((tickAnim - 23) / 9) * (69.6842-(86.04194)));
            yy = 1.17726 + (((tickAnim - 23) / 9) * (3.76722-(1.17726)));
            zz = -0.51806 + (((tickAnim - 23) / 9) * (-1.65779-(-0.51806)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 69.6842 + (((tickAnim - 32) / 6) * (17.05813-(69.6842)));
            yy = 3.76722 + (((tickAnim - 32) / 6) * (3.90436-(3.76722)));
            zz = -1.65779 + (((tickAnim - 32) / 6) * (-0.91747-(-1.65779)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 3) * (-1.225-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.225 + (((tickAnim - 3) / 2) * (-1.4-(-1.225)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -1.4 + (((tickAnim - 5) / 4) * (0.225-(-1.4)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0.225 + (((tickAnim - 9) / 9) * (0.425-(0.225)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 18) / 5) * (1.865-(0.425)));
            zz = 0 + (((tickAnim - 18) / 5) * (0.525-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 1.865 + (((tickAnim - 23) / 3) * (2.71-(1.865)));
            zz = 0.525 + (((tickAnim - 23) / 3) * (0.055-(0.525)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 2.71 + (((tickAnim - 26) / 6) * (1.725-(2.71)));
            zz = 0.055 + (((tickAnim - 26) / 6) * (0.275-(0.055)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 1.725 + (((tickAnim - 32) / 6) * (-0.3-(1.725)));
            zz = 0.275 + (((tickAnim - 32) / 6) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -32.5 + (((tickAnim - 9) / 3) * (-30.45-(-32.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -30.45 + (((tickAnim - 12) / 6) * (26-(-30.45)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 26 + (((tickAnim - 18) / 5) * (31.37-(26)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 31.37 + (((tickAnim - 23) / 3) * (37.71-(31.37)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 37.71 + (((tickAnim - 26) / 6) * (0-(37.71)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0.185-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (-0.075-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0.185 + (((tickAnim - 12) / 6) * (-0.225-(0.185)));
            zz = -0.075 + (((tickAnim - 12) / 6) * (0.075-(-0.075)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 18) / 5) * (-0.25-(-0.225)));
            zz = 0.075 + (((tickAnim - 18) / 5) * (0.4-(0.075)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 23) / 3) * (-0.16-(-0.25)));
            zz = 0.4 + (((tickAnim - 23) / 3) * (0.625-(0.4)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = -0.16 + (((tickAnim - 26) / 6) * (0-(-0.16)));
            zz = 0.625 + (((tickAnim - 26) / 6) * (0-(0.625)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 29 + (((tickAnim - 0) / 2) * (-8.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(29)));
            yy = 0 + (((tickAnim - 0) / 2) * (3.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-10-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (1.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 20) {
            xx = -8.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 2) / 18) * (-11.90358-(-8.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 3.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-10 + (((tickAnim - 2) / 18) * (2.04568-(3.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-10)));
            zz = 1.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5 + (((tickAnim - 2) / 18) * (-4.01567-(1.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -11.90358 + (((tickAnim - 20) / 18) * (29-(-11.90358)));
            yy = 2.04568 + (((tickAnim - 20) / 18) * (0-(2.04568)));
            zz = -4.01567 + (((tickAnim - 20) / 18) * (0-(-4.01567)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 29.375 + (((tickAnim - 0) / 4) * (-6.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*100-(29.375)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 20) {
            xx = -6.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*100 + (((tickAnim - 4) / 16) * (-5.725-(-6.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*100)));
            yy = 1.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5 + (((tickAnim - 4) / 16) * (0-(1.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5)));
            zz = -0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5 + (((tickAnim - 4) / 16) * (0-(-0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -5.725 + (((tickAnim - 20) / 3) * (-1.03-(-5.725)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -1.03 + (((tickAnim - 23) / 15) * (29.375-(-1.03)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-48.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -48.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50 + (((tickAnim - 9) / 4) * (-26.005-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(-48.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -26.005-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 13) / 7) * (-2.775-(-26.005-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2.775 + (((tickAnim - 20) / 3) * (-6.48-(-2.775)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -6.48 + (((tickAnim - 23) / 15) * (0-(-6.48)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 23) / 2) * (-0.325-(-0.2)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -0.325 + (((tickAnim - 25) / 13) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 48.75 + (((tickAnim - 0) / 4) * (86.04194-(48.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.17726-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.51806-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 86.04194 + (((tickAnim - 4) / 9) * (69.6842-(86.04194)));
            yy = 1.17726 + (((tickAnim - 4) / 9) * (3.76722-(1.17726)));
            zz = -0.51806 + (((tickAnim - 4) / 9) * (-1.65779-(-0.51806)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 69.6842 + (((tickAnim - 13) / 7) * (18.55813-(69.6842)));
            yy = 3.76722 + (((tickAnim - 13) / 7) * (-3.90436-(3.76722)));
            zz = -1.65779 + (((tickAnim - 13) / 7) * (0.91747-(-1.65779)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 18.55813 + (((tickAnim - 20) / 3) * (13.92369-(18.55813)));
            yy = -3.90436 + (((tickAnim - 20) / 3) * (-2.92578-(-3.90436)));
            zz = 0.91747 + (((tickAnim - 20) / 3) * (1.48973-(0.91747)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 13.92369 + (((tickAnim - 23) / 2) * (4.68991-(13.92369)));
            yy = -2.92578 + (((tickAnim - 23) / 2) * (-2.16378-(-2.92578)));
            zz = 1.48973 + (((tickAnim - 23) / 2) * (1.93535-(1.48973)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 4.68991 + (((tickAnim - 25) / 13) * (48.75-(4.68991)));
            yy = -2.16378 + (((tickAnim - 25) / 13) * (0-(-2.16378)));
            zz = 1.93535 + (((tickAnim - 25) / 13) * (0-(1.93535)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 4) * (1.865-(0.425)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.525-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.865 + (((tickAnim - 4) / 4) * (3.535-(1.865)));
            zz = 0.525 + (((tickAnim - 4) / 4) * (0.18-(0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 3.535 + (((tickAnim - 8) / 5) * (1.725-(3.535)));
            zz = 0.18 + (((tickAnim - 8) / 5) * (0.275-(0.18)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 1.725 + (((tickAnim - 13) / 7) * (-0.6-(1.725)));
            zz = 0.275 + (((tickAnim - 13) / 7) * (0-(0.275)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 20) / 5) * (-1.4-(-0.6)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = -1.4 + (((tickAnim - 25) / 4) * (-0.2-(-1.4)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            yy = -0.2 + (((tickAnim - 29) / 9) * (0.425-(-0.2)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 26 + (((tickAnim - 0) / 4) * (31.37-(26)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 31.37 + (((tickAnim - 4) / 4) * (37.71-(31.37)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 37.71 + (((tickAnim - 8) / 5) * (0-(37.71)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -32.5 + (((tickAnim - 29) / 3) * (-30.45-(-32.5)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -30.45 + (((tickAnim - 32) / 6) * (26-(-30.45)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 4) * (-0.25-(-0.225)));
            zz = 0.075 + (((tickAnim - 0) / 4) * (0.4-(0.075)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 4) / 4) * (-0.16-(-0.25)));
            zz = 0.4 + (((tickAnim - 4) / 4) * (0.625-(0.4)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.16 + (((tickAnim - 8) / 5) * (0-(-0.16)));
            zz = 0.625 + (((tickAnim - 8) / 5) * (0-(0.625)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (0.185-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (-0.075-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.185 + (((tickAnim - 32) / 6) * (-0.225-(0.185)));
            zz = -0.075 + (((tickAnim - 32) / 6) * (0.075-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-25))*-4), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-90))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-120))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-120))*-3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188))*-2.5));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-80))*-2), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188))*-1.5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-180))*-4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-220))*-4), leftArm3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-50))*-4), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-80))*-2), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188))*-1.5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-180))*-4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-220))*-4), rightArm3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-50))*-4), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-50))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-200))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-150))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-180))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-20))*-2), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188))*2), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-65))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-100))*-2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-150))*-5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-100))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-100))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-200))*-4), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-150))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-150))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188/0.5-250))*-4), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-200))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*188-200))*4));

   }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAfrovenator entity = (EntityPrehistoricFloraAfrovenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*3), hip.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*1.5), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0.275+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-2);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*1.5);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 0) / 10) * (30-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 30 + (((tickAnim - 10) / 4) * (100.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(30)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 100.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 14) / 6) * (-12.5-(100.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -8.5 + (((tickAnim - 0) / 10) * (25.25-(-8.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 25.25 + (((tickAnim - 10) / 4) * (131.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*190-(25.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 131.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*190 + (((tickAnim - 14) / 6) * (-8.5-(131.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*190)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -40.75 + (((tickAnim - 15) / 2) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -40.75 + (((tickAnim - 17) / 3) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 10) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 21 + (((tickAnim - 0) / 3) * (6.2569-(21)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.1763-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.2431-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.2569 + (((tickAnim - 3) / 2) * (-16.4862-(6.2569)));
            yy = -0.1763 + (((tickAnim - 3) / 2) * (-0.3527-(-0.1763)));
            zz = -2.2431 + (((tickAnim - 3) / 2) * (-4.4862-(-2.2431)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -16.4862 + (((tickAnim - 5) / 1) * (4.8865-(-16.4862)));
            yy = -0.3527 + (((tickAnim - 5) / 1) * (-0.2939-(-0.3527)));
            zz = -4.4862 + (((tickAnim - 5) / 1) * (-3.7385-(-4.4862)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 4.8865 + (((tickAnim - 6) / 1) * (30.8092-(4.8865)));
            yy = -0.2939 + (((tickAnim - 6) / 1) * (-0.2351-(-0.2939)));
            zz = -3.7385 + (((tickAnim - 6) / 1) * (-2.9908-(-3.7385)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 30.8092 + (((tickAnim - 7) / 3) * (45.75-(30.8092)));
            yy = -0.2351 + (((tickAnim - 7) / 3) * (0-(-0.2351)));
            zz = -2.9908 + (((tickAnim - 7) / 3) * (0-(-2.9908)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 45.75 + (((tickAnim - 10) / 3) * (81.37-(45.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 81.37 + (((tickAnim - 13) / 7) * (21-(81.37)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.675 + (((tickAnim - 0) / 1) * (0.76-(-0.675)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.76 + (((tickAnim - 1) / 1) * (1.705-(0.76)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.705 + (((tickAnim - 2) / 1) * (1.99-(1.705)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.99 + (((tickAnim - 3) / 2) * (-1.675-(1.99)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.675 + (((tickAnim - 5) / 5) * (0-(-1.675)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (1.865-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 1.865 + (((tickAnim - 13) / 7) * (-0.325-(1.865)));
            zz = 0.275 + (((tickAnim - 13) / 7) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-15.63-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -15.63 + (((tickAnim - 6) / 2) * (-20.63-(-15.63)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20.63 + (((tickAnim - 8) / 2) * (31.25-(-20.63)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 31.25 + (((tickAnim - 10) / 3) * (31.12-(31.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 31.12 + (((tickAnim - 13) / 7) * (0-(31.12)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.125-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 6) / 2) * (0-(-0.175)));
            zz = -0.125 + (((tickAnim - 6) / 2) * (0-(-0.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 3) * (-0.17-(-0.25)));
            zz = 0.3 + (((tickAnim - 10) / 3) * (0.3-(0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.17 + (((tickAnim - 13) / 7) * (0-(-0.17)));
            zz = 0.3 + (((tickAnim - 13) / 7) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 30 + (((tickAnim - 0) / 4) * (32.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(30)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 32.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 4) / 6) * (-12.5-(32.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 10) / 10) * (30-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 25.25 + (((tickAnim - 0) / 4) * (46.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(25.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 46.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 4) / 6) * (-8.5-(46.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.5 + (((tickAnim - 10) / 10) * (25.25-(-8.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -40.75 + (((tickAnim - 5) / 2) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -40.75 + (((tickAnim - 7) / 3) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45.75 + (((tickAnim - 0) / 3) * (81.37-(45.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 81.37 + (((tickAnim - 3) / 7) * (21-(81.37)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 21 + (((tickAnim - 10) / 3) * (6.2569-(21)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.1763-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (2.2431-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.2569 + (((tickAnim - 13) / 2) * (-16.4862-(6.2569)));
            yy = 0.1763 + (((tickAnim - 13) / 2) * (0.3527-(0.1763)));
            zz = 2.2431 + (((tickAnim - 13) / 2) * (4.4862-(2.2431)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -16.4862 + (((tickAnim - 15) / 1) * (4.8865-(-16.4862)));
            yy = 0.3527 + (((tickAnim - 15) / 1) * (0.2939-(0.3527)));
            zz = 4.4862 + (((tickAnim - 15) / 1) * (3.7385-(4.4862)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 4.8865 + (((tickAnim - 16) / 1) * (30.8092-(4.8865)));
            yy = 0.2939 + (((tickAnim - 16) / 1) * (0.2351-(0.2939)));
            zz = 3.7385 + (((tickAnim - 16) / 1) * (2.9908-(3.7385)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 30.8092 + (((tickAnim - 17) / 3) * (45.75-(30.8092)));
            yy = 0.2351 + (((tickAnim - 17) / 3) * (0-(0.2351)));
            zz = 2.9908 + (((tickAnim - 17) / 3) * (0-(2.9908)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.865-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.865 + (((tickAnim - 3) / 3) * (0.96-(1.865)));
            zz = 0.275 + (((tickAnim - 3) / 3) * (0.15-(0.275)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.96 + (((tickAnim - 6) / 4) * (-0.675-(0.96)));
            zz = 0.15 + (((tickAnim - 6) / 4) * (0-(0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -0.675 + (((tickAnim - 10) / 1) * (0.76-(-0.675)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.76 + (((tickAnim - 11) / 1) * (1.705-(0.76)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.705 + (((tickAnim - 12) / 1) * (1.99-(1.705)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.99 + (((tickAnim - 13) / 2) * (-1.675-(1.99)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -1.675 + (((tickAnim - 15) / 5) * (0-(-1.675)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31.25 + (((tickAnim - 0) / 3) * (31.12-(31.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 31.12 + (((tickAnim - 3) / 7) * (0-(31.12)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (-15.63-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -15.63 + (((tickAnim - 16) / 2) * (-20.63-(-15.63)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20.63 + (((tickAnim - 18) / 2) * (31.25-(-20.63)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 3) * (-0.17-(-0.25)));
            zz = 0.3 + (((tickAnim - 0) / 3) * (0.3-(0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = -0.17 + (((tickAnim - 3) / 7) * (0-(-0.17)));
            zz = 0.3 + (((tickAnim - 3) / 7) * (0-(0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (-0.125-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 16) / 2) * (0-(-0.175)));
            zz = -0.125 + (((tickAnim - 16) / 2) * (0-(-0.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-4), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*-1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-130))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-130))*4), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*7), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-130))*4), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*7), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-6.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*3), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*4), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*5), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*4));

    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAfrovenator e = (EntityPrehistoricFloraAfrovenator) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Neck4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
