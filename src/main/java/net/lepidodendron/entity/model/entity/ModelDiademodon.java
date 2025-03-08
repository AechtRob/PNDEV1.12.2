package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiademodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDiademodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer foreleg1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer foreleg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer foreleg3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer foreleg4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer foreleg5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer foreleg6;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer hat;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer mustache;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer hindleg1;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer hindleg2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer hindleg3;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer hindleg4;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer hindleg5;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer hindleg6;
    private final AdvancedModelRenderer cube_r45;

    private ModelAnimator animator;

    public ModelDiademodon() {
        this.textureWidth = 125;
        this.textureHeight = 80;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 16.2F, 10.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -4.5013F, -4.1514F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 64, -3.0F, 0.0F, 0.0F, 7, 7, 9, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.2F, -4.0F);
        this.hip.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -2.2618F, -16.1305F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -4.5F, -0.075F, 0.0F, 10, 9, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.9F, -8.1329F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 0, -4.0F, 0.0F, 0.0F, 9, 8, 8, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.0F, -16.0F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5955F, -3.5118F, -0.131F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 32, -4.0F, -0.075F, -6.0F, 9, 7, 6, 0.001F, false));

        this.foreleg1 = new AdvancedModelRenderer(this);
        this.foreleg1.setRotationPoint(3.0176F, 0.1131F, -0.3773F);
        this.chest.addChild(foreleg1);
        this.setRotateAngle(foreleg1, -2.3998F, 0.2182F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.958F, -6.0147F, 0.4363F);
        this.foreleg1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.6109F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 69, -1.6828F, 0.428F, -2.5567F, 4, 7, 4, 0.001F, false));

        this.foreleg2 = new AdvancedModelRenderer(this);
        this.foreleg2.setRotationPoint(3.758F, -4.7703F, -0.2088F);
        this.foreleg1.addChild(foreleg2);
        this.setRotateAngle(foreleg2, -0.7418F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.7F, 1.0F, -5.3F);
        this.foreleg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 67, 17, -2.19F, -6.1F, 3.7982F, 3, 5, 3, -0.001F, false));

        this.foreleg3 = new AdvancedModelRenderer(this);
        this.foreleg3.setRotationPoint(-0.0244F, -4.5193F, -0.5053F);
        this.foreleg2.addChild(foreleg3);
        this.setRotateAngle(foreleg3, -1.5708F, 0.1309F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.7F, 3.3F, -5.0F);
        this.foreleg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 8, -2.7055F, -7.2949F, 4.0F, 4, 4, 1, 0.001F, false));

        this.foreleg4 = new AdvancedModelRenderer(this);
        this.foreleg4.setRotationPoint(-3.2086F, 0.1131F, -0.3773F);
        this.chest.addChild(foreleg4);
        this.setRotateAngle(foreleg4, -2.3998F, -0.2182F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.958F, -6.0147F, 0.4363F);
        this.foreleg4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.6109F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 69, -2.3172F, 0.428F, -2.5567F, 4, 7, 4, 0.001F, true));

        this.foreleg5 = new AdvancedModelRenderer(this);
        this.foreleg5.setRotationPoint(-3.758F, -4.7703F, -0.2088F);
        this.foreleg4.addChild(foreleg5);
        this.setRotateAngle(foreleg5, -0.7418F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.7F, 1.0F, -5.3F);
        this.foreleg5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 17, -0.81F, -6.1F, 3.7982F, 3, 5, 3, -0.001F, true));

        this.foreleg6 = new AdvancedModelRenderer(this);
        this.foreleg6.setRotationPoint(0.0244F, -4.5193F, -0.5053F);
        this.foreleg5.addChild(foreleg6);
        this.setRotateAngle(foreleg6, -1.5708F, -0.1309F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.7F, 3.3F, -5.0F);
        this.foreleg6.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 8, -1.2945F, -7.2949F, 4.0F, 4, 4, 1, 0.001F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3686F, -4.6146F);
        this.chest.addChild(neck);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.2106F, -2.6171F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 40, -3.5F, -0.0008F, 0.0132F, 7, 4, 6, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.5885F, -7.7605F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 4, 21, -3.5F, 0.9992F, 4.0132F, 7, 5, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.0955F, 0.8365F, -1.8361F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1571F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.8F, -0.45F, -13.525F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 4, 7, -1.8F, -1.0496F, 0.0837F, 2, 1, 0, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 0, -2.05F, -1.0496F, 0.0837F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 0, 0.45F, -1.0496F, 0.0837F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.8F, 4.15F, -5.325F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 24, -0.35F, -5.5996F, -6.9913F, 0, 2, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 24, 1.95F, -5.5996F, -6.9913F, 0, 2, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.8F, -0.2644F, -11.2935F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0087F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 3, -0.05F, -0.8996F, 0.0337F, 0, 1, 3, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 3, 1.65F, -0.8996F, 0.0337F, 0, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.8522F, -13.7901F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 16, -6.5F, -3.5758F, 8.3632F, 13, 4, 5, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 56, -1.5F, -1.0008F, 0.0132F, 3, 1, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.8385F, -1.8826F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 45, -5.5F, 0.0242F, 0.0132F, 11, 4, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -3.7513F, 0.1155F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 50, -3.5F, 5.0242F, -6.9868F, 7, 1, 5, -0.001F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 25, -5.5F, 4.0242F, -2.5368F, 11, 1, 2, -0.002F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 29, 28, -5.5F, 0.0242F, -6.9868F, 11, 5, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.8522F, -13.7901F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5672F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 53, -1.5F, -1.0008F, 0.0132F, 3, 1, 1, 0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.2318F, -13.4796F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1571F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 29, 4, -1.5F, 0.4992F, 2.0132F, 3, 1, 3, 0.002F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 54, 40, -1.5F, -0.0008F, 0.0132F, 3, 1, 6, 0.004F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -2.2318F, -13.4796F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3316F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 66, 41, -1.5F, 0.4992F, 2.8632F, 3, 1, 4, 0.006F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.6106F, -1.8576F, -7.3646F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1765F, 1.1364F, -0.149F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 25, -1.2539F, -1.4989F, -2.3842F, 2, 3, 5, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(4.3609F, -0.7122F, -7.4773F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3542F, 0.9167F, -0.1991F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 66, 27, -0.7129F, -0.524F, -4.854F, 1, 1, 6, -0.001F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 55, -1.7129F, -0.274F, -4.854F, 2, 1, 6, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.3609F, -0.7122F, -7.4773F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3542F, -0.9167F, 0.1991F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 66, 27, -0.2871F, -0.524F, -4.854F, 1, 1, 6, -0.001F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 56, 55, -0.2871F, -0.274F, -4.854F, 2, 1, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.6106F, -1.8576F, -7.3646F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1765F, -1.1364F, 0.149F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 25, -0.7461F, -1.4989F, -2.3842F, 2, 3, 5, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, -1.5459F, -3.1448F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.0436F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 23, 1.15F, 0.1768F, -8.475F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 23, -1.15F, 0.1768F, -8.475F, 0, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.8F, 0.7453F, -5.429F);
        this.lowerjaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.1519F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 61, 34, -1.7F, -0.0008F, 0.0132F, 5, 3, 3, -0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.8F, 0.7453F, -5.429F);
        this.lowerjaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.4835F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 38, 0, -1.7F, -0.0008F, -1.9868F, 5, 4, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.1F, 2.4326F, -9.09F);
        this.lowerjaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.4835F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 17, -1.6F, -0.0008F, 0.0132F, 3, 4, 2, -0.002F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.2474F, -9.5387F);
        this.lowerjaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2705F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 0, -1.5F, -0.012F, -0.0341F, 3, 1, 1, -0.004F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.8F, 0.1014F, -8.4837F);
        this.lowerjaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1745F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 8, 16, -0.35F, -0.6746F, -1.7913F, 0, 2, 1, 0.0F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 8, 16, 1.95F, -0.6746F, -1.7913F, 0, 2, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.1471F, -10.6221F);
        this.lowerjaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.8727F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 23, -1.5F, -0.0008F, 0.0132F, 3, 2, 1, -0.003F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.1291F, -10.784F);
        this.lowerjaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0873F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 7, -1.0F, -0.5008F, 0.5132F, 2, 1, 0, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 30, 2, -1.5F, -0.0008F, 0.2632F, 3, 1, 1, -0.001F, false));

        this.hat = new AdvancedModelRenderer(this);
        this.hat.setRotationPoint(0.0F, -3.7497F, -4.0701F);
        this.head.addChild(hat);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.0016F, 4.1856F);
        this.hat.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0436F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 102, 20, -2.5F, -36.9758F, -6.9868F, 2, 3, 5, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 102, 29, 0.5F, -35.9758F, -6.9868F, 2, 2, 5, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 81, 20, -2.5F, -33.9758F, -6.9868F, 5, 33, 5, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 82, 9, -6.5F, -3.9758F, -7.9868F, 13, 3, 7, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 82, 0, -6.5F, -0.9758F, -7.9868F, 13, 1, 7, 0.0F, false));

        this.mustache = new AdvancedModelRenderer(this);
        this.mustache.setRotationPoint(0.0F, -0.9211F, -13.7684F);
        this.head.addChild(mustache);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0689F, -0.0217F);
        this.mustache.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0873F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 73, 1, -3.5F, -1.0705F, 0.0156F, 7, 2, 0, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, -2.1883F, -7.7477F);
        this.head.addChild(eye);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(2.6106F, 0.3308F, 0.3831F);
        this.eye.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1765F, 1.1364F, -0.149F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 32, -0.2289F, -0.7989F, -1.3842F, 1, 1, 2, -0.001F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-2.6106F, 0.3308F, 0.3831F);
        this.eye.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1765F, -1.1364F, 0.149F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 32, -0.7711F, -0.7989F, -1.3842F, 1, 1, 2, -0.001F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.696F, 2.8403F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -2.0F, 5.0F);
        this.tail.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 52, -1.5F, 0.5F, -5.0F, 4, 4, 6, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1644F, 5.8282F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0F, -1.5F, 2.0F);
        this.tail2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 32, 65, -0.5F, 0.5F, -2.0F, 3, 3, 5, -0.002F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1642F, 4.9575F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.0F, -2.0F, 1.95F);
        this.tail3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 62, 0.0F, 1.5F, -2.0F, 2, 2, 5, -0.004F, false));

        this.hindleg1 = new AdvancedModelRenderer(this);
        this.hindleg1.setRotationPoint(2.0F, -1.8338F, -0.3591F);
        this.hip.addChild(hindleg1);
        this.setRotateAngle(hindleg1, -0.8727F, -0.0873F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.5F, 5.25F, 0.5F);
        this.hindleg1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2618F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 18, 57, -2.0F, -5.8525F, 0.1351F, 4, 6, 5, 0.0F, false));

        this.hindleg2 = new AdvancedModelRenderer(this);
        this.hindleg2.setRotationPoint(1.0F, 4.1268F, 2.5627F);
        this.hindleg1.addChild(hindleg2);
        this.setRotateAngle(hindleg2, -2.1817F, 0.0F, 0.0F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 1.0F, -4.25F);
        this.hindleg2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 17, 72, -1.5F, -5.575F, 3.0F, 3, 5, 3, -0.001F, false));

        this.hindleg3 = new AdvancedModelRenderer(this);
        this.hindleg3.setRotationPoint(0.5F, -4.0755F, -1.0529F);
        this.hindleg2.addChild(hindleg3);
        this.setRotateAngle(hindleg3, -0.9599F, 0.0F, 0.0F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -0.0093F, 0.0033F);
        this.hindleg3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.6981F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 48, 38, -2.5F, -4.05F, -1.0F, 4, 4, 1, 0.001F, false));

        this.hindleg4 = new AdvancedModelRenderer(this);
        this.hindleg4.setRotationPoint(-2.0F, -1.8338F, -0.3591F);
        this.hip.addChild(hindleg4);
        this.setRotateAngle(hindleg4, -0.8727F, 0.0873F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.5F, 5.25F, 0.5F);
        this.hindleg4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.2618F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 18, 57, -2.0F, -5.8525F, 0.1351F, 4, 6, 5, 0.0F, true));

        this.hindleg5 = new AdvancedModelRenderer(this);
        this.hindleg5.setRotationPoint(-1.0F, 4.1268F, 2.5627F);
        this.hindleg4.addChild(hindleg5);
        this.setRotateAngle(hindleg5, -2.1817F, 0.0F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 1.0F, -4.25F);
        this.hindleg5.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 17, 72, -1.5F, -5.575F, 3.0F, 3, 5, 3, -0.001F, true));

        this.hindleg6 = new AdvancedModelRenderer(this);
        this.hindleg6.setRotationPoint(-0.5F, -4.0755F, -1.0529F);
        this.hindleg5.addChild(hindleg6);
        this.setRotateAngle(hindleg6, -0.9599F, 0.0F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, -0.0093F, 0.0033F);
        this.hindleg6.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.6981F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 48, 38, -1.5F, -4.05F, -1.0F, 4, 4, 1, 0.001F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -0.50F;
        this.hip.offsetX = 0.6F;
        this.hip.rotateAngleY = (float)Math.toRadians(130);
        this.hip.rotateAngleX = (float)Math.toRadians(0);
        this.hip.rotateAngleZ = (float)Math.toRadians(0);
        this.hip.scaleChildren = true;
        float scaler = 1.0F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
        resetToDefaultPose();

    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.3F, 0.0F, 0.0F);
        this.foreleg1.setScale(0,0,0);
        this.foreleg4.setScale(0,0,0);
        this.foreleg1.scaleChildren = true;
        this.foreleg4.scaleChildren = true;
        this.chest.offsetX = -0.0F;
        this.chest.offsetY = -0.02F;
        this.chest.offsetZ = 0.05F;
        this.chest.render(0.01F);
        this.foreleg1.setScale(1,1,1);
        this.foreleg4.setScale(1,1,1);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hip, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(neck, 0.6F, 0.1F, 0.0F);
        this.setRotateAngle(head, -0.7F, 0.1F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.4F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.2F, 0.2F, 0.0F);
        this.hip.offsetY = -0.07F;
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

        EntityPrehistoricFloraDiademodon Diademodon = (EntityPrehistoricFloraDiademodon) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (Diademodon.getAnimation() == Diademodon.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }

        if (!Diademodon.isReallyInWater()) {

            if (f3 == 0.0F || !Diademodon.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
            }

            if (Diademodon.getIsFast()) { //Running


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
        EntityPrehistoricFloraDiademodon ee = (EntityPrehistoricFloraDiademodon) entitylivingbaseIn;

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
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }


    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiademodon entity = (EntityPrehistoricFloraDiademodon) entitylivingbaseIn;
        int animCycle = 90;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 75) {
            xx = 0.5 + (((tickAnim - 25) / 50) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 25) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 50) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0.5 + (((tickAnim - 75) / 15) * (0-(0.5)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 75) {
            xx = 3.25 + (((tickAnim - 25) / 50) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 25) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 50) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 3.25 + (((tickAnim - 75) / 15) * (0-(3.25)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-55-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 75) {
            xx = -55 + (((tickAnim - 25) / 50) * (-55-(-55)));
            yy = 0 + (((tickAnim - 25) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 50) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -55 + (((tickAnim - 75) / 15) * (0-(-55)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg1, foreleg1.rotateAngleX + (float) Math.toRadians(xx), foreleg1.rotateAngleY + (float) Math.toRadians(yy), foreleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -38.75 + (((tickAnim - 12) / 13) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 25) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 50) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 75) / 8) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 75) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 8) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -42.5 + (((tickAnim - 83) / 7) * (0-(-42.5)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg2, foreleg2.rotateAngleX + (float) Math.toRadians(xx), foreleg2.rotateAngleY + (float) Math.toRadians(yy), foreleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (91.38222-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-2.97158-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (2.63644-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 91.38222 + (((tickAnim - 12) / 13) * (51.17618-(91.38222)));
            yy = -2.97158 + (((tickAnim - 12) / 13) * (-6.36767-(-2.97158)));
            zz = 2.63644 + (((tickAnim - 12) / 13) * (5.64951-(2.63644)));
        }
        else if (tickAnim >= 25 && tickAnim < 75) {
            xx = 51.17618 + (((tickAnim - 25) / 50) * (51.17618-(51.17618)));
            yy = -6.36767 + (((tickAnim - 25) / 50) * (-6.36767-(-6.36767)));
            zz = 5.64951 + (((tickAnim - 25) / 50) * (5.64951-(5.64951)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 51.17618 + (((tickAnim - 75) / 8) * (87.33809-(51.17618)));
            yy = -6.36767 + (((tickAnim - 75) / 8) * (-3.18384-(-6.36767)));
            zz = 5.64951 + (((tickAnim - 75) / 8) * (2.82475-(5.64951)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 87.33809 + (((tickAnim - 83) / 7) * (0-(87.33809)));
            yy = -3.18384 + (((tickAnim - 83) / 7) * (0-(-3.18384)));
            zz = 2.82475 + (((tickAnim - 83) / 7) * (0-(2.82475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg3, foreleg3.rotateAngleX + (float) Math.toRadians(xx), foreleg3.rotateAngleY + (float) Math.toRadians(yy), foreleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.975-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -1.175 + (((tickAnim - 12) / 13) * (0-(-1.175)));
            zz = 0.975 + (((tickAnim - 12) / 13) * (0-(0.975)));
        }
        else if (tickAnim >= 25 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 25) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 50) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 75) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 8) * (-1.775-(0)));
            zz = 0 + (((tickAnim - 75) / 8) * (0.925-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            yy = -1.775 + (((tickAnim - 83) / 7) * (0-(-1.775)));
            zz = 0.925 + (((tickAnim - 83) / 7) * (0-(0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg3.rotationPointX = this.foreleg3.rotationPointX + (float)(xx);
        this.foreleg3.rotationPointY = this.foreleg3.rotationPointY - (float)(yy);
        this.foreleg3.rotationPointZ = this.foreleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 75) {
            xx = -3.5 + (((tickAnim - 25) / 50) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 25) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 50) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -3.5 + (((tickAnim - 75) / 15) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg4, foreleg4.rotateAngleX + (float) Math.toRadians(xx), foreleg4.rotateAngleY + (float) Math.toRadians(yy), foreleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 9.25 + (((tickAnim - 25) / 13) * (10.25-(9.25)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 10.25 + (((tickAnim - 38) / 15) * (-19.0052-(10.25)));
            yy = 0 + (((tickAnim - 38) / 15) * (9.22792-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (-3.16143-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 61) {
            xx = -19.0052 + (((tickAnim - 53) / 8) * (-19.0052-(-19.0052)));
            yy = 9.22792 + (((tickAnim - 53) / 8) * (9.22792-(9.22792)));
            zz = -3.16143 + (((tickAnim - 53) / 8) * (-3.16143-(-3.16143)));
        }
        else if (tickAnim >= 61 && tickAnim < 75) {
            xx = -19.0052 + (((tickAnim - 61) / 14) * (-18.2552-(-19.0052)));
            yy = 9.22792 + (((tickAnim - 61) / 14) * (9.22792-(9.22792)));
            zz = -3.16143 + (((tickAnim - 61) / 14) * (-3.16143-(-3.16143)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -18.2552 + (((tickAnim - 75) / 15) * (0-(-18.2552)));
            yy = 9.22792 + (((tickAnim - 75) / 15) * (0-(9.22792)));
            zz = -3.16143 + (((tickAnim - 75) / 15) * (0-(-3.16143)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 9 + (((tickAnim - 25) / 3) * (9.5-(9)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 9.5 + (((tickAnim - 28) / 4) * (9-(9.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 9 + (((tickAnim - 32) / 3) * (9.5-(9)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 9.5 + (((tickAnim - 35) / 3) * (9-(9.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 9 + (((tickAnim - 38) / 8) * (30.7287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(9)));
            yy = 0 + (((tickAnim - 38) / 8) * (3.86047-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (3.08941-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 30.7287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 46) / 7) * (9.62088-(30.7287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = 3.86047 + (((tickAnim - 46) / 7) * (7.29201-(3.86047)));
            zz = 3.08941 + (((tickAnim - 46) / 7) * (5.83554-(3.08941)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 9.62088 + (((tickAnim - 53) / 2) * (8.87088-(9.62088)));
            yy = 7.29201 + (((tickAnim - 53) / 2) * (7.29201-(7.29201)));
            zz = 5.83554 + (((tickAnim - 53) / 2) * (5.83554-(5.83554)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 8.87088 + (((tickAnim - 55) / 3) * (9.62088-(8.87088)));
            yy = 7.29201 + (((tickAnim - 55) / 3) * (7.29201-(7.29201)));
            zz = 5.83554 + (((tickAnim - 55) / 3) * (5.83554-(5.83554)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 9.62088 + (((tickAnim - 58) / 2) * (8.87088-(9.62088)));
            yy = 7.29201 + (((tickAnim - 58) / 2) * (7.29201-(7.29201)));
            zz = 5.83554 + (((tickAnim - 58) / 2) * (5.83554-(5.83554)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 8.87088 + (((tickAnim - 60) / 3) * (9.62088-(8.87088)));
            yy = 7.29201 + (((tickAnim - 60) / 3) * (7.29201-(7.29201)));
            zz = 5.83554 + (((tickAnim - 60) / 3) * (5.83554-(5.83554)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 9.62088 + (((tickAnim - 63) / 12) * (9.62088-(9.62088)));
            yy = 7.29201 + (((tickAnim - 63) / 12) * (7.29201-(7.29201)));
            zz = 5.83554 + (((tickAnim - 63) / 12) * (5.83554-(5.83554)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 9.62088 + (((tickAnim - 75) / 15) * (0-(9.62088)));
            yy = 7.29201 + (((tickAnim - 75) / 15) * (0-(7.29201)));
            zz = 5.83554 + (((tickAnim - 75) / 15) * (0-(5.83554)));
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
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-30-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -30 + (((tickAnim - 28) / 4) * (0-(-30)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (-30-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -30 + (((tickAnim - 35) / 3) * (0-(-30)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 53) / 3) * (-30-(0)));
            yy = 0 + (((tickAnim - 53) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 3) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 59) {
            xx = -30 + (((tickAnim - 56) / 3) * (0-(-30)));
            yy = 0 + (((tickAnim - 56) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 3) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 59) / 4) * (-30-(0)));
            yy = 0 + (((tickAnim - 59) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 4) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = -30 + (((tickAnim - 63) / 3) * (0-(-30)));
            yy = 0 + (((tickAnim - 63) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(mustache, mustache.rotateAngleX + (float) Math.toRadians(xx), mustache.rotateAngleY + (float) Math.toRadians(yy), mustache.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 43 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 43) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 43) / 4) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 43) / 4) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = 1 + (((tickAnim - 47) / 4) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 47) / 4) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 47) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiademodon entity = (EntityPrehistoricFloraDiademodon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 9 + (((tickAnim - 10) / 8) * (-8.25-(9)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -8.25 + (((tickAnim - 18) / 2) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 12.75 + (((tickAnim - 10) / 2) * (0-(12.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (9.25-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 18) / 2) * (0-(9.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.25 + (((tickAnim - 10) / 10) * (0-(16.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (14.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 14.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 10) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-12.575-(14.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-12.575 + (((tickAnim - 18) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-12.575)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hat, hat.rotateAngleX + (float) Math.toRadians(xx), hat.rotateAngleY + (float) Math.toRadians(yy), hat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = -4.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 10) / 8) * (-8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-4.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 18) / 2) * (0-(-8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hat.rotationPointX = this.hat.rotationPointX + (float)(xx);
        this.hat.rotationPointY = this.hat.rotationPointY - (float)(yy);
        this.hat.rotationPointZ = this.hat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -22 + (((tickAnim - 10) / 8) * (15-(-22)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 18) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(mustache, mustache.rotateAngleX + (float) Math.toRadians(xx), mustache.rotateAngleY + (float) Math.toRadians(yy), mustache.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiademodon entity = (EntityPrehistoricFloraDiademodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-53.28652-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (9.55818-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-5.26393-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -53.28652 + (((tickAnim - 15) / 10) * (0.1358-(-53.28652)));
            yy = 9.55818 + (((tickAnim - 15) / 10) * (-10.21953-(9.55818)));
            zz = -5.26393 + (((tickAnim - 15) / 10) * (-3.25024-(-5.26393)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0.1358 + (((tickAnim - 25) / 10) * (-53.28652-(0.1358)));
            yy = -10.21953 + (((tickAnim - 25) / 10) * (9.55818-(-10.21953)));
            zz = -3.25024 + (((tickAnim - 25) / 10) * (-5.26393-(-3.25024)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -53.28652 + (((tickAnim - 35) / 10) * (0.1358-(-53.28652)));
            yy = 9.55818 + (((tickAnim - 35) / 10) * (-10.21953-(9.55818)));
            zz = -5.26393 + (((tickAnim - 35) / 10) * (-3.25024-(-5.26393)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.1358 + (((tickAnim - 45) / 5) * (0-(0.1358)));
            yy = -10.21953 + (((tickAnim - 45) / 5) * (0-(-10.21953)));
            zz = -3.25024 + (((tickAnim - 45) / 5) * (0-(-3.25024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg1, foreleg1.rotateAngleX + (float) Math.toRadians(xx), foreleg1.rotateAngleY + (float) Math.toRadians(yy), foreleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-31.50853-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.76462-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.6188-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -31.50853 + (((tickAnim - 8) / 7) * (14.48295-(-31.50853)));
            yy = 6.76462 + (((tickAnim - 8) / 7) * (13.52924-(6.76462)));
            zz = -0.6188 + (((tickAnim - 8) / 7) * (-1.2376-(-0.6188)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 14.48295 + (((tickAnim - 15) / 10) * (40.73295-(14.48295)));
            yy = 13.52924 + (((tickAnim - 15) / 10) * (13.52924-(13.52924)));
            zz = -1.2376 + (((tickAnim - 15) / 10) * (-1.2376-(-1.2376)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 40.73295 + (((tickAnim - 25) / 5) * (-31.50853-(40.73295)));
            yy = 13.52924 + (((tickAnim - 25) / 5) * (6.76462-(13.52924)));
            zz = -1.2376 + (((tickAnim - 25) / 5) * (-0.6188-(-1.2376)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -31.50853 + (((tickAnim - 30) / 5) * (14.48295-(-31.50853)));
            yy = 6.76462 + (((tickAnim - 30) / 5) * (13.52924-(6.76462)));
            zz = -0.6188 + (((tickAnim - 30) / 5) * (-1.2376-(-0.6188)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 14.48295 + (((tickAnim - 35) / 10) * (40.73295-(14.48295)));
            yy = 13.52924 + (((tickAnim - 35) / 10) * (13.52924-(13.52924)));
            zz = -1.2376 + (((tickAnim - 35) / 10) * (-1.2376-(-1.2376)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 40.73295 + (((tickAnim - 45) / 5) * (0-(40.73295)));
            yy = 13.52924 + (((tickAnim - 45) / 5) * (0-(13.52924)));
            zz = -1.2376 + (((tickAnim - 45) / 5) * (0-(-1.2376)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg2, foreleg2.rotateAngleX + (float) Math.toRadians(xx), foreleg2.rotateAngleY + (float) Math.toRadians(yy), foreleg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.foreleg2.rotationPointX = this.foreleg2.rotationPointX + (float)(0);
        this.foreleg2.rotationPointY = this.foreleg2.rotationPointY - (float)(0);
        this.foreleg2.rotationPointZ = this.foreleg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (90.01042-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.93156-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.1835-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 90.01042 + (((tickAnim - 8) / 7) * (38.52083-(90.01042)));
            yy = -0.93156 + (((tickAnim - 8) / 7) * (-1.86311-(-0.93156)));
            zz = 1.1835 + (((tickAnim - 8) / 7) * (2.36699-(1.1835)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 38.52083 + (((tickAnim - 15) / 5) * (0.05528-(38.52083)));
            yy = -1.86311 + (((tickAnim - 15) / 5) * (-1.29357-(-1.86311)));
            zz = 2.36699 + (((tickAnim - 15) / 5) * (-8.174-(2.36699)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.05528 + (((tickAnim - 20) / 5) * (73.27083-(0.05528)));
            yy = -1.29357 + (((tickAnim - 20) / 5) * (-1.86311-(-1.29357)));
            zz = -8.174 + (((tickAnim - 20) / 5) * (2.36699-(-8.174)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 73.27083 + (((tickAnim - 25) / 5) * (90.01042-(73.27083)));
            yy = -1.86311 + (((tickAnim - 25) / 5) * (-0.93156-(-1.86311)));
            zz = 2.36699 + (((tickAnim - 25) / 5) * (1.1835-(2.36699)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 90.01042 + (((tickAnim - 30) / 5) * (38.52083-(90.01042)));
            yy = -0.93156 + (((tickAnim - 30) / 5) * (-1.86311-(-0.93156)));
            zz = 1.1835 + (((tickAnim - 30) / 5) * (2.36699-(1.1835)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 38.52083 + (((tickAnim - 35) / 5) * (0.05528-(38.52083)));
            yy = -1.86311 + (((tickAnim - 35) / 5) * (-1.29357-(-1.86311)));
            zz = 2.36699 + (((tickAnim - 35) / 5) * (-8.174-(2.36699)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0.05528 + (((tickAnim - 40) / 5) * (73.27083-(0.05528)));
            yy = -1.29357 + (((tickAnim - 40) / 5) * (-1.86311-(-1.29357)));
            zz = -8.174 + (((tickAnim - 40) / 5) * (2.36699-(-8.174)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 73.27083 + (((tickAnim - 45) / 5) * (0-(73.27083)));
            yy = -1.86311 + (((tickAnim - 45) / 5) * (0-(-1.86311)));
            zz = 2.36699 + (((tickAnim - 45) / 5) * (0-(2.36699)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg3, foreleg3.rotateAngleX + (float) Math.toRadians(xx), foreleg3.rotateAngleY + (float) Math.toRadians(yy), foreleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.225-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -1.225 + (((tickAnim - 8) / 7) * (-0.45-(-1.225)));
            zz = 1.2 + (((tickAnim - 8) / 7) * (0-(1.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.45 + (((tickAnim - 15) / 15) * (-1.225-(-0.45)));
            zz = 0 + (((tickAnim - 15) / 15) * (1.2-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -1.225 + (((tickAnim - 30) / 5) * (-0.45-(-1.225)));
            zz = 1.2 + (((tickAnim - 30) / 5) * (0-(1.2)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -0.45 + (((tickAnim - 35) / 10) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg3.rotationPointX = this.foreleg3.rotationPointX + (float)(xx);
        this.foreleg3.rotationPointY = this.foreleg3.rotationPointY - (float)(yy);
        this.foreleg3.rotationPointZ = this.foreleg3.rotationPointZ + (float)(zz);



    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiademodon entity = (EntityPrehistoricFloraDiademodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.325-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -3.325 + (((tickAnim - 15) / 20) * (-3.325-(-3.325)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -3.325 + (((tickAnim - 35) / 15) * (0-(-3.325)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 15) / 20) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 35) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.8-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.8 + (((tickAnim - 15) / 20) * (0.8-(0.8)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.8 + (((tickAnim - 35) / 15) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-15.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -29 + (((tickAnim - 15) / 20) * (-29-(-29)));
            yy = -15.25 + (((tickAnim - 15) / 20) * (-15.25-(-15.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -29 + (((tickAnim - 35) / 15) * (0-(-29)));
            yy = -15.25 + (((tickAnim - 35) / 15) * (0-(-15.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg1, hindleg1.rotateAngleX + (float) Math.toRadians(xx), hindleg1.rotateAngleY + (float) Math.toRadians(yy), hindleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (30.23985-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (3.7371-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.31097-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 30.23985 + (((tickAnim - 15) / 20) * (30.23985-(30.23985)));
            yy = 3.7371 + (((tickAnim - 15) / 20) * (3.7371-(3.7371)));
            zz = -0.31097 + (((tickAnim - 15) / 20) * (-0.31097-(-0.31097)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 30.23985 + (((tickAnim - 35) / 15) * (0-(30.23985)));
            yy = 3.7371 + (((tickAnim - 35) / 15) * (0-(3.7371)));
            zz = -0.31097 + (((tickAnim - 35) / 15) * (0-(-0.31097)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg2, hindleg2.rotateAngleX + (float) Math.toRadians(xx), hindleg2.rotateAngleY + (float) Math.toRadians(yy), hindleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.375 + (((tickAnim - 15) / 20) * (0.375-(0.375)));
            zz = -1.125 + (((tickAnim - 15) / 20) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.375 + (((tickAnim - 35) / 15) * (0-(0.375)));
            zz = -1.125 + (((tickAnim - 35) / 15) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg2.rotationPointX = this.hindleg2.rotationPointX + (float)(xx);
        this.hindleg2.rotationPointY = this.hindleg2.rotationPointY - (float)(yy);
        this.hindleg2.rotationPointZ = this.hindleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 15) / 20) * (3-(3)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 35) / 15) * (0-(3)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg3, hindleg3.rotateAngleX + (float) Math.toRadians(xx), hindleg3.rotateAngleY + (float) Math.toRadians(yy), hindleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (15.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -29 + (((tickAnim - 15) / 20) * (-29-(-29)));
            yy = 15.25 + (((tickAnim - 15) / 20) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -29 + (((tickAnim - 35) / 15) * (0-(-29)));
            yy = 15.25 + (((tickAnim - 35) / 15) * (0-(15.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg4, hindleg4.rotateAngleX + (float) Math.toRadians(xx), hindleg4.rotateAngleY + (float) Math.toRadians(yy), hindleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (30.23985-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (3.7371-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.31097-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 30.23985 + (((tickAnim - 15) / 20) * (30.23985-(30.23985)));
            yy = 3.7371 + (((tickAnim - 15) / 20) * (3.7371-(3.7371)));
            zz = -0.31097 + (((tickAnim - 15) / 20) * (-0.31097-(-0.31097)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 30.23985 + (((tickAnim - 35) / 15) * (0-(30.23985)));
            yy = 3.7371 + (((tickAnim - 35) / 15) * (0-(3.7371)));
            zz = -0.31097 + (((tickAnim - 35) / 15) * (0-(-0.31097)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg5, hindleg5.rotateAngleX + (float) Math.toRadians(xx), hindleg5.rotateAngleY + (float) Math.toRadians(yy), hindleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.375 + (((tickAnim - 15) / 20) * (0.375-(0.375)));
            zz = -1.125 + (((tickAnim - 15) / 20) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.375 + (((tickAnim - 35) / 15) * (0-(0.375)));
            zz = -1.125 + (((tickAnim - 35) / 15) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg5.rotationPointX = this.hindleg5.rotationPointX + (float)(xx);
        this.hindleg5.rotationPointY = this.hindleg5.rotationPointY - (float)(yy);
        this.hindleg5.rotationPointZ = this.hindleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 15) / 20) * (3-(3)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 35) / 15) * (0-(3)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg6, hindleg6.rotateAngleX + (float) Math.toRadians(xx), hindleg6.rotateAngleY + (float) Math.toRadians(yy), hindleg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.75 + (((tickAnim - 15) / 20) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 35) / 15) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 15) / 20) * (1-(1)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 1 + (((tickAnim - 35) / 4) * (-9.78-(1)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -9.78 + (((tickAnim - 39) / 11) * (0-(-9.78)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4.75 + (((tickAnim - 15) / 20) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 4.75 + (((tickAnim - 35) / 8) * (-11.62-(4.75)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -11.62 + (((tickAnim - 43) / 7) * (0-(-11.62)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiademodon entity = (EntityPrehistoricFloraDiademodon) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7.75 + (((tickAnim - 13) / 12) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 15.75 + (((tickAnim - 13) / 6) * (0-(15.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 13) / 12) * (0-(-7)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 15.5 + (((tickAnim - 13) / 12) * (0-(15.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hat, hat.rotateAngleX + (float) Math.toRadians(xx), hat.rotateAngleY + (float) Math.toRadians(yy), hat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.2))*5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.2))*5 + (((tickAnim - 3) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.2))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(mustache, mustache.rotateAngleX + (float) Math.toRadians(xx), mustache.rotateAngleY + (float) Math.toRadians(yy), mustache.rotateAngleZ + (float) Math.toRadians(zz));

        

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiademodon entity = (EntityPrehistoricFloraDiademodon) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -58 + (((tickAnim - 0) / 12) * (13.42989-(-58)));
            yy = 0 + (((tickAnim - 0) / 12) * (-7.6341-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (6.1401-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 13.42989 + (((tickAnim - 12) / 6) * (-29.76333-(13.42989)));
            yy = -7.6341 + (((tickAnim - 12) / 6) * (5.50128-(-7.6341)));
            zz = 6.1401 + (((tickAnim - 12) / 6) * (-28.45509-(6.1401)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -29.76333 + (((tickAnim - 18) / 7) * (-58-(-29.76333)));
            yy = 5.50128 + (((tickAnim - 18) / 7) * (0-(5.50128)));
            zz = -28.45509 + (((tickAnim - 18) / 7) * (0-(-28.45509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg1, foreleg1.rotateAngleX + (float) Math.toRadians(xx), foreleg1.rotateAngleY + (float) Math.toRadians(yy), foreleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 13.80392 + (((tickAnim - 0) / 12) * (24.75-(13.80392)));
            yy = 4.0372 + (((tickAnim - 0) / 12) * (0-(4.0372)));
            zz = 8.60662 + (((tickAnim - 0) / 12) * (0-(8.60662)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 24.75 + (((tickAnim - 12) / 6) * (-12.04962-(24.75)));
            yy = 0 + (((tickAnim - 12) / 6) * (-0.55074-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-1.66832-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -12.04962 + (((tickAnim - 18) / 4) * (-11.40728-(-12.04962)));
            yy = -0.55074 + (((tickAnim - 18) / 4) * (5.78636-(-0.55074)));
            zz = -1.66832 + (((tickAnim - 18) / 4) * (13.04993-(-1.66832)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -11.40728 + (((tickAnim - 22) / 3) * (13.80392-(-11.40728)));
            yy = 5.78636 + (((tickAnim - 22) / 3) * (4.0372-(5.78636)));
            zz = 13.04993 + (((tickAnim - 22) / 3) * (8.60662-(13.04993)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg2, foreleg2.rotateAngleX + (float) Math.toRadians(xx), foreleg2.rotateAngleY + (float) Math.toRadians(yy), foreleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -0.375 + (((tickAnim - 5) / 7) * (0-(-0.375)));
            yy = -0.575 + (((tickAnim - 5) / 7) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.025 + (((tickAnim - 18) / 7) * (0-(-0.025)));
            yy = -0.725 + (((tickAnim - 18) / 7) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg2.rotationPointX = this.foreleg2.rotationPointX + (float)(xx);
        this.foreleg2.rotationPointY = this.foreleg2.rotationPointY - (float)(yy);
        this.foreleg2.rotationPointZ = this.foreleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 46.82902 + (((tickAnim - 0) / 5) * (6.83087-(46.82902)));
            yy = 1.27813 + (((tickAnim - 0) / 5) * (0.73036-(1.27813)));
            zz = -1.20754 + (((tickAnim - 0) / 5) * (-0.69003-(-1.20754)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6.83087 + (((tickAnim - 5) / 3) * (-0.95956-(6.83087)));
            yy = 0.73036 + (((tickAnim - 5) / 3) * (0.36518-(0.73036)));
            zz = -0.69003 + (((tickAnim - 5) / 3) * (-0.34501-(-0.69003)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.95956 + (((tickAnim - 8) / 4) * (70.75-(-0.95956)));
            yy = 0.36518 + (((tickAnim - 8) / 4) * (0-(0.36518)));
            zz = -0.34501 + (((tickAnim - 8) / 4) * (0-(-0.34501)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 70.75 + (((tickAnim - 12) / 6) * (104.78951-(70.75)));
            yy = 0 + (((tickAnim - 12) / 6) * (0.63907-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-0.60377-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 104.78951 + (((tickAnim - 18) / 4) * (85.55927-(104.78951)));
            yy = 0.63907 + (((tickAnim - 18) / 4) * (0.9586-(0.63907)));
            zz = -0.60377 + (((tickAnim - 18) / 4) * (-0.90566-(-0.60377)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 85.55927 + (((tickAnim - 22) / 3) * (46.82902-(85.55927)));
            yy = 0.9586 + (((tickAnim - 22) / 3) * (1.27813-(0.9586)));
            zz = -0.90566 + (((tickAnim - 22) / 3) * (-1.20754-(-0.90566)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg3, foreleg3.rotateAngleX + (float) Math.toRadians(xx), foreleg3.rotateAngleY + (float) Math.toRadians(yy), foreleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 12) * (-0.65-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.375-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = -0.65 + (((tickAnim - 12) / 6) * (-0.94-(-0.65)));
            zz = 0.375 + (((tickAnim - 12) / 6) * (1.29-(0.375)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -0.94 + (((tickAnim - 18) / 4) * (-1.05-(-0.94)));
            zz = 1.29 + (((tickAnim - 18) / 4) * (0.95-(1.29)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -1.05 + (((tickAnim - 22) / 3) * (-0.425-(-1.05)));
            zz = 0.95 + (((tickAnim - 22) / 3) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg3.rotationPointX = this.foreleg3.rotationPointX + (float)(xx);
        this.foreleg3.rotationPointY = this.foreleg3.rotationPointY - (float)(yy);
        this.foreleg3.rotationPointZ = this.foreleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13.42989 + (((tickAnim - 0) / 5) * (-27.32185-(13.42989)));
            yy = 7.63411 + (((tickAnim - 0) / 5) * (-6.7943-(7.63411)));
            zz = -6.14014 + (((tickAnim - 0) / 5) * (28.30585-(-6.14014)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -27.32185 + (((tickAnim - 5) / 7) * (-58-(-27.32185)));
            yy = -6.7943 + (((tickAnim - 5) / 7) * (0-(-6.7943)));
            zz = 28.30585 + (((tickAnim - 5) / 7) * (0-(28.30585)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -58 + (((tickAnim - 12) / 13) * (13.42989-(-58)));
            yy = 0 + (((tickAnim - 12) / 13) * (7.63411-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (-6.14014-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg4, foreleg4.rotateAngleX + (float) Math.toRadians(xx), foreleg4.rotateAngleY + (float) Math.toRadians(yy), foreleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 24.75 + (((tickAnim - 0) / 8) * (-11.17006-(24.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (-3.10554-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-6.62046-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -11.17006 + (((tickAnim - 8) / 4) * (13.80392-(-11.17006)));
            yy = -3.10554 + (((tickAnim - 8) / 4) * (-4.0372-(-3.10554)));
            zz = -6.62046 + (((tickAnim - 8) / 4) * (-8.6066-(-6.62046)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 13.80392 + (((tickAnim - 12) / 13) * (24.75-(13.80392)));
            yy = -4.0372 + (((tickAnim - 12) / 13) * (0-(-4.0372)));
            zz = -8.6066 + (((tickAnim - 12) / 13) * (0-(-8.6066)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg5, foreleg5.rotateAngleX + (float) Math.toRadians(xx), foreleg5.rotateAngleY + (float) Math.toRadians(yy), foreleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -1.1 + (((tickAnim - 5) / 7) * (0-(-1.1)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.9 + (((tickAnim - 18) / 7) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg5.rotationPointX = this.foreleg5.rotationPointX + (float)(xx);
        this.foreleg5.rotationPointY = this.foreleg5.rotationPointY - (float)(yy);
        this.foreleg5.rotationPointZ = this.foreleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 70.75 + (((tickAnim - 0) / 3) * (106.72977-(70.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.29495-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.27866-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 106.72977 + (((tickAnim - 3) / 2) * (85.70955-(106.72977)));
            yy = -0.29495 + (((tickAnim - 3) / 2) * (-0.58989-(-0.29495)));
            zz = -0.27866 + (((tickAnim - 3) / 2) * (-0.55733-(-0.27866)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 85.70955 + (((tickAnim - 5) / 3) * (100.24211-(85.70955)));
            yy = -0.58989 + (((tickAnim - 5) / 3) * (-0.98315-(-0.58989)));
            zz = -0.55733 + (((tickAnim - 5) / 3) * (-0.92888-(-0.55733)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 100.24211 + (((tickAnim - 8) / 4) * (46.82902-(100.24211)));
            yy = -0.98315 + (((tickAnim - 8) / 4) * (-1.2781-(-0.98315)));
            zz = -0.92888 + (((tickAnim - 8) / 4) * (-1.20754-(-0.92888)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 46.82902 + (((tickAnim - 12) / 6) * (3.19307-(46.82902)));
            yy = -1.2781 + (((tickAnim - 12) / 6) * (-0.60146-(-1.2781)));
            zz = -1.20754 + (((tickAnim - 12) / 6) * (-0.56826-(-1.20754)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 3.19307 + (((tickAnim - 18) / 4) * (1.47153-(3.19307)));
            yy = -0.60146 + (((tickAnim - 18) / 4) * (-0.30073-(-0.60146)));
            zz = -0.56826 + (((tickAnim - 18) / 4) * (-0.28413-(-0.56826)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 1.47153 + (((tickAnim - 22) / 3) * (70.75-(1.47153)));
            yy = -0.30073 + (((tickAnim - 22) / 3) * (0-(-0.30073)));
            zz = -0.28413 + (((tickAnim - 22) / 3) * (0-(-0.28413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg6, foreleg6.rotateAngleX + (float) Math.toRadians(xx), foreleg6.rotateAngleY + (float) Math.toRadians(yy), foreleg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.65 + (((tickAnim - 0) / 3) * (-1.625-(-0.65)));
            zz = 0.375 + (((tickAnim - 0) / 3) * (0.955-(0.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.625 + (((tickAnim - 3) / 2) * (-1.15-(-1.625)));
            zz = 0.955 + (((tickAnim - 3) / 2) * (0.675-(0.955)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -1.15 + (((tickAnim - 5) / 3) * (-0.74-(-1.15)));
            zz = 0.675 + (((tickAnim - 5) / 3) * (1.14-(0.675)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.74 + (((tickAnim - 8) / 4) * (-0.425-(-0.74)));
            zz = 1.14 + (((tickAnim - 8) / 4) * (0-(1.14)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 12) / 2) * (-0.795-(-0.425)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -0.795 + (((tickAnim - 14) / 4) * (0-(-0.795)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0.375-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg6.rotationPointX = this.foreleg6.rotationPointX + (float)(xx);
        this.foreleg6.rotationPointY = this.foreleg6.rotationPointY - (float)(yy);
        this.foreleg6.rotationPointZ = this.foreleg6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 45 + (((tickAnim - 0) / 7) * (5.75-(45)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 5.75 + (((tickAnim - 7) / 3) * (-8.5-(5.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -8.5 + (((tickAnim - 10) / 15) * (45-(-8.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg1, hindleg1.rotateAngleX + (float) Math.toRadians(xx), hindleg1.rotateAngleY + (float) Math.toRadians(yy), hindleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 10) * (0-(-0.425)));
            zz = -0.35 + (((tickAnim - 0) / 10) * (0-(-0.35)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg1.rotationPointX = this.hindleg1.rotationPointX + (float)(xx);
        this.hindleg1.rotationPointY = this.hindleg1.rotationPointY - (float)(yy);
        this.hindleg1.rotationPointZ = this.hindleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.75 + (((tickAnim - 0) / 5) * (10.25-(14.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 5) / 5) * (-11.25-(10.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -11.25 + (((tickAnim - 10) / 15) * (14.75-(-11.25)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg2, hindleg2.rotateAngleX + (float) Math.toRadians(xx), hindleg2.rotateAngleY + (float) Math.toRadians(yy), hindleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 3) * (1.125-(0.375)));
            zz = 0.18 + (((tickAnim - 0) / 3) * (-0.485-(0.18)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 3) / 2) * (0.94-(1.125)));
            zz = -0.485 + (((tickAnim - 3) / 2) * (-0.295-(-0.485)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.94 + (((tickAnim - 5) / 5) * (-0.3-(0.94)));
            zz = -0.295 + (((tickAnim - 5) / 5) * (0.33-(-0.295)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 10) / 15) * (0.375-(-0.3)));
            zz = 0.33 + (((tickAnim - 10) / 15) * (0.18-(0.33)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg2.rotationPointX = this.hindleg2.rotationPointX + (float)(xx);
        this.hindleg2.rotationPointY = this.hindleg2.rotationPointY - (float)(yy);
        this.hindleg2.rotationPointZ = this.hindleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 0) / 10) * (19-(40)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 19 + (((tickAnim - 10) / 5) * (-5.46-(19)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -5.46 + (((tickAnim - 15) / 6) * (2.06-(-5.46)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 2.06 + (((tickAnim - 21) / 4) * (40-(2.06)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg3, hindleg3.rotateAngleX + (float) Math.toRadians(xx), hindleg3.rotateAngleY + (float) Math.toRadians(yy), hindleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 3) * (-1.425-(-0.3)));
            zz = 0.35 + (((tickAnim - 0) / 3) * (0.27-(0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.425 + (((tickAnim - 3) / 2) * (-0.795-(-1.425)));
            zz = 0.27 + (((tickAnim - 3) / 2) * (0.18-(0.27)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.795 + (((tickAnim - 5) / 5) * (-0.245-(-0.795)));
            zz = 0.18 + (((tickAnim - 5) / 5) * (0-(0.18)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.245 + (((tickAnim - 10) / 5) * (0-(-0.245)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg3.rotationPointX = this.hindleg3.rotationPointX + (float)(xx);
        this.hindleg3.rotationPointY = this.hindleg3.rotationPointY - (float)(yy);
        this.hindleg3.rotationPointZ = this.hindleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-0.5), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-60))*2), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*1.5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-0.25);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*0.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*1.5), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-30))*-0.08);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*1.5), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*-2));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -8.5 + (((tickAnim - 0) / 11) * (45-(-8.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 45 + (((tickAnim - 11) / 14) * (-8.5-(45)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg4, hindleg4.rotateAngleX + (float) Math.toRadians(xx), hindleg4.rotateAngleY + (float) Math.toRadians(yy), hindleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.35-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = -0.425 + (((tickAnim - 11) / 14) * (0-(-0.425)));
            zz = -0.35 + (((tickAnim - 11) / 14) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg4.rotationPointX = this.hindleg4.rotationPointX + (float)(xx);
        this.hindleg4.rotationPointY = this.hindleg4.rotationPointY - (float)(yy);
        this.hindleg4.rotationPointZ = this.hindleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -11.25 + (((tickAnim - 0) / 11) * (14.75-(-11.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 14.75 + (((tickAnim - 11) / 10) * (-24.71-(14.75)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -24.71 + (((tickAnim - 21) / 4) * (-11.25-(-24.71)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg5, hindleg5.rotateAngleX + (float) Math.toRadians(xx), hindleg5.rotateAngleY + (float) Math.toRadians(yy), hindleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 11) * (0.375-(-0.3)));
            zz = 0.33 + (((tickAnim - 0) / 11) * (0.18-(0.33)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 11) / 6) * (1.925-(0.375)));
            zz = 0.18 + (((tickAnim - 11) / 6) * (-0.37-(0.18)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 1.925 + (((tickAnim - 17) / 4) * (1.11-(1.925)));
            zz = -0.37 + (((tickAnim - 17) / 4) * (-0.11-(-0.37)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 1.11 + (((tickAnim - 21) / 4) * (-0.3-(1.11)));
            zz = -0.11 + (((tickAnim - 21) / 4) * (0.33-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg5.rotationPointX = this.hindleg5.rotationPointX + (float)(xx);
        this.hindleg5.rotationPointY = this.hindleg5.rotationPointY - (float)(yy);
        this.hindleg5.rotationPointZ = this.hindleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 19 + (((tickAnim - 0) / 4) * (0.33-(19)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0.33 + (((tickAnim - 4) / 7) * (40-(0.33)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 40 + (((tickAnim - 11) / 14) * (19-(40)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg6, hindleg6.rotateAngleX + (float) Math.toRadians(xx), hindleg6.rotateAngleY + (float) Math.toRadians(yy), hindleg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.245 + (((tickAnim - 0) / 11) * (-0.3-(-0.245)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.35-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = -0.3 + (((tickAnim - 11) / 6) * (-0.88-(-0.3)));
            zz = 0.35 + (((tickAnim - 11) / 6) * (0.21-(0.35)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -0.88 + (((tickAnim - 17) / 8) * (-0.245-(-0.88)));
            zz = 0.21 + (((tickAnim - 17) / 8) * (0-(0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg6.rotationPointX = this.hindleg6.rotationPointX + (float)(xx);
        this.hindleg6.rotationPointY = this.hindleg6.rotationPointY - (float)(yy);
        this.hindleg6.rotationPointZ = this.hindleg6.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-140))*7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*1.5));


        this.setRotateAngle(hat, hat.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+120))*-3), hat.rotateAngleY + (float) Math.toRadians(0), hat.rotateAngleZ + (float) Math.toRadians(0));
        this.hat.rotationPointX = this.hat.rotationPointX + (float)(0);
        this.hat.rotationPointY = this.hat.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+30))*-0.2);
        this.hat.rotationPointZ = this.hat.rotationPointZ + (float)(0);


        this.setRotateAngle(mustache, mustache.rotateAngleX + (float) Math.toRadians(0), mustache.rotateAngleY + (float) Math.toRadians(0), mustache.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*5));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiademodon entity = (EntityPrehistoricFloraDiademodon) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -58 + (((tickAnim - 0) / 7) * (13.42989-(-58)));
            yy = 0 + (((tickAnim - 0) / 7) * (-7.6341-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (6.1401-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 13.42989 + (((tickAnim - 7) / 4) * (-29.76333-(13.42989)));
            yy = -7.6341 + (((tickAnim - 7) / 4) * (5.50128-(-7.6341)));
            zz = 6.1401 + (((tickAnim - 7) / 4) * (-28.45509-(6.1401)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -29.76333 + (((tickAnim - 11) / 4) * (-58-(-29.76333)));
            yy = 5.50128 + (((tickAnim - 11) / 4) * (0-(5.50128)));
            zz = -28.45509 + (((tickAnim - 11) / 4) * (0-(-28.45509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg1, foreleg1.rotateAngleX + (float) Math.toRadians(xx), foreleg1.rotateAngleY + (float) Math.toRadians(yy), foreleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 13.80392 + (((tickAnim - 0) / 7) * (24.75-(13.80392)));
            yy = 4.0372 + (((tickAnim - 0) / 7) * (0-(4.0372)));
            zz = 8.60662 + (((tickAnim - 0) / 7) * (0-(8.60662)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 24.75 + (((tickAnim - 7) / 4) * (-12.04962-(24.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (-0.55074-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-1.66832-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.04962 + (((tickAnim - 11) / 2) * (-11.40728-(-12.04962)));
            yy = -0.55074 + (((tickAnim - 11) / 2) * (5.78636-(-0.55074)));
            zz = -1.66832 + (((tickAnim - 11) / 2) * (13.04993-(-1.66832)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -11.40728 + (((tickAnim - 13) / 2) * (13.80392-(-11.40728)));
            yy = 5.78636 + (((tickAnim - 13) / 2) * (4.0372-(5.78636)));
            zz = 13.04993 + (((tickAnim - 13) / 2) * (8.60662-(13.04993)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg2, foreleg2.rotateAngleX + (float) Math.toRadians(xx), foreleg2.rotateAngleY + (float) Math.toRadians(yy), foreleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.375 + (((tickAnim - 3) / 4) * (0-(-0.375)));
            yy = -0.575 + (((tickAnim - 3) / 4) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.025 + (((tickAnim - 11) / 4) * (0-(-0.025)));
            yy = -0.725 + (((tickAnim - 11) / 4) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg2.rotationPointX = this.foreleg2.rotationPointX + (float)(xx);
        this.foreleg2.rotationPointY = this.foreleg2.rotationPointY - (float)(yy);
        this.foreleg2.rotationPointZ = this.foreleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.82902 + (((tickAnim - 0) / 3) * (6.83087-(46.82902)));
            yy = 1.27813 + (((tickAnim - 0) / 3) * (0.73036-(1.27813)));
            zz = -1.20754 + (((tickAnim - 0) / 3) * (-0.69003-(-1.20754)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 6.83087 + (((tickAnim - 3) / 1) * (-0.95956-(6.83087)));
            yy = 0.73036 + (((tickAnim - 3) / 1) * (0.36518-(0.73036)));
            zz = -0.69003 + (((tickAnim - 3) / 1) * (-0.34501-(-0.69003)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -0.95956 + (((tickAnim - 4) / 3) * (70.75-(-0.95956)));
            yy = 0.36518 + (((tickAnim - 4) / 3) * (0-(0.36518)));
            zz = -0.34501 + (((tickAnim - 4) / 3) * (0-(-0.34501)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 70.75 + (((tickAnim - 7) / 4) * (104.78951-(70.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (0.63907-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-0.60377-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 104.78951 + (((tickAnim - 11) / 2) * (85.55927-(104.78951)));
            yy = 0.63907 + (((tickAnim - 11) / 2) * (0.9586-(0.63907)));
            zz = -0.60377 + (((tickAnim - 11) / 2) * (-0.90566-(-0.60377)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 85.55927 + (((tickAnim - 13) / 2) * (46.82902-(85.55927)));
            yy = 0.9586 + (((tickAnim - 13) / 2) * (1.27813-(0.9586)));
            zz = -0.90566 + (((tickAnim - 13) / 2) * (-1.20754-(-0.90566)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg3, foreleg3.rotateAngleX + (float) Math.toRadians(xx), foreleg3.rotateAngleY + (float) Math.toRadians(yy), foreleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 7) * (-0.65-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.375-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -0.65 + (((tickAnim - 7) / 4) * (-0.94-(-0.65)));
            zz = 0.375 + (((tickAnim - 7) / 4) * (1.29-(0.375)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.94 + (((tickAnim - 11) / 2) * (-1.05-(-0.94)));
            zz = 1.29 + (((tickAnim - 11) / 2) * (0.95-(1.29)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -1.05 + (((tickAnim - 13) / 2) * (-0.425-(-1.05)));
            zz = 0.95 + (((tickAnim - 13) / 2) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg3.rotationPointX = this.foreleg3.rotationPointX + (float)(xx);
        this.foreleg3.rotationPointY = this.foreleg3.rotationPointY - (float)(yy);
        this.foreleg3.rotationPointZ = this.foreleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.42989 + (((tickAnim - 0) / 3) * (-27.32185-(13.42989)));
            yy = 7.63411 + (((tickAnim - 0) / 3) * (-6.7943-(7.63411)));
            zz = -6.14014 + (((tickAnim - 0) / 3) * (28.30585-(-6.14014)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -27.32185 + (((tickAnim - 3) / 4) * (-58-(-27.32185)));
            yy = -6.7943 + (((tickAnim - 3) / 4) * (0-(-6.7943)));
            zz = 28.30585 + (((tickAnim - 3) / 4) * (0-(28.30585)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -58 + (((tickAnim - 7) / 8) * (13.42989-(-58)));
            yy = 0 + (((tickAnim - 7) / 8) * (7.63411-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (-6.14014-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg4, foreleg4.rotateAngleX + (float) Math.toRadians(xx), foreleg4.rotateAngleY + (float) Math.toRadians(yy), foreleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 24.75 + (((tickAnim - 0) / 5) * (-11.17006-(24.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.10554-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-6.62046-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -11.17006 + (((tickAnim - 5) / 2) * (13.80392-(-11.17006)));
            yy = -3.10554 + (((tickAnim - 5) / 2) * (-4.0372-(-3.10554)));
            zz = -6.62046 + (((tickAnim - 5) / 2) * (-8.6066-(-6.62046)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 13.80392 + (((tickAnim - 7) / 8) * (24.75-(13.80392)));
            yy = -4.0372 + (((tickAnim - 7) / 8) * (0-(-4.0372)));
            zz = -8.6066 + (((tickAnim - 7) / 8) * (0-(-8.6066)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg5, foreleg5.rotateAngleX + (float) Math.toRadians(xx), foreleg5.rotateAngleY + (float) Math.toRadians(yy), foreleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -1.1 + (((tickAnim - 3) / 4) * (0-(-1.1)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.9 + (((tickAnim - 11) / 4) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg5.rotationPointX = this.foreleg5.rotationPointX + (float)(xx);
        this.foreleg5.rotationPointY = this.foreleg5.rotationPointY - (float)(yy);
        this.foreleg5.rotationPointZ = this.foreleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 70.75 + (((tickAnim - 0) / 2) * (106.72977-(70.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.29495-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.27866-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 106.72977 + (((tickAnim - 2) / 1) * (85.70955-(106.72977)));
            yy = -0.29495 + (((tickAnim - 2) / 1) * (-0.58989-(-0.29495)));
            zz = -0.27866 + (((tickAnim - 2) / 1) * (-0.55733-(-0.27866)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 85.70955 + (((tickAnim - 3) / 2) * (100.24211-(85.70955)));
            yy = -0.58989 + (((tickAnim - 3) / 2) * (-0.98315-(-0.58989)));
            zz = -0.55733 + (((tickAnim - 3) / 2) * (-0.92888-(-0.55733)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 100.24211 + (((tickAnim - 5) / 2) * (46.82902-(100.24211)));
            yy = -0.98315 + (((tickAnim - 5) / 2) * (-1.2781-(-0.98315)));
            zz = -0.92888 + (((tickAnim - 5) / 2) * (-1.20754-(-0.92888)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 46.82902 + (((tickAnim - 7) / 4) * (3.19307-(46.82902)));
            yy = -1.2781 + (((tickAnim - 7) / 4) * (-0.60146-(-1.2781)));
            zz = -1.20754 + (((tickAnim - 7) / 4) * (-0.56826-(-1.20754)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 3.19307 + (((tickAnim - 11) / 2) * (1.47153-(3.19307)));
            yy = -0.60146 + (((tickAnim - 11) / 2) * (-0.30073-(-0.60146)));
            zz = -0.56826 + (((tickAnim - 11) / 2) * (-0.28413-(-0.56826)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.47153 + (((tickAnim - 13) / 2) * (70.75-(1.47153)));
            yy = -0.30073 + (((tickAnim - 13) / 2) * (0-(-0.30073)));
            zz = -0.28413 + (((tickAnim - 13) / 2) * (0-(-0.28413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(foreleg6, foreleg6.rotateAngleX + (float) Math.toRadians(xx), foreleg6.rotateAngleY + (float) Math.toRadians(yy), foreleg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.65 + (((tickAnim - 0) / 2) * (-1.625-(-0.65)));
            zz = 0.375 + (((tickAnim - 0) / 2) * (0.955-(0.375)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -1.625 + (((tickAnim - 2) / 1) * (-1.15-(-1.625)));
            zz = 0.955 + (((tickAnim - 2) / 1) * (0.675-(0.955)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.15 + (((tickAnim - 3) / 2) * (-0.74-(-1.15)));
            zz = 0.675 + (((tickAnim - 3) / 2) * (1.14-(0.675)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.74 + (((tickAnim - 5) / 2) * (-0.425-(-0.74)));
            zz = 1.14 + (((tickAnim - 5) / 2) * (0-(1.14)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.425 + (((tickAnim - 7) / 1) * (-0.795-(-0.425)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.795 + (((tickAnim - 8) / 3) * (0-(-0.795)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.375-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.foreleg6.rotationPointX = this.foreleg6.rotationPointX + (float)(xx);
        this.foreleg6.rotationPointY = this.foreleg6.rotationPointY - (float)(yy);
        this.foreleg6.rotationPointZ = this.foreleg6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 45 + (((tickAnim - 0) / 4) * (-3.75-(45)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -3.75 + (((tickAnim - 4) / 2) * (-15.25-(-3.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -15.25 + (((tickAnim - 6) / 9) * (45-(-15.25)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg1, hindleg1.rotateAngleX + (float) Math.toRadians(xx), hindleg1.rotateAngleY + (float) Math.toRadians(yy), hindleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 6) * (0-(-0.425)));
            zz = -0.35 + (((tickAnim - 0) / 6) * (0-(-0.35)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 9) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg1.rotationPointX = this.hindleg1.rotationPointX + (float)(xx);
        this.hindleg1.rotationPointY = this.hindleg1.rotationPointY - (float)(yy);
        this.hindleg1.rotationPointZ = this.hindleg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.75 + (((tickAnim - 0) / 3) * (-17.5-(14.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -17.5 + (((tickAnim - 3) / 3) * (-3.25-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -3.25 + (((tickAnim - 6) / 9) * (14.75-(-3.25)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg2, hindleg2.rotateAngleX + (float) Math.toRadians(xx), hindleg2.rotateAngleY + (float) Math.toRadians(yy), hindleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 2) * (1.125-(0.375)));
            zz = 0.18 + (((tickAnim - 0) / 2) * (-0.485-(0.18)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.125 + (((tickAnim - 2) / 1) * (1.215-(1.125)));
            zz = -0.485 + (((tickAnim - 2) / 1) * (-0.295-(-0.485)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.215 + (((tickAnim - 3) / 3) * (-0.625-(1.215)));
            zz = -0.295 + (((tickAnim - 3) / 3) * (0.33-(-0.295)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = -0.625 + (((tickAnim - 6) / 9) * (0.375-(-0.625)));
            zz = 0.33 + (((tickAnim - 6) / 9) * (0.18-(0.33)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg2.rotationPointX = this.hindleg2.rotationPointX + (float)(xx);
        this.hindleg2.rotationPointY = this.hindleg2.rotationPointY - (float)(yy);
        this.hindleg2.rotationPointZ = this.hindleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 40 + (((tickAnim - 0) / 6) * (16.75-(40)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 16.75 + (((tickAnim - 6) / 3) * (-5.46-(16.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5.46 + (((tickAnim - 9) / 4) * (2.06-(-5.46)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.06 + (((tickAnim - 13) / 2) * (40-(2.06)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg3, hindleg3.rotateAngleX + (float) Math.toRadians(xx), hindleg3.rotateAngleY + (float) Math.toRadians(yy), hindleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 2) * (-1.425-(-0.3)));
            zz = 0.35 + (((tickAnim - 0) / 2) * (0.27-(0.35)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -1.425 + (((tickAnim - 2) / 1) * (-0.795-(-1.425)));
            zz = 0.27 + (((tickAnim - 2) / 1) * (0.18-(0.27)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.795 + (((tickAnim - 3) / 3) * (-0.07-(-0.795)));
            zz = 0.18 + (((tickAnim - 3) / 3) * (0-(0.18)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.07 + (((tickAnim - 6) / 3) * (0-(-0.07)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg3.rotationPointX = this.hindleg3.rotationPointX + (float)(xx);
        this.hindleg3.rotationPointY = this.hindleg3.rotationPointY - (float)(yy);
        this.hindleg3.rotationPointZ = this.hindleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-1), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*6), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*3));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-0.25);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*5), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-30))*-0.08);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.35);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-2.5), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*3.5), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+30))*-4));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-0.15);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -8.5 + (((tickAnim - 0) / 7) * (45-(-8.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 45 + (((tickAnim - 7) / 6) * (0.7-(45)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.7 + (((tickAnim - 13) / 2) * (-8.5-(0.7)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg4, hindleg4.rotateAngleX + (float) Math.toRadians(xx), hindleg4.rotateAngleY + (float) Math.toRadians(yy), hindleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.35-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 7) / 8) * (0-(-0.425)));
            zz = -0.35 + (((tickAnim - 7) / 8) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg4.rotationPointX = this.hindleg4.rotationPointX + (float)(xx);
        this.hindleg4.rotationPointY = this.hindleg4.rotationPointY - (float)(yy);
        this.hindleg4.rotationPointZ = this.hindleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -11.25 + (((tickAnim - 0) / 7) * (14.75-(-11.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 14.75 + (((tickAnim - 7) / 6) * (-24.71-(14.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -24.71 + (((tickAnim - 13) / 2) * (-11.25-(-24.71)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg5, hindleg5.rotateAngleX + (float) Math.toRadians(xx), hindleg5.rotateAngleY + (float) Math.toRadians(yy), hindleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 7) * (0.375-(-0.3)));
            zz = 0.33 + (((tickAnim - 0) / 7) * (0.18-(0.33)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 7) / 3) * (1.925-(0.375)));
            zz = 0.18 + (((tickAnim - 7) / 3) * (-0.37-(0.18)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.925 + (((tickAnim - 10) / 3) * (1.11-(1.925)));
            zz = -0.37 + (((tickAnim - 10) / 3) * (-0.11-(-0.37)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.11 + (((tickAnim - 13) / 2) * (-0.3-(1.11)));
            zz = -0.11 + (((tickAnim - 13) / 2) * (0.33-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg5.rotationPointX = this.hindleg5.rotationPointX + (float)(xx);
        this.hindleg5.rotationPointY = this.hindleg5.rotationPointY - (float)(yy);
        this.hindleg5.rotationPointZ = this.hindleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19 + (((tickAnim - 0) / 3) * (0.33-(19)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.33 + (((tickAnim - 3) / 4) * (40-(0.33)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 40 + (((tickAnim - 7) / 8) * (19-(40)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindleg6, hindleg6.rotateAngleX + (float) Math.toRadians(xx), hindleg6.rotateAngleY + (float) Math.toRadians(yy), hindleg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.245 + (((tickAnim - 0) / 7) * (-0.3-(-0.245)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.35-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 7) / 3) * (-0.88-(-0.3)));
            zz = 0.35 + (((tickAnim - 7) / 3) * (0.21-(0.35)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.88 + (((tickAnim - 10) / 5) * (-0.245-(-0.88)));
            zz = 0.21 + (((tickAnim - 10) / 5) * (0-(0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindleg6.rotationPointX = this.hindleg6.rotationPointX + (float)(xx);
        this.hindleg6.rotationPointY = this.hindleg6.rotationPointY - (float)(yy);
        this.hindleg6.rotationPointZ = this.hindleg6.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-160))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-230))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(hat, hat.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+120))*-3), hat.rotateAngleY + (float) Math.toRadians(0), hat.rotateAngleZ + (float) Math.toRadians(0));
        this.hat.rotationPointX = this.hat.rotationPointX + (float)(0);
        this.hat.rotationPointY = this.hat.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+30))*-0.5);
        this.hat.rotationPointZ = this.hat.rotationPointZ + (float)(0);


        this.setRotateAngle(mustache, mustache.rotateAngleX + (float) Math.toRadians(0), mustache.rotateAngleY + (float) Math.toRadians(0), mustache.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*10));

    }

    

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDiademodon e = (EntityPrehistoricFloraDiademodon) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        
    }
}
