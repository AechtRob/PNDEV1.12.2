package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraNicrosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelNicrosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;

    private ModelAnimator animator;

    public ModelNicrosaurus() {
        this.textureWidth = 82;
        this.textureHeight = 82;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.5F, 22.9F, 0.0F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(-0.5F, -9.6F, 9.75F);
        this.main.addChild(hip);
        this.hip.cubeList.add(new ModelBox(hip, 0, 18, -3.0F, -1.35F, -3.75F, 6, 6, 7, 0.0F, false));
        this.hip.cubeList.add(new ModelBox(hip, 26, 58, -1.0F, -2.15F, -2.75F, 2, 1, 6, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 2.75F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 32, -2.5F, -1.0F, 0.0F, 5, 5, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 55, 53, -1.0F, -2.0F, 0.0F, 2, 1, 6, 0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 39, 41, -2.0F, -1.0F, 0.0F, 4, 5, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 67, 3, -0.5F, -2.5F, 0.0F, 1, 2, 5, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 34, -1.5F, -1.0F, 0.0F, 3, 4, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 48, 18, -0.5F, -2.5F, 0.0F, 1, 2, 7, 0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 6.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 50, 31, -1.0F, -1.0F, 0.0F, 2, 3, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 43, 59, -0.5F, -2.2F, 0.0F, 1, 2, 6, -0.001F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.5F, 5.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 37, 26, -0.5F, -1.0F, 0.0F, 1, 2, 8, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 30, 47, 0.0F, -2.0F, 0.0F, 0, 1, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -4.75F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -1.5F, -8.0F, 7, 7, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 17, 22, -1.0F, -2.2F, -8.0F, 2, 1, 10, 0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.9F, -7.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 32, 13, -3.0F, 0.25F, -5.0F, 6, 6, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 1.8F, -2.5F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 64, -0.5F, -2.75F, -2.5F, 2, 2, 5, -0.001F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.8F, 3.25F, -3.375F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.5199F, 0.0653F, -0.1135F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 25, 66, -1.1974F, -0.4367F, -1.6762F, 3, 5, 3, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.8026F, 3.8133F, 0.1238F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.6476F, -0.1207F, 0.2011F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 0, 0, -1.5F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 4.55F, -0.2F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.1752F, 0.0859F, 0.0152F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 66, 50, -2.0F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.8F, 3.25F, -4.0F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.5199F, -0.0653F, 0.1135F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 25, 66, -1.613F, -0.3586F, -1.0F, 3, 5, 3, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.613F, 3.8914F, 0.8F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.6476F, 0.1207F, -0.2011F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 0, 0, -0.5F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 4.55F, -0.2F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.1752F, -0.0859F, -0.0152F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 66, 50, -1.0F, 0.0F, -3.0F, 3, 1, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.0052F, -4.0231F);
        this.body2.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 44, -2.5F, -0.7552F, -3.9769F, 5, 5, 4, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 3.7448F, -1.9769F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 61, -1.5F, -0.975F, -1.925F, 4, 2, 4, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0302F, -1.9769F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 25, -1.0F, -0.675F, -2.0F, 2, 1, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.729F, -3.1305F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 15, 55, -2.0F, -1.4842F, -3.8464F, 4, 4, 4, -0.002F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 53, 41, -1.0F, -2.3342F, -3.8464F, 2, 1, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.0158F, -2.3464F);
        this.neck2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 68, -1.5F, -0.95F, -0.775F, 3, 2, 3, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 0.1F, -3.25F);
        this.neck2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 51, 0, -1.5F, -1.5F, -5.0F, 4, 2, 5, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 17, 34, -1.0F, -0.5F, -7.0F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 32, 1.9F, 0.5F, -6.2F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 46, -0.5F, -0.5F, -14.0F, 2, 1, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 58, 41, 1.4F, 0.5F, -14.0F, 0, 1, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 18, 0.0F, -1.9573F, -8.5929F, 1, 2, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 58, 41, -0.4F, 0.5F, -14.0F, 0, 1, 7, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 32, -0.9F, 0.5F, -6.2F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.1F, -5.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 61, 30, -0.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.5F, -13.9F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 37, -1.2F, -0.25F, -0.825F, 2, 2, 1, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 4, -0.8F, -0.25F, -0.825F, 2, 2, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.45F, 1.1481F, -14.8865F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 32, 0.0F, -0.2685F, -0.2547F, 0, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 32, 1.9F, -0.2685F, -0.2547F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.7288F, -12.7337F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 22, -0.5F, 1.0021F, -0.9932F, 1, 1, 1, -0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 0, -0.5F, 0.0021F, -1.9932F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -2.2573F, -10.7929F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 0, -1.0F, 0.0103F, -2.0047F, 1, 2, 2, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -1.9573F, -8.5929F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 68, -1.0F, 0.0F, -2.225F, 1, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.95F, -6.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 59, -1.0F, -1.05F, -1.0F, 2, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 0, -1.0F, 0.0F, -14.45F, 2, 1, 8, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 66, 0.85F, -1.0F, -12.85F, 0, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 18, -1.5F, 0.0F, -7.0F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 5, 1.25F, -1.0F, -6.8F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 5, -1.25F, -1.0F, -6.8F, 0, 1, 1, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 66, -0.85F, -1.0F, -12.85F, 0, 1, 6, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 53, 8, -2.0F, 0.0F, -5.0F, 4, 1, 5, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 58, 15, -1.5F, -1.9F, -4.5F, 3, 2, 5, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 23, -1.5F, 1.0F, -5.0F, 3, 1, 5, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 2.0F, -5.0F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1396F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 3, -1.5F, -1.0F, -7.0F, 2, 1, 7, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.0F, -13.95F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 5, 0.2F, -0.8F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 5, 1.8F, -0.8F, -0.5F, 0, 1, 1, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.5F, -1.698F, -4.0205F);
        this.head.addChild(eye);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.4F, -0.052F, 0.0205F);
        this.eye.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 44, -0.575F, -0.45F, -1.025F, 1, 1, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 44, 2.375F, -0.45F, -1.025F, 1, 1, 2, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.6F, 0.6F, 1.25F);
        this.hip.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.3323F, -0.0206F, -0.3166F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 0, 54, -1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 4.75F, 0.25F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.5087F, -0.1298F, 0.228F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 66, 38, -1.0F, -1.125F, -2.0F, 2, 7, 3, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 5.0F, 0.75F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.1628F, -0.0378F, 0.0358F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 42, 52, -2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.6F, 0.6F, 1.25F);
        this.hip.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.3323F, 0.0206F, 0.3166F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 0, 54, -1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 4.75F, 0.25F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.5087F, 0.1298F, -0.228F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 66, 38, -1.0F, -1.125F, -2.0F, 2, 7, 3, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 5.0F, 0.75F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.1628F, 0.0378F, -0.0358F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 42, 52, -2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, true));
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
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(117);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.2F, 3.8F, -0.0F);
        this.setRotateAngle(neck, -0.05F, 0.05F, 0.0F);
        this.setRotateAngle(neck2, -0.05F, 0.05F, 0.0F);
        this.setRotateAngle(head, 0.1F, 0.05F, 0.0F);
        this.setRotateAngle(jaw, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg, -0.2F, 0.0F, -0.1F);
        this.setRotateAngle(frontLeftLeg2, -0.25F, 0.0F, 0.1F);
        this.setRotateAngle(frontLeftLeg3, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, 0.9F, 0.0F, 0.1F);
        this.setRotateAngle(frontRightLeg2, -0.6F, 0.0F, -0.1F);
        this.setRotateAngle(frontRightLeg3, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg2, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg3, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.frontLeftLeg.setScale(0,0,0);
        this.frontRightLeg.setScale(0,0,0);
        this.frontLeftLeg.scaleChildren = true;
        this.frontRightLeg.scaleChildren = true;
        this.body2.offsetX = -0.0F;
        this.body2.offsetY = -0.02F;
        this.body2.offsetZ = 0.03F;
        this.body2.render(0.01F);
        this.frontLeftLeg.setScale(1,1,1);
        this.frontRightLeg.setScale(1,1,1);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(neck, -0.05F, 0.05F, 0.0F);
        this.setRotateAngle(neck2, -0.05F, 0.05F, 0.0F);
        this.setRotateAngle(head, 0.1F, 0.05F, 0.0F);
        this.setRotateAngle(jaw, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg, -0.2F, 0.0F, -0.1F);
        this.setRotateAngle(frontLeftLeg2, -0.25F, 0.0F, 0.1F);
        this.setRotateAngle(frontLeftLeg3, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, 0.9F, 0.0F, 0.1F);
        this.setRotateAngle(frontRightLeg2, -0.6F, 0.0F, -0.1F);
        this.setRotateAngle(frontRightLeg3, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg2, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg3, 0.0F, 0.0F, 0.0F);
        this.hip.offsetY = 0.075F;
        this.hip.render(0.01f);
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

        EntityPrehistoricFloraNicrosaurus Nicrosaurus = (EntityPrehistoricFloraNicrosaurus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        Nicrosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (Nicrosaurus.getAnimation() == Nicrosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }

        if (!Nicrosaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Nicrosaurus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
            }

            if (Nicrosaurus.getIsFast()) { //Running


            }
            else { //Walking

            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraNicrosaurus ee = (EntityPrehistoricFloraNicrosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

            if (!ee.getIsMoving()) {
                return;
            }

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
            else { //Walking
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                return;
            }
            //moving in water
            return;
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }


    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNicrosaurus entity = (EntityPrehistoricFloraNicrosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 11.5 + (((tickAnim - 5) / 6) * (0-(11.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.5 + (((tickAnim - 13) / 2) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 1.75 + (((tickAnim - 5) / 6) * (0-(1.75)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5.25 + (((tickAnim - 13) / 2) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.65597-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.79795-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.98679-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12.65597 + (((tickAnim - 5) / 3) * (20.90597-(12.65597)));
            yy = 1.79795 + (((tickAnim - 5) / 3) * (1.79795-(1.79795)));
            zz = -5.98679 + (((tickAnim - 5) / 3) * (-5.98679-(-5.98679)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.90597 + (((tickAnim - 8) / 1) * (20.4774-(20.90597)));
            yy = 1.79795 + (((tickAnim - 8) / 1) * (1.79795-(1.79795)));
            zz = -5.98679 + (((tickAnim - 8) / 1) * (-5.98679-(-5.98679)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.4774 + (((tickAnim - 9) / 4) * (8.90597-(20.4774)));
            yy = 1.79795 + (((tickAnim - 9) / 4) * (1.79795-(1.79795)));
            zz = -5.98679 + (((tickAnim - 9) / 4) * (-5.98679-(-5.98679)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.90597 + (((tickAnim - 13) / 2) * (0-(8.90597)));
            yy = 1.79795 + (((tickAnim - 13) / 2) * (0-(1.79795)));
            zz = -5.98679 + (((tickAnim - 13) / 2) * (0-(-5.98679)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0.425 + (((tickAnim - 5) / 10) * (0-(0.425)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.25 + (((tickAnim - 5) / 3) * (0-(10.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (10.25-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 10.25 + (((tickAnim - 13) / 2) * (0-(10.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.03-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 3) / 2) * (1-(1)));
            yy = 0.03 + (((tickAnim - 3) / 2) * (1-(0.03)));
            zz = 1 + (((tickAnim - 3) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);
        
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNicrosaurus entity = (EntityPrehistoricFloraNicrosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.25 + (((tickAnim - 5) / 5) * (-15.5-(-22.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.5 + (((tickAnim - 10) / 10) * (22.75-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22.75 + (((tickAnim - 20) / 10) * (-15.5-(22.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -15.5 + (((tickAnim - 30) / 10) * (22.75-(-15.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 22.75 + (((tickAnim - 40) / 10) * (0-(22.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12 + (((tickAnim - 5) / 5) * (0-(12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (34.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34.25 + (((tickAnim - 20) / 10) * (0-(34.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (34.25-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 40) / 10) * (0-(34.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.03-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.03 + (((tickAnim - 5) / 5) * (-0.45-(1.03)));
            zz = -0.4 + (((tickAnim - 5) / 5) * (0-(-0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.45 + (((tickAnim - 10) / 10) * (0.525-(-0.45)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 20) / 5) * (1.715-(0.525)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.715 + (((tickAnim - 25) / 5) * (-0.45-(1.715)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.45 + (((tickAnim - 30) / 10) * (0.525-(-0.45)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 40) / 5) * (1.21-(0.525)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.21 + (((tickAnim - 45) / 5) * (0-(1.21)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (34.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 34.13 + (((tickAnim - 5) / 5) * (14.75-(34.13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 14.75 + (((tickAnim - 10) / 4) * (-3.86-(14.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -3.86 + (((tickAnim - 14) / 6) * (55.25-(-3.86)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 55.25 + (((tickAnim - 20) / 10) * (14.75-(55.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 14.75 + (((tickAnim - 30) / 4) * (-3.86-(14.75)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -3.86 + (((tickAnim - 34) / 6) * (55.25-(-3.86)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 55.25 + (((tickAnim - 40) / 10) * (0-(55.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 5) / 5) * (0-(0.55)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.65-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (1.575-(0)));
            zz = -0.65 + (((tickAnim - 20) / 5) * (-0.32-(-0.65)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.575 + (((tickAnim - 25) / 5) * (0-(1.575)));
            zz = -0.32 + (((tickAnim - 25) / 5) * (0-(-0.32)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-0.65-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (1.2-(0)));
            zz = -0.65 + (((tickAnim - 40) / 5) * (-0.32-(-0.65)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 45) / 5) * (0-(1.2)));
            zz = -0.32 + (((tickAnim - 45) / 5) * (0-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNicrosaurus entity = (EntityPrehistoricFloraNicrosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.75 + (((tickAnim - 15) / 20) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 35) / 15) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.325-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.35 + (((tickAnim - 15) / 20) * (-2.35-(-2.35)));
            zz = 1.325 + (((tickAnim - 15) / 20) * (1.325-(1.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.35 + (((tickAnim - 35) / 15) * (0-(-2.35)));
            zz = 1.325 + (((tickAnim - 35) / 15) * (0-(1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9 + (((tickAnim - 15) / 20) * (9-(9)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 35) / 15) * (0-(9)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.75 + (((tickAnim - 15) / 20) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 35) / 15) * (0-(8.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 15) / 20) * (5-(5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 35) / 15) * (0-(5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -19.25 + (((tickAnim - 15) / 20) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 35) / 15) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19.77086-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.5057-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.3327-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 19.77086 + (((tickAnim - 15) / 20) * (19.77086-(19.77086)));
            yy = 0.5057 + (((tickAnim - 15) / 20) * (0.5057-(0.5057)));
            zz = 0.3327 + (((tickAnim - 15) / 20) * (0.3327-(0.3327)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 19.77086 + (((tickAnim - 35) / 15) * (0-(19.77086)));
            yy = 0.5057 + (((tickAnim - 35) / 15) * (0-(0.5057)));
            zz = 0.3327 + (((tickAnim - 35) / 15) * (0-(0.3327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = 0 + (((tickAnim - 0) / 15) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6 + (((tickAnim - 15) / 20) * (6-(6)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 35) / 15) * (0-(6)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21 + (((tickAnim - 15) / 20) * (-21-(-21)));
            yy = -11.75 + (((tickAnim - 15) / 20) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 35) / 15) * (0-(-21)));
            yy = -11.75 + (((tickAnim - 35) / 15) * (0-(-11.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 35.75 + (((tickAnim - 15) / 20) * (35.75-(35.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 35.75 + (((tickAnim - 35) / 15) * (0-(35.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.375 + (((tickAnim - 15) / 20) * (0.375-(0.375)));
            zz = -0.25 + (((tickAnim - 15) / 20) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.375 + (((tickAnim - 35) / 15) * (0-(0.375)));
            zz = -0.25 + (((tickAnim - 35) / 15) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8 + (((tickAnim - 15) / 20) * (-8-(-8)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 35) / 15) * (0-(-8)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.525 + (((tickAnim - 15) / 20) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.525 + (((tickAnim - 35) / 15) * (0-(0.525)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21 + (((tickAnim - 15) / 20) * (-21-(-21)));
            yy = 11.75 + (((tickAnim - 15) / 20) * (11.75-(11.75)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 35) / 15) * (0-(-21)));
            yy = 11.75 + (((tickAnim - 35) / 15) * (0-(11.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 35.75 + (((tickAnim - 15) / 20) * (35.75-(35.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 35.75 + (((tickAnim - 35) / 15) * (0-(35.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.375 + (((tickAnim - 15) / 20) * (0.375-(0.375)));
            zz = -0.25 + (((tickAnim - 15) / 20) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.375 + (((tickAnim - 35) / 15) * (0-(0.375)));
            zz = -0.25 + (((tickAnim - 35) / 15) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8 + (((tickAnim - 15) / 20) * (-8-(-8)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 35) / 15) * (0-(-8)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.525 + (((tickAnim - 15) / 20) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.525 + (((tickAnim - 35) / 15) * (0-(0.525)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNicrosaurus entity = (EntityPrehistoricFloraNicrosaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.74932-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.05234-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.49909-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.74932 + (((tickAnim - 3) / 5) * (-10.50068-(4.74932)));
            yy = 0.05234 + (((tickAnim - 3) / 5) * (0.05234-(0.05234)));
            zz = -1.49909 + (((tickAnim - 3) / 5) * (-1.49909-(-1.49909)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -10.50068 + (((tickAnim - 8) / 5) * (0-(-10.50068)));
            yy = 0.05234 + (((tickAnim - 8) / 5) * (0-(0.05234)));
            zz = -1.49909 + (((tickAnim - 8) / 5) * (0-(-1.49909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-3.24997-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.01199-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.24971-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.24997 + (((tickAnim - 3) / 5) * (-1.5219-(-3.24997)));
            yy = -0.01199 + (((tickAnim - 3) / 5) * (0.57482-(-0.01199)));
            zz = -0.24971 + (((tickAnim - 3) / 5) * (-4.71136-(-0.24971)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -1.5219 + (((tickAnim - 8) / 5) * (0-(-1.5219)));
            yy = 0.57482 + (((tickAnim - 8) / 5) * (0-(0.57482)));
            zz = -4.71136 + (((tickAnim - 8) / 5) * (0-(-4.71136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.75 + (((tickAnim - 3) / 5) * (-1.94302-(-2.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.35561-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-4.81318-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -1.94302 + (((tickAnim - 8) / 5) * (0-(-1.94302)));
            yy = -1.35561 + (((tickAnim - 8) / 5) * (0-(-1.35561)));
            zz = -4.81318 + (((tickAnim - 8) / 5) * (0-(-4.81318)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 6.25 + (((tickAnim - 3) / 5) * (23.58288-(6.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.52401-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (3.72519-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 23.58288 + (((tickAnim - 8) / 1) * (0-(23.58288)));
            yy = -0.52401 + (((tickAnim - 8) / 1) * (0-(-0.52401)));
            zz = 3.72519 + (((tickAnim - 8) / 1) * (0-(3.72519)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNicrosaurus entity = (EntityPrehistoricFloraNicrosaurus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -22.5 + (((tickAnim - 0) / 7) * (29.75-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 29.75 + (((tickAnim - 7) / 4) * (1.94075-(29.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (5.59505-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (17.42044-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 1.94075 + (((tickAnim - 11) / 2) * (-22.5-(1.94075)));
            yy = 5.59505 + (((tickAnim - 11) / 2) * (0-(5.59505)));
            zz = 17.42044 + (((tickAnim - 11) / 2) * (0-(17.42044)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -1.5 + (((tickAnim - 0) / 7) * (40.25-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 40.25 + (((tickAnim - 7) / 2) * (20.03-(40.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 20.03 + (((tickAnim - 9) / 3) * (-7.86-(20.03)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -7.86 + (((tickAnim - 12) / 1) * (-1.5-(-7.86)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 7) * (0.85-(-0.6)));
            zz = 0.05 + (((tickAnim - 0) / 7) * (-0.525-(0.05)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 7) / 2) * (1.295-(0.85)));
            zz = -0.525 + (((tickAnim - 7) / 2) * (-0.58-(-0.525)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.295 + (((tickAnim - 9) / 3) * (1.365-(1.295)));
            zz = -0.58 + (((tickAnim - 9) / 3) * (-0.185-(-0.58)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.365 + (((tickAnim - 12) / 1) * (-0.6-(1.365)));
            zz = -0.185 + (((tickAnim - 12) / 1) * (0.05-(-0.185)));
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
            xx = 21.25 + (((tickAnim - 0) / 3) * (-2.4835-(21.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.25539-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.22441-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -2.4835 + (((tickAnim - 3) / 1) * (2.15-(-2.4835)));
            yy = -0.25539 + (((tickAnim - 3) / 1) * (0-(-0.25539)));
            zz = -1.22441 + (((tickAnim - 3) / 1) * (0-(-1.22441)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 2.15 + (((tickAnim - 4) / 3) * (49.75-(2.15)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 49.75 + (((tickAnim - 7) / 2) * (78.63-(49.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 78.63 + (((tickAnim - 9) / 3) * (0.7-(78.63)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0.7 + (((tickAnim - 12) / 1) * (21.25-(0.7)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (-0.175-(0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 1) * (0.2-(-0.175)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.245-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 4) / 1) * (1.04-(0.2)));
            zz = 0.245 + (((tickAnim - 4) / 1) * (0.21-(0.245)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.04 + (((tickAnim - 5) / 2) * (0.475-(1.04)));
            zz = 0.21 + (((tickAnim - 5) / 2) * (-0.825-(0.21)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 7) / 2) * (2.38-(0.475)));
            zz = -0.825 + (((tickAnim - 7) / 2) * (-1.34-(-0.825)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 2.38 + (((tickAnim - 9) / 3) * (-0.625-(2.38)));
            zz = -1.34 + (((tickAnim - 9) / 3) * (0-(-1.34)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.625 + (((tickAnim - 12) / 1) * (0.5-(-0.625)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30.06916 + (((tickAnim - 0) / 3) * (-40.30186-(-30.06916)));
            yy = 4.1931 + (((tickAnim - 0) / 3) * (1.8118-(4.1931)));
            zz = -16.239 + (((tickAnim - 0) / 3) * (-11.1173-(-16.239)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -40.30186 + (((tickAnim - 3) / 5) * (27.51064-(-40.30186)));
            yy = 1.8118 + (((tickAnim - 3) / 5) * (-3.1459-(1.8118)));
            zz = -11.1173 + (((tickAnim - 3) / 5) * (7.1009-(-11.1173)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.51064 + (((tickAnim - 8) / 3) * (-23.99013-(27.51064)));
            yy = -3.1459 + (((tickAnim - 8) / 3) * (8.53478-(-3.1459)));
            zz = 7.1009 + (((tickAnim - 8) / 3) * (-29.0615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15-(7.1009)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -23.99013 + (((tickAnim - 11) / 2) * (-30.06916-(-23.99013)));
            yy = 8.53478 + (((tickAnim - 11) / 2) * (4.1931-(8.53478)));
            zz = -29.0615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15 + (((tickAnim - 11) / 2) * (-16.239-(-29.0615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0.325 + (((tickAnim - 0) / 3) * (1-(0.325)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0.2-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 1 + (((tickAnim - 3) / 5) * (0-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.2 + (((tickAnim - 8) / 3) * (-0.25-(0.2)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.35-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.25 + (((tickAnim - 11) / 2) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0.35 + (((tickAnim - 11) / 2) * (0.325-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -23.0691 + (((tickAnim - 0) / 3) * (16.25-(-23.0691)));
            yy = 3.4976 + (((tickAnim - 0) / 3) * (0-(3.4976)));
            zz = 5.8181 + (((tickAnim - 0) / 3) * (0-(5.8181)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 16.25 + (((tickAnim - 3) / 5) * (18-(16.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 18 + (((tickAnim - 8) / 3) * (6.07144-(18)));
            yy = 0 + (((tickAnim - 8) / 3) * (7.1769-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (24.148-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.07144 + (((tickAnim - 11) / 2) * (-23.0691-(6.07144)));
            yy = 7.1769 + (((tickAnim - 11) / 2) * (3.4976-(7.1769)));
            zz = 24.148 + (((tickAnim - 11) / 2) * (5.8181-(24.148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.14 + (((tickAnim - 0) / 3) * (0-(-0.14)));
            yy = -0.155 + (((tickAnim - 0) / 3) * (-0.15-(-0.155)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 3) / 5) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0.3-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.01-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.3 + (((tickAnim - 11) / 2) * (-0.14-(0.3)));
            yy = 0.01 + (((tickAnim - 11) / 2) * (-0.155-(0.01)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
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
            xx = 86.64687 + (((tickAnim - 0) / 3) * (19.82507-(86.64687)));
            yy = -5.2404 + (((tickAnim - 0) / 3) * (-1.05601-(-5.2404)));
            zz = 4.855 + (((tickAnim - 0) / 3) * (0.75433-(4.855)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 19.82507 + (((tickAnim - 3) / 0) * (6.21136-(19.82507)));
            yy = -1.05601 + (((tickAnim - 3) / 0) * (-1.77014-(-1.05601)));
            zz = 0.75433 + (((tickAnim - 3) / 0) * (3.08723-(0.75433)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.21136 + (((tickAnim - 3) / 2) * (23.773-(6.21136)));
            yy = -1.77014 + (((tickAnim - 3) / 2) * (2.69052-(-1.77014)));
            zz = 3.08723 + (((tickAnim - 3) / 2) * (-0.25114-(3.08723)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 23.773 + (((tickAnim - 5) / 3) * (81.08465-(23.773)));
            yy = 2.69052 + (((tickAnim - 5) / 3) * (7.15118-(2.69052)));
            zz = -0.25114 + (((tickAnim - 5) / 3) * (-3.58951-(-0.25114)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 81.08465 + (((tickAnim - 8) / 3) * (94.67123-(81.08465)));
            yy = 7.15118 + (((tickAnim - 8) / 3) * (-5.9753-(7.15118)));
            zz = -3.58951 + (((tickAnim - 8) / 3) * (4.3683-(-3.58951)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 94.67123 + (((tickAnim - 11) / 2) * (86.64687-(94.67123)));
            yy = -5.9753 + (((tickAnim - 11) / 2) * (-5.2404-(-5.9753)));
            zz = 4.3683 + (((tickAnim - 11) / 2) * (4.855-(4.3683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.14 + (((tickAnim - 0) / 3) * (0-(1.14)));
            zz = -0.545 + (((tickAnim - 0) / 3) * (0-(-0.545)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (1.515-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 1.515 + (((tickAnim - 5) / 1) * (1.99-(1.515)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.99 + (((tickAnim - 6) / 2) * (0-(1.99)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (1.165-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.165 + (((tickAnim - 11) / 2) * (1.14-(1.165)));
            zz = -0.225 + (((tickAnim - 11) / 2) * (-0.545-(-0.225)));
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
            xx = 27.51064 + (((tickAnim - 0) / 3) * (-5.97012-(27.51064)));
            yy = 3.14593 + (((tickAnim - 0) / 3) * (-13.20036-(3.14593)));
            zz = -7.10092 + (((tickAnim - 0) / 3) * (13.3149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-15-(-7.10092)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -5.97012 + (((tickAnim - 3) / 4) * (-50.67999-(-5.97012)));
            yy = -13.20036 + (((tickAnim - 3) / 4) * (1.69646-(-13.20036)));
            zz = 13.3149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-15 + (((tickAnim - 3) / 4) * (11.71061-(13.3149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-15)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -50.67999 + (((tickAnim - 7) / 6) * (27.51064-(-50.67999)));
            yy = 1.69646 + (((tickAnim - 7) / 6) * (3.14593-(1.69646)));
            zz = 11.71061 + (((tickAnim - 7) / 6) * (-7.10092-(11.71061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.15 + (((tickAnim - 0) / 3) * (0-(-0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (1.325-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 1.325 + (((tickAnim - 7) / 4) * (0-(1.325)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.75 + (((tickAnim - 0) / 3) * (5.84453-(19.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-7.86965-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-13.09073-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5.84453 + (((tickAnim - 3) / 2) * (-23.83637-(5.84453)));
            yy = -7.86965 + (((tickAnim - 3) / 2) * (-4.37203-(-7.86965)));
            zz = -13.09073 + (((tickAnim - 3) / 2) * (-7.27263-(-13.09073)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -23.83637 + (((tickAnim - 5) / 2) * (19.5-(-23.83637)));
            yy = -4.37203 + (((tickAnim - 5) / 2) * (0-(-4.37203)));
            zz = -7.27263 + (((tickAnim - 5) / 2) * (0-(-7.27263)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 19.5 + (((tickAnim - 7) / 6) * (19.75-(19.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.06-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.3 + (((tickAnim - 3) / 2) * (-0.17-(-0.3)));
            yy = 1.06 + (((tickAnim - 3) / 2) * (-0.355-(1.06)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.17 + (((tickAnim - 5) / 2) * (0-(-0.17)));
            yy = -0.355 + (((tickAnim - 5) / 2) * (-0.5-(-0.355)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.5 + (((tickAnim - 7) / 6) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 81.08465 + (((tickAnim - 0) / 2) * (102.15747-(81.08465)));
            yy = 7.15118 + (((tickAnim - 0) / 2) * (6.64724-(7.15118)));
            zz = -3.58951 + (((tickAnim - 0) / 2) * (-3.92327-(-3.58951)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 102.15747 + (((tickAnim - 2) / 1) * (94.67123-(102.15747)));
            yy = 6.64724 + (((tickAnim - 2) / 1) * (5.97533-(6.64724)));
            zz = -3.92327 + (((tickAnim - 2) / 1) * (-4.36828-(-3.92327)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 94.67123 + (((tickAnim - 3) / 2) * (87.06174-(94.67123)));
            yy = 5.97533 + (((tickAnim - 3) / 2) * (5.38741-(5.97533)));
            zz = -4.36828 + (((tickAnim - 3) / 2) * (-4.75767-(-4.36828)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 87.06174 + (((tickAnim - 5) / 2) * (28.73738-(87.06174)));
            yy = 5.38741 + (((tickAnim - 5) / 2) * (4.6525-(5.38741)));
            zz = -4.75767 + (((tickAnim - 5) / 2) * (-5.2444-(-4.75767)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 28.73738 + (((tickAnim - 7) / 3) * (0.37633-(28.73738)));
            yy = 4.6525 + (((tickAnim - 7) / 3) * (3.79584-(4.6525)));
            zz = -5.2444 + (((tickAnim - 7) / 3) * (3.74896-(-5.2444)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0.37633 + (((tickAnim - 10) / 2) * (16.0181-(0.37633)));
            yy = 3.79584 + (((tickAnim - 10) / 2) * (6.11864-(3.79584)));
            zz = 3.74896 + (((tickAnim - 10) / 2) * (-2.74069-(3.74896)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 16.0181 + (((tickAnim - 12) / 1) * (81.08465-(16.0181)));
            yy = 6.11864 + (((tickAnim - 12) / 1) * (7.15118-(6.11864)));
            zz = -2.74069 + (((tickAnim - 12) / 1) * (-3.58951-(-2.74069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.915-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.915 + (((tickAnim - 3) / 2) * (0.41-(0.915)));
            zz = -0.225 + (((tickAnim - 3) / 2) * (-0.395-(-0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.41 + (((tickAnim - 5) / 2) * (0.475-(0.41)));
            zz = -0.395 + (((tickAnim - 5) / 2) * (0-(-0.395)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 7) / 2) * (1.31-(0.475)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.31 + (((tickAnim - 9) / 1) * (0.99-(1.31)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.99 + (((tickAnim - 10) / 2) * (1.535-(0.99)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.535 + (((tickAnim - 12) / 1) * (0-(1.535)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.75 + (((tickAnim - 0) / 3) * (2.95257-(29.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-6.31074-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-20.62317-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.95257 + (((tickAnim - 3) / 3) * (-27-(2.95257)));
            yy = -6.31074 + (((tickAnim - 3) / 3) * (0-(-6.31074)));
            zz = -20.62317 + (((tickAnim - 3) / 3) * (0-(-20.62317)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -27 + (((tickAnim - 6) / 7) * (29.75-(-27)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.75 + (((tickAnim - 0) / 3) * (20.03-(43.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 20.03 + (((tickAnim - 3) / 1) * (-7.86-(20.03)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -7.86 + (((tickAnim - 4) / 2) * (-4.75-(-7.86)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -4.75 + (((tickAnim - 6) / 7) * (43.75-(-4.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.825 + (((tickAnim - 0) / 3) * (1.295-(0.825)));
            zz = -0.525 + (((tickAnim - 0) / 3) * (-0.58-(-0.525)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.295 + (((tickAnim - 3) / 1) * (1.49-(1.295)));
            zz = -0.58 + (((tickAnim - 3) / 1) * (-0.035-(-0.58)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.49 + (((tickAnim - 4) / 2) * (-0.6-(1.49)));
            zz = -0.035 + (((tickAnim - 4) / 2) * (0.05-(-0.035)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 6) / 7) * (0.825-(-0.6)));
            zz = 0.05 + (((tickAnim - 6) / 7) * (-0.525-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 48.25 + (((tickAnim - 0) / 3) * (78.63-(48.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 78.63 + (((tickAnim - 3) / 0) * (49.2-(78.63)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 49.2 + (((tickAnim - 3) / 1) * (6.93-(49.2)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 6.93 + (((tickAnim - 4) / 2) * (30.75-(6.93)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 30.75 + (((tickAnim - 6) / 2) * (-5.77-(30.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -5.77 + (((tickAnim - 8) / 3) * (6.01-(-5.77)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.01 + (((tickAnim - 11) / 2) * (48.25-(6.01)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 0) / 3) * (2.38-(0.975)));
            zz = -0.575 + (((tickAnim - 0) / 3) * (-1.34-(-0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.38 + (((tickAnim - 3) / 0) * (1.555-(2.38)));
            zz = -1.34 + (((tickAnim - 3) / 0) * (-0.56-(-1.34)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.555 + (((tickAnim - 3) / 1) * (0-(1.555)));
            zz = -0.56 + (((tickAnim - 3) / 1) * (0-(-0.56)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.175-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 1) * (0.51-(0.175)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.51 + (((tickAnim - 7) / 1) * (0-(0.51)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.94-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.21-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.94 + (((tickAnim - 11) / 2) * (0.975-(0.94)));
            zz = 0.21 + (((tickAnim - 11) / 2) * (-0.575-(0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+50))*2.5), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-20))*5), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-70))*4));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5 + (((tickAnim - 0) / 4) * (0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1 + (((tickAnim - 4) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1)));
            yy = 0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5 + (((tickAnim - 4) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5-(0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5 + (((tickAnim - 4) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1 + (((tickAnim - 7) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5 + (((tickAnim - 7) / 4) * (0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5 + (((tickAnim - 7) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1 + (((tickAnim - 11) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540))*0.1)));
            yy = 0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5 + (((tickAnim - 11) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5-(0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5-45))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5 + (((tickAnim - 11) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5+10))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*-0.8), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*5), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-70))*2));
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(0);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(0);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(-0.15);
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*0.8), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*-5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-70))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(3.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-120))*0.2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-120))*-4), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*15), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-140))*4));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-8.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-120))*-1), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*20), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-180))*-8));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*4));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-120))*3.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*-7), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-90))*-8));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*-2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-20))*8), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-290))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+80))*-8), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNicrosaurus entity = (EntityPrehistoricFloraNicrosaurus) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -22.5 + (((tickAnim - 0) / 18) * (29.75-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 29.75 + (((tickAnim - 18) / 15) * (-22.5-(29.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -1.5 + (((tickAnim - 0) / 18) * (27.75-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 27.75 + (((tickAnim - 18) / 5) * (20.03-(27.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 20.03 + (((tickAnim - 23) / 5) * (-7.86-(20.03)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -7.86 + (((tickAnim - 28) / 5) * (-1.5-(-7.86)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 18) * (0-(-0.6)));
            zz = 0.05 + (((tickAnim - 0) / 18) * (0-(0.05)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (1.295-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.58-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.295 + (((tickAnim - 23) / 5) * (1.49-(1.295)));
            zz = -0.58 + (((tickAnim - 23) / 5) * (-0.035-(-0.58)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 1.49 + (((tickAnim - 28) / 5) * (-0.6-(1.49)));
            zz = -0.035 + (((tickAnim - 28) / 5) * (0.05-(-0.035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 21.25 + (((tickAnim - 0) / 5) * (-2.4835-(21.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.25539-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.22441-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.4835 + (((tickAnim - 5) / 5) * (2.15-(-2.4835)));
            yy = -0.25539 + (((tickAnim - 5) / 5) * (0-(-0.25539)));
            zz = -1.22441 + (((tickAnim - 5) / 5) * (0-(-1.22441)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 2.15 + (((tickAnim - 10) / 8) * (32.25-(2.15)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 32.25 + (((tickAnim - 18) / 5) * (78.63-(32.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 78.63 + (((tickAnim - 23) / 5) * (49.2-(78.63)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 49.2 + (((tickAnim - 28) / 3) * (2.43-(49.2)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 2.43 + (((tickAnim - 31) / 2) * (21.25-(2.43)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 5) * (-0.175-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 5) / 5) * (0.2-(-0.175)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.245-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 10) / 3) * (1.04-(0.2)));
            zz = 0.245 + (((tickAnim - 10) / 3) * (0.21-(0.245)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.04 + (((tickAnim - 13) / 5) * (0-(1.04)));
            zz = 0.21 + (((tickAnim - 13) / 5) * (0.175-(0.21)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (2.38-(0)));
            zz = 0.175 + (((tickAnim - 18) / 5) * (-1.34-(0.175)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 2.38 + (((tickAnim - 23) / 5) * (1.73-(2.38)));
            zz = -1.34 + (((tickAnim - 23) / 5) * (-0.56-(-1.34)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 1.73 + (((tickAnim - 28) / 3) * (-0.3-(1.73)));
            zz = -0.56 + (((tickAnim - 28) / 3) * (0-(-0.56)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 31) / 2) * (-0.325-(-0.3)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -21.56916 + (((tickAnim - 0) / 3) * (-32.80186-(-21.56916)));
            yy = 4.1931 + (((tickAnim - 0) / 3) * (1.8118-(4.1931)));
            zz = -16.239 + (((tickAnim - 0) / 3) * (-11.1173-(-16.239)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = -32.80186 + (((tickAnim - 3) / 17) * (27.51064-(-32.80186)));
            yy = 1.8118 + (((tickAnim - 3) / 17) * (-3.1459-(1.8118)));
            zz = -11.1173 + (((tickAnim - 3) / 17) * (7.1009-(-11.1173)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 27.51064 + (((tickAnim - 20) / 7) * (-8.08184-(27.51064)));
            yy = -3.1459 + (((tickAnim - 20) / 7) * (6.19154-(-3.1459)));
            zz = 7.1009 + (((tickAnim - 20) / 7) * (-8.2888+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-15-(7.1009)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -8.08184 + (((tickAnim - 27) / 6) * (-21.56916-(-8.08184)));
            yy = 6.19154 + (((tickAnim - 27) / 6) * (4.1931-(6.19154)));
            zz = -8.2888+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-15 + (((tickAnim - 27) / 6) * (-16.239-(-8.2888+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0.325 + (((tickAnim - 0) / 3) * (0.325-(0.325)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0.2-(0)));
            yy = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            zz = 0.325 + (((tickAnim - 3) / 17) * (0-(0.325)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0.2 + (((tickAnim - 20) / 7) * (-0.25-(0.2)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0.35-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -0.25 + (((tickAnim - 27) / 6) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0.35 + (((tickAnim - 27) / 6) * (0.325-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -23.0691 + (((tickAnim - 0) / 3) * (3.75-(-23.0691)));
            yy = 3.4976 + (((tickAnim - 0) / 3) * (0-(3.4976)));
            zz = 5.8181 + (((tickAnim - 0) / 3) * (0-(5.8181)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 3.75 + (((tickAnim - 3) / 17) * (9-(3.75)));
            yy = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 17) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 9 + (((tickAnim - 20) / 7) * (6.86747-(9)));
            yy = 0 + (((tickAnim - 20) / 7) * (2.02277-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (7.13082-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 6.86747 + (((tickAnim - 27) / 6) * (-23.0691-(6.86747)));
            yy = 2.02277 + (((tickAnim - 27) / 6) * (3.4976-(2.02277)));
            zz = 7.13082 + (((tickAnim - 27) / 6) * (5.8181-(7.13082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.14 + (((tickAnim - 0) / 3) * (0-(-0.14)));
            yy = -0.38 + (((tickAnim - 0) / 3) * (-0.5-(-0.38)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            yy = -0.5 + (((tickAnim - 3) / 17) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 3) / 17) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0.3-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (1.16-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0.3 + (((tickAnim - 27) / 6) * (-0.14-(0.3)));
            yy = 1.16 + (((tickAnim - 27) / 6) * (-0.38-(1.16)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
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
            xx = 75.14687 + (((tickAnim - 0) / 3) * (28.73738-(75.14687)));
            yy = -5.2404 + (((tickAnim - 0) / 3) * (-4.6525-(-5.2404)));
            zz = 4.855 + (((tickAnim - 0) / 3) * (5.2444-(4.855)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 28.73738 + (((tickAnim - 3) / 4) * (13.71136-(28.73738)));
            yy = -4.6525 + (((tickAnim - 3) / 4) * (-1.77014-(-4.6525)));
            zz = 5.2444 + (((tickAnim - 3) / 4) * (3.08723-(5.2444)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 13.71136 + (((tickAnim - 7) / 6) * (23.773-(13.71136)));
            yy = -1.77014 + (((tickAnim - 7) / 6) * (2.69052-(-1.77014)));
            zz = 3.08723 + (((tickAnim - 7) / 6) * (-0.25114-(3.08723)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 23.773 + (((tickAnim - 13) / 7) * (81.08465-(23.773)));
            yy = 2.69052 + (((tickAnim - 13) / 7) * (7.15118-(2.69052)));
            zz = -0.25114 + (((tickAnim - 13) / 7) * (-3.58951-(-0.25114)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 81.08465 + (((tickAnim - 20) / 7) * (94.67123-(81.08465)));
            yy = 7.15118 + (((tickAnim - 20) / 7) * (-5.9753-(7.15118)));
            zz = -3.58951 + (((tickAnim - 20) / 7) * (4.3683-(-3.58951)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 94.67123 + (((tickAnim - 27) / 6) * (75.14687-(94.67123)));
            yy = -5.9753 + (((tickAnim - 27) / 6) * (-5.2404-(-5.9753)));
            zz = 4.3683 + (((tickAnim - 27) / 6) * (4.855-(4.3683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.29 + (((tickAnim - 0) / 3) * (-0.2-(0.29)));
            zz = -0.32 + (((tickAnim - 0) / 3) * (0-(-0.32)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 4) * (0.28-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.28 + (((tickAnim - 7) / 6) * (0.965-(0.28)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.965 + (((tickAnim - 13) / 3) * (1.165-(0.965)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.165 + (((tickAnim - 16) / 4) * (0-(1.165)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (1.165-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (-0.225-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 1.165 + (((tickAnim - 27) / 6) * (0.29-(1.165)));
            zz = -0.225 + (((tickAnim - 27) / 6) * (-0.32-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 27.51064 + (((tickAnim - 0) / 8) * (-5.97012-(27.51064)));
            yy = 3.14593 + (((tickAnim - 0) / 8) * (-13.20036-(3.14593)));
            zz = -7.10092 + (((tickAnim - 0) / 8) * (13.3149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-15-(-7.10092)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -5.97012 + (((tickAnim - 8) / 9) * (-32.80186-(-5.97012)));
            yy = -13.20036 + (((tickAnim - 8) / 9) * (1.8118-(-13.20036)));
            zz = 13.3149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-15 + (((tickAnim - 8) / 9) * (11.1173-(13.3149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-15)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = -32.80186 + (((tickAnim - 17) / 16) * (27.51064-(-32.80186)));
            yy = 1.8118 + (((tickAnim - 17) / 16) * (3.14593-(1.8118)));
            zz = 11.1173 + (((tickAnim - 17) / 16) * (-7.10092-(11.1173)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0.175-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            zz = 0.175 + (((tickAnim - 17) / 9) * (0-(0.175)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 9 + (((tickAnim - 0) / 8) * (5.84453-(9)));
            yy = 0 + (((tickAnim - 0) / 8) * (-7.86965-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-13.09073-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 5.84453 + (((tickAnim - 8) / 5) * (-23.83637-(5.84453)));
            yy = -7.86965 + (((tickAnim - 8) / 5) * (-4.37203-(-7.86965)));
            zz = -13.09073 + (((tickAnim - 8) / 5) * (-7.27263-(-13.09073)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -23.83637 + (((tickAnim - 13) / 4) * (3.75-(-23.83637)));
            yy = -4.37203 + (((tickAnim - 13) / 4) * (0-(-4.37203)));
            zz = -7.27263 + (((tickAnim - 13) / 4) * (0-(-7.27263)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 3.75 + (((tickAnim - 17) / 16) * (9-(3.75)));
            yy = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.06-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.3 + (((tickAnim - 8) / 5) * (-0.17-(-0.3)));
            yy = 1.06 + (((tickAnim - 8) / 5) * (-0.355-(1.06)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.17 + (((tickAnim - 13) / 4) * (0-(-0.17)));
            yy = -0.355 + (((tickAnim - 13) / 4) * (-0.5-(-0.355)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            yy = -0.5 + (((tickAnim - 17) / 16) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 17) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 81.08465 + (((tickAnim - 0) / 3) * (102.15747-(81.08465)));
            yy = 7.15118 + (((tickAnim - 0) / 3) * (6.64724-(7.15118)));
            zz = -3.58951 + (((tickAnim - 0) / 3) * (-3.92327-(-3.58951)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 102.15747 + (((tickAnim - 3) / 5) * (94.67123-(102.15747)));
            yy = 6.64724 + (((tickAnim - 3) / 5) * (5.97533-(6.64724)));
            zz = -3.92327 + (((tickAnim - 3) / 5) * (-4.36828-(-3.92327)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 94.67123 + (((tickAnim - 8) / 5) * (87.06174-(94.67123)));
            yy = 5.97533 + (((tickAnim - 8) / 5) * (5.38741-(5.97533)));
            zz = -4.36828 + (((tickAnim - 8) / 5) * (-4.75767-(-4.36828)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 87.06174 + (((tickAnim - 13) / 4) * (28.73738-(87.06174)));
            yy = 5.38741 + (((tickAnim - 13) / 4) * (4.6525-(5.38741)));
            zz = -4.75767 + (((tickAnim - 13) / 4) * (-5.2444-(-4.75767)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 28.73738 + (((tickAnim - 17) / 6) * (4.41486-(28.73738)));
            yy = 4.6525 + (((tickAnim - 17) / 6) * (5.29261-(4.6525)));
            zz = -5.2444 + (((tickAnim - 17) / 6) * (-2.06164-(-5.2444)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 4.41486 + (((tickAnim - 23) / 4) * (16.0181-(4.41486)));
            yy = 5.29261 + (((tickAnim - 23) / 4) * (6.11864-(5.29261)));
            zz = -2.06164 + (((tickAnim - 23) / 4) * (-2.74069-(-2.06164)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 16.0181 + (((tickAnim - 27) / 6) * (81.08465-(16.0181)));
            yy = 6.11864 + (((tickAnim - 27) / 6) * (7.15118-(6.11864)));
            zz = -2.74069 + (((tickAnim - 27) / 6) * (-3.58951-(-2.74069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.915-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.915 + (((tickAnim - 8) / 5) * (0.41-(0.915)));
            zz = -0.225 + (((tickAnim - 8) / 5) * (-0.395-(-0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 13) / 4) * (-0.2-(0.41)));
            zz = -0.395 + (((tickAnim - 13) / 4) * (0-(-0.395)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 17) / 6) * (0.265-(-0.2)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.265 + (((tickAnim - 23) / 4) * (0.66-(0.265)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0.66 + (((tickAnim - 27) / 6) * (0-(0.66)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 29.75 + (((tickAnim - 0) / 13) * (-22.5-(29.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -22.5 + (((tickAnim - 13) / 20) * (29.75-(-22.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 27.75 + (((tickAnim - 0) / 4) * (20.03-(27.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 20.03 + (((tickAnim - 4) / 5) * (-7.86-(20.03)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -7.86 + (((tickAnim - 9) / 4) * (-1.5-(-7.86)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -1.5 + (((tickAnim - 13) / 20) * (27.75-(-1.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.295-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.58-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 1.295 + (((tickAnim - 4) / 5) * (1.49-(1.295)));
            zz = -0.58 + (((tickAnim - 4) / 5) * (-0.035-(-0.58)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.49 + (((tickAnim - 9) / 4) * (-0.6-(1.49)));
            zz = -0.035 + (((tickAnim - 9) / 4) * (0.05-(-0.035)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            yy = -0.6 + (((tickAnim - 13) / 20) * (0-(-0.6)));
            zz = 0.05 + (((tickAnim - 13) / 20) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 32.25 + (((tickAnim - 0) / 4) * (78.63-(32.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 78.63 + (((tickAnim - 4) / 5) * (49.2-(78.63)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 49.2 + (((tickAnim - 9) / 3) * (6.93-(49.2)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 6.93 + (((tickAnim - 12) / 1) * (21.25-(6.93)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 21.25 + (((tickAnim - 13) / 7) * (-5.77-(21.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -5.77 + (((tickAnim - 20) / 6) * (6.01-(-5.77)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 6.01 + (((tickAnim - 26) / 7) * (32.25-(6.01)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.38-(0)));
            zz = 0.175 + (((tickAnim - 0) / 4) * (-1.34-(0.175)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 2.38 + (((tickAnim - 4) / 5) * (1.555-(2.38)));
            zz = -1.34 + (((tickAnim - 4) / 5) * (-0.56-(-1.34)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.555 + (((tickAnim - 9) / 3) * (0-(1.555)));
            zz = -0.56 + (((tickAnim - 9) / 3) * (0-(-0.56)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 13) / 7) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0.94-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0.21-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 0.94 + (((tickAnim - 26) / 7) * (0-(0.94)));
            zz = 0.21 + (((tickAnim - 26) / 7) * (0.175-(0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+50))*1), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-20))*2), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-70))*2));

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05 + (((tickAnim - 0) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2 + (((tickAnim - 0) / 8) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2 + (((tickAnim - 0) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05 + (((tickAnim - 8) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05)));
            yy = 0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2 + (((tickAnim - 8) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2-(0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2 + (((tickAnim - 8) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05 + (((tickAnim - 15) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2 + (((tickAnim - 15) / 9) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2 + (((tickAnim - 15) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05 + (((tickAnim - 24) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222))*0.05)));
            yy = 0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2 + (((tickAnim - 24) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2-(0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5-45))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2 + (((tickAnim - 24) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*222/0.5+10))*0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-50))*-0.8), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+40))*-5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-70))*2));
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(0);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(0);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(-0.15);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-50))*0.8), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-150))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-70))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-1.8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-120))*0.2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-200))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-100))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-120))*-0.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-250))*-5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-140))*4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(11.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-120))*0.5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-300))*-5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-180))*8));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-290))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-120))*1), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-70))*-4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-90))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-150))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-20))*0.5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-290))*1), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+50))*-1), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraNicrosaurus e = (EntityPrehistoricFloraNicrosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw, (float) Math.toRadians(17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(9);
        
    }
}
