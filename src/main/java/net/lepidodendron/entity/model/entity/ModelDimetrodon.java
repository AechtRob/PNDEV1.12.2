package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDimetrodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDimetrodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer Neckend_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer teeth;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw5;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer teeth2;
    private final AdvancedModelRenderer teeth3;
    private final AdvancedModelRenderer head1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer head5;
    private final AdvancedModelRenderer teeth4;
    private final AdvancedModelRenderer teeth5;
    private final AdvancedModelRenderer teeth6;
    private final AdvancedModelRenderer teeth7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer teeth8;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer teeth9;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer sailFront;
    private final AdvancedModelRenderer sailFront2;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer sailMiddlefront;
    private final AdvancedModelRenderer sailMiddle;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer sailEnd;

    private ModelAnimator animator;

    public ModelDimetrodon() {
        this.textureWidth = 93;
        this.textureHeight = 93;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 12.2F, 10.0F);
        this.setRotateAngle(hips, -0.4245F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.1F, -6.8F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0262F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 37, -3.0F, -0.193F, 0.2026F, 6, 9, 11, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.2F, -5.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.3821F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 30, 0, -4.0F, -0.6F, -13.0F, 8, 11, 12, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.1F, -12.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1061F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.5F, -4.0F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 42, -3.5F, -5.5F, -4.0F, 7, 11, 8, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -6.5F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1061F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 48, 57, -2.5F, -0.3F, -4.0F, 5, 10, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.0F, -4.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0637F, 0.0F, 0.0F);


        this.Neckend_r1 = new AdvancedModelRenderer(this);
        this.Neckend_r1.setRotationPoint(0.0F, 1.9F, -2.0F);
        this.neck2.addChild(Neckend_r1);
        this.setRotateAngle(Neckend_r1, -0.1745F, 0.0F, 0.0F);
        this.Neckend_r1.cubeList.add(new ModelBox(Neckend_r1, 62, 34, -2.0F, -3.7F, 0.3F, 4, 8, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, -1.1F, -3.45F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.0223F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 22, 0, -2.49F, -0.8163F, -2.5403F, 5, 4, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.1837F, 1.1597F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 11, 61, -2.49F, 0.0F, -3.0F, 5, 3, 4, -0.01F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.65F, -3.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1911F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 72, 41, -1.49F, 0.0F, -3.75F, 3, 2, 4, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.7288F, -0.3164F);
        this.jaw2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3403F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 67, -0.99F, -1.0F, -2.0F, 2, 2, 6, 0.1F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.2335F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 23, 46, -1.49F, -2.0F, -1.75F, 3, 2, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.01F, -1.95F, -1.8F);
        this.jaw3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7767F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 83, -1.0F, 0.425F, -1.325F, 2, 1, 1, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.01F, -1.95F, -1.8F);
        this.jaw3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 50, -1.0F, -0.05F, -0.9F, 2, 1, 1, -0.02F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 50, -1.0F, -0.05F, -1.05F, 2, 1, 1, -0.01F, false));

        this.teeth = new AdvancedModelRenderer(this);
        this.teeth.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.jaw3.addChild(teeth);
        this.setRotateAngle(teeth, 0.7006F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.9F, 1.2F);
        this.teeth.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 9, -0.5F, -1.7F, -0.7F, 1, 2, 1, 0.0F, false));

        this.jaw5 = new AdvancedModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.jaw.addChild(jaw5);
        this.setRotateAngle(jaw5, -0.3183F, 0.0F, 0.0F);
        this.jaw5.cubeList.add(new ModelBox(jaw5, 73, 47, -1.49F, -4.0F, 0.0F, 3, 4, 3, 0.0F, false));

        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(-0.01F, -0.1F, -3.0F);
        this.jaw.addChild(jaw4);
        this.setRotateAngle(jaw4, 0.3768F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 72, 72, -1.48F, 0.0F, -3.75F, 3, 1, 4, 0.01F, false));

        this.teeth2 = new AdvancedModelRenderer(this);
        this.teeth2.setRotationPoint(1.5F, 0.6F, 0.0F);
        this.jaw4.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.0637F, 0.1698F, 0.0F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 0, 7, 0.0F, -0.8F, -5.0F, 0, 2, 5, 0.0F, false));

        this.teeth3 = new AdvancedModelRenderer(this);
        this.teeth3.setRotationPoint(-1.46F, 0.6F, 0.0F);
        this.jaw4.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.0637F, -0.1698F, 0.0F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 0, 7, 0.0F, -0.8F, -5.0F, 0, 2, 5, 0.0F, true));

        this.head1 = new AdvancedModelRenderer(this);
        this.head1.setRotationPoint(0.01F, -0.6663F, -3.3403F);
        this.head.addChild(head1);
        this.setRotateAngle(head1, 0.3183F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.6163F, -0.3361F);
        this.head1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 75, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 1.3337F, -2.8403F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.4245F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 73, 30, -1.99F, 0.1F, -2.4F, 4, 2, 3, 0.0F, false));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.5943F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.4F, -0.6F);
        this.head3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.192F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 76, 5, -1.49F, -1.9598F, -1.9362F, 3, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.9F, 1.3F);
        this.head3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2269F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 0, -1.49F, -2.9F, -1.9F, 3, 3, 2, 0.025F, false));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -4.4F, -1.25F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 0.9976F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.1F, -3.7F);
        this.head4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7156F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.99F, -0.0248F, -1.5851F, 2, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 2, -0.99F, -0.0248F, -0.9851F, 2, 1, 1, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.3F, -2.7F);
        this.head4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2269F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 4, -0.99F, -0.0549F, -1.0044F, 2, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.2F, -2.6F);
        this.head4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2531F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 9, -0.99F, -0.0665F, -0.1664F, 2, 2, 4, -0.01F, false));

        this.head5 = new AdvancedModelRenderer(this);
        this.head5.setRotationPoint(-0.01F, -2.0F, -2.8F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.9128F, 0.0F, 0.0F);


        this.teeth4 = new AdvancedModelRenderer(this);
        this.teeth4.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.head5.addChild(teeth4);
        this.setRotateAngle(teeth4, -0.1227F, 0.0F, 0.0F);


        this.teeth5 = new AdvancedModelRenderer(this);
        this.teeth5.setRotationPoint(1.3F, -0.5F, -2.0F);
        this.head3.addChild(teeth5);
        this.setRotateAngle(teeth5, 0.2759F, 0.0637F, 0.0F);


        this.teeth6 = new AdvancedModelRenderer(this);
        this.teeth6.setRotationPoint(-1.28F, -0.5F, -2.0F);
        this.head3.addChild(teeth6);
        this.setRotateAngle(teeth6, 0.2759F, -0.0637F, 0.0F);


        this.teeth7 = new AdvancedModelRenderer(this);
        this.teeth7.setRotationPoint(1.8F, 1.7F, 1.17F);
        this.head2.addChild(teeth7);
        this.setRotateAngle(teeth7, -0.1061F, 0.0213F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.2499F, 0.338F, -7.0714F);
        this.teeth7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 11, -0.5F, -1.4F, -0.4F, 0, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.2499F, -0.2266F, -5.922F);
        this.teeth7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.48F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2499F, 1.2369F, -4.4028F);
        this.teeth7.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 4, 0.0F, -1.3F, -1.3F, 0, 2, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 5, 3, 0.0F, -0.9F, -0.1F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.2499F, 0.5006F, -2.0053F);
        this.teeth7.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 4, 0.0F, -0.3F, -1.0F, 0, 1, 2, 0.0F, false));

        this.teeth8 = new AdvancedModelRenderer(this);
        this.teeth8.setRotationPoint(-1.78F, 1.7F, 1.17F);
        this.head2.addChild(teeth8);
        this.setRotateAngle(teeth8, -0.1061F, -0.0213F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.2499F, 0.338F, -7.0714F);
        this.teeth8.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 11, 0.5F, -1.4F, -0.4F, 0, 2, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.2499F, -0.2266F, -5.922F);
        this.teeth8.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.48F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 5, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.2499F, 1.2369F, -4.4028F);
        this.teeth8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 4, 0.0F, -1.3F, -1.3F, 0, 2, 1, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 3, 0.0F, -0.9F, -0.1F, 0, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.2499F, 0.5006F, -2.0053F);
        this.teeth8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 4, 0.0F, -0.3F, -1.0F, 0, 1, 2, 0.0F, true));

        this.teeth9 = new AdvancedModelRenderer(this);
        this.teeth9.setRotationPoint(-1.78F, 1.7F, 1.17F);
        this.head2.addChild(teeth9);
        this.setRotateAngle(teeth9, -0.1061F, -0.0213F, 0.0F);


        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-0.515F, 2.9F, -7.65F);
        this.head.addChild(nose);
        this.setRotateAngle(nose, 0.0175F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 88, 1, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 88, 1, 1.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.01F, 0.675F, -1.55F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 84, 66, 1.515F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 84, 66, -2.515F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.sailFront = new AdvancedModelRenderer(this);
        this.sailFront.setRotationPoint(0.0F, -2.3F, -1.3F);
        this.neck2.addChild(sailFront);
        this.setRotateAngle(sailFront, 0.3609F, 0.0F, 0.0F);
        this.sailFront.cubeList.add(new ModelBox(sailFront, 76, 23, -0.5F, 0.0F, -2.0F, 1, 3, 4, 0.0F, false));

        this.sailFront2 = new AdvancedModelRenderer(this);
        this.sailFront2.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.neck.addChild(sailFront2);
        this.setRotateAngle(sailFront2, 0.0848F, 0.0F, 0.0F);
        this.sailFront2.cubeList.add(new ModelBox(sailFront2, 18, 62, 0.0F, -5.0F, -2.5F, 0, 5, 6, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.0F, 7.4F, -6.0F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5943F, -0.1061F, 0.2122F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 48, 71, -2.0F, -1.5F, -1.5F, 3, 6, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.5F, 3.9F, 0.9F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7217F, -0.0637F, -0.2122F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 23, 75, -1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0637F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 70, 67, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.0F, 7.4F, -6.0F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.5943F, 0.1061F, -0.2122F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 70, 9, -1.0F, -1.5F, -1.5F, 3, 6, 3, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.5F, 3.9F, 0.9F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7217F, 0.0637F, 0.2122F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 75, -1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0637F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 70, 18, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, true));

        this.sailMiddlefront = new AdvancedModelRenderer(this);
        this.sailMiddlefront.setRotationPoint(-0.01F, -1.0F, -7.6F);
        this.chest.addChild(sailMiddlefront);
        this.setRotateAngle(sailMiddlefront, -0.0637F, 0.0F, 0.0F);
        this.sailMiddlefront.cubeList.add(new ModelBox(sailMiddlefront, 30, 48, 0.0F, -21.0F, 1.0F, 0, 21, 9, 0.0F, false));

        this.sailMiddle = new AdvancedModelRenderer(this);
        this.sailMiddle.setRotationPoint(0.0F, -1.0F, -12.0F);
        this.body.addChild(sailMiddle);
        this.sailMiddle.cubeList.add(new ModelBox(sailMiddle, 30, 13, 0.0F, -23.0F, 0.0F, 0, 25, 10, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.9151F, 1.1441F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.1958F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 0, -2.0F, -0.2504F, 0.1317F, 4, 5, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.8496F, 7.0317F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1335F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 58, 0, -1.5F, -1.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 5.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0552F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 61, -1.0F, -0.5F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1F, 6.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0689F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 50, 23, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.5F, 2.8F, 0.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4245F, -0.1485F, -0.2546F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 66, 57, -1.0F, -0.5F, -1.5F, 3, 6, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.7F, 4.9F, -0.7F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9552F, -0.1274F, 0.0848F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 13, 73, -1.0F, 0.0F, -0.5F, 2, 6, 3, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 5.7F, 1.5F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.0637F, 0.0F, 0.0213F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 70, 0, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.5F, 2.8F, 0.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4245F, 0.1485F, 0.2546F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 62, 23, -2.0F, -0.5F, -1.5F, 3, 6, 4, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.7F, 4.9F, -0.7F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9552F, 0.1274F, -0.0848F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 50, 23, -1.0F, 0.0F, -0.5F, 2, 6, 3, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 5.7F, 1.5F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.0637F, 0.0F, -0.0213F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 0, 70, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.sailEnd = new AdvancedModelRenderer(this);
        this.sailEnd.setRotationPoint(0.51F, -3.5F, -6.5F);
        this.hips.addChild(sailEnd);
        this.setRotateAngle(sailEnd, 0.3821F, 0.0F, 0.0F);
        this.sailEnd.cubeList.add(new ModelBox(sailEnd, 0, 0, -0.4181F, -19.5826F, -3.1112F, 0, 27, 15, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.2F;
        this.hips.offsetX = 0.35F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(120);
        this.hips.rotateAngleX = (float)Math.toRadians(1);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.6F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.hips.offsetY = -0.105F;
        this.hips.render(0.01F);
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

        EntityPrehistoricFloraDimetrodon EntityMegalosaurus = (EntityPrehistoricFloraDimetrodon) e;

        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.head};

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

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon entity = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.75 + (((tickAnim - 8) / 7) * (0-(6.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 8) / 7) * (0-(6.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.5 + (((tickAnim - 8) / 7) * (0-(4.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 8) / 7) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24.75 + (((tickAnim - 8) / 4) * (10-(24.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 12) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 8) / 7) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 34.75 + (((tickAnim - 5) / 3) * (0-(34.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 12) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -10.5 + (((tickAnim - 8) / 7) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(xx), sailFront.rotateAngleY + (float) Math.toRadians(yy), sailFront.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.625-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0.625 + (((tickAnim - 8) / 7) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailFront.rotationPointX = this.sailFront.rotationPointX + (float)(xx);
        this.sailFront.rotationPointY = this.sailFront.rotationPointY - (float)(yy);
        this.sailFront.rotationPointZ = this.sailFront.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -6.75 + (((tickAnim - 8) / 7) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -10.5 + (((tickAnim - 8) / 7) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7 + (((tickAnim - 8) / 7) * (0-(7)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -6.75 + (((tickAnim - 8) / 7) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -10.5 + (((tickAnim - 8) / 7) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7 + (((tickAnim - 8) / 7) * (0-(7)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -6.25 + (((tickAnim - 8) / 7) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailMiddlefront, sailMiddlefront.rotateAngleX + (float) Math.toRadians(xx), sailMiddlefront.rotateAngleY + (float) Math.toRadians(yy), sailMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.725 + (((tickAnim - 8) / 7) * (0-(0.725)));
            zz = 0.175 + (((tickAnim - 8) / 7) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailMiddlefront.rotationPointX = this.sailMiddlefront.rotationPointX + (float)(xx);
        this.sailMiddlefront.rotationPointY = this.sailMiddlefront.rotationPointY - (float)(yy);
        this.sailMiddlefront.rotationPointZ = this.sailMiddlefront.rotationPointZ + (float)(zz);



        this.sailEnd.rotationPointX = this.sailEnd.rotationPointX + (float)(0);
        this.sailEnd.rotationPointY = this.sailEnd.rotationPointY - (float)(0);
        this.sailEnd.rotationPointZ = this.sailEnd.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 3) / 1) * (1-(1)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 1 + (((tickAnim - 3) / 1) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 4) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 4) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 4) / 3) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 7) / 1) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 1) * (1-(1)));
            zz = 1 + (((tickAnim - 7) / 1) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 8) / 3) * (1-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 11) / 2) * (1-(1)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 1 + (((tickAnim - 11) / 2) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 13) / 2) * (1-(1)));
            yy = 0 + (((tickAnim - 13) / 2) * (1-(0)));
            zz = 1 + (((tickAnim - 13) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon entity = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.75 + (((tickAnim - 3) / 4) * (-4.95614-(9.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.43233-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (2.86538-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -4.95614 + (((tickAnim - 7) / 6) * (0-(-4.95614)));
            yy = 0.43233 + (((tickAnim - 7) / 6) * (0-(0.43233)));
            zz = 2.86538 + (((tickAnim - 7) / 6) * (0-(2.86538)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -6.25 + (((tickAnim - 3) / 4) * (-2.00308-(-6.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (-0.10072-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (3.49855-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -2.00308 + (((tickAnim - 7) / 3) * (-3.25308-(-2.00308)));
            yy = -0.10072 + (((tickAnim - 7) / 3) * (-0.10072-(-0.10072)));
            zz = 3.49855 + (((tickAnim - 7) / 3) * (3.49855-(3.49855)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -3.25308 + (((tickAnim - 10) / 3) * (0-(-3.25308)));
            yy = -0.10072 + (((tickAnim - 10) / 3) * (0-(-0.10072)));
            zz = 3.49855 + (((tickAnim - 10) / 3) * (0-(3.49855)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.15 + (((tickAnim - 3) / 4) * (-0.3-(-0.15)));
            zz = 0.125 + (((tickAnim - 3) / 4) * (-0.115-(0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 7) / 3) * (-0.4-(-0.3)));
            zz = -0.115 + (((tickAnim - 7) / 3) * (0.075-(-0.115)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 3) * (0-(-0.4)));
            zz = 0.075 + (((tickAnim - 10) / 3) * (0-(0.075)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -6 + (((tickAnim - 3) / 4) * (-15.00988-(-6)));
            yy = 0 + (((tickAnim - 3) / 4) * (-2.97579-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.3805-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15.00988 + (((tickAnim - 7) / 3) * (10.5-(-15.00988)));
            yy = -2.97579 + (((tickAnim - 7) / 3) * (0-(-2.97579)));
            zz = 0.3805 + (((tickAnim - 7) / 3) * (0-(0.3805)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10.5 + (((tickAnim - 10) / 3) * (0-(10.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 3) * (0.075-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0.075 + (((tickAnim - 3) / 4) * (0.23-(0.075)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0.23 + (((tickAnim - 7) / 3) * (0-(0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 20.25 + (((tickAnim - 3) / 4) * (49-(20.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 49 + (((tickAnim - 7) / 3) * (0-(49)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (1.0125-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (1-(1)));
            yy = 1.0125 + (((tickAnim - 3) / 3) * (0-(1.0125)));
            zz = 1 + (((tickAnim - 3) / 3) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 6) / 2) * (1-(1)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 1 + (((tickAnim - 6) / 2) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 0 + (((tickAnim - 8) / 2) * (1-(0)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon entity = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 2 + (((tickAnim - 10) / 13) * (3.75-(2)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 3.75 + (((tickAnim - 23) / 12) * (2-(3.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 2 + (((tickAnim - 35) / 15) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.01355-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.55264-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.24225-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0.01355 + (((tickAnim - 10) / 13) * (0.33619-(0.01355)));
            yy = -6.55264 + (((tickAnim - 10) / 13) * (-9.50817-(-6.55264)));
            zz = 0.24225 + (((tickAnim - 10) / 13) * (-0.27754-(0.24225)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0.33619 + (((tickAnim - 23) / 12) * (0.01355-(0.33619)));
            yy = -9.50817 + (((tickAnim - 23) / 12) * (-6.55264-(-9.50817)));
            zz = -0.27754 + (((tickAnim - 23) / 12) * (0.24225-(-0.27754)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.01355 + (((tickAnim - 35) / 15) * (0-(0.01355)));
            yy = -6.55264 + (((tickAnim - 35) / 15) * (0-(-6.55264)));
            zz = 0.24225 + (((tickAnim - 35) / 15) * (0-(0.24225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.58607-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.44464-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (5.0035-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -0.58607 + (((tickAnim - 10) / 13) * (-4.58607-(-0.58607)));
            yy = -6.44464 + (((tickAnim - 10) / 13) * (-6.44464-(-6.44464)));
            zz = 5.0035 + (((tickAnim - 10) / 13) * (5.0035-(5.0035)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -4.58607 + (((tickAnim - 23) / 12) * (-0.58607-(-4.58607)));
            yy = -6.44464 + (((tickAnim - 23) / 12) * (-6.44464-(-6.44464)));
            zz = 5.0035 + (((tickAnim - 23) / 12) * (5.0035-(5.0035)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.58607 + (((tickAnim - 35) / 15) * (0-(-0.58607)));
            yy = -6.44464 + (((tickAnim - 35) / 15) * (0-(-6.44464)));
            zz = 5.0035 + (((tickAnim - 35) / 15) * (0-(5.0035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.33375-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-8.96974-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.78878-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -3.33375 + (((tickAnim - 10) / 13) * (-6.33375-(-3.33375)));
            yy = -8.96974 + (((tickAnim - 10) / 13) * (-8.96974-(-8.96974)));
            zz = 3.78878 + (((tickAnim - 10) / 13) * (3.78878-(3.78878)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -6.33375 + (((tickAnim - 23) / 12) * (-3.33375-(-6.33375)));
            yy = -8.96974 + (((tickAnim - 23) / 12) * (-8.96974-(-8.96974)));
            zz = 3.78878 + (((tickAnim - 23) / 12) * (3.78878-(3.78878)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.33375 + (((tickAnim - 35) / 15) * (0-(-3.33375)));
            yy = -8.96974 + (((tickAnim - 35) / 15) * (0-(-8.96974)));
            zz = 3.78878 + (((tickAnim - 35) / 15) * (0-(3.78878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.87437-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.35758-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.82766-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -0.87437 + (((tickAnim - 10) / 13) * (6.37563-(-0.87437)));
            yy = -10.35758 + (((tickAnim - 10) / 13) * (-10.35758-(-10.35758)));
            zz = 4.82766 + (((tickAnim - 10) / 13) * (4.82766-(4.82766)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 6.37563 + (((tickAnim - 23) / 12) * (-0.87437-(6.37563)));
            yy = -10.35758 + (((tickAnim - 23) / 12) * (-10.35758-(-10.35758)));
            zz = 4.82766 + (((tickAnim - 23) / 12) * (4.82766-(4.82766)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.87437 + (((tickAnim - 35) / 15) * (0-(-0.87437)));
            yy = -10.35758 + (((tickAnim - 35) / 15) * (0-(-10.35758)));
            zz = 4.82766 + (((tickAnim - 35) / 15) * (0-(4.82766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-48.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -48.25 + (((tickAnim - 10) / 13) * (19.75-(-48.25)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 19.75 + (((tickAnim - 23) / 12) * (-48.25-(19.75)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -48.25 + (((tickAnim - 35) / 15) * (0-(-48.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -30.25 + (((tickAnim - 5) / 5) * (14.5-(-30.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 14.5 + (((tickAnim - 10) / 13) * (16.5-(14.5)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 16.5 + (((tickAnim - 23) / 5) * (-51.43-(16.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -51.43 + (((tickAnim - 28) / 7) * (14.5-(-51.43)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 35) / 15) * (0-(14.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (83.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 83.13 + (((tickAnim - 5) / 5) * (32.25-(83.13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 32.25 + (((tickAnim - 10) / 7) * (-2.12771-(32.25)));
            yy = 0 + (((tickAnim - 10) / 7) * (-0.10373-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (-0.11236-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -2.12771 + (((tickAnim - 17) / 3) * (16.90955-(-2.12771)));
            yy = -0.10373 + (((tickAnim - 17) / 3) * (-0.04446-(-0.10373)));
            zz = -0.11236 + (((tickAnim - 17) / 3) * (-0.04816-(-0.11236)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 16.90955 + (((tickAnim - 20) / 5) * (105.5-(16.90955)));
            yy = -0.04446 + (((tickAnim - 20) / 5) * (0-(-0.04446)));
            zz = -0.04816 + (((tickAnim - 20) / 5) * (0-(-0.04816)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 105.5 + (((tickAnim - 25) / 3) * (102.17-(105.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 102.17 + (((tickAnim - 28) / 7) * (32.25-(102.17)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 32.25 + (((tickAnim - 35) / 15) * (0-(32.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.74-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.025-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.74 + (((tickAnim - 5) / 5) * (0.275-(0.74)));
            zz = -1.025 + (((tickAnim - 5) / 5) * (0-(-1.025)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 7) * (0.45-(0.275)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 17) / 3) * (0.925-(0.45)));
            zz = 0 + (((tickAnim - 17) / 3) * (0.13-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.925 + (((tickAnim - 20) / 5) * (1.655-(0.925)));
            zz = 0.13 + (((tickAnim - 20) / 5) * (-1-(0.13)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 1.655 + (((tickAnim - 25) / 10) * (0.275-(1.655)));
            zz = -1 + (((tickAnim - 25) / 10) * (0-(-1)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.275 + (((tickAnim - 35) / 15) * (0-(0.275)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-0.25401-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (-1.74563-(0)));
            zz = -1 + (((tickAnim - 10) / 13) * (-0.75063-(-1)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -0.25401 + (((tickAnim - 23) / 12) * (0-(-0.25401)));
            yy = -1.74563 + (((tickAnim - 23) / 12) * (0-(-1.74563)));
            zz = -0.75063 + (((tickAnim - 23) / 12) * (-1-(-0.75063)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -1 + (((tickAnim - 35) / 15) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(xx), sailMiddle.rotateAngleY + (float) Math.toRadians(yy), sailMiddle.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon entity = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -5.25 + (((tickAnim - 13) / 25) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 38) / 12) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.3-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = -2.3 + (((tickAnim - 13) / 25) * (-2.3-(-2.3)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -2.3 + (((tickAnim - 38) / 12) * (0-(-2.3)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 2.5 + (((tickAnim - 13) / 25) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 38) / 12) * (0-(2.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.675-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0.675 + (((tickAnim - 13) / 25) * (0.675-(0.675)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0.675 + (((tickAnim - 38) / 12) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 4 + (((tickAnim - 13) / 25) * (4-(4)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 38) / 12) * (0-(4)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -4.75 + (((tickAnim - 13) / 25) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 38) / 12) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 11 + (((tickAnim - 13) / 25) * (11-(11)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 11 + (((tickAnim - 38) / 12) * (0-(11)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 7.25 + (((tickAnim - 13) / 25) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 38) / 12) * (0-(7.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -29.75 + (((tickAnim - 13) / 25) * (-29.75-(-29.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -29.75 + (((tickAnim - 38) / 12) * (0-(-29.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 24.25 + (((tickAnim - 13) / 25) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 24.25 + (((tickAnim - 38) / 12) * (0-(24.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 7.25 + (((tickAnim - 13) / 25) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 38) / 12) * (0-(7.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -29.75 + (((tickAnim - 13) / 25) * (-29.75-(-29.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -29.75 + (((tickAnim - 38) / 12) * (0-(-29.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 24.25 + (((tickAnim - 13) / 25) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 24.25 + (((tickAnim - 38) / 12) * (0-(24.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -4 + (((tickAnim - 13) / 25) * (-4-(-4)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 38) / 12) * (0-(-4)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-4.3-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -4.3 + (((tickAnim - 6) / 7) * (4.5-(-4.3)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 4.5 + (((tickAnim - 13) / 25) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 4.5 + (((tickAnim - 38) / 5) * (-11.1-(4.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -11.1 + (((tickAnim - 43) / 7) * (0-(-11.1)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 14 + (((tickAnim - 13) / 25) * (14-(14)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 14 + (((tickAnim - 38) / 5) * (18.97-(14)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 18.97 + (((tickAnim - 43) / 4) * (-1.77-(18.97)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -1.77 + (((tickAnim - 47) / 3) * (0-(-1.77)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -11.75 + (((tickAnim - 13) / 25) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 38) / 12) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 25.75 + (((tickAnim - 13) / 25) * (25.75-(25.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 38) / 12) * (0-(25.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -11.75 + (((tickAnim - 13) / 25) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 38) / 12) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -11.75 + (((tickAnim - 13) / 25) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 38) / 12) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 25.75 + (((tickAnim - 13) / 25) * (25.75-(25.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 38) / 12) * (0-(25.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -11.75 + (((tickAnim - 13) / 25) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 38) / 12) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon entity = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;
        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.16357-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.74054-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.22161-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0.16357 + (((tickAnim - 5) / 10) * (-0.27082-(0.16357)));
            yy = 1.74054 + (((tickAnim - 5) / 10) * (10.54353-(1.74054)));
            zz = 2.22161 + (((tickAnim - 5) / 10) * (-0.74416-(2.22161)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -0.27082 + (((tickAnim - 15) / 10) * (0.3-(-0.27082)));
            yy = 10.54353 + (((tickAnim - 15) / 10) * (18-(10.54353)));
            zz = -0.74416 + (((tickAnim - 15) / 10) * (0-(-0.74416)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0.3 + (((tickAnim - 25) / 8) * (1.25-(0.3)));
            yy = 18 + (((tickAnim - 25) / 8) * (18-(18)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 1.25 + (((tickAnim - 33) / 12) * (0-(1.25)));
            yy = 18 + (((tickAnim - 33) / 12) * (-10.25-(18)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = -10.25 + (((tickAnim - 45) / 9) * (-10.25-(-10.25)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            yy = -10.25 + (((tickAnim - 54) / 11) * (0-(-10.25)));
            zz = 0 + (((tickAnim - 54) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.06-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.46-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -0.06 + (((tickAnim - 4) / 5) * (-0.14-(-0.06)));
            yy = 0.175 + (((tickAnim - 4) / 5) * (-0.045-(0.175)));
            zz = 0.46 + (((tickAnim - 4) / 5) * (1.17-(0.46)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.14 + (((tickAnim - 9) / 4) * (-0.06-(-0.14)));
            yy = -0.045 + (((tickAnim - 9) / 4) * (0.175-(-0.045)));
            zz = 1.17 + (((tickAnim - 9) / 4) * (1.86-(1.17)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -0.06 + (((tickAnim - 13) / 6) * (-0.14-(-0.06)));
            yy = 0.175 + (((tickAnim - 13) / 6) * (-0.045-(0.175)));
            zz = 1.86 + (((tickAnim - 13) / 6) * (2.895-(1.86)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -0.14 + (((tickAnim - 19) / 6) * (-0.375-(-0.14)));
            yy = -0.045 + (((tickAnim - 19) / 6) * (0-(-0.045)));
            zz = 2.895 + (((tickAnim - 19) / 6) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*3-(2.895)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -0.375 + (((tickAnim - 25) / 8) * (-0.375-(-0.375)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*3 + (((tickAnim - 25) / 8) * (6.275-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*3)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -0.375 + (((tickAnim - 33) / 12) * (0-(-0.375)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 6.275 + (((tickAnim - 33) / 12) * (1.05-(6.275)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 1.05 + (((tickAnim - 45) / 9) * (1.55-(1.05)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            zz = 1.55 + (((tickAnim - 54) / 11) * (0-(1.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.02599-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.95679-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.99415-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.02599 + (((tickAnim - 5) / 8) * (0.14482-(0.02599)));
            yy = -0.95679 + (((tickAnim - 5) / 8) * (-0.07229-(-0.95679)));
            zz = 0.99415 + (((tickAnim - 5) / 8) * (-3.49313-(0.99415)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0.14482 + (((tickAnim - 13) / 12) * (0.61213-(0.14482)));
            yy = -0.07229 + (((tickAnim - 13) / 12) * (-1.98345-(-0.07229)));
            zz = -3.49313 + (((tickAnim - 13) / 12) * (-1.9873-(-3.49313)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0.61213 + (((tickAnim - 25) / 8) * (0.93635-(0.61213)));
            yy = -1.98345 + (((tickAnim - 25) / 8) * (-2.26549-(-1.98345)));
            zz = -1.9873 + (((tickAnim - 25) / 8) * (-1.29188-(-1.9873)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0.93635 + (((tickAnim - 33) / 6) * (0.98631-(0.93635)));
            yy = -2.26549 + (((tickAnim - 33) / 6) * (-0.37915-(-2.26549)));
            zz = -1.29188 + (((tickAnim - 33) / 6) * (3.84295-(-1.29188)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0.98631 + (((tickAnim - 39) / 6) * (0.70725-(0.98631)));
            yy = -0.37915 + (((tickAnim - 39) / 6) * (5.53942-(-0.37915)));
            zz = 3.84295 + (((tickAnim - 39) / 6) * (-1.81444-(3.84295)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0.70725 + (((tickAnim - 45) / 9) * (0.99864-(0.70725)));
            yy = 5.53942 + (((tickAnim - 45) / 9) * (4.08923-(5.53942)));
            zz = -1.81444 + (((tickAnim - 45) / 9) * (1.65615-(-1.81444)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 0.99864 + (((tickAnim - 54) / 11) * (0-(0.99864)));
            yy = 4.08923 + (((tickAnim - 54) / 11) * (0-(4.08923)));
            zz = 1.65615 + (((tickAnim - 54) / 11) * (0-(1.65615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.08835-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.81329-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.74225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0.08835 + (((tickAnim - 5) / 4) * (0.0874-(0.08835)));
            yy = -2.81329 + (((tickAnim - 5) / 4) * (-5.49582-(-2.81329)));
            zz = -1.74225 + (((tickAnim - 5) / 4) * (-0.02711-(-1.74225)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.0874 + (((tickAnim - 9) / 4) * (-0.62011-(0.0874)));
            yy = -5.49582 + (((tickAnim - 9) / 4) * (-8.4774-(-5.49582)));
            zz = -0.02711 + (((tickAnim - 9) / 4) * (4.75497-(-0.02711)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -0.62011 + (((tickAnim - 13) / 12) * (-1.75-(-0.62011)));
            yy = -8.4774 + (((tickAnim - 13) / 12) * (-15-(-8.4774)));
            zz = 4.75497 + (((tickAnim - 13) / 12) * (0-(4.75497)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -1.75 + (((tickAnim - 25) / 8) * (-3.86649-(-1.75)));
            yy = -15 + (((tickAnim - 25) / 8) * (-14.96602-(-15)));
            zz = 0 + (((tickAnim - 25) / 8) * (-0.5164-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -3.86649 + (((tickAnim - 33) / 3) * (-1.9665-(-3.86649)));
            yy = -14.96602 + (((tickAnim - 33) / 3) * (-6.63323-(-14.96602)));
            zz = -0.5164 + (((tickAnim - 33) / 3) * (-3.9517-(-0.5164)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -1.9665 + (((tickAnim - 36) / 3) * (-4.0665-(-1.9665)));
            yy = -6.63323 + (((tickAnim - 36) / 3) * (1.69956-(-6.63323)));
            zz = -3.9517 + (((tickAnim - 36) / 3) * (-7.38699-(-3.9517)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -4.0665 + (((tickAnim - 39) / 3) * (-1.47715-(-4.0665)));
            yy = 1.69956 + (((tickAnim - 39) / 3) * (7.72634-(1.69956)));
            zz = -7.38699 + (((tickAnim - 39) / 3) * (-3.93856-(-7.38699)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -1.47715 + (((tickAnim - 42) / 3) * (-2.66767-(-1.47715)));
            yy = 7.72634 + (((tickAnim - 42) / 3) * (15.55305-(7.72634)));
            zz = -3.93856 + (((tickAnim - 42) / 3) * (5.06789-(-3.93856)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -2.66767 + (((tickAnim - 45) / 9) * (-2.85802-(-2.66767)));
            yy = 15.55305 + (((tickAnim - 45) / 9) * (15.76204-(15.55305)));
            zz = 5.06789 + (((tickAnim - 45) / 9) * (0.65936-(5.06789)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = -2.85802 + (((tickAnim - 54) / 11) * (0-(-2.85802)));
            yy = 15.76204 + (((tickAnim - 54) / 11) * (0-(15.76204)));
            zz = 0.65936 + (((tickAnim - 54) / 11) * (0-(0.65936)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));

        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.84496-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-13.48581-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (2.89459-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -1.84496 + (((tickAnim - 25) / 8) * (-3.28938-(-1.84496)));
            yy = -13.48581 + (((tickAnim - 25) / 8) * (-14.87043-(-13.48581)));
            zz = 2.89459 + (((tickAnim - 25) / 8) * (1.77042-(2.89459)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -3.28938 + (((tickAnim - 33) / 6) * (-9.91947-(-3.28938)));
            yy = -14.87043 + (((tickAnim - 33) / 6) * (-2.62759-(-14.87043)));
            zz = 1.77042 + (((tickAnim - 33) / 6) * (-0.21445-(1.77042)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -9.91947 + (((tickAnim - 39) / 6) * (-3.06456-(-9.91947)));
            yy = -2.62759 + (((tickAnim - 39) / 6) * (8.08491-(-2.62759)));
            zz = -0.21445 + (((tickAnim - 39) / 6) * (-1.9512-(-0.21445)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -3.06456 + (((tickAnim - 45) / 9) * (-1.31456-(-3.06456)));
            yy = 8.08491 + (((tickAnim - 45) / 9) * (8.08491-(8.08491)));
            zz = -1.9512 + (((tickAnim - 45) / 9) * (-1.9512-(-1.9512)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = -1.31456 + (((tickAnim - 54) / 11) * (0-(-1.31456)));
            yy = 8.08491 + (((tickAnim - 54) / 11) * (0-(8.08491)));
            zz = -1.9512 + (((tickAnim - 54) / 11) * (0-(-1.9512)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0.35-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0.35 + (((tickAnim - 33) / 6) * (1.05-(0.35)));
        }
        else if (tickAnim >= 39 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 39) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 26) * (0-(0)));
            zz = 1.05 + (((tickAnim - 39) / 26) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 15) / 5) * (-4.75-(-6.75)));
            yy = -9 + (((tickAnim - 15) / 5) * (-9-(-9)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -4.75 + (((tickAnim - 20) / 13) * (-8-(-4.75)));
            yy = -9 + (((tickAnim - 20) / 13) * (-9-(-9)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -8 + (((tickAnim - 33) / 6) * (11.91083-(-8)));
            yy = -9 + (((tickAnim - 33) / 6) * (-13.7857-(-9)));
            zz = 0 + (((tickAnim - 33) / 6) * (0.38119-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 11.91083 + (((tickAnim - 39) / 6) * (2.88496-(11.91083)));
            yy = -13.7857 + (((tickAnim - 39) / 6) * (-11.51661-(-13.7857)));
            zz = 0.38119 + (((tickAnim - 39) / 6) * (1.4908-(0.38119)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 2.88496 + (((tickAnim - 45) / 9) * (2.88496-(2.88496)));
            yy = -11.51661 + (((tickAnim - 45) / 9) * (-11.51661-(-11.51661)));
            zz = 1.4908 + (((tickAnim - 45) / 9) * (1.4908-(1.4908)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 2.88496 + (((tickAnim - 54) / 11) * (0-(2.88496)));
            yy = -11.51661 + (((tickAnim - 54) / 11) * (0-(-11.51661)));
            zz = 1.4908 + (((tickAnim - 54) / 11) * (0-(1.4908)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.85-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0.85 + (((tickAnim - 25) / 8) * (0.7-(0.85)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0.7 + (((tickAnim - 33) / 4) * (-0.365-(0.7)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = -0.365 + (((tickAnim - 37) / 2) * (-0.4-(-0.365)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = -0.4 + (((tickAnim - 39) / 6) * (0-(-0.4)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.75 + (((tickAnim - 15) / 5) * (14.13-(-0.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 14.13 + (((tickAnim - 20) / 5) * (-8.09533-(14.13)));
            yy = 0 + (((tickAnim - 20) / 5) * (8.14129-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-1.33942-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -8.09533 + (((tickAnim - 25) / 8) * (-7.60771-(-8.09533)));
            yy = 8.14129 + (((tickAnim - 25) / 8) * (8.89368-(8.14129)));
            zz = -1.33942 + (((tickAnim - 25) / 8) * (-1.38491-(-1.33942)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -7.60771 + (((tickAnim - 33) / 4) * (-12.72-(-7.60771)));
            yy = 8.89368 + (((tickAnim - 33) / 4) * (0-(8.89368)));
            zz = -1.38491 + (((tickAnim - 33) / 4) * (0-(-1.38491)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = -12.72 + (((tickAnim - 37) / 2) * (-2.25-(-12.72)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -2.25 + (((tickAnim - 39) / 6) * (-29.0648-(-2.25)));
            yy = 0 + (((tickAnim - 39) / 6) * (-9.24592-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (-0.92051-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -29.0648 + (((tickAnim - 45) / 9) * (-33.5648-(-29.0648)));
            yy = -9.24592 + (((tickAnim - 45) / 9) * (-9.24592-(-9.24592)));
            zz = -0.92051 + (((tickAnim - 45) / 9) * (-0.92051-(-0.92051)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = -33.5648 + (((tickAnim - 54) / 11) * (0-(-33.5648)));
            yy = -9.24592 + (((tickAnim - 54) / 11) * (0-(-9.24592)));
            zz = -0.92051 + (((tickAnim - 54) / 11) * (0-(-0.92051)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (1.225-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 37) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 17) * (0-(0)));
            zz = 1.225 + (((tickAnim - 37) / 17) * (1.62-(1.225)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            zz = 1.62 + (((tickAnim - 54) / 11) * (0-(1.62)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (48.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 48.75 + (((tickAnim - 15) / 5) * (0-(48.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (40.75-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 40.75 + (((tickAnim - 25) / 8) * (46.5-(40.75)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 46.5 + (((tickAnim - 33) / 4) * (0-(46.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (45-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 45 + (((tickAnim - 45) / 9) * (56-(45)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 56 + (((tickAnim - 54) / 11) * (0-(56)));
            yy = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.04-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 3) / 2) * (1-(1)));
            yy = 0.04 + (((tickAnim - 3) / 2) * (1-(0.04)));
            zz = 1 + (((tickAnim - 3) / 2) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 5) / 28) * (1-(1)));
            yy = 1 + (((tickAnim - 5) / 28) * (1-(1)));
            zz = 1 + (((tickAnim - 5) / 28) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 33) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 33) / 2) * (0.04-(1)));
            zz = 1 + (((tickAnim - 33) / 2) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 35) / 3) * (1-(1)));
            yy = 0.04 + (((tickAnim - 35) / 3) * (1-(0.04)));
            zz = 1 + (((tickAnim - 35) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.75-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = -2.75 + (((tickAnim - 18) / 7) * (0-(-2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailFront2, sailFront2.rotateAngleX + (float) Math.toRadians(xx), sailFront2.rotateAngleY + (float) Math.toRadians(yy), sailFront2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-30-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -21 + (((tickAnim - 8) / 5) * (21.5-(-21)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -30 + (((tickAnim - 8) / 5) * (-13.25-(-30)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 21.5 + (((tickAnim - 13) / 5) * (0-(21.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -13.25 + (((tickAnim - 13) / 5) * (3.5-(-13.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 3.5 + (((tickAnim - 18) / 7) * (-16-(3.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -9.5 + (((tickAnim - 25) / 8) * (-18.25-(-9.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = -16 + (((tickAnim - 25) / 8) * (-16-(-16)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -18.25 + (((tickAnim - 33) / 3) * (5.23435-(-18.25)));
            yy = 0 + (((tickAnim - 33) / 3) * (-1.06402-(0)));
            zz = -16 + (((tickAnim - 33) / 3) * (-23.8647-(-16)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 5.23435 + (((tickAnim - 36) / 3) * (-41.66589-(5.23435)));
            yy = -1.06402 + (((tickAnim - 36) / 3) * (-1.31546-(-1.06402)));
            zz = -23.8647 + (((tickAnim - 36) / 3) * (-25.22001-(-23.8647)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -41.66589 + (((tickAnim - 39) / 6) * (-36.0871-(-41.66589)));
            yy = -1.31546 + (((tickAnim - 39) / 6) * (1.98718-(-1.31546)));
            zz = -25.22001 + (((tickAnim - 39) / 6) * (-0.34365-(-25.22001)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -36.0871 + (((tickAnim - 45) / 9) * (-37.3371-(-36.0871)));
            yy = 1.98718 + (((tickAnim - 45) / 9) * (1.98718-(1.98718)));
            zz = -0.34365 + (((tickAnim - 45) / 9) * (-0.34365-(-0.34365)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = -37.3371 + (((tickAnim - 54) / 11) * (0-(-37.3371)));
            yy = 1.98718 + (((tickAnim - 54) / 11) * (0-(1.98718)));
            zz = -0.34365 + (((tickAnim - 54) / 11) * (0-(-0.34365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10.43632-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.56266-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (15.75159-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 10.43632 + (((tickAnim - 8) / 5) * (-31.47355-(10.43632)));
            yy = -0.56266 + (((tickAnim - 8) / 5) * (-1.67691-(-0.56266)));
            zz = 15.75159 + (((tickAnim - 8) / 5) * (5.7933-(15.75159)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -31.47355 + (((tickAnim - 13) / 5) * (7.61657-(-31.47355)));
            yy = -1.67691 + (((tickAnim - 13) / 5) * (-2.79117-(-1.67691)));
            zz = 5.7933 + (((tickAnim - 13) / 5) * (-4.16498-(5.7933)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 7.61657 + (((tickAnim - 18) / 7) * (-9.4055-(7.61657)));
            yy = -2.79117 + (((tickAnim - 18) / 7) * (3.49705-(-2.79117)));
            zz = -4.16498 + (((tickAnim - 18) / 7) * (8.01481-(-4.16498)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -9.4055 + (((tickAnim - 25) / 8) * (-14.4055-(-9.4055)));
            yy = 3.49705 + (((tickAnim - 25) / 8) * (3.49705-(3.49705)));
            zz = 8.01481 + (((tickAnim - 25) / 8) * (8.01481-(8.01481)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -14.4055 + (((tickAnim - 33) / 3) * (-41.78724-(-14.4055)));
            yy = 3.49705 + (((tickAnim - 33) / 3) * (-1.28985-(3.49705)));
            zz = 8.01481 + (((tickAnim - 33) / 3) * (10.98338-(8.01481)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -41.78724 + (((tickAnim - 36) / 3) * (12.83101-(-41.78724)));
            yy = -1.28985 + (((tickAnim - 36) / 3) * (-6.07675-(-1.28985)));
            zz = 10.98338 + (((tickAnim - 36) / 3) * (13.95195-(10.98338)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 12.83101 + (((tickAnim - 39) / 6) * (17.5-(12.83101)));
            yy = -6.07675 + (((tickAnim - 39) / 6) * (0-(-6.07675)));
            zz = 13.95195 + (((tickAnim - 39) / 6) * (0-(13.95195)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 17.5 + (((tickAnim - 45) / 9) * (12.5-(17.5)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 12.5 + (((tickAnim - 54) / 11) * (0-(12.5)));
            yy = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.475 + (((tickAnim - 18) / 15) * (-0.595-(-0.475)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            yy = -0.595 + (((tickAnim - 33) / 12) * (0-(-0.595)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (18-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 9.5 + (((tickAnim - 8) / 5) * (59.125-(9.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 18 + (((tickAnim - 8) / 5) * (9-(18)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 59.125 + (((tickAnim - 13) / 5) * (-9.75-(59.125)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 9 + (((tickAnim - 13) / 5) * (0-(9)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -9.75 + (((tickAnim - 18) / 7) * (19-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (9.75-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 19 + (((tickAnim - 25) / 8) * (33-(19)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 9.75 + (((tickAnim - 25) / 8) * (9.75-(9.75)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 33 + (((tickAnim - 33) / 3) * (96.39911-(33)));
            yy = 0 + (((tickAnim - 33) / 3) * (-8.11923-(0)));
            zz = 9.75 + (((tickAnim - 33) / 3) * (-5.62876-(9.75)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 96.39911 + (((tickAnim - 36) / 3) * (32.64153-(96.39911)));
            yy = -8.11923 + (((tickAnim - 36) / 3) * (-5.50608-(-8.11923)));
            zz = -5.62876 + (((tickAnim - 36) / 3) * (17.19423-(-5.62876)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 32.64153 + (((tickAnim - 39) / 6) * (20.68799-(32.64153)));
            yy = -5.50608 + (((tickAnim - 39) / 6) * (-2.46444-(-5.50608)));
            zz = 17.19423 + (((tickAnim - 39) / 6) * (-1.47283-(17.19423)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 20.68799 + (((tickAnim - 45) / 9) * (26.43799-(20.68799)));
            yy = -2.46444 + (((tickAnim - 45) / 9) * (-2.46444-(-2.46444)));
            zz = -1.47283 + (((tickAnim - 45) / 9) * (-1.47283-(-1.47283)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 26.43799 + (((tickAnim - 54) / 11) * (0-(26.43799)));
            yy = -2.46444 + (((tickAnim - 54) / 11) * (0-(-2.46444)));
            zz = -1.47283 + (((tickAnim - 54) / 11) * (0-(-1.47283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1.525-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.525 + (((tickAnim - 13) / 5) * (0-(1.525)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0.35-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0.35 + (((tickAnim - 25) / 8) * (0.75-(0.35)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 33) / 3) * (1.55-(0.75)));
            zz = 0 + (((tickAnim - 33) / 3) * (-1.475-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = 1.55 + (((tickAnim - 36) / 3) * (0.65-(1.55)));
            zz = -1.475 + (((tickAnim - 36) / 3) * (0-(-1.475)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0.65 + (((tickAnim - 39) / 3) * (0.955-(0.65)));
            zz = 0 + (((tickAnim - 39) / 3) * (-0.31-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0.955 + (((tickAnim - 42) / 3) * (0.55-(0.955)));
            zz = -0.31 + (((tickAnim - 42) / 3) * (0-(-0.31)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0.55 + (((tickAnim - 45) / 20) * (0-(0.55)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (29.84563-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-10.18136-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (5.01182-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 29.84563 + (((tickAnim - 4) / 5) * (11.21039-(29.84563)));
            yy = -10.18136 + (((tickAnim - 4) / 5) * (-22.39898-(-10.18136)));
            zz = 5.01182 + (((tickAnim - 4) / 5) * (11.02601-(5.01182)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 11.21039 + (((tickAnim - 9) / 16) * (-21.83279-(11.21039)));
            yy = -22.39898 + (((tickAnim - 9) / 16) * (6.46294-(-22.39898)));
            zz = 11.02601 + (((tickAnim - 9) / 16) * (-19.82942-(11.02601)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -21.83279 + (((tickAnim - 25) / 8) * (-27.05172-(-21.83279)));
            yy = 6.46294 + (((tickAnim - 25) / 8) * (6.86388-(6.46294)));
            zz = -19.82942 + (((tickAnim - 25) / 8) * (-20.7983-(-19.82942)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -27.05172 + (((tickAnim - 33) / 3) * (-15.45029-(-27.05172)));
            yy = 6.86388 + (((tickAnim - 33) / 3) * (-0.36-(6.86388)));
            zz = -20.7983 + (((tickAnim - 33) / 3) * (-6.40937-(-20.7983)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -15.45029 + (((tickAnim - 36) / 3) * (5.65114-(-15.45029)));
            yy = -0.36 + (((tickAnim - 36) / 3) * (-7.58387-(-0.36)));
            zz = -6.40937 + (((tickAnim - 36) / 3) * (7.97956-(-6.40937)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 5.65114 + (((tickAnim - 39) / 3) * (7.02627-(5.65114)));
            yy = -7.58387 + (((tickAnim - 39) / 3) * (-4.34403-(-7.58387)));
            zz = 7.97956 + (((tickAnim - 39) / 3) * (-2.72587-(7.97956)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 7.02627 + (((tickAnim - 42) / 3) * (-28.47355-(7.02627)));
            yy = -4.34403 + (((tickAnim - 42) / 3) * (-0.02424-(-4.34403)));
            zz = -2.72587 + (((tickAnim - 42) / 3) * (-16.99978-(-2.72587)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -28.47355 + (((tickAnim - 45) / 9) * (-27.96782-(-28.47355)));
            yy = -0.02424 + (((tickAnim - 45) / 9) * (-0.53239-(-0.02424)));
            zz = -16.99978 + (((tickAnim - 45) / 9) * (-12.00002-(-16.99978)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = -27.96782 + (((tickAnim - 54) / 11) * (0-(-27.96782)));
            yy = -0.53239 + (((tickAnim - 54) / 11) * (0-(-0.53239)));
            zz = -12.00002 + (((tickAnim - 54) / 11) * (0-(-12.00002)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(0);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(0);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-37.26061-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-1.71831-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-3.19417-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -37.26061 + (((tickAnim - 4) / 5) * (12.97879-(-37.26061)));
            yy = -1.71831 + (((tickAnim - 4) / 5) * (-3.43662-(-1.71831)));
            zz = -3.19417 + (((tickAnim - 4) / 5) * (-6.38833-(-3.19417)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 12.97879 + (((tickAnim - 9) / 16) * (11.04589-(12.97879)));
            yy = -3.43662 + (((tickAnim - 9) / 16) * (-4.02245-(-3.43662)));
            zz = -6.38833 + (((tickAnim - 9) / 16) * (-5.91033-(-6.38833)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 11.04589 + (((tickAnim - 25) / 8) * (6.3004-(11.04589)));
            yy = -4.02245 + (((tickAnim - 25) / 8) * (-4.34049-(-4.02245)));
            zz = -5.91033 + (((tickAnim - 25) / 8) * (-6.00959-(-5.91033)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 6.3004 + (((tickAnim - 33) / 6) * (7.26018-(6.3004)));
            yy = -4.34049 + (((tickAnim - 33) / 6) * (5.06613-(-4.34049)));
            zz = -6.00959 + (((tickAnim - 33) / 6) * (7.59542-(-6.00959)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 7.26018 + (((tickAnim - 39) / 3) * (-39.35856-(7.26018)));
            yy = 5.06613 + (((tickAnim - 39) / 3) * (3.6-(5.06613)));
            zz = 7.59542 + (((tickAnim - 39) / 3) * (0.11854-(7.59542)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -39.35856 + (((tickAnim - 42) / 3) * (27.25-(-39.35856)));
            yy = 3.6 + (((tickAnim - 42) / 3) * (0-(3.6)));
            zz = 0.11854 + (((tickAnim - 42) / 3) * (0-(0.11854)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 27.25 + (((tickAnim - 45) / 9) * (18.70665-(27.25)));
            yy = 0 + (((tickAnim - 45) / 9) * (-1.90193-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (-6.22272-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 18.70665 + (((tickAnim - 54) / 11) * (0-(18.70665)));
            yy = -1.90193 + (((tickAnim - 54) / 11) * (0-(-1.90193)));
            zz = -6.22272 + (((tickAnim - 54) / 11) * (0-(-6.22272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.01-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.475-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.01 + (((tickAnim - 4) / 5) * (-0.575-(0.01)));
            zz = 0.475 + (((tickAnim - 4) / 5) * (0-(0.475)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            yy = -0.575 + (((tickAnim - 9) / 16) * (-0.675-(-0.575)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -0.675 + (((tickAnim - 25) / 8) * (-0.75-(-0.675)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = -0.75 + (((tickAnim - 33) / 6) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (86.90401-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-1.72749-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.75959-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 86.90401 + (((tickAnim - 4) / 5) * (-22.19199-(86.90401)));
            yy = -1.72749 + (((tickAnim - 4) / 5) * (-3.45499-(-1.72749)));
            zz = -1.75959 + (((tickAnim - 4) / 5) * (-3.51919-(-1.75959)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -22.19199 + (((tickAnim - 9) / 16) * (5.72168-(-22.19199)));
            yy = -3.45499 + (((tickAnim - 9) / 16) * (-12.05298-(-3.45499)));
            zz = -3.51919 + (((tickAnim - 9) / 16) * (22.52624-(-3.51919)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 5.72168 + (((tickAnim - 25) / 8) * (12.77404-(5.72168)));
            yy = -12.05298 + (((tickAnim - 25) / 8) * (-12.00679-(-12.05298)));
            zz = 22.52624 + (((tickAnim - 25) / 8) * (22.27503-(22.52624)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 12.77404 + (((tickAnim - 33) / 3) * (6.26202-(12.77404)));
            yy = -12.00679 + (((tickAnim - 33) / 3) * (-6.00339-(-12.00679)));
            zz = 22.27503 + (((tickAnim - 33) / 3) * (4.13752-(22.27503)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 6.26202 + (((tickAnim - 36) / 3) * (-7.49635-(6.26202)));
            yy = -6.00339 + (((tickAnim - 36) / 3) * (0.16781-(-6.00339)));
            zz = 4.13752 + (((tickAnim - 36) / 3) * (-11.50563-(4.13752)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -7.49635 + (((tickAnim - 39) / 3) * (95.78571-(-7.49635)));
            yy = 0.16781 + (((tickAnim - 39) / 3) * (0-(0.16781)));
            zz = -11.50563 + (((tickAnim - 39) / 3) * (-0.17857-(-11.50563)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 95.78571 + (((tickAnim - 42) / 3) * (0-(95.78571)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = -0.17857 + (((tickAnim - 42) / 3) * (18.25-(-0.17857)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (8.75-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 18.25 + (((tickAnim - 45) / 9) * (18.25-(18.25)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 8.75 + (((tickAnim - 54) / 11) * (0-(8.75)));
            yy = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            zz = 18.25 + (((tickAnim - 54) / 11) * (0-(18.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.94-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.025-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.94 + (((tickAnim - 4) / 5) * (-0.425-(0.94)));
            zz = -1.025 + (((tickAnim - 4) / 5) * (0-(-1.025)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 9) / 8) * (0.09-(-0.425)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0.09 + (((tickAnim - 17) / 8) * (-0.075-(0.09)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -0.075 + (((tickAnim - 25) / 8) * (0.205-(-0.075)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0.205 + (((tickAnim - 33) / 3) * (0.635-(0.205)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = 0.635 + (((tickAnim - 36) / 3) * (-0.39-(0.635)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = -0.39 + (((tickAnim - 39) / 3) * (1.77-(-0.39)));
            zz = 0 + (((tickAnim - 39) / 3) * (-1.2-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 1.77 + (((tickAnim - 42) / 3) * (0.325-(1.77)));
            zz = -1.2 + (((tickAnim - 42) / 3) * (0-(-1.2)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0.325 + (((tickAnim - 45) / 9) * (0.255-(0.325)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            yy = 0.255 + (((tickAnim - 54) / 11) * (0-(0.255)));
            zz = 0 + (((tickAnim - 54) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = -1.5 + (((tickAnim - 5) / 8) * (-5.08-(-1.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -5.08 + (((tickAnim - 13) / 5) * (-5-(-5.08)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (1-(0)));
            zz = -5 + (((tickAnim - 18) / 7) * (0-(-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (-0.10947-(0)));
            yy = 1 + (((tickAnim - 25) / 8) * (-0.27385-(1)));
            zz = 0 + (((tickAnim - 25) / 8) * (-0.8685-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -0.10947 + (((tickAnim - 33) / 6) * (1.27745-(-0.10947)));
            yy = -0.27385 + (((tickAnim - 33) / 6) * (-1.09615-(-0.27385)));
            zz = -0.8685 + (((tickAnim - 33) / 6) * (3.07157-(-0.8685)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 1.27745 + (((tickAnim - 39) / 3) * (-0.2152-(1.27745)));
            yy = -1.09615 + (((tickAnim - 39) / 3) * (-1.62928-(-1.09615)));
            zz = 3.07157 + (((tickAnim - 39) / 3) * (1.13329-(3.07157)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -0.2152 + (((tickAnim - 42) / 3) * (-0.08534-(-0.2152)));
            yy = -1.62928 + (((tickAnim - 42) / 3) * (-2.61356-(-1.62928)));
            zz = 1.13329 + (((tickAnim - 42) / 3) * (-5.52701-(1.13329)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -0.08534 + (((tickAnim - 45) / 10) * (-0.08534-(-0.08534)));
            yy = -2.61356 + (((tickAnim - 45) / 10) * (-2.61356-(-2.61356)));
            zz = -5.52701 + (((tickAnim - 45) / 10) * (-5.52701-(-5.52701)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -0.08534 + (((tickAnim - 55) / 10) * (0-(-0.08534)));
            yy = -2.61356 + (((tickAnim - 55) / 10) * (0-(-2.61356)));
            zz = -5.52701 + (((tickAnim - 55) / 10) * (0-(-5.52701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailMiddlefront, sailMiddlefront.rotateAngleX + (float) Math.toRadians(xx), sailMiddlefront.rotateAngleY + (float) Math.toRadians(yy), sailMiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = -3.5 + (((tickAnim - 5) / 8) * (0.33-(-3.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0.33 + (((tickAnim - 13) / 5) * (-2.25-(0.33)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = -2.25 + (((tickAnim - 18) / 7) * (0-(-2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 14) * (-4.75-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = -4.75 + (((tickAnim - 39) / 6) * (-0.25-(-4.75)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = -0.25 + (((tickAnim - 45) / 9) * (-5.5-(-0.25)));
        }
        else if (tickAnim >= 54 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 54) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 1) * (0-(0)));
            zz = -5.5 + (((tickAnim - 54) / 1) * (-5.5-(-5.5)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = -5.5 + (((tickAnim - 55) / 10) * (0-(-5.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(xx), sailMiddle.rotateAngleY + (float) Math.toRadians(yy), sailMiddle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 65) {
            xx = -0.3 + (((tickAnim - 39) / 26) * (0-(-0.3)));
            yy = 0 + (((tickAnim - 39) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailMiddle.rotationPointX = this.sailMiddle.rotationPointX + (float)(xx);
        this.sailMiddle.rotationPointY = this.sailMiddle.rotationPointY - (float)(yy);
        this.sailMiddle.rotationPointZ = this.sailMiddle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.04177-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.9042-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-4.22527-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0.04177 + (((tickAnim - 15) / 18) * (0.19529-(0.04177)));
            yy = -4.9042 + (((tickAnim - 15) / 18) * (10.54689-(-4.9042)));
            zz = -4.22527 + (((tickAnim - 15) / 18) * (-1.17767-(-4.22527)));
        }
        else if (tickAnim >= 33 && tickAnim < 51) {
            xx = 0.19529 + (((tickAnim - 33) / 18) * (-3.62222-(0.19529)));
            yy = 10.54689 + (((tickAnim - 33) / 18) * (3.20639-(10.54689)));
            zz = -1.17767 + (((tickAnim - 33) / 18) * (3.46276-(-1.17767)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = -3.62222 + (((tickAnim - 51) / 3) * (-3.61116-(-3.62222)));
            yy = 3.20639 + (((tickAnim - 51) / 3) * (4.4454-(3.20639)));
            zz = 3.46276 + (((tickAnim - 51) / 3) * (3.62851-(3.46276)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = -3.61116 + (((tickAnim - 54) / 11) * (0-(-3.61116)));
            yy = 4.4454 + (((tickAnim - 54) / 11) * (0-(4.4454)));
            zz = 3.62851 + (((tickAnim - 54) / 11) * (0-(3.62851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-20.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -20.5 + (((tickAnim - 15) / 10) * (6-(-20.5)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 6 + (((tickAnim - 25) / 8) * (12.25-(6)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 33) / 18) * (0-(0)));
            yy = 12.25 + (((tickAnim - 33) / 18) * (-6.25-(12.25)));
            zz = 0 + (((tickAnim - 33) / 18) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 51) / 3) * (0.33404-(0)));
            yy = -6.25 + (((tickAnim - 51) / 3) * (-0.08973-(-6.25)));
            zz = 0 + (((tickAnim - 51) / 3) * (-1.76559-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 0.33404 + (((tickAnim - 54) / 11) * (0-(0.33404)));
            yy = -0.08973 + (((tickAnim - 54) / 11) * (0-(-0.08973)));
            zz = -1.76559 + (((tickAnim - 54) / 11) * (0-(-1.76559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-0.475-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 33) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 32) * (0-(0)));
            zz = -0.475 + (((tickAnim - 33) / 32) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (6.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*-55-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 6.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*-55 + (((tickAnim - 7) / 8) * (-12.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*20-(6.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*-55)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -12.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*20 + (((tickAnim - 15) / 10) * (-3.25-(-12.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*20)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -3.25 + (((tickAnim - 25) / 8) * (9.75-(-3.25)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 9.75 + (((tickAnim - 33) / 7) * (2.75-(9.75)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            yy = 2.75 + (((tickAnim - 40) / 11) * (-20.25-(2.75)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 51) / 3) * (0-(0)));
            yy = -20.25 + (((tickAnim - 51) / 3) * (-8.5-(-20.25)));
            zz = 0 + (((tickAnim - 51) / 3) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            yy = -8.5 + (((tickAnim - 54) / 11) * (0-(-8.5)));
            zz = 0 + (((tickAnim - 54) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (6.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*-55-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 6.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*-55 + (((tickAnim - 7) / 8) * (-22.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-70))*70-(6.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*-55)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -22.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-70))*70 + (((tickAnim - 15) / 10) * (-17.75-(-22.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-70))*70)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -17.75 + (((tickAnim - 25) / 3) * (-19.5-(-17.75)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -19.5 + (((tickAnim - 28) / 5) * (20.5-(-19.5)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 20.5 + (((tickAnim - 33) / 7) * (25.1-(20.5)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 25.1 + (((tickAnim - 40) / 6) * (19.53-(25.1)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 46) / 5) * (0-(0)));
            yy = 19.53 + (((tickAnim - 46) / 5) * (-23.5-(19.53)));
            zz = 0 + (((tickAnim - 46) / 5) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 51) / 3) * (0-(0)));
            yy = -23.5 + (((tickAnim - 51) / 3) * (-32-(-23.5)));
            zz = 0 + (((tickAnim - 51) / 3) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            yy = -32 + (((tickAnim - 54) / 11) * (0-(-32)));
            zz = 0 + (((tickAnim - 54) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.49205-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.65332-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-11.85859-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 9.49205 + (((tickAnim - 8) / 5) * (-9.35375-(9.49205)));
            yy = -1.65332 + (((tickAnim - 8) / 5) * (1.87785-(-1.65332)));
            zz = -11.85859 + (((tickAnim - 8) / 5) * (0.10642-(-11.85859)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -9.35375 + (((tickAnim - 13) / 5) * (9.80045-(-9.35375)));
            yy = 1.87785 + (((tickAnim - 13) / 5) * (5.40902-(1.87785)));
            zz = 0.10642 + (((tickAnim - 13) / 5) * (12.07142-(0.10642)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 9.80045 + (((tickAnim - 18) / 7) * (4.57597-(9.80045)));
            yy = 5.40902 + (((tickAnim - 18) / 7) * (0.98961-(5.40902)));
            zz = 12.07142 + (((tickAnim - 18) / 7) * (4.49694-(12.07142)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 4.57597 + (((tickAnim - 25) / 8) * (-6.17403-(4.57597)));
            yy = 0.98961 + (((tickAnim - 25) / 8) * (0.98961-(0.98961)));
            zz = 4.49694 + (((tickAnim - 25) / 8) * (4.49694-(4.49694)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -6.17403 + (((tickAnim - 33) / 3) * (-14.62421-(-6.17403)));
            yy = 0.98961 + (((tickAnim - 33) / 3) * (-2.15455-(0.98961)));
            zz = 4.49694 + (((tickAnim - 33) / 3) * (-1.14969-(4.49694)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -14.62421 + (((tickAnim - 36) / 3) * (2.4256-(-14.62421)));
            yy = -2.15455 + (((tickAnim - 36) / 3) * (-5.29871-(-2.15455)));
            zz = -1.14969 + (((tickAnim - 36) / 3) * (-6.79633-(-1.14969)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 2.4256 + (((tickAnim - 39) / 6) * (8.05174-(2.4256)));
            yy = -5.29871 + (((tickAnim - 39) / 6) * (5.58218-(-5.29871)));
            zz = -6.79633 + (((tickAnim - 39) / 6) * (3.65105-(-6.79633)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 8.05174 + (((tickAnim - 45) / 9) * (3.30174-(8.05174)));
            yy = 5.58218 + (((tickAnim - 45) / 9) * (5.58218-(5.58218)));
            zz = 3.65105 + (((tickAnim - 45) / 9) * (3.65105-(3.65105)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 3.30174 + (((tickAnim - 54) / 11) * (0-(3.30174)));
            yy = 5.58218 + (((tickAnim - 54) / 11) * (0-(5.58218)));
            zz = 3.65105 + (((tickAnim - 54) / 11) * (0-(3.65105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-31.75862-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-3.09708-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.30444-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -31.75862 + (((tickAnim - 8) / 5) * (21.12069-(-31.75862)));
            yy = -3.09708 + (((tickAnim - 8) / 5) * (-1.54854-(-3.09708)));
            zz = 3.30444 + (((tickAnim - 8) / 5) * (1.65222-(3.30444)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 21.12069 + (((tickAnim - 13) / 5) * (10.95675-(21.12069)));
            yy = -1.54854 + (((tickAnim - 13) / 5) * (-11.04039-(-1.54854)));
            zz = 1.65222 + (((tickAnim - 13) / 5) * (1.77755-(1.65222)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 10.95675 + (((tickAnim - 18) / 7) * (-1-(10.95675)));
            yy = -11.04039 + (((tickAnim - 18) / 7) * (0-(-11.04039)));
            zz = 1.77755 + (((tickAnim - 18) / 7) * (0-(1.77755)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -1 + (((tickAnim - 25) / 8) * (-2.75-(-1)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -2.75 + (((tickAnim - 33) / 3) * (29.87-(-2.75)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 29.87 + (((tickAnim - 36) / 3) * (-21.75-(29.87)));
            yy = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -21.75 + (((tickAnim - 39) / 6) * (-7.99598-(-21.75)));
            yy = 0 + (((tickAnim - 39) / 6) * (-2.16348-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (3.40097-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -7.99598 + (((tickAnim - 45) / 9) * (-8.74598-(-7.99598)));
            yy = -2.16348 + (((tickAnim - 45) / 9) * (-2.16348-(-2.16348)));
            zz = 3.40097 + (((tickAnim - 45) / 9) * (3.40097-(3.40097)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = -8.74598 + (((tickAnim - 54) / 11) * (0-(-8.74598)));
            yy = -2.16348 + (((tickAnim - 54) / 11) * (0-(-2.16348)));
            zz = 3.40097 + (((tickAnim - 54) / 11) * (0-(3.40097)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.23-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.525-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.23 + (((tickAnim - 13) / 5) * (-0.175-(-0.23)));
            zz = -0.525 + (((tickAnim - 13) / 5) * (0-(-0.525)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 18) / 15) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 3) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (-0.625-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = -0.325 + (((tickAnim - 36) / 3) * (-0.295-(-0.325)));
            zz = -0.625 + (((tickAnim - 36) / 3) * (0-(-0.625)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = -0.295 + (((tickAnim - 39) / 6) * (0.06-(-0.295)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0.06 + (((tickAnim - 45) / 20) * (0-(0.06)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25.24839-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.03355-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (5.4999-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.24839 + (((tickAnim - 8) / 5) * (50.87419-(25.24839)));
            yy = -0.03355 + (((tickAnim - 8) / 5) * (-0.01677-(-0.03355)));
            zz = 5.4999 + (((tickAnim - 8) / 5) * (-2.00005-(5.4999)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 50.87419 + (((tickAnim - 13) / 5) * (-20.5-(50.87419)));
            yy = -0.01677 + (((tickAnim - 13) / 5) * (0-(-0.01677)));
            zz = -2.00005 + (((tickAnim - 13) / 5) * (-9.5-(-2.00005)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -20.5 + (((tickAnim - 18) / 7) * (-4.19593-(-20.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (-0.92565-(0)));
            zz = -9.5 + (((tickAnim - 18) / 7) * (-6.68652-(-9.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -4.19593 + (((tickAnim - 25) / 8) * (7.56573-(-4.19593)));
            yy = -0.92565 + (((tickAnim - 25) / 8) * (1.88635-(-0.92565)));
            zz = -6.68652 + (((tickAnim - 25) / 8) * (-3.70185-(-6.68652)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 7.56573 + (((tickAnim - 33) / 3) * (50.08851-(7.56573)));
            yy = 1.88635 + (((tickAnim - 33) / 3) * (1.1274-(1.88635)));
            zz = -3.70185 + (((tickAnim - 33) / 3) * (1.71858-(-3.70185)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 50.08851 + (((tickAnim - 36) / 3) * (20.24653-(50.08851)));
            yy = 1.1274 + (((tickAnim - 36) / 3) * (0.62837-(1.1274)));
            zz = 1.71858 + (((tickAnim - 36) / 3) * (3.39627-(1.71858)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 20.24653 + (((tickAnim - 39) / 6) * (-1.75251-(20.24653)));
            yy = 0.62837 + (((tickAnim - 39) / 6) * (2.97136-(0.62837)));
            zz = 3.39627 + (((tickAnim - 39) / 6) * (-4.5185-(3.39627)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -1.75251 + (((tickAnim - 45) / 9) * (2.24749-(-1.75251)));
            yy = 2.97136 + (((tickAnim - 45) / 9) * (2.97136-(2.97136)));
            zz = -4.5185 + (((tickAnim - 45) / 9) * (-4.5185-(-4.5185)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 2.24749 + (((tickAnim - 54) / 11) * (0-(2.24749)));
            yy = 2.97136 + (((tickAnim - 54) / 11) * (0-(2.97136)));
            zz = -4.5185 + (((tickAnim - 54) / 11) * (0-(-4.5185)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1.225-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 13) / 5) * (-0.4-(1.225)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 18) / 7) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = -0.125 + (((tickAnim - 33) / 3) * (1.305-(-0.125)));
            zz = 0 + (((tickAnim - 33) / 3) * (-0.275-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = 1.305 + (((tickAnim - 36) / 3) * (0.3-(1.305)));
            zz = -0.275 + (((tickAnim - 36) / 3) * (0-(-0.275)));
        }
        else if (tickAnim >= 39 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 39) / 26) * (0-(0)));
            yy = 0.3 + (((tickAnim - 39) / 26) * (0-(0.3)));
            zz = 0 + (((tickAnim - 39) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-11.06925-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (5.03566-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.92566-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -11.06925 + (((tickAnim - 4) / 4) * (24.36149-(-11.06925)));
            yy = 5.03566 + (((tickAnim - 4) / 4) * (10.07132-(5.03566)));
            zz = -0.92566 + (((tickAnim - 4) / 4) * (-1.85132-(-0.92566)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 24.36149 + (((tickAnim - 8) / 10) * (-0.23413-(24.36149)));
            yy = 10.07132 + (((tickAnim - 8) / 10) * (1.78587-(10.07132)));
            zz = -1.85132 + (((tickAnim - 8) / 10) * (-13.29768-(-1.85132)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.23413 + (((tickAnim - 18) / 4) * (-11.81617-(-0.23413)));
            yy = 1.78587 + (((tickAnim - 18) / 4) * (2.47055-(1.78587)));
            zz = -13.29768 + (((tickAnim - 18) / 4) * (-7.05616-(-13.29768)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -11.81617 + (((tickAnim - 22) / 3) * (4.56819-(-11.81617)));
            yy = 2.47055 + (((tickAnim - 22) / 3) * (3.01829-(2.47055)));
            zz = -7.05616 + (((tickAnim - 22) / 3) * (-2.06294-(-7.05616)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 4.56819 + (((tickAnim - 25) / 8) * (2.56819-(4.56819)));
            yy = 3.01829 + (((tickAnim - 25) / 8) * (3.01829-(3.01829)));
            zz = -2.06294 + (((tickAnim - 25) / 8) * (-2.06294-(-2.06294)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 2.56819 + (((tickAnim - 33) / 6) * (19.40654-(2.56819)));
            yy = 3.01829 + (((tickAnim - 33) / 6) * (3.18215-(3.01829)));
            zz = -2.06294 + (((tickAnim - 33) / 6) * (10.21733-(-2.06294)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 19.40654 + (((tickAnim - 39) / 4) * (-0.68291-(19.40654)));
            yy = 3.18215 + (((tickAnim - 39) / 4) * (1.36378-(3.18215)));
            zz = 10.21733 + (((tickAnim - 39) / 4) * (-2.04972-(10.21733)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -0.68291 + (((tickAnim - 43) / 2) * (0-(-0.68291)));
            yy = 1.36378 + (((tickAnim - 43) / 2) * (0-(1.36378)));
            zz = -2.04972 + (((tickAnim - 43) / 2) * (-11.25-(-2.04972)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = -11.25 + (((tickAnim - 45) / 9) * (-11.25-(-11.25)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = -2.25 + (((tickAnim - 54) / 11) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            zz = -11.25 + (((tickAnim - 54) / 11) * (0-(-11.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(0);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(0);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (28.9892-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.70365-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.95374-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 28.9892 + (((tickAnim - 4) / 4) * (-7.1328-(28.9892)));
            yy = -3.70365 + (((tickAnim - 4) / 4) * (-8.00778-(-3.70365)));
            zz = -0.95374 + (((tickAnim - 4) / 4) * (-0.57646-(-0.95374)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -7.1328 + (((tickAnim - 8) / 10) * (-16.52103-(-7.1328)));
            yy = -8.00778 + (((tickAnim - 8) / 10) * (-3.64246-(-8.00778)));
            zz = -0.57646 + (((tickAnim - 8) / 10) * (-0.46455-(-0.57646)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -16.52103 + (((tickAnim - 18) / 4) * (21.65732-(-16.52103)));
            yy = -3.64246 + (((tickAnim - 18) / 4) * (-1.61887-(-3.64246)));
            zz = -0.46455 + (((tickAnim - 18) / 4) * (-0.20647-(-0.46455)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 21.65732 + (((tickAnim - 22) / 3) * (-15.75-(21.65732)));
            yy = -1.61887 + (((tickAnim - 22) / 3) * (0-(-1.61887)));
            zz = -0.20647 + (((tickAnim - 22) / 3) * (0-(-0.20647)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -15.75 + (((tickAnim - 25) / 8) * (-26-(-15.75)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -26 + (((tickAnim - 33) / 6) * (-11.78142-(-26)));
            yy = 0 + (((tickAnim - 33) / 6) * (-4.00941-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (2.83765-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -11.78142 + (((tickAnim - 39) / 4) * (26.20082-(-11.78142)));
            yy = -4.00941 + (((tickAnim - 39) / 4) * (-1.71832-(-4.00941)));
            zz = 2.83765 + (((tickAnim - 39) / 4) * (1.21614-(2.83765)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 26.20082 + (((tickAnim - 43) / 2) * (0-(26.20082)));
            yy = -1.71832 + (((tickAnim - 43) / 2) * (0-(-1.71832)));
            zz = 1.21614 + (((tickAnim - 43) / 2) * (0-(1.21614)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = -1.5 + (((tickAnim - 54) / 11) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.575-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.225 + (((tickAnim - 4) / 4) * (0.825-(-0.225)));
            zz = -0.575 + (((tickAnim - 4) / 4) * (-0.375-(-0.575)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.825 + (((tickAnim - 8) / 14) * (-0.215-(0.825)));
            zz = -0.375 + (((tickAnim - 8) / 14) * (-0.525-(-0.375)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.215 + (((tickAnim - 22) / 3) * (-0.05-(-0.215)));
            zz = -0.525 + (((tickAnim - 22) / 3) * (0-(-0.525)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -0.05 + (((tickAnim - 25) / 8) * (-0.225-(-0.05)));
            zz = 0 + (((tickAnim - 25) / 8) * (-0.2-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 33) / 6) * (0-(-0.225)));
            zz = -0.2 + (((tickAnim - 33) / 6) * (0-(-0.2)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (-0.165-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (-0.565-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = -0.165 + (((tickAnim - 43) / 2) * (0-(-0.165)));
            zz = -0.565 + (((tickAnim - 43) / 2) * (0-(-0.565)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (48.12217-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.22675-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.71491-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 48.12217 + (((tickAnim - 4) / 4) * (-15.00566-(48.12217)));
            yy = -0.22675 + (((tickAnim - 4) / 4) * (-0.45351-(-0.22675)));
            zz = 0.71491 + (((tickAnim - 4) / 4) * (1.42982-(0.71491)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -15.00566 + (((tickAnim - 8) / 10) * (11.25163-(-15.00566)));
            yy = -0.45351 + (((tickAnim - 8) / 10) * (-0.35921-(-0.45351)));
            zz = 1.42982 + (((tickAnim - 8) / 10) * (11.1618-(1.42982)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 11.25163 + (((tickAnim - 18) / 3) * (36.49808-(11.25163)));
            yy = -0.35921 + (((tickAnim - 18) / 3) * (0.02315-(-0.35921)));
            zz = 11.1618 + (((tickAnim - 18) / 3) * (8.2983-(11.1618)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 36.49808 + (((tickAnim - 21) / 4) * (11.24364-(36.49808)));
            yy = 0.02315 + (((tickAnim - 21) / 4) * (0.5011-(0.02315)));
            zz = 8.2983 + (((tickAnim - 21) / 4) * (4.71892-(8.2983)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 11.24364 + (((tickAnim - 25) / 8) * (20.74364-(11.24364)));
            yy = 0.5011 + (((tickAnim - 25) / 8) * (0.5011-(0.5011)));
            zz = 4.71892 + (((tickAnim - 25) / 8) * (4.71892-(4.71892)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 20.74364 + (((tickAnim - 33) / 6) * (-2.13156-(20.74364)));
            yy = 0.5011 + (((tickAnim - 33) / 6) * (-5.98899-(0.5011)));
            zz = 4.71892 + (((tickAnim - 33) / 6) * (-13.43071-(4.71892)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -2.13156 + (((tickAnim - 39) / 4) * (44.55076-(-2.13156)));
            yy = -5.98899 + (((tickAnim - 39) / 4) * (-2.56671-(-5.98899)));
            zz = -13.43071 + (((tickAnim - 39) / 4) * (-0.32745-(-13.43071)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 44.55076 + (((tickAnim - 43) / 2) * (-2.25-(44.55076)));
            yy = -2.56671 + (((tickAnim - 43) / 2) * (0-(-2.56671)));
            zz = -0.32745 + (((tickAnim - 43) / 2) * (9.5-(-0.32745)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -2.25 + (((tickAnim - 45) / 9) * (2.75-(-2.25)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 9.5 + (((tickAnim - 45) / 9) * (9.5-(9.5)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 2.75 + (((tickAnim - 54) / 11) * (0-(2.75)));
            yy = 0 + (((tickAnim - 54) / 11) * (0-(0)));
            zz = 9.5 + (((tickAnim - 54) / 11) * (0-(9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 4) / 4) * (-0.2-(0.975)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 10) * (0.15-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 18) / 3) * (1.195-(0.15)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 1.195 + (((tickAnim - 21) / 4) * (0.525-(1.195)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 25) / 8) * (0.45-(0.525)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 33) / 6) * (0.255-(0.45)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = 0.255 + (((tickAnim - 39) / 4) * (1.56-(0.255)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 1.56 + (((tickAnim - 43) / 2) * (0-(1.56)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.13189-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.82432-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.9749-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0.13189 + (((tickAnim - 5) / 13) * (0-(0.13189)));
            yy = 2.82432 + (((tickAnim - 5) / 13) * (0-(2.82432)));
            zz = -0.9749 + (((tickAnim - 5) / 13) * (-4.5-(-0.9749)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = -4.5 + (((tickAnim - 18) / 7) * (-1.5-(-4.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0.14366-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (3.3814-(0)));
            zz = -1.5 + (((tickAnim - 25) / 8) * (-2.76926-(-1.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0.14366 + (((tickAnim - 33) / 6) * (-0.02433-(0.14366)));
            yy = 3.3814 + (((tickAnim - 33) / 6) * (5.89562-(3.3814)));
            zz = -2.76926 + (((tickAnim - 33) / 6) * (1.04572-(-2.76926)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -0.02433 + (((tickAnim - 39) / 6) * (0.51439-(-0.02433)));
            yy = 5.89562 + (((tickAnim - 39) / 6) * (10.25276-(5.89562)));
            zz = 1.04572 + (((tickAnim - 39) / 6) * (0.0889-(1.04572)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0.51439 + (((tickAnim - 45) / 10) * (0.51439-(0.51439)));
            yy = 10.25276 + (((tickAnim - 45) / 10) * (10.25276-(10.25276)));
            zz = 0.0889 + (((tickAnim - 45) / 10) * (0.0889-(0.0889)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0.51439 + (((tickAnim - 55) / 10) * (0-(0.51439)));
            yy = 10.25276 + (((tickAnim - 55) / 10) * (0-(10.25276)));
            zz = 0.0889 + (((tickAnim - 55) / 10) * (0-(0.0889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(xx), sailEnd.rotateAngleY + (float) Math.toRadians(yy), sailEnd.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.275 + (((tickAnim - 18) / 7) * (0-(-0.275)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -0.375 + (((tickAnim - 45) / 10) * (-0.375-(-0.375)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -0.375 + (((tickAnim - 55) / 10) * (0-(-0.375)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailEnd.rotationPointX = this.sailEnd.rotationPointX + (float)(xx);
        this.sailEnd.rotationPointY = this.sailEnd.rotationPointY - (float)(yy);
        this.sailEnd.rotationPointZ = this.sailEnd.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 0) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 6) * (0.2475-(1)));
            zz = 1 + (((tickAnim - 0) / 6) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 6) / 7) * (1-(1)));
            yy = 0.2475 + (((tickAnim - 6) / 7) * (1-(0.2475)));
            zz = 1 + (((tickAnim - 6) / 7) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 13) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 6) * (1-(1)));
            zz = 1 + (((tickAnim - 13) / 6) * (1-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 19) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 19) / 7) * (0.2475-(1)));
            zz = 1 + (((tickAnim - 19) / 7) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 26) / 7) * (1-(1)));
            yy = 0.2475 + (((tickAnim - 26) / 7) * (1-(0.2475)));
            zz = 1 + (((tickAnim - 26) / 7) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 33) / 0) * (1-(1)));
            yy = 1 + (((tickAnim - 33) / 0) * (1-(1)));
            zz = 1 + (((tickAnim - 33) / 0) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 1 + (((tickAnim - 33) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 33) / 6) * (0.2475-(1)));
            zz = 1 + (((tickAnim - 33) / 6) * (1-(1)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 39) / 8) * (1-(1)));
            yy = 0.2475 + (((tickAnim - 39) / 8) * (1-(0.2475)));
            zz = 1 + (((tickAnim - 39) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nose.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 65) {
            xx = -9.25 + (((tickAnim - 39) / 26) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 39) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(xx), sailFront.rotateAngleY + (float) Math.toRadians(yy), sailFront.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (1.075-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 39) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 26) * (0-(0)));
            zz = 1.075 + (((tickAnim - 39) / 26) * (0-(1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailFront.rotationPointX = this.sailFront.rotationPointX + (float)(xx);
        this.sailFront.rotationPointY = this.sailFront.rotationPointY - (float)(yy);
        this.sailFront.rotationPointZ = this.sailFront.rotationPointZ + (float)(zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon entity = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;
        int animCycle = 33;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 23) / 10) * (0-(4.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -5.25 + (((tickAnim - 23) / 10) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -8.5 + (((tickAnim - 23) / 10) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 22.25 + (((tickAnim - 23) / 10) * (0-(22.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon entity = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;
        int animCycle = 36;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-2.725-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-2.725 + (((tickAnim - 15) / 8) * (-2.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-2.725)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -2.25 + (((tickAnim - 23) / 14) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -3 + (((tickAnim - 15) / 8) * (-2-(-3)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -2 + (((tickAnim - 23) / 14) * (0-(-2)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 13) / 10) * (-8.5-(-5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -8.5 + (((tickAnim - 23) / 14) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-20))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-20))*15 + (((tickAnim - 13) / 11) * (41.25-(34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-20))*15)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 41.25 + (((tickAnim - 24) / 7) * (0-(41.25)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (1.75-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 1.75 + (((tickAnim - 33) / 4) * (0-(1.75)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 0) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 11) * (0.1325-(1)));
            zz = 1 + (((tickAnim - 0) / 11) * (1-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 11) / 4) * (1-(1)));
            yy = 0.1325 + (((tickAnim - 11) / 4) * (0-(0.1325)));
            zz = 1 + (((tickAnim - 11) / 4) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 15) / 8) * (1-(1)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 1 + (((tickAnim - 15) / 8) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 1 + (((tickAnim - 23) / 14) * (1-(1)));
            yy = 0 + (((tickAnim - 23) / 14) * (1-(0)));
            zz = 1 + (((tickAnim - 23) / 14) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -6.25 + (((tickAnim - 15) / 8) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -6.25 + (((tickAnim - 23) / 14) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(xx), sailFront.rotateAngleY + (float) Math.toRadians(yy), sailFront.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0.15 + (((tickAnim - 15) / 8) * (0.15-(0.15)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0.15 + (((tickAnim - 23) / 14) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailFront.rotationPointX = this.sailFront.rotationPointX + (float)(xx);
        this.sailFront.rotationPointY = this.sailFront.rotationPointY - (float)(yy);
        this.sailFront.rotationPointZ = this.sailFront.rotationPointZ + (float)(zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimetrodon entity = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18 + (((tickAnim - 0) / 2) * (19-(18)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 19 + (((tickAnim - 2) / 7) * (-19.78898-(19)));
            yy = 0 + (((tickAnim - 2) / 7) * (2.77996-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (10.4745-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -19.78898 + (((tickAnim - 9) / 7) * (-50.5-(-19.78898)));
            yy = 2.77996 + (((tickAnim - 9) / 7) * (0-(2.77996)));
            zz = 10.4745 + (((tickAnim - 9) / 7) * (0-(10.4745)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -50.5 + (((tickAnim - 16) / 14) * (18-(-50.5)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 14.75 + (((tickAnim - 0) / 2) * (19.5-(14.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19.5 + (((tickAnim - 2) / 1) * (20.29-(19.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 20.29 + (((tickAnim - 3) / 7) * (-27.1163-(20.29)));
            yy = 0 + (((tickAnim - 3) / 7) * (-1.82959-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (-0.26872-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -27.1163 + (((tickAnim - 10) / 6) * (20.5-(-27.1163)));
            yy = -1.82959 + (((tickAnim - 10) / 6) * (0-(-1.82959)));
            zz = -0.26872 + (((tickAnim - 10) / 6) * (0-(-0.26872)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 20.5 + (((tickAnim - 16) / 14) * (14.75-(20.5)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0.69-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0.25-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.69 + (((tickAnim - 6) / 4) * (0.025-(0.69)));
            zz = 0.25 + (((tickAnim - 6) / 4) * (0-(0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 0.025 + (((tickAnim - 10) / 20) * (0-(0.025)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 37.5 + (((tickAnim - 0) / 2) * (47-(37.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 47 + (((tickAnim - 2) / 4) * (108.87-(47)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 108.87 + (((tickAnim - 6) / 4) * (94.54-(108.87)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 94.54 + (((tickAnim - 10) / 6) * (28.5-(94.54)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 28.5 + (((tickAnim - 16) / 7) * (-6.88-(28.5)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -6.88 + (((tickAnim - 23) / 7) * (37.5-(-6.88)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.925 + (((tickAnim - 0) / 2) * (1.1-(0.925)));
            zz = -0.175 + (((tickAnim - 0) / 2) * (0-(-0.175)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.1 + (((tickAnim - 2) / 1) * (2.03-(1.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.53-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 2.03 + (((tickAnim - 3) / 3) * (1.93-(2.03)));
            zz = -0.53 + (((tickAnim - 3) / 3) * (-1.335-(-0.53)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 1.93 + (((tickAnim - 6) / 4) * (1.325-(1.93)));
            zz = -1.335 + (((tickAnim - 6) / 4) * (-0.95-(-1.335)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 1.325 + (((tickAnim - 10) / 6) * (0.225-(1.325)));
            zz = -0.95 + (((tickAnim - 10) / 6) * (0-(-0.95)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 16) / 3) * (1.165-(0.225)));
            zz = 0 + (((tickAnim - 16) / 3) * (0.16-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.165 + (((tickAnim - 19) / 4) * (0.475-(1.165)));
            zz = 0.16 + (((tickAnim - 19) / 4) * (0.35-(0.16)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 23) / 7) * (0.925-(0.475)));
            zz = 0.35 + (((tickAnim - 23) / 7) * (-0.175-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -50.5 + (((tickAnim - 0) / 13) * (19-(-50.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 19 + (((tickAnim - 13) / 10) * (-19.78898-(19)));
            yy = 0 + (((tickAnim - 13) / 10) * (2.77996-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-10.47454-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -19.78898 + (((tickAnim - 23) / 7) * (-50.5-(-19.78898)));
            yy = 2.77996 + (((tickAnim - 23) / 7) * (0-(2.77996)));
            zz = -10.47454 + (((tickAnim - 23) / 7) * (0-(-10.47454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 20.5 + (((tickAnim - 0) / 13) * (19.5-(20.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 19.5 + (((tickAnim - 13) / 5) * (20.29-(19.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 20.29 + (((tickAnim - 18) / 6) * (-27.1163-(20.29)));
            yy = 0 + (((tickAnim - 18) / 6) * (-1.82959-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (-0.26872-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -27.1163 + (((tickAnim - 24) / 6) * (20.5-(-27.1163)));
            yy = -1.82959 + (((tickAnim - 24) / 6) * (0-(-1.82959)));
            zz = -0.26872 + (((tickAnim - 24) / 6) * (0-(-0.26872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0.69-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0.69 + (((tickAnim - 20) / 4) * (0.025-(0.69)));
            zz = 0.25 + (((tickAnim - 20) / 4) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 28.5 + (((tickAnim - 0) / 5) * (-0.32-(28.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.32 + (((tickAnim - 5) / 4) * (6.59-(-0.32)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.59 + (((tickAnim - 9) / 4) * (47-(6.59)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 47 + (((tickAnim - 13) / 7) * (108.87-(47)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 108.87 + (((tickAnim - 20) / 4) * (94.54-(108.87)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 94.54 + (((tickAnim - 24) / 6) * (28.5-(94.54)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 5) * (0.825-(0.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.825 + (((tickAnim - 5) / 8) * (1.1-(0.825)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.1 + (((tickAnim - 13) / 5) * (2.03-(1.1)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.53-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 2.03 + (((tickAnim - 18) / 2) * (1.93-(2.03)));
            zz = -0.53 + (((tickAnim - 18) / 2) * (-1.335-(-0.53)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 1.93 + (((tickAnim - 20) / 4) * (1.325-(1.93)));
            zz = -1.335 + (((tickAnim - 20) / 4) * (-0.95-(-1.335)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 1.325 + (((tickAnim - 24) / 6) * (0.5-(1.325)));
            zz = -0.95 + (((tickAnim - 24) / 6) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 42.5 + (((tickAnim - 0) / 5) * (17.71333-(42.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.66646-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-6.2811-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 17.71333 + (((tickAnim - 5) / 6) * (-3.5-(17.71333)));
            yy = 1.66646 + (((tickAnim - 5) / 6) * (0-(1.66646)));
            zz = -6.2811 + (((tickAnim - 5) / 6) * (1.725-(-6.2811)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -3.5 + (((tickAnim - 11) / 2) * (-0.5-(-3.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 1.725 + (((tickAnim - 11) / 2) * (0-(1.725)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.5 + (((tickAnim - 13) / 5) * (3-(-0.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 18) / 12) * (42.5-(3)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.25 + (((tickAnim - 0) / 3) * (29.57-(17.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 29.57 + (((tickAnim - 3) / 6) * (-33.84-(29.57)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -33.84 + (((tickAnim - 9) / 4) * (-21-(-33.84)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -21 + (((tickAnim - 13) / 5) * (-9.5-(-21)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 18) / 12) * (17.25-(-9.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.6-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 3) / 6) * (1.13-(-0.1)));
            zz = -0.6 + (((tickAnim - 3) / 6) * (-0.3-(-0.6)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.13 + (((tickAnim - 9) / 4) * (-0.2-(1.13)));
            zz = -0.3 + (((tickAnim - 9) / 4) * (0-(-0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 5) * (-0.05-(-0.2)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -0.05 + (((tickAnim - 18) / 12) * (0-(-0.05)));
            zz = -0.2 + (((tickAnim - 18) / 12) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 54.5 + (((tickAnim - 0) / 3) * (64.11-(54.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 64.11 + (((tickAnim - 3) / 6) * (20.08-(64.11)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.08 + (((tickAnim - 9) / 4) * (20.75-(20.08)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.75 + (((tickAnim - 13) / 5) * (8-(20.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 8 + (((tickAnim - 18) / 5) * (-17.07-(8)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -17.07 + (((tickAnim - 23) / 7) * (54.5-(-17.07)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 0) / 3) * (1.51-(1.175)));
            zz = -0.4 + (((tickAnim - 0) / 3) * (-0.39-(-0.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.51 + (((tickAnim - 3) / 1) * (2.45-(1.51)));
            zz = -0.39 + (((tickAnim - 3) / 1) * (-0.13-(-0.39)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 2.45 + (((tickAnim - 4) / 2) * (2.675-(2.45)));
            zz = -0.13 + (((tickAnim - 4) / 2) * (-0.21-(-0.13)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 2.675 + (((tickAnim - 6) / 2) * (1.865-(2.675)));
            zz = -0.21 + (((tickAnim - 6) / 2) * (-0.37-(-0.21)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.865 + (((tickAnim - 8) / 1) * (0-(1.865)));
            zz = -0.37 + (((tickAnim - 8) / 1) * (0-(-0.37)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.225-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.225 + (((tickAnim - 13) / 5) * (0.475-(0.225)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 18) / 5) * (0.17-(0.475)));
            zz = 0 + (((tickAnim - 18) / 5) * (0.305-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.17 + (((tickAnim - 23) / 7) * (1.175-(0.17)));
            zz = 0.305 + (((tickAnim - 23) / 7) * (-0.4-(0.305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 5.5 + (((tickAnim - 0) / 13) * (50.83746-(5.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (5.08777-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-9.94113-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 50.83746 + (((tickAnim - 13) / 5) * (17.71333-(50.83746)));
            yy = 5.08777 + (((tickAnim - 13) / 5) * (1.66646-(5.08777)));
            zz = -9.94113 + (((tickAnim - 13) / 5) * (6.28112-(-9.94113)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 17.71333 + (((tickAnim - 18) / 6) * (-3.5-(17.71333)));
            yy = 1.66646 + (((tickAnim - 18) / 6) * (0-(1.66646)));
            zz = 6.28112 + (((tickAnim - 18) / 6) * (1.725-(6.28112)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -3.5 + (((tickAnim - 24) / 2) * (-0.5-(-3.5)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 1.725 + (((tickAnim - 24) / 2) * (0-(1.725)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.5 + (((tickAnim - 26) / 4) * (5.5-(-0.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -9.5 + (((tickAnim - 0) / 13) * (17.25-(-9.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.25 + (((tickAnim - 13) / 2) * (29.57-(17.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 29.57 + (((tickAnim - 15) / 8) * (-33.84-(29.57)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -33.84 + (((tickAnim - 23) / 3) * (-21-(-33.84)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -21 + (((tickAnim - 26) / 4) * (-9.5-(-21)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 13) * (0-(-0.05)));
            zz = -0.2 + (((tickAnim - 0) / 13) * (0-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.6-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.1 + (((tickAnim - 15) / 8) * (1.13-(-0.1)));
            zz = -0.6 + (((tickAnim - 15) / 8) * (-0.3-(-0.6)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 1.13 + (((tickAnim - 23) / 3) * (-0.2-(1.13)));
            zz = -0.3 + (((tickAnim - 23) / 3) * (0-(-0.3)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 26) / 4) * (-0.05-(-0.2)));
            zz = 0 + (((tickAnim - 26) / 4) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 3.75 + (((tickAnim - 0) / 4) * (-18.15-(3.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -18.15 + (((tickAnim - 4) / 4) * (-17.5-(-18.15)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 8) / 5) * (54.5-(-17.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 54.5 + (((tickAnim - 13) / 2) * (64.11-(54.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 64.11 + (((tickAnim - 15) / 8) * (32.83-(64.11)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 32.83 + (((tickAnim - 23) / 3) * (20.75-(32.83)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 20.75 + (((tickAnim - 26) / 4) * (3.75-(20.75)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 4) * (0.8-(0.025)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.14-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 4) / 4) * (0.35-(0.8)));
            zz = -0.14 + (((tickAnim - 4) / 4) * (0-(-0.14)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 3) * (1.365-(0.35)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.04-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.365 + (((tickAnim - 11) / 2) * (1.175-(1.365)));
            zz = -0.04 + (((tickAnim - 11) / 2) * (-0.4-(-0.04)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.175 + (((tickAnim - 13) / 2) * (1.51-(1.175)));
            zz = -0.4 + (((tickAnim - 13) / 2) * (-0.39-(-0.4)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.51 + (((tickAnim - 15) / 3) * (2.45-(1.51)));
            zz = -0.39 + (((tickAnim - 15) / 3) * (-0.13-(-0.39)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 2.45 + (((tickAnim - 18) / 2) * (2.675-(2.45)));
            zz = -0.13 + (((tickAnim - 18) / 2) * (-0.21-(-0.13)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 2.675 + (((tickAnim - 20) / 2) * (1.865-(2.675)));
            zz = -0.21 + (((tickAnim - 20) / 2) * (-0.37-(-0.21)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 1.865 + (((tickAnim - 22) / 1) * (0.825-(1.865)));
            zz = -0.37 + (((tickAnim - 22) / 1) * (-0.175-(-0.37)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0.825 + (((tickAnim - 23) / 3) * (0.225-(0.825)));
            zz = -0.175 + (((tickAnim - 23) / 3) * (0-(-0.175)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 26) / 4) * (0.025-(0.225)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*-2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*4), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*0.7);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+30))*-2.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-4), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+50))*-2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-4), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+50))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-280))*-4), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+100))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-350))*2), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(sailMiddlefront, sailMiddlefront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*-2), sailMiddlefront.rotateAngleY + (float) Math.toRadians(0), sailMiddlefront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*1.5));
        this.sailMiddlefront.rotationPointX = this.sailMiddlefront.rotationPointX + (float)(0);
        this.sailMiddlefront.rotationPointY = this.sailMiddlefront.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*-0.2);
        this.sailMiddlefront.rotationPointZ = this.sailMiddlefront.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-180))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-180))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-180))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-180))*-1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2.5));


        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-140))*2.5), sailEnd.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*-2.8), sailEnd.rotateAngleZ + (float) Math.toRadians(0));
        this.sailEnd.rotationPointX = this.sailEnd.rotationPointX + (float)(-0.075);
        this.sailEnd.rotationPointY = this.sailEnd.rotationPointY - (float)(0);
        this.sailEnd.rotationPointZ = this.sailEnd.rotationPointZ + (float)(-0.025);


        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(0), sailMiddle.rotateAngleY + (float) Math.toRadians(0), sailMiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+110))*0.9));



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimetrodon entity = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 28.25 + (((tickAnim - 0) / 1) * (30-(28.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 30 + (((tickAnim - 1) / 3) * (-25.89379-(30)));
            yy = 0 + (((tickAnim - 1) / 3) * (-1.17589-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (25.90687-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -25.89379 + (((tickAnim - 4) / 4) * (-56.5-(-25.89379)));
            yy = -1.17589 + (((tickAnim - 4) / 4) * (0-(-1.17589)));
            zz = 25.90687 + (((tickAnim - 4) / 4) * (0-(25.90687)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -56.5 + (((tickAnim - 8) / 7) * (28.25-(-56.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.75 + (((tickAnim - 0) / 1) * (22-(14.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 22 + (((tickAnim - 1) / 1) * (20.29-(22)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 20.29 + (((tickAnim - 2) / 3) * (-27.1163-(20.29)));
            yy = 0 + (((tickAnim - 2) / 3) * (-1.82959-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (-0.26872-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -27.1163 + (((tickAnim - 5) / 3) * (23.75-(-27.1163)));
            yy = -1.82959 + (((tickAnim - 5) / 3) * (0-(-1.82959)));
            zz = -0.26872 + (((tickAnim - 5) / 3) * (0-(-0.26872)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 23.75 + (((tickAnim - 8) / 7) * (14.75-(23.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0.69-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.69 + (((tickAnim - 3) / 2) * (0.025-(0.69)));
            zz = 0.25 + (((tickAnim - 3) / 2) * (0-(0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 5) / 3) * (-0.18-(0.025)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.18 + (((tickAnim - 8) / 7) * (0-(-0.18)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 51 + (((tickAnim - 0) / 1) * (61.25-(51)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 61.25 + (((tickAnim - 1) / 2) * (108.87-(61.25)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 108.87 + (((tickAnim - 3) / 2) * (94.54-(108.87)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 94.54 + (((tickAnim - 5) / 3) * (31.9447-(94.54)));
            yy = 0 + (((tickAnim - 5) / 3) * (1.99449-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-3.17625-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 31.9447 + (((tickAnim - 8) / 4) * (-6.88-(31.9447)));
            yy = 1.99449 + (((tickAnim - 8) / 4) * (0-(1.99449)));
            zz = -3.17625 + (((tickAnim - 8) / 4) * (0-(-3.17625)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -6.88 + (((tickAnim - 12) / 3) * (51-(-6.88)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.925 + (((tickAnim - 0) / 1) * (1.1-(0.925)));
            zz = -0.175 + (((tickAnim - 0) / 1) * (-0.375-(-0.175)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.1 + (((tickAnim - 1) / 1) * (2.03-(1.1)));
            zz = -0.375 + (((tickAnim - 1) / 1) * (-0.53-(-0.375)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.03 + (((tickAnim - 2) / 1) * (1.93-(2.03)));
            zz = -0.53 + (((tickAnim - 2) / 1) * (-1.335-(-0.53)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.93 + (((tickAnim - 3) / 2) * (1.325-(1.93)));
            zz = -1.335 + (((tickAnim - 3) / 2) * (-0.95-(-1.335)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.325 + (((tickAnim - 5) / 3) * (0.325-(1.325)));
            zz = -0.95 + (((tickAnim - 5) / 3) * (0-(-0.95)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 8) / 1) * (1.765-(0.325)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.16-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.765 + (((tickAnim - 9) / 1) * (1.865-(1.765)));
            zz = 0.16 + (((tickAnim - 9) / 1) * (0.22-(0.16)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 1.865 + (((tickAnim - 10) / 2) * (0.475-(1.865)));
            zz = 0.22 + (((tickAnim - 10) / 2) * (0.35-(0.22)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 12) / 3) * (0.925-(0.475)));
            zz = 0.35 + (((tickAnim - 12) / 3) * (-0.175-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -57 + (((tickAnim - 0) / 7) * (23.5-(-57)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 23.5 + (((tickAnim - 7) / 5) * (-23.46161-(23.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (6.96142-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-29.6214-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -23.46161 + (((tickAnim - 12) / 3) * (-57-(-23.46161)));
            yy = 6.96142 + (((tickAnim - 12) / 3) * (0-(6.96142)));
            zz = -29.6214 + (((tickAnim - 12) / 3) * (0-(-29.6214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 26 + (((tickAnim - 0) / 7) * (24-(26)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 24 + (((tickAnim - 7) / 1) * (20.29-(24)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20.29 + (((tickAnim - 8) / 5) * (-27.1163-(20.29)));
            yy = 0 + (((tickAnim - 8) / 5) * (-1.82959-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.26872-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -27.1163 + (((tickAnim - 13) / 2) * (26-(-27.1163)));
            yy = -1.82959 + (((tickAnim - 13) / 2) * (0-(-1.82959)));
            zz = -0.26872 + (((tickAnim - 13) / 2) * (0-(-0.26872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0.69-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.69 + (((tickAnim - 10) / 3) * (0.025-(0.69)));
            zz = 0.25 + (((tickAnim - 10) / 3) * (0-(0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 13) / 2) * (0-(0.025)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28.5 + (((tickAnim - 0) / 3) * (4.18-(28.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 4.18 + (((tickAnim - 3) / 1) * (6.59-(4.18)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 6.59 + (((tickAnim - 4) / 3) * (61.5-(6.59)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 61.5 + (((tickAnim - 7) / 3) * (108.87-(61.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 108.87 + (((tickAnim - 10) / 3) * (94.54-(108.87)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 94.54 + (((tickAnim - 13) / 2) * (28.5-(94.54)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 1) * (1.41-(0.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.41 + (((tickAnim - 1) / 2) * (1.425-(1.41)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.425 + (((tickAnim - 3) / 4) * (0.825-(1.425)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.825 + (((tickAnim - 7) / 1) * (2.03-(0.825)));
            zz = -0.25 + (((tickAnim - 7) / 1) * (-0.53-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.03 + (((tickAnim - 8) / 2) * (1.93-(2.03)));
            zz = -0.53 + (((tickAnim - 8) / 2) * (-1.335-(-0.53)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.93 + (((tickAnim - 10) / 3) * (1.325-(1.93)));
            zz = -1.335 + (((tickAnim - 10) / 3) * (-0.95-(-1.335)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.325 + (((tickAnim - 13) / 2) * (0.5-(1.325)));
            zz = -0.95 + (((tickAnim - 13) / 2) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 54.25 + (((tickAnim - 0) / 4) * (17.71333-(54.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.66646-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-6.2811-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 17.71333 + (((tickAnim - 4) / 2) * (-3.5-(17.71333)));
            yy = 1.66646 + (((tickAnim - 4) / 2) * (0-(1.66646)));
            zz = -6.2811 + (((tickAnim - 4) / 2) * (1.725-(-6.2811)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -3.5 + (((tickAnim - 6) / 2) * (-0.5-(-3.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 1.725 + (((tickAnim - 6) / 2) * (0-(1.725)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.5 + (((tickAnim - 8) / 1) * (3-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 3 + (((tickAnim - 9) / 6) * (54.25-(3)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14 + (((tickAnim - 0) / 1) * (17.57-(14)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 17.57 + (((tickAnim - 1) / 5) * (-25.84-(17.57)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -25.84 + (((tickAnim - 6) / 2) * (-21-(-25.84)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -21 + (((tickAnim - 8) / 1) * (-9.5-(-21)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -9.5 + (((tickAnim - 9) / 6) * (14-(-9.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.6-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 1) / 5) * (1.505-(-0.1)));
            zz = -0.6 + (((tickAnim - 1) / 5) * (-0.55-(-0.6)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.505 + (((tickAnim - 6) / 2) * (-0.2-(1.505)));
            zz = -0.55 + (((tickAnim - 6) / 2) * (0-(-0.55)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 1) * (-0.05-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 1) * (-0.2-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 9) / 6) * (0-(-0.05)));
            zz = -0.2 + (((tickAnim - 9) / 6) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.75 + (((tickAnim - 0) / 3) * (64.11-(43.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 64.11 + (((tickAnim - 3) / 2) * (14.83-(64.11)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 14.83 + (((tickAnim - 5) / 2) * (20.75-(14.83)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 20.75 + (((tickAnim - 7) / 1) * (8-(20.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8 + (((tickAnim - 8) / 2) * (-5.78-(8)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -5.78 + (((tickAnim - 10) / 2) * (-17.07-(-5.78)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -17.07 + (((tickAnim - 12) / 3) * (43.75-(-17.07)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 0) / 3) * (2.66-(1.175)));
            zz = -0.4 + (((tickAnim - 0) / 3) * (-0.165-(-0.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.66 + (((tickAnim - 3) / 0) * (2.45-(2.66)));
            zz = -0.165 + (((tickAnim - 3) / 0) * (-0.13-(-0.165)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 2.45 + (((tickAnim - 3) / 1) * (1.865-(2.45)));
            zz = -0.13 + (((tickAnim - 3) / 1) * (-0.37-(-0.13)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.865 + (((tickAnim - 4) / 1) * (0.8-(1.865)));
            zz = -0.37 + (((tickAnim - 4) / 1) * (0-(-0.37)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.8 + (((tickAnim - 5) / 2) * (0.225-(0.8)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.225 + (((tickAnim - 7) / 1) * (0.775-(0.225)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 2) * (0.745-(0.775)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.745 + (((tickAnim - 10) / 2) * (0.17-(0.745)));
            zz = 0.15 + (((tickAnim - 10) / 2) * (0.305-(0.15)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.17 + (((tickAnim - 12) / 3) * (1.175-(0.17)));
            zz = 0.305 + (((tickAnim - 12) / 3) * (-0.4-(0.305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3 + (((tickAnim - 0) / 6) * (54.5-(3)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 54.5 + (((tickAnim - 6) / 2) * (17.71333-(54.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.66646-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (6.28112-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 17.71333 + (((tickAnim - 8) / 5) * (-0.5-(17.71333)));
            yy = 1.66646 + (((tickAnim - 8) / 5) * (0-(1.66646)));
            zz = 6.28112 + (((tickAnim - 8) / 5) * (0-(6.28112)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.5 + (((tickAnim - 13) / 2) * (3-(-0.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -9.5 + (((tickAnim - 0) / 6) * (17.25-(-9.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 17.25 + (((tickAnim - 6) / 1) * (29.57-(17.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 29.57 + (((tickAnim - 7) / 5) * (-31.05-(29.57)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -31.05 + (((tickAnim - 12) / 1) * (-21-(-31.05)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -21 + (((tickAnim - 13) / 2) * (-9.5-(-21)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 6) * (0-(-0.05)));
            zz = -0.2 + (((tickAnim - 0) / 6) * (0-(-0.2)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.6-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 4) * (1.455-(-0.1)));
            zz = -0.6 + (((tickAnim - 8) / 4) * (-0.425-(-0.6)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.455 + (((tickAnim - 12) / 1) * (-0.2-(1.455)));
            zz = -0.425 + (((tickAnim - 12) / 1) * (0-(-0.425)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 2) * (-0.05-(-0.2)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.75 + (((tickAnim - 0) / 3) * (-20.9-(1.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -20.9 + (((tickAnim - 3) / 0) * (-17.5-(-20.9)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -17.5 + (((tickAnim - 3) / 3) * (54.5-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 54.5 + (((tickAnim - 6) / 1) * (64.11-(54.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 64.11 + (((tickAnim - 7) / 5) * (32.83-(64.11)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 32.83 + (((tickAnim - 12) / 1) * (29.5-(32.83)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 29.5 + (((tickAnim - 13) / 2) * (1.75-(29.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 3) * (1.575-(0.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.14-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.575 + (((tickAnim - 3) / 0) * (1.075-(1.575)));
            zz = -0.14 + (((tickAnim - 3) / 0) * (0-(-0.14)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.075 + (((tickAnim - 3) / 2) * (1.365-(1.075)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.04-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 1.365 + (((tickAnim - 5) / 1) * (1.175-(1.365)));
            zz = -0.04 + (((tickAnim - 5) / 1) * (-0.4-(-0.04)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.175 + (((tickAnim - 6) / 1) * (1.51-(1.175)));
            zz = -0.4 + (((tickAnim - 6) / 1) * (-0.39-(-0.4)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 1.51 + (((tickAnim - 7) / 2) * (2.45-(1.51)));
            zz = -0.39 + (((tickAnim - 7) / 2) * (-0.13-(-0.39)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 2.45 + (((tickAnim - 9) / 1) * (2.675-(2.45)));
            zz = -0.13 + (((tickAnim - 9) / 1) * (-0.21-(-0.13)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 2.675 + (((tickAnim - 10) / 1) * (1.865-(2.675)));
            zz = -0.21 + (((tickAnim - 10) / 1) * (-0.37-(-0.21)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 1.865 + (((tickAnim - 11) / 1) * (0.825-(1.865)));
            zz = -0.37 + (((tickAnim - 11) / 1) * (-0.175-(-0.37)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.825 + (((tickAnim - 12) / 1) * (0-(0.825)));
            zz = -0.175 + (((tickAnim - 12) / 1) * (0-(-0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-130))*-6), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*9), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*4));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3)));
            yy = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1 + (((tickAnim - 0) / 3) * (-0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.2 + (((tickAnim - 0) / 3) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3 + (((tickAnim - 3) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3)));
            yy = -0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1 + (((tickAnim - 3) / 4) * (-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1-(-0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1)));
            zz = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.5 + (((tickAnim - 3) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.2-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3 + (((tickAnim - 7) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3)));
            yy = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1 + (((tickAnim - 7) / 3) * (-0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.2 + (((tickAnim - 7) / 3) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3 + (((tickAnim - 10) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.3)));
            yy = -0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1 + (((tickAnim - 10) / 5) * (-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1-(-0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*-1)));
            zz = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.5 + (((tickAnim - 10) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.2-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-40))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+50))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-9), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+30))*-6), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*-9), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+60))*6), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*-9), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+80))*-4), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-330))*6), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+280))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(sailMiddlefront, sailMiddlefront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*-7), sailMiddlefront.rotateAngleY + (float) Math.toRadians(0), sailMiddlefront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*3.5));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-80))*0 + (((tickAnim - 0) / 5) * (0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-200))*0.425-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-80))*0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.325-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-200))*0.425 + (((tickAnim - 5) / 3) * (-0.485-(0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-200))*0.425)));
            zz = 0.325 + (((tickAnim - 5) / 3) * (0.1-(0.325)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.485 + (((tickAnim - 8) / 5) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-80))*0.425-(-0.485)));
            zz = 0.1 + (((tickAnim - 8) / 5) * (0-(0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-80))*0.425 + (((tickAnim - 13) / 2) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-80))*0-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-80))*0.425)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailMiddlefront.rotationPointX = this.sailMiddlefront.rotationPointX + (float)(xx);
        this.sailMiddlefront.rotationPointY = this.sailMiddlefront.rotationPointY - (float)(yy);
        this.sailMiddlefront.rotationPointZ = this.sailMiddlefront.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-180))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*6), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-180))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*11), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-180))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-180))*-1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*19), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2.5));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-130))*4 + (((tickAnim - 0) / 5) * (-0.1151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-130))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-130))*4)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-40))*-2.8 + (((tickAnim - 0) / 5) * (-0.972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-40))*-2.8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-40))*-2.8)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.0325-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -0.1151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-130))*4 + (((tickAnim - 5) / 6) * (-0.2399+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-130))*4-(-0.1151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-130))*4)));
            yy = -0.972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-40))*-2.8 + (((tickAnim - 5) / 6) * (0.8384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-40))*-2.8-(-0.972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-40))*-2.8)));
            zz = 2.0325 + (((tickAnim - 5) / 6) * (-2.0893-(2.0325)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.2399+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-130))*4 + (((tickAnim - 11) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-130))*4-(-0.2399+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-130))*4)));
            yy = 0.8384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-40))*-2.8 + (((tickAnim - 11) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-40))*-2.8-(0.8384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-40))*-2.8)));
            zz = -2.0893 + (((tickAnim - 11) / 4) * (0-(-2.0893)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(xx), sailEnd.rotateAngleY + (float) Math.toRadians(yy), sailEnd.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.475 + (((tickAnim - 0) / 3) * (-0.06-(-0.475)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.25 + (((tickAnim - 0) / 3) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.06 + (((tickAnim - 3) / 2) * (0.3-(-0.06)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 3) / 2) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.3 + (((tickAnim - 5) / 6) * (-0.175-(0.3)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = -0.25 + (((tickAnim - 5) / 6) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.175 + (((tickAnim - 11) / 2) * (-0.62-(-0.175)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 11) / 2) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.62 + (((tickAnim - 13) / 2) * (-0.475-(-0.62)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 13) / 2) * (-0.25-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailEnd.rotationPointX = this.sailEnd.rotationPointX + (float)(xx);
        this.sailEnd.rotationPointY = this.sailEnd.rotationPointY - (float)(yy);
        this.sailEnd.rotationPointZ = this.sailEnd.rotationPointZ + (float)(zz);



        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(0), sailMiddle.rotateAngleY + (float) Math.toRadians(0), sailMiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+110))*0.9));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 0) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 6) * (0.8975-(1)));
            zz = 1 + (((tickAnim - 0) / 6) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 6) / 6) * (1-(1)));
            yy = 0.8975 + (((tickAnim - 6) / 6) * (0.8975-(0.8975)));
            zz = 1 + (((tickAnim - 6) / 6) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 12) / 3) * (1-(1)));
            yy = 0.8975 + (((tickAnim - 12) / 3) * (1-(0.8975)));
            zz = 1 + (((tickAnim - 12) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDimetrodon ee = (EntityPrehistoricFloraDimetrodon) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDimetrodon e = (EntityPrehistoricFloraDimetrodon) entity;

    }
}
