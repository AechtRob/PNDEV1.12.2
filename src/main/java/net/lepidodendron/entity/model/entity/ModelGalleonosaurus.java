package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGalleonosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGalleonosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftMasseterinferior;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightMasseterinferior;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightarm1;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftarm1;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r38;


    private ModelAnimator animator;

    public ModelGalleonosaurus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 3.7F, 0.675F);
        this.main.cubeList.add(new ModelBox(main, 0, 18, -3.0F, 0.8365F, -1.1685F, 6, 8, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.0468F, 0.1153F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0611F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 24, -1.0F, 0.0F, 0.0F, 3, 1, 7, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0833F, 1.6069F, 0.6459F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5833F, -1.1554F, -8.2377F, 7, 9, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 56, 15, -1.5833F, -1.5601F, -7.5306F, 3, 1, 7, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.9742F, -7.6868F);
        this.body.addChild(chest);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5833F, -0.5859F, 0.1562F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 47, -1.0F, 0.0F, -8.0F, 3, 1, 8, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5833F, 1.5503F, -7.3613F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 0, -2.0F, 0.0F, 0.0F, 5, 6, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5833F, 1.5503F, -7.3613F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 35, -2.0F, 0.0F, 0.0F, 5, 4, 7, -0.002F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.0833F, 3.8423F, -7.3841F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.4765F, -1.9168F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 67, -1.5F, -4.0F, -2.0F, 3, 4, 4, 0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.175F, -3.1743F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -3.7427F, -2.9031F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 0, -2.0F, 0.0F, 0.0F, 2, 3, 6, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.1847F, -3.3678F);
        this.neck2.addChild(neck3);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.65F, -0.5F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 68, -1.0F, 0.0F, -1.0F, 2, 3, 2, -0.002F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.5429F, -1.1747F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.2345F, -0.1175F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 67, 50, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 67, -0.75F, 0.0F, -3.0F, 2, 2, 3, -0.002F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 69, -1.0F, 0.9985F, -4.6282F, 2, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 67, 44, -1.25F, 0.0F, -3.0F, 2, 2, 3, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 1.6764F, -2.2029F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 73, -0.75F, -1.0F, 0.0F, 2, 1, 2, -0.004F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 69, 10, -1.25F, -1.0F, 0.0F, 2, 1, 2, -0.008F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.3217F, -2.1156F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 69, -1.0F, -0.3725F, -2.7953F, 2, 1, 2, -0.002F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.4437F, -3.9634F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 43, 15, -1.0F, -0.629F, -1.6046F, 1, 1, 1, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.3849F, -2.8134F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 75, 0, -1.0F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(-1.0F, 1.8405F, -0.7446F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.8552F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 3.1879F, -3.1453F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5236F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 44, -0.5F, -0.4F, -0.2F, 1, 1, 1, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.7604F, 2.399F);
        this.Jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7418F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 75, 4, 0.0F, -0.5164F, -6.3137F, 1, 1, 2, 0.001F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 58, 10, -0.5F, -0.3164F, -6.9137F, 2, 1, 3, -0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.475F, -2.9604F, 3.799F);
        this.Jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7505F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 70, 74, -2.5F, -0.4481F, -6.6971F, 1, 1, 2, 0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 63, 74, -3.2F, -0.4481F, -6.6971F, 1, 1, 2, -0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 74, -1.75F, -0.4481F, -6.6971F, 1, 1, 2, -0.001F, false));

        this.leftMasseterinferior = new AdvancedModelRenderer(this);
        this.leftMasseterinferior.setRotationPoint(0.0F, -2.9604F, 3.799F);
        this.Jaw.addChild(leftMasseterinferior);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftMasseterinferior.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.7505F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 73, 33, 1.39F, -1.4481F, -7.6971F, 0, 1, 3, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 73, 1.4F, -1.4481F, -7.6971F, 0, 1, 3, 0.0F, false));

        this.rightMasseterinferior = new AdvancedModelRenderer(this);
        this.rightMasseterinferior.setRotationPoint(1.0F, -2.9604F, 3.799F);
        this.Jaw.addChild(rightMasseterinferior);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightMasseterinferior.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.7505F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 49, 73, -1.39F, -1.4481F, -7.6971F, 0, 1, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 73, 38, -1.4F, -1.4481F, -7.6971F, 0, 1, 3, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.5F, 0.5932F, -1.7524F);
        this.head.addChild(eye);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 0.0F, -0.35F);
        this.eye.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 15, -1.275F, -0.5F, -0.3F, 1, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 15, 0.275F, -0.5F, -0.3F, 1, 1, 1, 0.0F, false));

        this.rightarm1 = new AdvancedModelRenderer(this);
        this.rightarm1.setRotationPoint(-2.3333F, 6.0688F, -7.0509F);
        this.chest.addChild(rightarm1);
        this.setRotateAngle(rightarm1, 0.0F, -0.3927F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.1913F, -0.5959F, 0.2593F);
        this.rightarm1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5236F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 63, 57, -1.0F, -0.75F, -0.25F, 2, 2, 6, 0.0F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.1323F, 1.9208F, 5.3756F);
        this.rightarm1.addChild(rightarm2);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5544F, 2.3133F, -2.8621F);
        this.rightarm2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5236F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 68, -1.0383F, -3.3684F, -0.5868F, 1, 5, 2, 0.0F, false));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(0.0F, 3.65F, -3.25F);
        this.rightarm2.addChild(rightarm3);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.4456F, 0.049F, -0.4121F);
        this.rightarm3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.49F, -0.1925F, -0.3444F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 73, 0.0F, 0.0F, -0.5F, 1, 2, 2, 0.0F, false));

        this.leftarm1 = new AdvancedModelRenderer(this);
        this.leftarm1.setRotationPoint(2.1667F, 6.0688F, -7.0509F);
        this.chest.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.0F, 0.3927F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.1913F, -0.5959F, 0.2593F);
        this.leftarm1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.5236F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 63, 57, -1.0F, -0.75F, -0.25F, 2, 2, 6, 0.0F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.1323F, 1.9208F, 5.3756F);
        this.leftarm1.addChild(leftarm2);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5544F, 2.3133F, -2.8621F);
        this.leftarm2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.5236F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 9, 68, 0.0383F, -3.3684F, -0.5868F, 1, 5, 2, 0.0F, true));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.0F, 3.65F, -3.25F);
        this.leftarm2.addChild(leftarm3);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.4456F, 0.049F, -0.4121F);
        this.leftarm3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.49F, 0.1925F, 0.3444F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 56, 73, -1.0F, 0.0F, -0.5F, 1, 2, 2, 0.0F, true));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-2.0F, 2.2515F, 0.2582F);
        this.main.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.1309F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 2.0296F, -1.3941F);
        this.rightleg1.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.8326F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 29, 33, -3.0F, -4.25F, -3.25F, 4, 5, 8, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.5F, 6.8519F, -0.8071F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.1309F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, -0.1783F, 0.1091F);
        this.rightleg2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.0036F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 47, -2.5F, -1.4475F, -1.2854F, 3, 3, 8, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 4.9F, 3.6F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.0873F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.175F, 0.0F);
        this.rightleg3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.5708F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 59, -1.5F, -1.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0873F, 0.0F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.175F);
        this.rightleg4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.5708F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 60, -2.0F, -1.0F, -0.5F, 3, 5, 1, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(2.0F, 2.2515F, 0.2582F);
        this.main.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.1309F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 2.0296F, -1.3941F);
        this.leftleg1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.8326F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 29, 33, -1.0F, -4.25F, -3.25F, 4, 5, 8, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.5F, 6.8519F, -0.8071F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.1309F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, -0.1783F, 0.1091F);
        this.leftleg2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.0036F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 47, -0.5F, -1.4475F, -1.2854F, 3, 3, 8, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 4.9F, 3.6F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0873F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.175F, 0.0F);
        this.leftleg3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.5708F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 59, -0.5F, -1.0F, 0.0F, 2, 2, 6, 0.0F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0873F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.175F);
        this.leftleg4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -1.5708F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 34, 60, -1.0F, -1.0F, -0.5F, 3, 5, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 2.0564F, 6.9592F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.2618F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -2.6096F, -13.8438F);
        this.tail.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.5061F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 63, 66, -0.5F, -5.9904F, 13.1553F, 2, 1, 6, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.9537F, 0.3007F);
        this.tail.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3927F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 29, 18, -3.0F, 0.0F, -1.0F, 5, 6, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.7436F, 6.224F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.0F, -1.4935F, -0.6191F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.48F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 23, 47, -2.5F, 0.0F, 1.0F, 3, 5, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 3.0448F, 5.759F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -1.8173F, -2.6238F);
        this.tail3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3054F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 54, 33, -1.0F, 0.0F, 3.0F, 2, 3, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 2.0077F, 6.549F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.8067F, -0.0934F);
        this.tail4.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0873F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 44, 57, -1.0F, 0.0F, 0.0F, 2, 2, 7, -0.002F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.5476F, 6.8798F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1309F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -0.4981F, 0.0436F);
        this.tail5.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 17, 60, -0.5F, 0.0F, -0.25F, 1, 1, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.0F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(135);
        this.main.rotateAngleX = (float)Math.toRadians(-1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        EntityPrehistoricFloraGalleonosaurus entityGalleonosaurus = (EntityPrehistoricFloraGalleonosaurus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityGalleonosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityGalleonosaurus.getAnimation() == entityGalleonosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityGalleonosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityGalleonosaurus.getIsMoving()) {
                    if (entityGalleonosaurus.getAnimation() != entityGalleonosaurus.EAT_ANIMATION
                            && entityGalleonosaurus.getAnimation() != entityGalleonosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityGalleonosaurus.getIsFast()) { //Running


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
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraGalleonosaurus ee = (EntityPrehistoricFloraGalleonosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGalleonosaurus entity = (EntityPrehistoricFloraGalleonosaurus) entitylivingbaseIn;
        int animCycle = 175;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 14 + (((tickAnim - 18) / 10) * (24.75-(14)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 24.75 + (((tickAnim - 28) / 7) * (22-(24.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22 + (((tickAnim - 35) / 15) * (16.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*10-(22)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 16.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*10 + (((tickAnim - 50) / 15) * (-1.6-(16.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*10)));
            yy = 0 + (((tickAnim - 50) / 15) * (6.25-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 89) {
            xx = -1.6 + (((tickAnim - 65) / 24) * (-3-(-1.6)));
            yy = 6.25 + (((tickAnim - 65) / 24) * (6.25-(6.25)));
            zz = 0 + (((tickAnim - 65) / 24) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 110) {
            xx = -3 + (((tickAnim - 89) / 21) * (-2-(-3)));
            yy = 6.25 + (((tickAnim - 89) / 21) * (6.25-(6.25)));
            zz = 0 + (((tickAnim - 89) / 21) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -2 + (((tickAnim - 110) / 5) * (-2-(-2)));
            yy = 6.25 + (((tickAnim - 110) / 5) * (6.25-(6.25)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = -2 + (((tickAnim - 115) / 20) * (24.75-(-2)));
            yy = 6.25 + (((tickAnim - 115) / 20) * (0-(6.25)));
            zz = 0 + (((tickAnim - 115) / 20) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 24.75 + (((tickAnim - 135) / 7) * (22-(24.75)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 157) {
            xx = 22 + (((tickAnim - 142) / 15) * (16.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*10-(22)));
            yy = 0 + (((tickAnim - 142) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 15) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 16.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*10 + (((tickAnim - 157) / 18) * (0-(16.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*10)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 18) / 10) * (0.13-(0.125)));
            zz = 0 + (((tickAnim - 18) / 10) * (0.125-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 28) / 107) * (0-(0)));
            yy = 0.13 + (((tickAnim - 28) / 107) * (0.13-(0.13)));
            zz = 0.125 + (((tickAnim - 28) / 107) * (0.125-(0.125)));
        }
        else if (tickAnim >= 135 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 135) / 40) * (0-(0)));
            yy = 0.13 + (((tickAnim - 135) / 40) * (0-(0.13)));
            zz = 0.125 + (((tickAnim - 135) / 40) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 18) / 10) * (23.5-(10)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 23.5 + (((tickAnim - 28) / 7) * (15.75-(23.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 15.75 + (((tickAnim - 35) / 3) * (1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(15.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 38) / 7) * (2.88-(1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 2.88 + (((tickAnim - 45) / 5) * (3.5-(2.88)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 3.5 + (((tickAnim - 50) / 15) * (0-(3.5)));
            yy = 0 + (((tickAnim - 50) / 15) * (7.5-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 65) / 24) * (3.5-(0)));
            yy = 7.5 + (((tickAnim - 65) / 24) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 65) / 24) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 110) {
            xx = 3.5 + (((tickAnim - 89) / 21) * (1.75-(3.5)));
            yy = 7.5 + (((tickAnim - 89) / 21) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 89) / 21) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 1.75 + (((tickAnim - 110) / 5) * (1.75-(1.75)));
            yy = 7.5 + (((tickAnim - 110) / 5) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 1.75 + (((tickAnim - 115) / 20) * (23.5-(1.75)));
            yy = 7.5 + (((tickAnim - 115) / 20) * (0-(7.5)));
            zz = 0 + (((tickAnim - 115) / 20) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 23.5 + (((tickAnim - 135) / 7) * (15.75-(23.5)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = 15.75 + (((tickAnim - 142) / 3) * (26.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(15.75)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 157) {
            xx = 26.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 145) / 12) * (20.775-(26.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = 0 + (((tickAnim - 145) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 12) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 20.775 + (((tickAnim - 157) / 18) * (0-(20.775)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 28) / 107) * (0-(0)));
            yy = -0.2 + (((tickAnim - 28) / 107) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 28) / 107) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 135) / 40) * (0-(0)));
            yy = -0.2 + (((tickAnim - 135) / 40) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 135) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 65) {
            xx = 8.25 + (((tickAnim - 18) / 47) * (0-(8.25)));
            yy = 0 + (((tickAnim - 18) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 47) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 65) / 28) * (-4-(0)));
            yy = 0 + (((tickAnim - 65) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 28) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 114) {
            xx = -4 + (((tickAnim - 93) / 21) * (-1-(-4)));
            yy = 0 + (((tickAnim - 93) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 21) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 140) {
            xx = -1 + (((tickAnim - 114) / 26) * (4.75-(-1)));
            yy = 0 + (((tickAnim - 114) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 26) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = 4.75 + (((tickAnim - 140) / 17) * (5.25-(4.75)));
            yy = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 5.25 + (((tickAnim - 157) / 18) * (0-(5.25)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 3.25 + (((tickAnim - 18) / 12) * (4.89-(3.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 4.89 + (((tickAnim - 30) / 35) * (0-(4.89)));
            yy = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 35) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 65) / 33) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 65) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 33) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 114) {
            xx = -5.5 + (((tickAnim - 98) / 16) * (-4.75-(-5.5)));
            yy = 0 + (((tickAnim - 98) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 16) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 140) {
            xx = -4.75 + (((tickAnim - 114) / 26) * (0.5-(-4.75)));
            yy = 0 + (((tickAnim - 114) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 26) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = 0.5 + (((tickAnim - 140) / 17) * (2.25-(0.5)));
            yy = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 2.25 + (((tickAnim - 157) / 18) * (0-(2.25)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -8.5 + (((tickAnim - 18) / 12) * (0.74-(-8.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 0.74 + (((tickAnim - 30) / 35) * (0-(0.74)));
            yy = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 35) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 65) / 33) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 65) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 33) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 114) {
            xx = -11.5 + (((tickAnim - 98) / 16) * (-9.75-(-11.5)));
            yy = 0 + (((tickAnim - 98) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 16) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 140) {
            xx = -9.75 + (((tickAnim - 114) / 26) * (-2.25-(-9.75)));
            yy = 0 + (((tickAnim - 114) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 26) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = -2.25 + (((tickAnim - 140) / 17) * (3.25-(-2.25)));
            yy = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 3.25 + (((tickAnim - 157) / 18) * (0-(3.25)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -8 + (((tickAnim - 18) / 12) * (-2.39-(-8)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = -2.39 + (((tickAnim - 30) / 18) * (5.69-(-2.39)));
            yy = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 18) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = 5.69 + (((tickAnim - 48) / 17) * (0-(5.69)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 65) / 33) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 65) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 33) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 114) {
            xx = -5.25 + (((tickAnim - 98) / 16) * (-5-(-5.25)));
            yy = 0 + (((tickAnim - 98) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 16) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 140) {
            xx = -5 + (((tickAnim - 114) / 26) * (-8-(-5)));
            yy = 0 + (((tickAnim - 114) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 26) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = -8 + (((tickAnim - 140) / 17) * (-1-(-8)));
            yy = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 166) {
            xx = -1 + (((tickAnim - 157) / 9) * (4.75-(-1)));
            yy = 0 + (((tickAnim - 157) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 9) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 175) {
            xx = 4.75 + (((tickAnim - 166) / 9) * (0-(4.75)));
            yy = 0 + (((tickAnim - 166) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -3.25 + (((tickAnim - 18) / 12) * (-10.64-(-3.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = -10.64 + (((tickAnim - 30) / 18) * (13.96-(-10.64)));
            yy = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 18) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = 13.96 + (((tickAnim - 48) / 17) * (0-(13.96)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 65) / 33) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 65) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 33) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 114) {
            xx = -8.5 + (((tickAnim - 98) / 16) * (-7.5-(-8.5)));
            yy = 0 + (((tickAnim - 98) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 16) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 140) {
            xx = -7.5 + (((tickAnim - 114) / 26) * (-12.5-(-7.5)));
            yy = 0 + (((tickAnim - 114) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 26) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = -12.5 + (((tickAnim - 140) / 17) * (-4.5-(-12.5)));
            yy = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 166) {
            xx = -4.5 + (((tickAnim - 157) / 9) * (10.5-(-4.5)));
            yy = 0 + (((tickAnim - 157) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 9) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 175) {
            xx = 10.5 + (((tickAnim - 166) / 9) * (0-(10.5)));
            yy = 0 + (((tickAnim - 166) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.225-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 7.225 + (((tickAnim - 18) / 10) * (8.75-(7.225)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 28) / 22) * (9.25-(8.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 9.25 + (((tickAnim - 50) / 15) * (4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2-(9.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 89) {
            xx = 4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2 + (((tickAnim - 65) / 24) * (4.1-(4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2)));
            yy = 0 + (((tickAnim - 65) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 24) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 110) {
            xx = 4.1 + (((tickAnim - 89) / 21) * (4.1-(4.1)));
            yy = 0 + (((tickAnim - 89) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 21) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 4.1 + (((tickAnim - 110) / 5) * (4.1-(4.1)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 4.1 + (((tickAnim - 115) / 20) * (8.75-(4.1)));
            yy = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 20) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 157) {
            xx = 8.75 + (((tickAnim - 135) / 22) * (9.25-(8.75)));
            yy = 0 + (((tickAnim - 135) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 22) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 9.25 + (((tickAnim - 157) / 18) * (0-(9.25)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.275-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 18) / 157) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 157) * (0-(0)));
            zz = 0.275 + (((tickAnim - 18) / 157) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 4 + (((tickAnim - 18) / 10) * (7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1-(4)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1 + (((tickAnim - 28) / 22) * (4.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1-(7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 4.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1 + (((tickAnim - 50) / 15) * (0-(4.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 65) / 24) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.2-(0)));
            yy = 0 + (((tickAnim - 65) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 24) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 110) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.2 + (((tickAnim - 89) / 21) * (0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.2-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.2)));
            yy = 0 + (((tickAnim - 89) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 21) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.2 + (((tickAnim - 110) / 5) * (0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.2-(0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.2)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.2 + (((tickAnim - 115) / 20) * (7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1-(0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.2)));
            yy = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 20) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 157) {
            xx = 7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1 + (((tickAnim - 135) / 22) * (4.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1-(7.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1)));
            yy = 0 + (((tickAnim - 135) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 22) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 4.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1 + (((tickAnim - 157) / 18) * (0-(4.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+50))*-1)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 18) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 47) * (0-(0)));
            zz = 0.2 + (((tickAnim - 18) / 47) * (0-(0.2)));
        }
        else if (tickAnim >= 65 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 65) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 110) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 13.5 + (((tickAnim - 8) / 10) * (16.75-(13.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 16.75 + (((tickAnim - 18) / 10) * (19.5-(16.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 28) / 7) * (27.75-(19.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 27.75 + (((tickAnim - 35) / 5) * (22.5-(27.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 22.5 + (((tickAnim - 40) / 5) * (23.88-(22.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 23.88 + (((tickAnim - 45) / 5) * (17.5-(23.88)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 17.5 + (((tickAnim - 50) / 15) * (0-(17.5)));
            yy = 0 + (((tickAnim - 50) / 15) * (5.75-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 65) / 24) * (-3.5-(0)));
            yy = 5.75 + (((tickAnim - 65) / 24) * (5.75-(5.75)));
            zz = 0 + (((tickAnim - 65) / 24) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 115) {
            xx = -3.5 + (((tickAnim - 89) / 26) * (-3.5-(-3.5)));
            yy = 5.75 + (((tickAnim - 89) / 26) * (5.75-(5.75)));
            zz = 0 + (((tickAnim - 89) / 26) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -3.5 + (((tickAnim - 115) / 10) * (8.03472-(-3.5)));
            yy = 5.75 + (((tickAnim - 115) / 10) * (-6.03739-(5.75)));
            zz = 0 + (((tickAnim - 115) / 10) * (-1.25447-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 8.03472 + (((tickAnim - 125) / 10) * (19.5-(8.03472)));
            yy = -6.03739 + (((tickAnim - 125) / 10) * (0-(-6.03739)));
            zz = -1.25447 + (((tickAnim - 125) / 10) * (0-(-1.25447)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 19.5 + (((tickAnim - 135) / 7) * (27.75-(19.5)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 147) {
            xx = 27.75 + (((tickAnim - 142) / 5) * (22.5-(27.75)));
            yy = 0 + (((tickAnim - 142) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 5) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 152) {
            xx = 22.5 + (((tickAnim - 147) / 5) * (23.88-(22.5)));
            yy = 0 + (((tickAnim - 147) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 5) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 157) {
            xx = 23.88 + (((tickAnim - 152) / 5) * (17.5-(23.88)));
            yy = 0 + (((tickAnim - 152) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 5) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 17.5 + (((tickAnim - 157) / 18) * (0-(17.5)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.2-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = -0.15 + (((tickAnim - 23) / 27) * (-0.15-(-0.15)));
            zz = 0.2 + (((tickAnim - 23) / 27) * (0.2-(0.2)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = -0.15 + (((tickAnim - 50) / 15) * (0-(-0.15)));
            zz = 0.2 + (((tickAnim - 50) / 15) * (0-(0.2)));
        }
        else if (tickAnim >= 65 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 50) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 20) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 115) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 135) / 22) * (0-(0)));
            yy = -0.15 + (((tickAnim - 135) / 22) * (-0.15-(-0.15)));
            zz = 0.2 + (((tickAnim - 135) / 22) * (0.2-(0.2)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            yy = -0.15 + (((tickAnim - 157) / 18) * (0-(-0.15)));
            zz = 0.2 + (((tickAnim - 157) / 18) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 9 + (((tickAnim - 8) / 10) * (14.5-(9)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14.5 + (((tickAnim - 18) / 5) * (-14.19-(14.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -14.19 + (((tickAnim - 23) / 5) * (-10-(-14.19)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -10 + (((tickAnim - 28) / 7) * (0.25-(-10)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.25 + (((tickAnim - 35) / 5) * (-5.5-(0.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5.5 + (((tickAnim - 40) / 5) * (9.25-(-5.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 45) / 5) * (14.5-(9.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 14.5 + (((tickAnim - 50) / 15) * (6.75-(14.5)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 89) {
            xx = 6.75 + (((tickAnim - 65) / 24) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 65) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 24) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 95) {
            xx = 6.75 + (((tickAnim - 89) / 6) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 89) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 6) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 98) {
            xx = 6.75 + (((tickAnim - 95) / 3) * (6.25-(6.75)));
            yy = 0 + (((tickAnim - 95) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 3) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
            xx = 6.25 + (((tickAnim - 98) / 2) * (6.75-(6.25)));
            yy = 0 + (((tickAnim - 98) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 2) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 103) {
            xx = 6.75 + (((tickAnim - 100) / 3) * (6.25-(6.75)));
            yy = 0 + (((tickAnim - 100) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 3) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 105) {
            xx = 6.25 + (((tickAnim - 103) / 2) * (6.75-(6.25)));
            yy = 0 + (((tickAnim - 103) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 2) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 6.75 + (((tickAnim - 105) / 5) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 5) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 6.75 + (((tickAnim - 110) / 5) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 6.75 + (((tickAnim - 115) / 10) * (8.63-(6.75)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 8.63 + (((tickAnim - 125) / 10) * (-10-(8.63)));
            yy = 0 + (((tickAnim - 125) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 10) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = -10 + (((tickAnim - 135) / 7) * (0.25-(-10)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 147) {
            xx = 0.25 + (((tickAnim - 142) / 5) * (-5.5-(0.25)));
            yy = 0 + (((tickAnim - 142) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 5) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 152) {
            xx = -5.5 + (((tickAnim - 147) / 5) * (9.25-(-5.5)));
            yy = 0 + (((tickAnim - 147) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 5) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 157) {
            xx = 9.25 + (((tickAnim - 152) / 5) * (14.5-(9.25)));
            yy = 0 + (((tickAnim - 152) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 5) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 14.5 + (((tickAnim - 157) / 18) * (0-(14.5)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.2);



        if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (19.5-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 19.5 + (((tickAnim - 23) / 5) * (0-(19.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (11.75-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 11.75 + (((tickAnim - 35) / 5) * (0-(11.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (17.25-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 17.25 + (((tickAnim - 45) / 3) * (0-(17.25)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 50) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 75) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 125) / 10) * (24.55-(0)));
            yy = 0 + (((tickAnim - 125) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 10) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 24.55 + (((tickAnim - 135) / 3) * (0-(24.55)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 138) / 4) * (11.75-(0)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 147) {
            xx = 11.75 + (((tickAnim - 142) / 5) * (0-(11.75)));
            yy = 0 + (((tickAnim - 142) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 5) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 147) / 5) * (17.25-(0)));
            yy = 0 + (((tickAnim - 147) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 5) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 154) {
            xx = 17.25 + (((tickAnim - 152) / 2) * (0-(17.25)));
            yy = 0 + (((tickAnim - 152) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 2) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 154) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 154) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 73 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 73) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 73) / 2) * (0-(1)));
            zz = 1 + (((tickAnim - 73) / 2) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 75) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 75) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 75) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 14.5 + (((tickAnim - 28) / 9) * (4.5-(14.5)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 4.5 + (((tickAnim - 37) / 6) * (9-(4.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 43) / 7) * (4.5-(9)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 89) {
            xx = 4.5 + (((tickAnim - 50) / 39) * (0-(4.5)));
            yy = 0 + (((tickAnim - 50) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 39) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 89) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 89) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 86) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 14.5 + (((tickAnim - 28) / 9) * (1.5-(14.5)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 1.5 + (((tickAnim - 37) / 6) * (5.25-(1.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 43) / 7) * (1.5-(5.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 89) {
            xx = 1.5 + (((tickAnim - 50) / 39) * (0-(1.5)));
            yy = 0 + (((tickAnim - 50) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 39) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 89) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 89) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 86) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = 9 + (((tickAnim - 18) / 139) * (9-(9)));
            yy = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 9 + (((tickAnim - 157) / 18) * (0-(9)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = -11.75 + (((tickAnim - 18) / 139) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = -11.75 + (((tickAnim - 157) / 18) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = -4.5 + (((tickAnim - 18) / 139) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = -4.5 + (((tickAnim - 157) / 18) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = 7.5 + (((tickAnim - 18) / 139) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = 7.5 + (((tickAnim - 157) / 18) * (0-(7.5)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            yy = 0.075 + (((tickAnim - 18) / 139) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = -15.75 + (((tickAnim - 18) / 139) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 175) {
            xx = -15.75 + (((tickAnim - 157) / 18) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 157) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = -10 + (((tickAnim - 18) / 139) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 167) {
            xx = -10 + (((tickAnim - 157) / 10) * (18.5-(-10)));
            yy = 0 + (((tickAnim - 157) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 10) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 175) {
            xx = 18.5 + (((tickAnim - 167) / 8) * (0-(18.5)));
            yy = 0 + (((tickAnim - 167) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.075-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            yy = -0.35 + (((tickAnim - 18) / 139) * (-0.35-(-0.35)));
            zz = -0.075 + (((tickAnim - 18) / 139) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 157 && tickAnim < 167) {
            xx = 0 + (((tickAnim - 157) / 10) * (0-(0)));
            yy = -0.35 + (((tickAnim - 157) / 10) * (0-(-0.35)));
            zz = -0.075 + (((tickAnim - 157) / 10) * (0-(-0.075)));
        }
        else if (tickAnim >= 167 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 167) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 167) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-57.89-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -57.89 + (((tickAnim - 8) / 10) * (-9.75-(-57.89)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = -9.75 + (((tickAnim - 18) / 139) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 167) {
            xx = -9.75 + (((tickAnim - 157) / 10) * (-57.89-(-9.75)));
            yy = 0 + (((tickAnim - 157) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 10) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 175) {
            xx = -57.89 + (((tickAnim - 167) / 8) * (0-(-57.89)));
            yy = 0 + (((tickAnim - 167) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.51-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.4-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.51 + (((tickAnim - 8) / 10) * (-0.5-(0.51)));
            zz = 0.4 + (((tickAnim - 8) / 10) * (0-(0.4)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            yy = -0.5 + (((tickAnim - 18) / 139) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 167) {
            xx = 0 + (((tickAnim - 157) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 157) / 10) * (0.51-(-0.5)));
            zz = 0 + (((tickAnim - 157) / 10) * (0.4-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 167) / 8) * (0-(0)));
            yy = 0.51 + (((tickAnim - 167) / 8) * (0-(0.51)));
            zz = 0.4 + (((tickAnim - 167) / 8) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (97.77-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 97.77 + (((tickAnim - 8) / 10) * (35.75-(97.77)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = 35.75 + (((tickAnim - 18) / 139) * (35.75-(35.75)));
            yy = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 139) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 167) {
            xx = 35.75 + (((tickAnim - 157) / 10) * (97.77-(35.75)));
            yy = 0 + (((tickAnim - 157) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 10) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 175) {
            xx = 97.77 + (((tickAnim - 167) / 8) * (0-(97.77)));
            yy = 0 + (((tickAnim - 167) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.815-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.06-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.815 + (((tickAnim - 8) / 10) * (0.4-(0.815)));
            zz = 0.06 + (((tickAnim - 8) / 10) * (0.975-(0.06)));
        }
        else if (tickAnim >= 18 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 18) / 139) * (0-(0)));
            yy = 0.4 + (((tickAnim - 18) / 139) * (0.4-(0.4)));
            zz = 0.975 + (((tickAnim - 18) / 139) * (0.975-(0.975)));
        }
        else if (tickAnim >= 157 && tickAnim < 167) {
            xx = 0 + (((tickAnim - 157) / 10) * (0-(0)));
            yy = 0.4 + (((tickAnim - 157) / 10) * (0.815-(0.4)));
            zz = 0.975 + (((tickAnim - 157) / 10) * (0.06-(0.975)));
        }
        else if (tickAnim >= 167 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 167) / 8) * (0-(0)));
            yy = 0.815 + (((tickAnim - 167) / 8) * (0-(0.815)));
            zz = 0.06 + (((tickAnim - 167) / 8) * (0-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGalleonosaurus entity = (EntityPrehistoricFloraGalleonosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -2 + (((tickAnim - 5) / 4) * (-0.04-(-2)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.04 + (((tickAnim - 9) / 4) * (-9-(-0.04)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 13) / 7) * (0-(-9)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -4 + (((tickAnim - 5) / 4) * (-6.65-(-4)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -6.65 + (((tickAnim - 9) / 4) * (0.5-(-6.65)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 13) / 7) * (0-(0.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -3.25 + (((tickAnim - 13) / 7) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 7.25 + (((tickAnim - 5) / 4) * (13.41-(7.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 13.41 + (((tickAnim - 9) / 11) * (0-(13.41)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 15.75 + (((tickAnim - 5) / 4) * (0-(15.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (28.5-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 28.5 + (((tickAnim - 13) / 4) * (0-(28.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGalleonosaurus entity = (EntityPrehistoricFloraGalleonosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 15) / 20) * (-7-(-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 35) / 15) * (0-(-7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -5.275 + (((tickAnim - 15) / 20) * (-5.275-(-5.275)));
            zz = 4.575 + (((tickAnim - 15) / 20) * (4.575-(4.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -5.275 + (((tickAnim - 35) / 15) * (0-(-5.275)));
            zz = 4.575 + (((tickAnim - 35) / 15) * (0-(4.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 15) / 20) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 35) / 15) * (0-(-5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0.5266-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (8.42883-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.52478-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.5266 + (((tickAnim - 15) / 20) * (0.5266-(0.5266)));
            yy = 8.42883 + (((tickAnim - 15) / 20) * (8.42883-(8.42883)));
            zz = 3.52478 + (((tickAnim - 15) / 20) * (3.52478-(3.52478)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.5266 + (((tickAnim - 35) / 15) * (0-(0.5266)));
            yy = 8.42883 + (((tickAnim - 35) / 15) * (0-(8.42883)));
            zz = 3.52478 + (((tickAnim - 35) / 15) * (0-(3.52478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.0532-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.49947-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.29898-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.0532 + (((tickAnim - 15) / 20) * (8.0532-(8.0532)));
            yy = 10.49947 + (((tickAnim - 15) / 20) * (10.49947-(10.49947)));
            zz = 3.29898 + (((tickAnim - 15) / 20) * (3.29898-(3.29898)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.0532 + (((tickAnim - 35) / 15) * (0-(8.0532)));
            yy = 10.49947 + (((tickAnim - 35) / 15) * (0-(10.49947)));
            zz = 3.29898 + (((tickAnim - 35) / 15) * (0-(3.29898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.27868-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (18.67601-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (7.19462-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.27868 + (((tickAnim - 15) / 20) * (0.27868-(0.27868)));
            yy = 18.67601 + (((tickAnim - 15) / 20) * (18.67601-(18.67601)));
            zz = 7.19462 + (((tickAnim - 15) / 20) * (7.19462-(7.19462)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.27868 + (((tickAnim - 35) / 15) * (0-(0.27868)));
            yy = 18.67601 + (((tickAnim - 35) / 15) * (0-(18.67601)));
            zz = 7.19462 + (((tickAnim - 35) / 15) * (0-(7.19462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 15) / 20) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 35) / 15) * (0-(2.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.25 + (((tickAnim - 15) / 20) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 35) / 15) * (0-(5.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -27.25 + (((tickAnim - 15) / 20) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.25 + (((tickAnim - 35) / 15) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (49.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 49.75 + (((tickAnim - 15) / 20) * (49.75-(49.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49.75 + (((tickAnim - 35) / 15) * (0-(49.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 20) * (0.15-(0.15)));
            zz = -0.075 + (((tickAnim - 15) / 20) * (-0.075-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-41-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -41 + (((tickAnim - 15) / 20) * (-41-(-41)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -41 + (((tickAnim - 35) / 15) * (0-(-41)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24.25 + (((tickAnim - 15) / 20) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24.25 + (((tickAnim - 35) / 15) * (0-(24.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.505-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.16-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.505 + (((tickAnim - 8) / 7) * (0.35-(0.505)));
            zz = -0.16 + (((tickAnim - 8) / 7) * (0.1-(-0.16)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 15) / 20) * (0.35-(0.35)));
            zz = 0.1 + (((tickAnim - 15) / 20) * (0.1-(0.1)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0.35 + (((tickAnim - 35) / 8) * (0.73-(0.35)));
            zz = 0.1 + (((tickAnim - 35) / 8) * (-0.16-(0.1)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.73 + (((tickAnim - 43) / 7) * (0-(0.73)));
            zz = -0.16 + (((tickAnim - 43) / 7) * (0-(-0.16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -27.25 + (((tickAnim - 15) / 20) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.25 + (((tickAnim - 35) / 15) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 46.5 + (((tickAnim - 15) / 20) * (46.5-(46.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 46.5 + (((tickAnim - 35) / 15) * (0-(46.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.075-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 20) * (0.15-(0.15)));
            zz = -0.075 + (((tickAnim - 15) / 20) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 35) / 15) * (0-(0.15)));
            zz = -0.075 + (((tickAnim - 35) / 15) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-41-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -41 + (((tickAnim - 15) / 20) * (-41-(-41)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -41 + (((tickAnim - 35) / 15) * (0-(-41)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 30.25 + (((tickAnim - 15) / 20) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 30.25 + (((tickAnim - 35) / 15) * (0-(30.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.61-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.61 + (((tickAnim - 7) / 8) * (0.7-(0.61)));
            zz = -0.15 + (((tickAnim - 7) / 8) * (0.1-(-0.15)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.7 + (((tickAnim - 15) / 20) * (0.7-(0.7)));
            zz = 0.1 + (((tickAnim - 15) / 20) * (0.1-(0.1)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 35) / 8) * (0.535-(0.7)));
            zz = 0.1 + (((tickAnim - 35) / 8) * (-0.14-(0.1)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.535 + (((tickAnim - 43) / 7) * (0-(0.535)));
            zz = -0.14 + (((tickAnim - 43) / 7) * (0-(-0.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGalleonosaurus entity = (EntityPrehistoricFloraGalleonosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-2.05429-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-7.82486-(0)));
            zz = -5.75 + (((tickAnim - 8) / 7) * (8.25158-(-5.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -2.05429 + (((tickAnim - 15) / 7) * (0-(-2.05429)));
            yy = -7.82486 + (((tickAnim - 15) / 7) * (0-(-7.82486)));
            zz = 8.25158 + (((tickAnim - 15) / 7) * (-5.75-(8.25158)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (-2.05429-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (-7.82486-(0)));
            zz = -5.75 + (((tickAnim - 22) / 6) * (8.25158-(-5.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.05429 + (((tickAnim - 28) / 7) * (0-(-2.05429)));
            yy = -7.82486 + (((tickAnim - 28) / 7) * (0-(-7.82486)));
            zz = 8.25158 + (((tickAnim - 28) / 7) * (-5.75-(8.25158)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (-2.05429-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (-7.82486-(0)));
            zz = -5.75 + (((tickAnim - 35) / 7) * (8.25158-(-5.75)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -2.05429 + (((tickAnim - 42) / 6) * (0-(-2.05429)));
            yy = -7.82486 + (((tickAnim - 42) / 6) * (0-(-7.82486)));
            zz = 8.25158 + (((tickAnim - 42) / 6) * (-5.75-(8.25158)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = -5.75 + (((tickAnim - 48) / 2) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 4.25 + (((tickAnim - 8) / 7) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -12 + (((tickAnim - 15) / 7) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 4.25 + (((tickAnim - 22) / 6) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -12 + (((tickAnim - 28) / 7) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 4.25 + (((tickAnim - 35) / 7) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -12 + (((tickAnim - 42) / 6) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 4.25 + (((tickAnim - 48) / 2) * (0-(4.25)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 5.75 + (((tickAnim - 8) / 7) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -11.5 + (((tickAnim - 15) / 7) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 5.75 + (((tickAnim - 22) / 6) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -11.5 + (((tickAnim - 28) / 7) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 5.75 + (((tickAnim - 35) / 7) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -11.5 + (((tickAnim - 42) / 6) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 5.75 + (((tickAnim - 48) / 2) * (0-(5.75)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (11-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 11 + (((tickAnim - 8) / 4) * (14.56-(11)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 14.56 + (((tickAnim - 12) / 3) * (-11.5-(14.56)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -11.5 + (((tickAnim - 15) / 3) * (-13.5-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -13.5 + (((tickAnim - 18) / 4) * (11-(-13.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 11 + (((tickAnim - 22) / 3) * (14.63-(11)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 14.63 + (((tickAnim - 25) / 3) * (-11.5-(14.63)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -11.5 + (((tickAnim - 28) / 5) * (-9.53-(-11.5)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = -9.53 + (((tickAnim - 33) / 2) * (11-(-9.53)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 11 + (((tickAnim - 35) / 3) * (15.63-(11)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 15.63 + (((tickAnim - 38) / 4) * (-11.5-(15.63)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = -11.5 + (((tickAnim - 42) / 2) * (-16.22-(-11.5)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -16.22 + (((tickAnim - 44) / 4) * (11-(-16.22)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 11 + (((tickAnim - 48) / 2) * (0-(11)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.39688-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-10.15538-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (7.87413-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -1.39688 + (((tickAnim - 8) / 7) * (-2.54865-(-1.39688)));
            yy = -10.15538 + (((tickAnim - 8) / 7) * (-9.93137-(-10.15538)));
            zz = 7.87413 + (((tickAnim - 8) / 7) * (14.47148-(7.87413)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -2.54865 + (((tickAnim - 15) / 7) * (-1.39688-(-2.54865)));
            yy = -9.93137 + (((tickAnim - 15) / 7) * (-10.15538-(-9.93137)));
            zz = 14.47148 + (((tickAnim - 15) / 7) * (7.87413-(14.47148)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -1.39688 + (((tickAnim - 22) / 6) * (-2.54865-(-1.39688)));
            yy = -10.15538 + (((tickAnim - 22) / 6) * (-9.93137-(-10.15538)));
            zz = 7.87413 + (((tickAnim - 22) / 6) * (14.47148-(7.87413)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.54865 + (((tickAnim - 28) / 7) * (-1.39688-(-2.54865)));
            yy = -9.93137 + (((tickAnim - 28) / 7) * (-10.15538-(-9.93137)));
            zz = 14.47148 + (((tickAnim - 28) / 7) * (7.87413-(14.47148)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.39688 + (((tickAnim - 35) / 15) * (0-(-1.39688)));
            yy = -10.15538 + (((tickAnim - 35) / 15) * (0-(-10.15538)));
            zz = 7.87413 + (((tickAnim - 35) / 15) * (0-(7.87413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13.95309-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-3.98898-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.26034-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 13.95309 + (((tickAnim - 8) / 7) * (14.26259-(13.95309)));
            yy = -3.98898 + (((tickAnim - 8) / 7) * (-2.6474-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 8) / 7) * (-1.08262-(4.26034)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.26259 + (((tickAnim - 15) / 7) * (13.95309-(14.26259)));
            yy = -2.6474 + (((tickAnim - 15) / 7) * (-3.98898-(-2.6474)));
            zz = -1.08262 + (((tickAnim - 15) / 7) * (4.26034-(-1.08262)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 13.95309 + (((tickAnim - 22) / 6) * (14.26259-(13.95309)));
            yy = -3.98898 + (((tickAnim - 22) / 6) * (-2.6474-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 22) / 6) * (-1.08262-(4.26034)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.26259 + (((tickAnim - 28) / 7) * (13.95309-(14.26259)));
            yy = -2.6474 + (((tickAnim - 28) / 7) * (-3.98898-(-2.6474)));
            zz = -1.08262 + (((tickAnim - 28) / 7) * (4.26034-(-1.08262)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.95309 + (((tickAnim - 35) / 15) * (0-(13.95309)));
            yy = -3.98898 + (((tickAnim - 35) / 15) * (0-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 35) / 15) * (0-(4.26034)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0.21279-(0)));
            yy = 3.25 + (((tickAnim - 8) / 7) * (3.24303-(3.25)));
            zz = -2.5 + (((tickAnim - 8) / 7) * (1.25602-(-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0.21279 + (((tickAnim - 15) / 7) * (0-(0.21279)));
            yy = 3.24303 + (((tickAnim - 15) / 7) * (3.25-(3.24303)));
            zz = 1.25602 + (((tickAnim - 15) / 7) * (-2.5-(1.25602)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0.21279-(0)));
            yy = 3.25 + (((tickAnim - 22) / 6) * (3.24303-(3.25)));
            zz = -2.5 + (((tickAnim - 22) / 6) * (1.25602-(-2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0.21279 + (((tickAnim - 28) / 7) * (0-(0.21279)));
            yy = 3.24303 + (((tickAnim - 28) / 7) * (3.25-(3.24303)));
            zz = 1.25602 + (((tickAnim - 28) / 7) * (-2.5-(1.25602)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 3.25 + (((tickAnim - 35) / 15) * (0-(3.25)));
            zz = -2.5 + (((tickAnim - 35) / 15) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -2.75 + (((tickAnim - 8) / 7) * (3.5-(-2.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 3.5 + (((tickAnim - 15) / 7) * (-2.75-(3.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = -2.75 + (((tickAnim - 22) / 6) * (3.5-(-2.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 3.5 + (((tickAnim - 28) / 7) * (-2.75-(3.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.76159-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-13.08238-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.3118-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.76159 + (((tickAnim - 8) / 7) * (-2.66984-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 8) / 7) * (-11.75376-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 8) / 7) * (12.16816-(3.3118)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -2.66984 + (((tickAnim - 15) / 7) * (-0.76159-(-2.66984)));
            yy = -11.75376 + (((tickAnim - 15) / 7) * (-13.08238-(-11.75376)));
            zz = 12.16816 + (((tickAnim - 15) / 7) * (3.3118-(12.16816)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -0.76159 + (((tickAnim - 22) / 6) * (-2.66984-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 22) / 6) * (-11.75376-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 22) / 6) * (12.16816-(3.3118)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.66984 + (((tickAnim - 28) / 7) * (-0.76159-(-2.66984)));
            yy = -11.75376 + (((tickAnim - 28) / 7) * (-13.08238-(-11.75376)));
            zz = 12.16816 + (((tickAnim - 28) / 7) * (3.3118-(12.16816)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.76159 + (((tickAnim - 35) / 15) * (0-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 35) / 15) * (0-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 35) / 15) * (0-(3.3118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -12.25 + (((tickAnim - 8) / 7) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 27.25 + (((tickAnim - 15) / 7) * (-12.25-(27.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -12.25 + (((tickAnim - 22) / 6) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 27.25 + (((tickAnim - 28) / 7) * (-12.25-(27.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -12.25 + (((tickAnim - 35) / 7) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 27.25 + (((tickAnim - 42) / 8) * (0-(27.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -29.25 + (((tickAnim - 8) / 7) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.75 + (((tickAnim - 15) / 7) * (-29.25-(14.75)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -29.25 + (((tickAnim - 22) / 6) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.75 + (((tickAnim - 28) / 7) * (-29.25-(14.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -29.25 + (((tickAnim - 35) / 7) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 42) / 8) * (0-(14.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -30.75 + (((tickAnim - 4) / 4) * (11.5-(-30.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.5 + (((tickAnim - 8) / 7) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.25 + (((tickAnim - 15) / 3) * (-48.12-(20.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -48.12 + (((tickAnim - 18) / 4) * (11.5-(-48.12)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 11.5 + (((tickAnim - 22) / 6) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 20.25 + (((tickAnim - 28) / 4) * (-48.12-(20.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -48.12 + (((tickAnim - 32) / 3) * (11.5-(-48.12)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 11.5 + (((tickAnim - 35) / 7) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 20.25 + (((tickAnim - 42) / 8) * (0-(20.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (68.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 68.75 + (((tickAnim - 4) / 4) * (29-(68.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 29 + (((tickAnim - 8) / 4) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -17.37 + (((tickAnim - 12) / 3) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 56.75 + (((tickAnim - 15) / 3) * (66.13-(56.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 66.13 + (((tickAnim - 18) / 4) * (29-(66.13)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 29 + (((tickAnim - 22) / 3) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -17.37 + (((tickAnim - 25) / 3) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 56.75 + (((tickAnim - 28) / 4) * (66.13-(56.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 66.13 + (((tickAnim - 32) / 3) * (29-(66.13)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 29 + (((tickAnim - 35) / 3) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -17.37 + (((tickAnim - 38) / 4) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 56.75 + (((tickAnim - 42) / 8) * (0-(56.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 4) / 4) * (0.475-(0.575)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 7) * (0.475-(0.475)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 15) / 7) * (0.475-(0.475)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0.475 + (((tickAnim - 22) / 6) * (0.475-(0.475)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 28) / 7) * (0.475-(0.475)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 35) / 7) * (0.475-(0.475)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 42) / 8) * (0-(0.475)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGalleonosaurus entity = (EntityPrehistoricFloraGalleonosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 21.75 + (((tickAnim - 5) / 3) * (23.75-(21.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 23.75 + (((tickAnim - 8) / 8) * (0-(23.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 5) / 3) * (24.75-(17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 24.75 + (((tickAnim - 8) / 8) * (0-(24.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7.75 + (((tickAnim - 5) / 3) * (6-(7.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 6 + (((tickAnim - 8) / 8) * (0-(6)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 5) / 3) * (14-(12.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 14 + (((tickAnim - 8) / 8) * (0-(14)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.75 + (((tickAnim - 5) / 3) * (13-(10.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 13 + (((tickAnim - 8) / 8) * (0-(13)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.75 + (((tickAnim - 5) / 3) * (0-(22.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGalleonosaurus entity = (EntityPrehistoricFloraGalleonosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+50))*-0.3), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-0.1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625+30))*0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625))*-0.3);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623-200))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+230))*2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623-220))*4), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+280))*2), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-60))*3));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623+50))*-1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20+50))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30+50))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623-50))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623-70))*-2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623-90))*-2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623))*1.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(17.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.623-250))*-4), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+330))*3), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*3));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0.1);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.05);


        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625-50))*-3), rightarm1.rotateAngleY + (float) Math.toRadians(0), rightarm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625-130))*3), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625-50))*-3), leftarm1.rotateAngleY + (float) Math.toRadians(0), leftarm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625-130))*3), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.75 + (((tickAnim - 0) / 5) * (27.5-(14.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 27.5 + (((tickAnim - 5) / 6) * (-2.50772-(27.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (4.49571-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (-0.19669-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -2.50772 + (((tickAnim - 11) / 3) * (-9.25-(-2.50772)));
            yy = 4.49571 + (((tickAnim - 11) / 3) * (0-(4.49571)));
            zz = -0.19669 + (((tickAnim - 11) / 3) * (0-(-0.19669)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -9.25 + (((tickAnim - 14) / 11) * (14.75-(-9.25)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.5 + (((tickAnim - 0) / 4) * (28.25-(5.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 28.25 + (((tickAnim - 4) / 4) * (-8.755-(28.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -8.755 + (((tickAnim - 8) / 3) * (-29.5-(-8.755)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -29.5 + (((tickAnim - 11) / 3) * (-23.25-(-29.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -23.25 + (((tickAnim - 14) / 11) * (5.5-(-23.25)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 4) / 10) * (0-(0.35)));
            zz = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -25.5 + (((tickAnim - 5) / 3) * (-65.02-(-25.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -65.02 + (((tickAnim - 8) / 3) * (-50.33-(-65.02)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -50.33 + (((tickAnim - 11) / 3) * (-6.25-(-50.33)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -6.25 + (((tickAnim - 14) / 11) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(0);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(-0.35);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.25 + (((tickAnim - 0) / 5) * (118.75-(19.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 118.75 + (((tickAnim - 5) / 3) * (111.61-(118.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 111.61 + (((tickAnim - 8) / 3) * (109.67-(111.61)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 109.67 + (((tickAnim - 11) / 3) * (40-(109.67)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 40 + (((tickAnim - 14) / 7) * (1.85642-(40)));
            yy = 0 + (((tickAnim - 14) / 7) * (-0.5269-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (2.95341-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1.85642 + (((tickAnim - 21) / 4) * (19.25-(1.85642)));
            yy = -0.5269 + (((tickAnim - 21) / 4) * (0-(-0.5269)));
            zz = 2.95341 + (((tickAnim - 21) / 4) * (0-(2.95341)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.175-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 5) / 2) * (1.575-(0.525)));
            zz = 0.175 + (((tickAnim - 5) / 2) * (0.15-(0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.575 + (((tickAnim - 7) / 1) * (0.72-(1.575)));
            zz = 0.15 + (((tickAnim - 7) / 1) * (0.055-(0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.72 + (((tickAnim - 8) / 3) * (0.86-(0.72)));
            zz = 0.055 + (((tickAnim - 8) / 3) * (0.045-(0.055)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.86 + (((tickAnim - 11) / 3) * (-0.25-(0.86)));
            zz = 0.045 + (((tickAnim - 11) / 3) * (0.75-(0.045)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 14) / 2) * (0.35-(-0.25)));
            zz = 0.75 + (((tickAnim - 14) / 2) * (0.525-(0.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 16) / 5) * (1.025-(0.35)));
            zz = 0.525 + (((tickAnim - 16) / 5) * (0-(0.525)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 1.025 + (((tickAnim - 21) / 4) * (0-(1.025)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -9.25 + (((tickAnim - 0) / 16) * (23.25-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 23.25 + (((tickAnim - 16) / 6) * (-2.85467-(23.25)));
            yy = 0 + (((tickAnim - 16) / 6) * (-3.49666-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0.15286-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -2.85467 + (((tickAnim - 22) / 3) * (-9.25-(-2.85467)));
            yy = -3.49666 + (((tickAnim - 22) / 3) * (0-(-3.49666)));
            zz = 0.15286 + (((tickAnim - 22) / 3) * (0-(0.15286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -27.75 + (((tickAnim - 0) / 16) * (32.64-(-27.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 32.64 + (((tickAnim - 16) / 6) * (-7.255-(32.64)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -7.255 + (((tickAnim - 22) / 3) * (-27.75-(-7.255)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = -0.575 + (((tickAnim - 0) / 16) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.4 + (((tickAnim - 22) / 3) * (-0.575-(-0.4)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -8.75 + (((tickAnim - 0) / 16) * (-22.25-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -22.25 + (((tickAnim - 16) / 4) * (-64.25-(-22.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -64.25 + (((tickAnim - 20) / 3) * (-64.63-(-64.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -64.63 + (((tickAnim - 23) / 2) * (-8.75-(-64.63)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 57.75 + (((tickAnim - 0) / 6) * (17.45-(57.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 17.45 + (((tickAnim - 6) / 2) * (5-(17.45)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 5 + (((tickAnim - 8) / 8) * (90.25-(5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 90.25 + (((tickAnim - 16) / 7) * (100.66-(90.25)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 100.66 + (((tickAnim - 23) / 2) * (57.75-(100.66)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 6) * (0.6-(0.4)));
            zz = 0.75 + (((tickAnim - 0) / 6) * (0.6-(0.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 6) / 2) * (0-(0.6)));
            zz = 0.6 + (((tickAnim - 6) / 2) * (0-(0.6)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0.525-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0.275-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 16) / 2) * (0.85-(0.525)));
            zz = 0.275 + (((tickAnim - 16) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 18) / 5) * (0.46-(0.85)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.105-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.46 + (((tickAnim - 23) / 2) * (0.4-(0.46)));
            zz = -0.105 + (((tickAnim - 23) / 2) * (0.75-(-0.105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGalleonosaurus entity = (EntityPrehistoricFloraGalleonosaurus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335-20))*-6.5), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*-4), main.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+20))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+30))*-0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-20))*-1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+150))*-2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335+30))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+20))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+20))*6));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335+50))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+40))*7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+20))*-6));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335+90))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+60))*7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+20))*6));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335+220))*-10), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+150))*-19), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+20))*6));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335+180))*-15), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+120))*-10), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+20))*6));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335+50))*-5.75), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*-5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+170))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335-250))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+200))*3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335-250))*-9), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+130))*-5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+90))*3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0.1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0.35);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335+100))*4), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+150))*5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+130))*-3));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5))*-0.1 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*540/0.5))*-0.1)));
            zz = 0.475 + (((tickAnim - 0) / 5) * (0.78-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335-150))*-9), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+200))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(5.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335-50))*-6), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-200))*-5), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335-240))*8), rightarm1.rotateAngleY + (float) Math.toRadians(0), rightarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+130))*-3));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335+290))*8), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+130))*-3));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(0), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335-240))*8), leftarm1.rotateAngleY + (float) Math.toRadians(0), leftarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+130))*-3));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.335+290))*8), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+130))*-3));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(0), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 53.71859 + (((tickAnim - 0) / 6) * (-22.08835-(53.71859)));
            yy = 11.49009 + (((tickAnim - 0) / 6) * (-3.54426-(11.49009)));
            zz = 3.24075 + (((tickAnim - 0) / 6) * (2.09803-(3.24075)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -22.08835 + (((tickAnim - 6) / 7) * (53.71859-(-22.08835)));
            yy = -3.54426 + (((tickAnim - 6) / 7) * (11.49009-(-3.54426)));
            zz = 2.09803 + (((tickAnim - 6) / 7) * (3.24075-(2.09803)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5.42558 + (((tickAnim - 0) / 2) * (35.57442-(-5.42558)));
            yy = 7.72351 + (((tickAnim - 0) / 2) * (7.72351-(7.72351)));
            zz = -3.75484 + (((tickAnim - 0) / 2) * (-3.75484-(-3.75484)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 35.57442 + (((tickAnim - 2) / 2) * (-18.50956-(35.57442)));
            yy = 7.72351 + (((tickAnim - 2) / 2) * (1.50329-(7.72351)));
            zz = -3.75484 + (((tickAnim - 2) / 2) * (-0.73083-(-3.75484)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -18.50956 + (((tickAnim - 4) / 2) * (-27.75-(-18.50956)));
            yy = 1.50329 + (((tickAnim - 4) / 2) * (0-(1.50329)));
            zz = -0.73083 + (((tickAnim - 4) / 2) * (0-(-0.73083)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -27.75 + (((tickAnim - 6) / 7) * (-5.42558-(-27.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (7.72351-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-3.75484-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.93 + (((tickAnim - 0) / 2) * (0.93-(0.93)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0.93 + (((tickAnim - 2) / 4) * (-1.025-(0.93)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -1.025 + (((tickAnim - 6) / 7) * (0.93-(-1.025)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.75 + (((tickAnim - 0) / 2) * (-52-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -52 + (((tickAnim - 2) / 2) * (-68.45-(-52)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -68.45 + (((tickAnim - 4) / 2) * (-4.00797-(-68.45)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.36941-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-2.47257-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -4.00797 + (((tickAnim - 6) / 7) * (-4.75-(-4.00797)));
            yy = 0.36941 + (((tickAnim - 6) / 7) * (0-(0.36941)));
            zz = -2.47257 + (((tickAnim - 6) / 7) * (0-(-2.47257)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 2) / 4) * (-0.325-(0.45)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 6) / 7) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 102.75 + (((tickAnim - 0) / 2) * (97.07-(102.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 97.07 + (((tickAnim - 2) / 2) * (116.38-(97.07)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 116.38 + (((tickAnim - 4) / 2) * (61.46131-(116.38)));
            yy = 0 + (((tickAnim - 4) / 2) * (1.92785-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (2.299-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 61.46131 + (((tickAnim - 6) / 2) * (34.69-(61.46131)));
            yy = 1.92785 + (((tickAnim - 6) / 2) * (0-(1.92785)));
            zz = 2.299 + (((tickAnim - 6) / 2) * (0-(2.299)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 34.69 + (((tickAnim - 8) / 3) * (38.6-(34.69)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 38.6 + (((tickAnim - 11) / 2) * (102.75-(38.6)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 4) * (0.86-(0.525)));
            zz = 0.1 + (((tickAnim - 0) / 4) * (0.24-(0.1)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.86 + (((tickAnim - 4) / 2) * (0.05-(0.86)));
            zz = 0.24 + (((tickAnim - 4) / 2) * (0.75-(0.24)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.05 + (((tickAnim - 6) / 1) * (0.7-(0.05)));
            zz = 0.75 + (((tickAnim - 6) / 1) * (0.5-(0.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.7 + (((tickAnim - 7) / 1) * (1.41-(0.7)));
            zz = 0.5 + (((tickAnim - 7) / 1) * (0.52-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.41 + (((tickAnim - 8) / 0) * (2.45-(1.41)));
            zz = 0.52 + (((tickAnim - 8) / 0) * (0.4-(0.52)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.45 + (((tickAnim - 8) / 1) * (2.71-(2.45)));
            zz = 0.4 + (((tickAnim - 8) / 1) * (0.29-(0.4)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 2.71 + (((tickAnim - 9) / 1) * (1.67-(2.71)));
            zz = 0.29 + (((tickAnim - 9) / 1) * (0.17-(0.29)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 1.67 + (((tickAnim - 10) / 1) * (0.525-(1.67)));
            zz = 0.17 + (((tickAnim - 10) / 1) * (0-(0.17)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 11) / 2) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -22.223 + (((tickAnim - 0) / 6) * (50.51323-(-22.223)));
            yy = 2.50701 + (((tickAnim - 0) / 6) * (-10.3546-(2.50701)));
            zz = 4.6485 + (((tickAnim - 0) / 6) * (-2.9045-(4.6485)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 50.51323 + (((tickAnim - 6) / 7) * (-22.223-(50.51323)));
            yy = -10.3546 + (((tickAnim - 6) / 7) * (2.50701-(-10.3546)));
            zz = -2.9045 + (((tickAnim - 6) / 7) * (4.6485-(-2.9045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -18 + (((tickAnim - 0) / 6) * (2.75-(-18)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 2.75 + (((tickAnim - 6) / 2) * (40.5-(2.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 40.5 + (((tickAnim - 8) / 4) * (-29-(40.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -29 + (((tickAnim - 12) / 1) * (-18-(-29)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -1.025 + (((tickAnim - 0) / 6) * (-0.1-(-1.025)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 6) / 2) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 5) * (-1.025-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -7.50797 + (((tickAnim - 0) / 6) * (0.75-(-7.50797)));
            yy = 0.36941 + (((tickAnim - 0) / 6) * (0-(0.36941)));
            zz = -2.47257 + (((tickAnim - 0) / 6) * (0-(-2.47257)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.75 + (((tickAnim - 6) / 2) * (-65.44-(0.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -65.44 + (((tickAnim - 8) / 4) * (-54.51-(-65.44)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -54.51 + (((tickAnim - 12) / 1) * (-7.50797-(-54.51)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.36941-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-2.47257-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 6) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0.325-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 12) / 1) * (-0.325-(0.325)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 48.71131 + (((tickAnim - 0) / 1) * (33.77566-(48.71131)));
            yy = 1.92785 + (((tickAnim - 0) / 1) * (0.96392-(1.92785)));
            zz = -2.299 + (((tickAnim - 0) / 1) * (-1.1495-(-2.299)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 33.77566 + (((tickAnim - 1) / 1) * (22.59-(33.77566)));
            yy = 0.96392 + (((tickAnim - 1) / 1) * (0-(0.96392)));
            zz = -1.1495 + (((tickAnim - 1) / 1) * (0-(-1.1495)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 22.59 + (((tickAnim - 2) / 1) * (13.14-(22.59)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 13.14 + (((tickAnim - 3) / 1) * (44.5-(13.14)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 44.5 + (((tickAnim - 4) / 2) * (94-(44.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 94 + (((tickAnim - 6) / 2) * (102.47-(94)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 102.47 + (((tickAnim - 8) / 4) * (120.73-(102.47)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 120.73 + (((tickAnim - 12) / 1) * (48.71131-(120.73)));
            yy = 0 + (((tickAnim - 12) / 1) * (1.92785-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-2.299-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 1) * (0.95-(0.05)));
            zz = 0.75 + (((tickAnim - 0) / 1) * (0-(0.75)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.95 + (((tickAnim - 1) / 1) * (2.19-(0.95)));
            zz = 0 + (((tickAnim - 1) / 1) * (0.59-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.19 + (((tickAnim - 2) / 1) * (2.2-(2.19)));
            zz = 0.59 + (((tickAnim - 2) / 1) * (0-(0.59)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 2.2 + (((tickAnim - 3) / 1) * (0.625-(2.2)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 4) / 2) * (1-(0.625)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 6) / 2) * (1.115-(1)));
            zz = 0.175 + (((tickAnim - 6) / 2) * (0.09-(0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.115 + (((tickAnim - 8) / 4) * (0.84-(1.115)));
            zz = 0.09 + (((tickAnim - 8) / 4) * (0.28-(0.09)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.84 + (((tickAnim - 12) / 1) * (0.05-(0.84)));
            zz = 0.28 + (((tickAnim - 12) / 1) * (0.75-(0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGalleonosaurus e = (EntityPrehistoricFloraGalleonosaurus) entity;
        animator.update(entity);


    }
}
