package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEffigia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer bodyback;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer bodymiddle;
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
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ArmL2;
    private final AdvancedModelRenderer ArmL3;
    private final AdvancedModelRenderer ArmL4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;

    public ModelSkeletonEffigia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.85F, -8.0F);


        this.bodyback = new AdvancedModelRenderer(this);
        this.bodyback.setRotationPoint(0.0F, -18.0F, 7.0F);
        this.body.addChild(bodyback);
        this.setRotateAngle(bodyback, -0.0436F, 0.0F, 0.0F);
        this.bodyback.cubeList.add(new ModelBox(bodyback, 23, 31, -0.5F, -3.1F, 0.0F, 1, 1, 7, 0.0F, false));
        this.bodyback.cubeList.add(new ModelBox(bodyback, 30, 17, 1.0F, -3.8F, 0.0F, 1, 3, 7, 0.0F, false));
        this.bodyback.cubeList.add(new ModelBox(bodyback, 30, 17, -2.0F, -3.8F, 0.0F, 1, 3, 7, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.0F, 3.0F);
        this.bodyback.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7854F, 0.0F, -0.2182F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 17, -1.0F, 0.3243F, 0.4243F, 1, 5, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -1.0F, 3.0F);
        this.bodyback.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3752F, 0.0F, -0.2182F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 7, -1.0F, 2.6022F, -6.7863F, 1, 1, 4, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.0F, 3.0F);
        this.bodyback.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5672F, 0.0F, -0.2182F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 51, -1.0F, -0.0254F, -1.9868F, 1, 7, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -1.0F, 3.0F);
        this.bodyback.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3752F, 0.0F, 0.2182F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 7, 0.0F, 2.6022F, -6.7863F, 1, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -1.0F, 3.0F);
        this.bodyback.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, 0.0F, 0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 51, 0.0F, -0.0254F, -1.9868F, 1, 7, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -1.0F, 3.0F);
        this.bodyback.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.7854F, 0.0F, 0.2182F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 17, 0.0F, 0.3243F, 0.4243F, 1, 5, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(2.7F, -1.35F, 3.45F);
        this.bodyback.addChild(legL);
        this.setRotateAngle(legL, -0.2611F, -0.4917F, -0.1178F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, -1.35F, -0.474F, -1.0672F, 2, 9, 2, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, 8.0824F, -0.7681F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.7854F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 47, 22, -2.02F, 0.0F, -0.24F, 2, 9, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 20, 47, -2.02F, 0.0F, 1.16F, 2, 9, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.0F, 8.2F, 2.65F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.6981F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 29, -2.02F, 1.3911F, -2.1953F, 2, 6, 2, -0.01F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.0F, 7.5673F, -1.5213F);
        this.legL3.addChild(legL4);
        this.setRotateAngle(legL4, -0.9599F, 0.0F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 49, 42, -2.52F, -1.7193F, -1.0249F, 3, 2, 2, -0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.8307F, -0.2849F);
        this.legL4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 44, -2.52F, -0.65F, -0.74F, 3, 5, 2, -0.01F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(-2.7F, -1.35F, 3.45F);
        this.bodyback.addChild(legL5);
        this.setRotateAngle(legL5, -0.1262F, 0.1354F, 0.0265F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 0, -0.65F, -0.474F, -1.0672F, 2, 9, 2, 0.0F, true));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(-0.75F, 8.0824F, -0.7681F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, 0.5236F, 0.0F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 47, 22, 0.02F, 0.0F, -0.24F, 2, 9, 1, 0.0F, true));
        this.legL6.cubeList.add(new ModelBox(legL6, 20, 47, 0.02F, 0.0F, 1.16F, 2, 9, 1, 0.0F, true));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.0F, 8.2F, 2.65F);
        this.legL6.addChild(legL7);
        this.setRotateAngle(legL7, -0.7854F, 0.0F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 29, 0.02F, 1.3911F, -2.1953F, 2, 6, 2, -0.01F, true));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.0F, 7.5673F, -1.5213F);
        this.legL7.addChild(legL8);
        this.setRotateAngle(legL8, -1.0472F, 0.0F, 0.0F);
        this.legL8.cubeList.add(new ModelBox(legL8, 31, 44, -0.48F, 0.1807F, -1.0249F, 3, 5, 2, -0.01F, true));
        this.legL8.cubeList.add(new ModelBox(legL8, 49, 42, -0.48F, -1.7193F, -1.0249F, 3, 2, 2, -0.02F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.6F, 7.0F);
        this.bodyback.addChild(tail);
        this.setRotateAngle(tail, 0.0847F, 0.0019F, 0.0147F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.6939F, 3.8394F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6469F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 29, 0.0F, 1.6836F, 1.9769F, 0, 4, 1, 0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 0, 0.0F, 0.1149F, -0.003F, 0, 4, 1, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.6939F, 1.1394F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7341F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 22, 0.0F, 0.0319F, -0.0451F, 0, 3, 1, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.4061F, -1.8606F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 18, -0.5F, 0.0F, 1.0F, 1, 1, 11, 0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5939F, 9.7394F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 3, -0.5F, -0.5189F, -0.6887F, 1, 1, 12, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.4267F, -0.6888F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7341F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 17, 0.0F, 6.8836F, 7.5624F, 0, 1, 1, 0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 2, 0.0F, 5.6097F, 6.0205F, 0, 1, 1, 0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 8, 0.0F, 2.5491F, 3.1011F, 0, 3, 1, 0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 7, 0.0F, 4.1817F, 4.6061F, 0, 2, 1, 0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 0, 0.0F, 1.2753F, 1.5593F, 0, 3, 1, 0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 16, 0.0F, 0.0014F, 0.0174F, 0, 3, 1, 0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0189F, 11.2113F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2618F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, -0.459F, -0.0748F, 1, 1, 13, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.1031F, 0.0792F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6469F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 35, 0.0F, 1.1622F, -0.767F, 0, 1, 1, 0.001F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 6, 15, 0.0F, 2.4361F, 0.7748F, 0, 1, 1, 0.001F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 15, 0.0F, 3.71F, 2.3167F, 0, 1, 1, 0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.041F, 12.9252F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 15, -0.5F, -0.4103F, -0.1907F, 1, 1, 12, 0.0F, false));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -2.8F, 1.0F);
        this.bodyback.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, 0.2618F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 29, -0.5F, -0.3016F, -9.6742F, 1, 1, 10, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 9.6984F, -11.9742F);
        this.bodymiddle.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.153F, -0.0741F, 0.3414F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 37, -3.0F, -0.2116F, 4.0049F, 3, 0, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 25, -3.0F, -0.2116F, 6.0049F, 3, 0, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 0, -3.0F, -0.2116F, 8.0049F, 3, 0, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 9.6984F, -11.9742F);
        this.bodymiddle.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.153F, 0.0741F, -0.3414F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 0, 0.0F, -0.2116F, 8.0049F, 3, 0, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 25, 0.0F, -0.2116F, 6.0049F, 3, 0, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 37, 0.0F, -0.2116F, 4.0049F, 3, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 9.6984F, -11.9742F);
        this.bodymiddle.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 9, -1.0F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 2, -1.0F, 0.1F, 6.0F, 1, 0, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 31, -1.0F, 0.2F, 8.0F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1013F, -0.0546F, -0.2681F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 52, 2.3387F, 2.7056F, -1.0273F, 0, 4, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1147F, 0.0083F, -0.8321F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 52, 0.5334F, 0.5403F, -1.0273F, 0, 3, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0559F, -0.0562F, -0.8307F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 52, 0.5639F, 0.7284F, 0.9804F, 0, 3, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0169F, -0.0774F, -0.2625F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 52, 2.4655F, 2.8478F, 0.9804F, 0, 3, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0033F, -0.1205F, -0.8254F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 41, 0.9964F, 0.5439F, 2.9481F, 0, 3, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0678F, -0.0998F, -0.255F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 52, 2.7312F, 2.4599F, 2.9481F, 0, 3, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1528F, -0.1214F, -0.2456F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 8, 43, 3.0185F, 1.9522F, 4.7876F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0635F, -0.1844F, -0.8163F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 32, 8, 1.5115F, 0.2701F, 4.7876F, 0, 3, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1013F, 0.0546F, 0.2681F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 52, -1.5685F, 2.4991F, -0.964F, 0, 4, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0169F, 0.0774F, 0.2625F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 48, 52, -1.6952F, 2.6413F, 1.0437F, 0, 3, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0678F, 0.0998F, 0.255F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 42, 52, -1.9609F, 2.2534F, 3.0114F, 0, 3, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1528F, 0.1214F, 0.2456F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 8, 43, -2.2482F, 1.7456F, 4.8509F, 0, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0635F, 0.1844F, 0.8163F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 8, -0.9728F, -0.318F, 4.8509F, 0, 3, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0033F, 0.1205F, 0.8254F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 41, -0.4578F, -0.0442F, 3.0114F, 0, 3, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0559F, 0.0562F, 0.8307F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 45, 52, -0.0253F, 0.1403F, 1.0437F, 0, 3, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.4F, 0.533F, -8.2947F);
        this.bodymiddle.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1147F, -0.0083F, 0.8321F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 51, 52, 0.0052F, -0.0478F, -0.964F, 0, 3, 1, 0.0F, true));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.0484F, -9.0742F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0873F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 22, 17, -0.5F, 9.3409F, -5.7092F, 1, 0, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 8.8909F, -10.2092F);
        this.bodyfront.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3491F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 13, 31, -2.0F, -1.7F, -0.6F, 4, 1, 4, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-4.2F, 6.0246F, -8.8877F);
        this.bodyfront.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.515F, -0.3613F, -0.5584F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 15, 17, -0.5141F, -0.4384F, -0.8167F, 1, 3, 4, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.0F, 1.0246F, -4.8877F);
        this.bodyfront.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.5663F, 0.0039F, 0.4681F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 15, -0.1F, -0.6898F, -1.1696F, 1, 7, 3, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(4.2F, 6.0246F, -8.8877F);
        this.bodyfront.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.515F, 0.3613F, 0.5584F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 15, 17, -0.4859F, -0.4384F, -0.8167F, 1, 3, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(2.0F, 1.0246F, -4.8877F);
        this.bodyfront.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.5663F, -0.0039F, -0.4681F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 15, -0.9F, -0.6898F, -1.1696F, 1, 7, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.0403F, -5.4547F);
        this.bodyfront.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0785F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 0, -0.5F, -0.0016F, 0.9197F, 1, 1, 5, -0.001F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 0, -0.5F, -0.0016F, -0.0803F, 1, 1, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 9.6409F, 0.5908F);
        this.bodyfront.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0471F, 0.0298F, 0.3478F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 42, 10, -3.0F, -0.0179F, -6.29F, 3, 0, 1, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, 9.6409F, -3.1092F);
        this.bodyfront.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.158F, -0.0447F, 0.3463F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 8, 41, -3.1103F, -0.1922F, -0.5957F, 3, 0, 1, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 41, 0, -3.1103F, -0.1922F, 1.4043F, 3, 0, 1, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, 9.6409F, -3.1092F);
        this.bodyfront.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.158F, 0.0447F, -0.3463F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 41, 0, 0.1103F, -0.1922F, 1.4043F, 3, 0, 1, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 8, 41, 0.1103F, -0.1922F, -0.5957F, 3, 0, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 9.6409F, 0.5908F);
        this.bodyfront.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0471F, -0.0298F, -0.3478F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 42, 10, 0.0F, -0.0179F, -6.29F, 3, 0, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 1.6597F, -9.9547F);
        this.bodyfront.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2531F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 18, 40, -0.5F, -0.5208F, -0.298F, 1, 1, 5, 0.001F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.4F, 1.7915F, -8.4318F);
        this.bodyfront.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.2996F, 0.207F, -0.812F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 6, 54, 0.1263F, -0.0929F, -0.2642F, 0, 3, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2935F, 0.2007F, -0.8133F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 54, 1.0867F, -0.9628F, -0.1726F, 0, 3, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2032F, 0.1049F, -0.8271F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 53, 47, 1.1993F, -0.8458F, 1.8733F, 0, 3, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1147F, 0.0083F, -0.8321F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 53, 16, 1.5144F, -0.924F, 3.8285F, 0, 3, 1, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1013F, -0.0546F, -0.2681F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 9, 15, 2.3793F, 0.9436F, 3.8285F, 0, 5, 1, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2275F, -0.0195F, -0.2728F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 33, 31, 2.1556F, 1.1788F, 1.8733F, 0, 5, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.3536F, 0.0158F, -0.273F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 9, 0, 1.9978F, 1.1406F, -0.1726F, 0, 6, 1, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.4F, 1.7915F, -8.4318F);
        this.bodyfront.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.362F, 0.0181F, -0.2729F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 3, 54, 1.6551F, 2.3903F, -0.2642F, 0, 3, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.4F, 1.7915F, -8.4318F);
        this.bodyfront.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.2996F, -0.207F, 0.812F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 6, 54, -0.6649F, 0.4951F, -0.3275F, 0, 3, 1, 0.0F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.2935F, -0.2007F, 0.8133F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 54, -1.6254F, -0.3747F, -0.2358F, 0, 3, 1, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.2032F, -0.1049F, 0.8271F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 53, 47, -1.738F, -0.2577F, 1.8101F, 0, 3, 1, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1147F, -0.0083F, 0.8321F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 53, 16, -2.053F, -0.3359F, 3.7652F, 0, 3, 1, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1013F, 0.0546F, 0.2681F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 9, 15, -3.1496F, 1.1501F, 3.7652F, 0, 5, 1, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.2275F, 0.0195F, 0.2728F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 33, 31, -2.9259F, 1.3854F, 1.8101F, 0, 5, 1, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.4F, 2.373F, -6.3746F);
        this.bodyfront.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.3536F, -0.0158F, 0.273F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 9, 0, -2.768F, 1.3472F, -0.2358F, 0, 6, 1, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.4F, 1.7915F, -8.4318F);
        this.bodyfront.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.362F, -0.0181F, 0.2729F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 3, 54, -2.4254F, 2.5969F, -0.3275F, 0, 3, 1, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.5F, 9.6409F, -3.1092F);
        this.bodyfront.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.2182F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 22, 19, -1.0F, -0.2F, -0.6F, 1, 0, 1, 0.0F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 23, 7, -1.0F, -0.1F, 1.4F, 1, 0, 1, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(4.0F, 6.8909F, -7.2092F);
        this.bodyfront.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.6981F, 0.0F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 37, 52, -0.25F, 0.0F, -0.4F, 1, 6, 1, 0.0F, false));

        this.ArmL2 = new AdvancedModelRenderer(this);
        this.ArmL2.setRotationPoint(-0.15F, 5.05F, 0.3F);
        this.ArmL.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -1.8531F, 0.3786F, -0.1068F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 32, 52, -0.12F, 0.1587F, -0.1182F, 1, 6, 1, 0.0F, false));
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 11, 52, -0.12F, 0.1587F, -0.6182F, 1, 6, 1, -0.01F, false));

        this.ArmL3 = new AdvancedModelRenderer(this);
        this.ArmL3.setRotationPoint(-4.0F, 6.8909F, -7.2092F);
        this.bodyfront.addChild(ArmL3);
        this.setRotateAngle(ArmL3, 0.0873F, 0.0F, 0.0F);
        this.ArmL3.cubeList.add(new ModelBox(ArmL3, 37, 52, -0.75F, 0.0F, -0.4F, 1, 6, 1, 0.0F, true));

        this.ArmL4 = new AdvancedModelRenderer(this);
        this.ArmL4.setRotationPoint(0.15F, 5.05F, 0.3F);
        this.ArmL3.addChild(ArmL4);
        this.setRotateAngle(ArmL4, -0.756F, -0.4149F, -0.1393F);
        this.ArmL4.cubeList.add(new ModelBox(ArmL4, 32, 52, -0.88F, 0.1587F, -0.1182F, 1, 6, 1, 0.0F, true));
        this.ArmL4.cubeList.add(new ModelBox(ArmL4, 11, 52, -0.88F, 0.1587F, -0.6182F, 1, 6, 1, -0.01F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.3909F, -10.0592F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.4363F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 50, 0, -0.5F, 1.7261F, -4.9196F, 1, 1, 3, 0.001F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 2.3239F, -1.8685F);
        this.neck.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.7418F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 47, 33, -0.5F, -0.6978F, -0.3511F, 1, 1, 4, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.4F, 2.1776F, -2.9623F);
        this.neck.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 1.0968F, 0.7425F, -0.418F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 54, 21, -1.5293F, 1.8668F, 2.2997F, 0, 3, 1, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.4F, 2.1776F, -2.9623F);
        this.neck.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 1.3668F, 0.4024F, -0.3238F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 54, 26, -0.5226F, 1.1809F, -0.1439F, 0, 3, 1, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.4F, 2.1776F, -2.9623F);
        this.neck.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 1.0417F, 0.3169F, -0.3052F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 54, 31, 0.2281F, -0.6027F, -1.0844F, 0, 3, 1, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.4F, 2.1776F, -2.9623F);
        this.neck.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 1.0968F, -0.7425F, 0.418F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 54, 21, 0.9907F, 2.4549F, 2.2364F, 0, 3, 1, 0.0F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.4F, 2.1776F, -2.9623F);
        this.neck.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 1.3668F, -0.4024F, 0.3238F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 54, 26, -0.1753F, 1.5233F, -0.333F, 0, 3, 1, 0.0F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.4F, 2.1776F, -2.9623F);
        this.neck.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 1.0417F, -0.3169F, 0.3052F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 54, 31, -0.9531F, -0.2761F, -1.1719F, 0, 3, 1, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.2239F, -4.8685F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0436F, 0.0F, 0.0F);


        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, -1.4482F, -5.8492F);
        this.neck2.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.1745F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 32, 0, -0.5F, -0.15F, 0.25F, 1, 1, 6, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.4F, -0.0684F, -2.2217F);
        this.neck2.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.8708F, -0.3644F, 0.2455F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 54, 52, -0.1317F, -0.1444F, -0.1124F, 0, 3, 1, 0.0F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.4F, -0.2952F, -5.1335F);
        this.neck2.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 1.0454F, -0.3644F, 0.2455F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 55, 5, 0.0299F, 0.2391F, 0.296F, 0, 3, 1, 0.0F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.4F, -0.0684F, -2.2217F);
        this.neck2.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.8708F, 0.3644F, -0.2455F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 54, 52, 0.1317F, -0.1444F, -0.1124F, 0, 3, 1, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.4F, -0.2952F, -5.1335F);
        this.neck2.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 1.0454F, 0.3644F, -0.2455F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 55, 5, -0.0299F, 0.2391F, 0.296F, 0, 3, 1, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.1982F, -5.5992F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.5672F, 0.0F, 0.0F);


        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.4F, 0.4F, -1.6F);
        this.neck3.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.6439F, -0.3644F, 0.2455F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 56, 16, -0.0673F, 0.041F, -0.1604F, 0, 3, 1, 0.0F, true));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, 0.4F, -4.2F);
        this.neck3.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.9581F, -0.3644F, 0.2455F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 26, 31, -0.5F, 0.3313F, -0.0675F, 0, 2, 1, 0.0F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.4F, 0.4F, -1.6F);
        this.neck3.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.6439F, 0.3644F, -0.2455F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 56, 16, 0.0673F, 0.041F, -0.1604F, 0, 3, 1, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, 0.4F, -4.2F);
        this.neck3.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.9581F, 0.3644F, -0.2455F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 26, 31, 0.5F, 0.3313F, -0.0675F, 0, 2, 1, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 1.5F, -5.0F);
        this.neck3.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.48F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 16, 41, -0.5F, -1.475F, 0.15F, 1, 1, 2, -0.03F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.0F, -0.6F, -3.8F);
        this.neck3.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.1222F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 48, -0.5F, -0.2F, 0.05F, 1, 1, 4, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.2F, -3.95F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);


        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.3491F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 48, 10, 0.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 48, 10, -2.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(-1.5F, 0.0F, -8.5F);
        this.lowerjaw.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, -0.096F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 40, 15, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0125F, true));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.5F, 0.0F, -8.5F);
        this.lowerjaw.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0F, 0.096F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 40, 15, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0125F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 36, 36, -2.0F, -3.0F, -4.0F, 3, 3, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 36, 28, -1.5F, -1.0F, -8.5F, 2, 1, 5, 0.015F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, -1.0F, -8.5F);
        this.upperjaw.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.3054F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 26, 40, -1.5F, 1.0F, 3.0F, 2, 1, 2, 0.0F, false));
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 32, 8, -1.5F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(-1.5F, -1.0F, -8.5F);
        this.upperjaw.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, -0.096F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 0, 41, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0125F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(0.5F, -1.0F, -8.5F);
        this.upperjaw.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, 0.096F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 42, 3, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0125F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(-2.0F, -2.0F, -4.0F);
        this.upperjaw.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, -0.0873F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 42, 44, 0.0F, -1.0F, 0.0F, 1, 3, 4, -0.01F, true));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(1.0F, -2.0F, -4.0F);
        this.upperjaw.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, 0.0873F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 42, 44, -1.0F, -1.0F, 0.0F, 1, 3, 4, -0.01F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
