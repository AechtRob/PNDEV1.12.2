package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGuizhouichthyosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraKronosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGuizhouichthyosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoralFin;
    private final AdvancedModelRenderer pectoralFin2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer pelvicFin;
    private final AdvancedModelRenderer pelvicFin2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    private ModelAnimator animator;

    public ModelGuizhouichthyosaurus() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.75F, 0.25F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.0F, -19.35F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 128, 62, -1.5F, -2.0F, -6.65F, 3, 2, 5, -0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 133, 126, -2.0F, -2.0F, -2.175F, 4, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 82, 17, -2.0F, -2.75F, -2.175F, 4, 1, 3, -0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 41, 32, -0.5F, -1.0F, -17.65F, 1, 1, 18, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 115, 0.4F, -0.5F, -17.55F, 0, 1, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 115, -0.4F, -0.5F, -17.55F, 0, 1, 11, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 129, 27, -1.0F, -1.0F, -12.65F, 2, 1, 8, 0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -15.65F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 120, 83, -0.5F, 0.0F, 0.0F, 1, 1, 9, -0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.6973F, -7.6804F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.288F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 133, 132, -1.0F, 0.0F, -0.25F, 2, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.025F, -0.9991F, -4.2122F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 28, -1.7F, -0.8F, -0.25F, 2, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 101, 83, -1.675F, -1.3F, -0.75F, 2, 2, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 28, -0.25F, -0.8F, -0.25F, 2, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 101, 83, -0.275F, -1.3F, -0.75F, 2, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.7623F, -4.0849F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 74, 130, -1.5F, 0.0F, 0.0F, 3, 2, 4, -0.004F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -1.65F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 41, 52, -0.5F, 0.0F, -16.0F, 1, 1, 16, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 114, 113, 0.4F, -0.5F, -15.9F, 0, 1, 11, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 114, 113, -0.4F, -0.5F, -15.9F, 0, 1, 11, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 105, -1.0F, 0.0F, -11.0F, 2, 1, 11, 0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 130, 8, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 97, 17, -1.5F, 1.0F, -3.525F, 3, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 134, 21, -1.0F, -2.0F, -3.525F, 2, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 131, -2.0F, -0.25F, -0.525F, 4, 3, 3, -0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3524F, -5.9281F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 22, -1.0F, 0.0F, 0.0F, 2, 1, 8, -0.002F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -10.0F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 134, 15, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.0486F, -0.2103F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 109, 38, -3.0F, -2.9764F, -0.0897F, 6, 6, 6, 0.002F, false));
        this.body.cubeList.add(new ModelBox(body, 76, 52, -4.0F, -3.4764F, 5.9103F, 8, 8, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 111, 33, -2.0F, 2.4236F, -0.0897F, 4, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1134F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 109, 51, -3.0F, -3.0F, 6.0F, 6, 3, 7, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 125, -2.0F, -3.0F, 0.0F, 4, 3, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.4236F, -0.0897F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 118, -2.5F, -6.0F, 7.0F, 5, 6, 6, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 111, 19, -2.0F, -6.0F, 0.0F, 4, 6, 7, 0.0F, false));

        this.pectoralFin = new AdvancedModelRenderer(this);
        this.pectoralFin.setRotationPoint(3.25F, 2.3061F, 4.1524F);
        this.body.addChild(pectoralFin);
        this.setRotateAngle(pectoralFin, -1.2873F, 0.1153F, -0.3762F);
        this.pectoralFin.cubeList.add(new ModelBox(pectoralFin, 61, 128, -0.5F, -1.75F, -1.0F, 1, 3, 5, 0.0F, false));
        this.pectoralFin.cubeList.add(new ModelBox(pectoralFin, 0, 32, 0.0F, -4.95F, 1.25F, 0, 7, 20, 0.0F, false));

        this.pectoralFin2 = new AdvancedModelRenderer(this);
        this.pectoralFin2.setRotationPoint(-3.25F, 2.3061F, 4.1524F);
        this.body.addChild(pectoralFin2);
        this.setRotateAngle(pectoralFin2, -1.2873F, -0.1153F, 0.3762F);
        this.pectoralFin2.cubeList.add(new ModelBox(pectoralFin2, 61, 128, -0.5F, -1.75F, -1.0F, 1, 3, 5, 0.0F, true));
        this.pectoralFin2.cubeList.add(new ModelBox(pectoralFin2, 0, 32, 0.0F, -4.95F, 1.25F, 0, 7, 20, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0486F, 12.4853F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 60, -4.5F, -3.625F, 0.025F, 9, 9, 8, -0.002F, false));
        this.body2.cubeList.add(new ModelBox(body2, 68, 70, -4.5F, -3.875F, 7.275F, 9, 10, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 109, 62, -3.0F, 5.6608F, 10.9309F, 6, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.9893F, 7.3244F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 103, -3.5F, 0.0F, 0.0F, 7, 3, 7, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.501F, 0.3415F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0698F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 91, 102, -3.5F, 0.0F, 0.0F, 7, 3, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 7.6858F, 10.9059F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1353F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 78, -3.0F, -2.025F, -10.975F, 6, 2, 11, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -7.5205F, 1.3341F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.48F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 75, 115, 0.0F, -5.025F, -0.25F, 0, 7, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.85F, -0.7F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 120, 94, -0.5F, -4.025F, -0.025F, 1, 4, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.0142F, 14.0059F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 82, 0, -3.5F, -3.2608F, -1.9809F, 7, 9, 7, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 91, 113, -2.5F, -2.7608F, 4.1691F, 5, 7, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 7.1799F, 2.8839F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4276F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 114, -2.0F, -2.0F, 0.0F, 4, 2, 8, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 7.675F, -0.075F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1658F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 120, 107, -2.5F, -2.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -4.2434F, 0.2802F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1484F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 38, -2.0F, 0.0F, 0.0F, 4, 3, 10, 0.0F, false));

        this.pelvicFin = new AdvancedModelRenderer(this);
        this.pelvicFin.setRotationPoint(2.25F, 2.2717F, 7.9112F);
        this.body3.addChild(pelvicFin);
        this.setRotateAngle(pelvicFin, -1.2464F, 0.1313F, -0.3712F);
        this.pelvicFin.cubeList.add(new ModelBox(pelvicFin, 70, 22, -0.5F, -1.25F, 0.0F, 1, 2, 3, 0.0F, false));
        this.pelvicFin.cubeList.add(new ModelBox(pelvicFin, 49, 0, 0.0F, -2.95F, 0.75F, 0, 5, 16, 0.0F, false));

        this.pelvicFin2 = new AdvancedModelRenderer(this);
        this.pelvicFin2.setRotationPoint(-2.25F, 2.2717F, 7.9112F);
        this.body3.addChild(pelvicFin2);
        this.setRotateAngle(pelvicFin2, -1.2464F, -0.1313F, 0.3712F);
        this.pelvicFin2.cubeList.add(new ModelBox(pelvicFin2, 70, 22, -0.5F, -1.25F, 0.0F, 1, 2, 3, 0.0F, true));
        this.pelvicFin2.cubeList.add(new ModelBox(pelvicFin2, 49, 0, 0.0F, -2.95F, 0.75F, 0, 5, 16, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0142F, 10.0441F);
        this.body3.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 35, 70, -2.0F, -2.025F, -0.975F, 4, 5, 12, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.025F, 11.025F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0698F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 92, -1.5F, 0.0F, -11.0F, 3, 1, 11, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.975F, 11.025F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1047F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 64, 88, -1.5F, -2.0F, -11.0F, 3, 2, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.05F, 11.025F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 80, 22, -1.5F, -1.35F, -1.025F, 3, 3, 12, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.35F, 10.975F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0567F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 64, 102, -1.0F, 0.0F, -11.0F, 2, 1, 11, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.65F, 10.975F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1178F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 35, 88, -1.0F, -2.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.15F, 10.975F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 114, 126, -1.0F, -1.0F, -1.025F, 2, 2, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.0F, 5.975F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0785F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 128, -1.0F, -2.0F, -6.0F, 2, 2, 6, -0.002F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.0F, 5.975F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3491F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 111, 0, 0.0F, -5.0F, -2.0F, 0, 9, 9, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 90, 127, -1.0F, 0.0F, 0.0F, 2, 2, 7, -0.002F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.0F, 5.975F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0829F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 128, 70, -1.0F, 0.0F, -6.0F, 2, 1, 6, -0.002F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 2.2659F, 12.1764F);
        this.tail3.addChild(tail4);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 4.3F, 10.2F);
        this.tail4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.096F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 101, 69, -1.0F, -1.0F, 0.0F, 1, 1, 12, -0.002F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -3.2659F, -6.2014F);
        this.tail4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3491F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -3.5F, 7.0F, 0, 7, 24, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 93, 88, -0.5F, 0.5F, 6.0F, 1, 1, 12, 0.0F, false));
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
        this.main.offsetY = -0.5F;
        this.main.offsetX = -0.45F;
        this.main.rotateAngleY = (float)Math.toRadians(230);
        this.main.rotateAngleX = (float)Math.toRadians(20);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.425F;
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
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGuizhouichthyosaurus ee = (EntityPrehistoricFloraGuizhouichthyosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGuizhouichthyosaurus entity = (EntityPrehistoricFloraGuizhouichthyosaurus) entitylivingbaseIn;
        int animCycle = 24;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {

        xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));

        }
        else if (tickAnim >= 10 && tickAnim < 15) {

        xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 10) / 5) * (-2.75-(0)));
        zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }

        else if (tickAnim >= 15 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        yy = -2.75 + (((tickAnim - 15) / 5) * (0-(-2.75)));
        zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }

        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (-2.4979-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (2.59482-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (-3.61648-(0)));
        }

        else if (tickAnim >= 10 && tickAnim < 15) {
        xx = -2.4979 + (((tickAnim - 10) / 5) * (1.76463-(-2.4979)));
        yy = 2.59482 + (((tickAnim - 10) / 5) * (6.09449-(2.59482)));
        zz = -3.61648 + (((tickAnim - 10) / 5) * (-3.3046-(-3.61648)));
        }

        else if (tickAnim >= 15 && tickAnim < 20) {
        xx = 1.76463 + (((tickAnim - 15) / 5) * (0-(1.76463)));
        yy = 6.09449 + (((tickAnim - 15) / 5) * (0-(6.09449)));
        zz = -3.3046 + (((tickAnim - 15) / 5) * (0-(-3.3046)));
        }

        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 6) {
        xx = 0 + (((tickAnim - 0) / 6) * (22.98-(0)));
        yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }

        else if (tickAnim >= 6 && tickAnim < 10) {
        xx = 22.98 + (((tickAnim - 6) / 4) * (29-(22.98)));
        yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }

        else if (tickAnim >= 10 && tickAnim < 15) {
        xx = 29 + (((tickAnim - 10) / 5) * (0-(29)));
        yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }

        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (0.75-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }

        else if (tickAnim >= 10 && tickAnim < 15) {
        xx = 0.75 + (((tickAnim - 10) / 5) * (0-(0.75)));
        yy = 0 + (((tickAnim - 10) / 5) * (-4.5-(0)));
        zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }

        else if (tickAnim >= 15 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        yy = -4.5 + (((tickAnim - 15) / 5) * (0-(-4.5)));
        zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }

        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }

        else if (tickAnim >= 10 && tickAnim < 15) {
        xx = 3.5 + (((tickAnim - 10) / 5) * (-0.50191-(3.5)));
        yy = 0 + (((tickAnim - 10) / 5) * (-4.99981-(0)));
        zz = 0 + (((tickAnim - 10) / 5) * (0.04374-(0)));
        }

        else if (tickAnim >= 15 && tickAnim < 20) {
        xx = -0.50191 + (((tickAnim - 15) / 5) * (0-(-0.50191)));
        yy = -4.99981 + (((tickAnim - 15) / 5) * (0-(-4.99981)));
        zz = 0.04374 + (((tickAnim - 15) / 5) * (0-(0.04374)));
        }

        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (2.25-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }

        else if (tickAnim >= 10 && tickAnim < 15) {
        xx = 2.25 + (((tickAnim - 10) / 5) * (-1.5007-(2.25)));
        yy = 0 + (((tickAnim - 10) / 5) * (-1.7494-(0)));
        zz = 0 + (((tickAnim - 10) / 5) * (0.04582-(0)));
        }

        else if (tickAnim >= 15 && tickAnim < 20) {
        xx = -1.5007 + (((tickAnim - 15) / 5) * (0-(-1.5007)));
        yy = -1.7494 + (((tickAnim - 15) / 5) * (0-(-1.7494)));
        zz = 0.04582 + (((tickAnim - 15) / 5) * (0-(0.04582)));
        }

        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }

        else if (tickAnim >= 10 && tickAnim < 14) {
        xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        yy = 3.5 + (((tickAnim - 10) / 4) * (0-(3.5)));
        zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }

        else if (tickAnim >= 14 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        yy = 0 + (((tickAnim - 14) / 4) * (-3.25-(0)));
        zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }

        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        yy = -3.25 + (((tickAnim - 18) / 2) * (0-(-3.25)));
        zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }

        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (9.25-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }

        else if (tickAnim >= 10 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        yy = 9.25 + (((tickAnim - 10) / 8) * (0-(9.25)));
        zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }

        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }

        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (10-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }

        else if (tickAnim >= 10 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        yy = 10 + (((tickAnim - 10) / 8) * (0-(10)));
        zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }

        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }

        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGuizhouichthyosaurus entity = (EntityPrehistoricFloraGuizhouichthyosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2));

        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 16) {
        xx = 22.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*29 + (((tickAnim - 0) / 16) * (0-(22.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*29)));
        yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(1.975+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2));

        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(-0.35);

        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*4), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-2));
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(0);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(0);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(-0.6);

        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*4), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*-2));

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*4), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-2));

        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-400))*-4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*-2));

        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-450))*4), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*-2));
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGuizhouichthyosaurus entity = (EntityPrehistoricFloraGuizhouichthyosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-0.1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);

        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-2), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-90))*-2));

        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*1), body.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(pectoralFin, pectoralFin.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-2), pectoralFin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*-3), pectoralFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*2));

        this.setRotateAngle(pectoralFin2, pectoralFin2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2), pectoralFin2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*-3), pectoralFin2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*2));

        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*3), body2.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*6), body3.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(pelvicFin, pelvicFin.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*4), pelvicFin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*4), pelvicFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-4));

        this.setRotateAngle(pelvicFin2, pelvicFin2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-4), pelvicFin2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*-4), pelvicFin2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-4));

        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*9), tail.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-190))*12), tail2.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-10));

        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*18), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*10));
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGuizhouichthyosaurus entity = (EntityPrehistoricFloraGuizhouichthyosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);

        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2));

        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), body.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(pectoralFin, pectoralFin.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2), pectoralFin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-3), pectoralFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));

        this.setRotateAngle(pectoralFin2, pectoralFin2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), pectoralFin2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-3), pectoralFin2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));

        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*7), body2.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*10), body3.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(pelvicFin, pelvicFin.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*4), pelvicFin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*4), pelvicFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4));

        this.setRotateAngle(pelvicFin2, pelvicFin2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4), pelvicFin2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-4), pelvicFin2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4));

        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*15), tail.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*18), tail2.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*25), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-10));

        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*30), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*10));
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraGuizhouichthyosaurus ee = (EntityPrehistoricFloraGuizhouichthyosaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

