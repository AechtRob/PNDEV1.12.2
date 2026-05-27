package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGolshanichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
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
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer frontfinLeft;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer tailFin;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer backfinLeft;
    private final AdvancedModelRenderer backfinRight;
    private final AdvancedModelRenderer frontfinRight;
    private final AdvancedModelRenderer cube_r57;
    private ModelAnimator animator;

    public ModelGolshanichthys() {
        animator = ModelAnimator.create();
        this.textureWidth = 82;
        this.textureHeight = 82;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.0F, -6.2F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(4.975F, 2.6F, 1.1F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1037F, 0.388F, -0.0239F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 8, -3.0F, -4.0F, -1.5F, 3, 5, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.975F, 2.6F, 1.1F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1037F, -0.388F, 0.0239F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 8, 0.0F, -4.0F, -1.5F, 3, 5, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.8F, 4.525F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0611F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 32, -4.0F, -1.0F, -1.125F, 8, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.51F, 4.4659F, 0.7051F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1963F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 44, -4.01F, -2.0F, -2.0F, 7, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.95F, 2.2F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 0, -4.5F, 0.0F, 0.0F, 9, 2, 5, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.99F, -1.9107F, 2.3615F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2007F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 1, -5.99F, -0.01F, -2.99F, 8, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.8739F, 3.4523F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1353F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 33, -4.5F, -1.0F, -3.0F, 9, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.15F, -0.575F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0087F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 20, -5.0F, -3.0F, 2.025F, 10, 5, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.025F, 0.0F);
        this.main.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.2266F, 2.7287F, -0.9056F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1062F, -0.3967F, 0.1403F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 56, 0.0F, -2.0F, -3.0F, 2, 2, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.3611F, -1.1802F, 0.5405F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0866F, 0.4387F, 0.0047F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 58, 0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(4.2266F, 2.7287F, -0.9056F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1062F, 0.3967F, -0.1403F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 49, 56, -2.0F, -2.0F, -3.0F, 2, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.4725F, -0.3798F, -5.4189F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2714F, -0.5379F, -0.1043F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 65, 6, 0.01F, 0.01F, 0.01F, 1, 2, 2, 0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.775F, 0.3162F, -4.8202F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2419F, -0.567F, -0.0217F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 67, 17, -0.005F, -0.975F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.3611F, -1.1802F, 0.5405F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0866F, -0.4387F, -0.0047F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 58, -2.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.0524F, 2.5357F, -3.4666F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7045F, -0.494F, 0.2442F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 55, 63, 0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.975F, 1.727F, -3.9089F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2518F, -0.8295F, -0.1619F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 64, 0.0F, -1.0F, -2.0F, 0, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.1F, 1.427F, -5.3589F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1543F, 0.28F, 0.1732F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 51, -1.025F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.276F, 0.5895F, -5.2293F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6343F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 63, -1.5F, -1.0F, 0.0F, 2, 1, 3, 0.001F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 63, 0.052F, -1.0F, 0.0F, 2, 1, 3, 0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.675F, 0.652F, -3.4839F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.046F, -0.6005F, 0.1257F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 27, 17, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.2F, -0.248F, -5.8339F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2793F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 65, 14, -1.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.775F, 0.3162F, -4.8202F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2419F, 0.567F, 0.0217F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 67, 17, -0.995F, -0.975F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.4725F, -0.3798F, -5.4189F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2714F, 0.5379F, 0.1043F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 65, 6, -1.01F, 0.01F, 0.01F, 1, 2, 2, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.975F, 1.727F, -3.9089F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2518F, 0.8295F, 0.1619F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 64, 0.0F, -1.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.1F, 1.427F, -5.3589F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1543F, -0.28F, -0.1732F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 28, 51, 0.025F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.0524F, 2.5357F, -3.4666F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.7045F, 0.494F, -0.2442F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 55, 63, -1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.923F, -3.5839F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2793F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 54, 28, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.675F, 0.652F, -3.4839F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.046F, 0.6005F, -0.1257F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 27, 17, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.475F, -0.919F, -3.5767F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1047F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 13, 44, -2.025F, -0.001F, -0.001F, 5, 1, 4, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.601F, -1.8478F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1833F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.3F, 0.321F, -3.3225F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0831F, -0.6686F, 0.1168F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 65, 28, 0.208F, -1.0565F, -0.1622F, 0, 1, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.025F, -0.629F, -3.5725F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1284F, 0.1928F, -0.2361F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 53, -1.0F, -0.4F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.2566F, -0.3763F, -1.8912F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1504F, -0.6796F, 0.1252F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 65, 10, 0.0066F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.383F, -0.2932F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.048F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 43, 39, -3.5F, -1.99F, -0.01F, 7, 2, 2, -0.03F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.013F, -0.427F, -1.9603F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.8814F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 56, 0, -2.513F, -3.0F, 0.0F, 5, 3, 2, -0.001F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.001F, 0.7538F, -1.155F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1876F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 53, 44, -2.499F, -1.0F, -1.0F, 5, 1, 2, 0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.001F, 1.1038F, -1.23F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1876F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 67, 44, -2.499F, -1.0F, -1.0F, 5, 1, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.3F, 0.321F, -3.3225F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0831F, 0.6686F, -0.1168F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 65, 28, -0.208F, -1.0565F, -0.1622F, 0, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.025F, -0.629F, -3.5725F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1284F, -0.1928F, 0.2361F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 28, 53, 0.0F, -0.4F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(2.2566F, -0.3763F, -1.8912F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1504F, 0.6796F, -0.1252F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 65, 10, -1.0066F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.646F, -2.8725F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.2487F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 65, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.frontfinLeft = new AdvancedModelRenderer(this);
        this.frontfinLeft.setRotationPoint(4.5F, 2.925F, 1.575F);
        this.main.addChild(frontfinLeft);
        this.setRotateAngle(frontfinLeft, 0.0873F, -0.0436F, -0.8727F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.frontfinLeft.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.1004F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 44, 0.0F, 0.0F, 0.0F, 0, 7, 6, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.65F, 6.525F);
        this.main.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 27, 8, -4.0F, -0.975F, 0.225F, 8, 4, 4, -0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -2.125F, 2.25F);
        this.tail1.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2618F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 56, 17, 0.0F, -5.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 3.875F, 1.275F);
        this.tail1.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0873F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 38, -3.5F, -1.0F, -1.0F, 7, 1, 4, 0.001F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.tail1.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1484F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 33, 17, -3.5F, -2.0F, 0.0F, 7, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 4.025F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 24, -3.0F, -0.8F, -0.1F, 6, 3, 4, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 3.325F, 0.05F);
        this.tail2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1353F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 50, 32, -2.5F, -2.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -2.125F, 0.05F);
        this.tail2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.2356F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 49, 49, -2.5F, 0.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.35F, 4.325F);
        this.tail2.addChild(tail3);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 3.725F, 0.875F);
        this.tail3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1658F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 13, 64, 0.0F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 1.5F, 1.05F);
        this.tail3.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0175F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 62, 56, -1.5F, -2.0F, 1.425F, 3, 2, 3, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -1.15F, -1.225F);
        this.tail3.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.1178F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 62, 62, -1.0F, 0.0F, 3.275F, 2, 1, 3, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -1.425F, -0.475F);
        this.tail3.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.2051F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 26, 58, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 2.15F, 0.025F);
        this.tail3.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1134F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 37, 63, -1.0F, -1.0F, 2.39F, 2, 1, 3, -0.01F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 2.425F, -0.45F);
        this.tail3.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1745F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 61, 39, -1.5F, -1.0F, 0.0F, 3, 1, 3, -0.01F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 1.525F, 1.45F);
        this.tail3.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0175F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 13, 51, -2.0F, -2.0F, -2.0F, 4, 2, 3, 0.0F, false));

        this.tailFin = new AdvancedModelRenderer(this);
        this.tailFin.setRotationPoint(0.0F, 0.575F, 5.05F);
        this.tail3.addChild(tailFin);
        this.setRotateAngle(tailFin, 0.0698F, 0.0F, 0.0F);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, -0.025F, -0.775F);
        this.tailFin.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.4974F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 0, 0.0F, -0.1465F, -0.0077F, 0, 6, 13, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 0.6622F, 1.8124F);
        this.tailFin.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.7025F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 13, 57, -0.5F, -1.0F, 0.0F, 1, 1, 5, -0.001F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, -1.425F, 1.425F);
        this.tailFin.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.4974F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 32, 49, -0.5F, 0.0F, -1.0F, 1, 1, 7, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.825F, 0.825F);
        this.tailFin.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.1658F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 39, 58, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.001F, false));

        this.backfinLeft = new AdvancedModelRenderer(this);
        this.backfinLeft.setRotationPoint(2.375F, 3.275F, 0.45F);
        this.tail2.addChild(backfinLeft);
        this.setRotateAngle(backfinLeft, 0.1745F, 0.0698F, -0.8727F);
        this.backfinLeft.cubeList.add(new ModelBox(backfinLeft, 48, 63, 0.0311F, -0.3473F, -0.0349F, 0, 3, 3, 0.0F, false));

        this.backfinRight = new AdvancedModelRenderer(this);
        this.backfinRight.setRotationPoint(-2.375F, 3.275F, 0.45F);
        this.tail2.addChild(backfinRight);
        this.setRotateAngle(backfinRight, 0.1745F, -0.0698F, 0.8727F);
        this.backfinRight.cubeList.add(new ModelBox(backfinRight, 48, 63, -0.0311F, -0.3473F, -0.0349F, 0, 3, 3, 0.0F, true));

        this.frontfinRight = new AdvancedModelRenderer(this);
        this.frontfinRight.setRotationPoint(-4.5F, 2.925F, 1.575F);
        this.main.addChild(frontfinRight);
        this.setRotateAngle(frontfinRight, 0.0873F, 0.0436F, 0.8727F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.frontfinRight.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.1004F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 44, 0.0F, 0.0F, 0.0F, 0, 7, 6, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3, this.tailFin};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontfinLeft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontfinLeft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontfinRight, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontfinRight, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backfinLeft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backfinLeft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backfinRight, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backfinRight, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }

}
