package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelScaphitesShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer rightKnobs;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftKnobs;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer shell10;
    private final AdvancedModelRenderer shell11;
    private final AdvancedModelRenderer shell12;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer rightMemebrane;
    private final AdvancedModelRenderer rightUpperMembrane;
    private final AdvancedModelRenderer rightLowerMembrane;
    private final AdvancedModelRenderer leftMemebrane;
    private final AdvancedModelRenderer leftUpperMembrane;
    private final AdvancedModelRenderer leftLowerMembrane;
    private final AdvancedModelRenderer bottomMembrane;
    private final AdvancedModelRenderer topMembrane;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle1c;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle6c;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle10;

    public ModelScaphitesShell() {
        this.textureWidth = 88;
        this.textureHeight = 88;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -17.25F, 2.8F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, -0.5236F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 35, 0, -4.0F, 4.5447F, 2.6283F, 8, 4, 6, 0.0F, false));

        this.rightKnobs = new AdvancedModelRenderer(this);
        this.rightKnobs.setRotationPoint(-4.0F, 8.5447F, 4.6283F);
        this.shell.addChild(rightKnobs);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.075F, -2.25F, -10.5F);
        this.rightKnobs.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 72, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.725F, -0.25F, -9.5F);
        this.rightKnobs.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5672F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 72, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.6F, 1.5F, -7.5F);
        this.rightKnobs.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 72, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.575F, 2.0F, -5.25F);
        this.rightKnobs.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 72, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.275F, 1.5F, -3.0F);
        this.rightKnobs.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 72, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.175F, 0.5F, -1.0F);
        this.rightKnobs.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6981F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 72, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.rightKnobs.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 72, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.leftKnobs = new AdvancedModelRenderer(this);
        this.leftKnobs.setRotationPoint(4.0F, 8.5447F, 4.6283F);
        this.shell.addChild(leftKnobs);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.075F, -2.25F, -10.5F);
        this.leftKnobs.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 72, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.725F, -0.25F, -9.5F);
        this.leftKnobs.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5672F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 1, 72, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.6F, 1.5F, -7.5F);
        this.leftKnobs.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 1, 72, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.575F, 2.0F, -5.25F);
        this.leftKnobs.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 1, 72, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.275F, 1.5F, -3.0F);
        this.leftKnobs.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 1, 72, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.175F, 0.5F, -1.0F);
        this.leftKnobs.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 1, 72, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.leftKnobs.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 1, 72, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 8.5447F, 8.6283F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.7199F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 36, -4.0F, 0.0F, -6.0F, 8, 4, 6, -0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.3752F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 31, 34, -4.0F, 0.0F, -7.0F, 8, 5, 7, -0.02F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.5585F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 31, 18, -3.5F, 0.0F, -8.0F, 7, 7, 8, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.8945F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 0, 0, -3.5F, 0.0F, -10.0F, 7, 7, 10, -0.01F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.7069F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 0, 18, -3.0F, 0.0F, -9.0F, 6, 8, 9, -0.01F, false));
        this.shell6.cubeList.add(new ModelBox(shell6, 62, 34, -1.0F, 8.0F, -9.0F, 2, 2, 2, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.4756F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 47, -2.5F, 0.0F, -7.0F, 5, 7, 7, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.9599F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 25, 47, -2.0F, 0.0F, -6.0F, 4, 6, 6, 0.0F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -0.7898F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 46, 47, -2.0F, 0.0F, -5.0F, 4, 5, 5, -0.01F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, -0.7898F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 46, 58, -2.0F, 0.0F, -5.0F, 4, 5, 5, -0.02F, false));

        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.shell10.addChild(shell11);
        this.setRotateAngle(shell11, -0.8727F, 0.0F, 0.0F);
        this.shell11.cubeList.add(new ModelBox(shell11, 25, 60, -1.5F, 0.0F, -4.0F, 3, 4, 4, 0.0F, false));

        this.shell12 = new AdvancedModelRenderer(this);
        this.shell12.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.shell11.addChild(shell12);
        this.setRotateAngle(shell12, -0.7505F, 0.0F, 0.0F);
        this.shell12.cubeList.add(new ModelBox(shell12, 62, 21, -1.5F, 0.0F, -2.0F, 3, 2, 2, -0.01F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 4.5447F, 3.6283F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.4276F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 58, 11, -3.0F, -4.0F, 1.0F, 6, 2, 3, 0.0F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 64, 0, -0.5F, -5.0F, 1.5F, 1, 1, 2, 0.0F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 35, 11, -3.5F, -2.0F, 0.0F, 7, 2, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, -4.0F, 1.0F);
        this.mantle.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4712F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 62, -4.0F, 0.0F, 0.0F, 6, 2, 1, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, -3.782F, 0.908F);
        this.mantle.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4712F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 17, -4.0F, 0.0F, 0.0F, 6, 2, 1, -0.02F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -2.5288F, 4.0445F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, 0.8727F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 64, 4, -0.5F, -0.47F, -0.6802F, 1, 1, 2, 0.0F, false));

        this.rightMemebrane = new AdvancedModelRenderer(this);
        this.rightMemebrane.setRotationPoint(-2.5F, -3.5F, 2.5F);
        this.mantle.addChild(rightMemebrane);
        this.setRotateAngle(rightMemebrane, 0.0F, 0.0F, -0.48F);


        this.rightUpperMembrane = new AdvancedModelRenderer(this);
        this.rightUpperMembrane.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.rightMemebrane.addChild(rightUpperMembrane);
        this.setRotateAngle(rightUpperMembrane, 0.0F, -0.5672F, 0.0F);
        this.rightUpperMembrane.cubeList.add(new ModelBox(rightUpperMembrane, 62, 39, 0.0F, -1.0F, -2.0F, 0, 3, 2, 0.0F, false));

        this.rightLowerMembrane = new AdvancedModelRenderer(this);
        this.rightLowerMembrane.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.rightMemebrane.addChild(rightLowerMembrane);
        this.setRotateAngle(rightLowerMembrane, 0.0F, 0.48F, 0.0F);
        this.rightLowerMembrane.cubeList.add(new ModelBox(rightLowerMembrane, 40, 60, 0.0F, -1.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.leftMemebrane = new AdvancedModelRenderer(this);
        this.leftMemebrane.setRotationPoint(2.5F, -3.5F, 2.5F);
        this.mantle.addChild(leftMemebrane);
        this.setRotateAngle(leftMemebrane, 0.0F, 0.0F, 0.48F);


        this.leftUpperMembrane = new AdvancedModelRenderer(this);
        this.leftUpperMembrane.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.leftMemebrane.addChild(leftUpperMembrane);
        this.setRotateAngle(leftUpperMembrane, 0.0F, 0.5672F, 0.0F);
        this.leftUpperMembrane.cubeList.add(new ModelBox(leftUpperMembrane, 62, 39, 0.0F, -1.0F, -2.0F, 0, 3, 2, 0.0F, true));

        this.leftLowerMembrane = new AdvancedModelRenderer(this);
        this.leftLowerMembrane.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.leftMemebrane.addChild(leftLowerMembrane);
        this.setRotateAngle(leftLowerMembrane, 0.0F, -0.48F, 0.0F);
        this.leftLowerMembrane.cubeList.add(new ModelBox(leftLowerMembrane, 40, 60, 0.0F, -1.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.bottomMembrane = new AdvancedModelRenderer(this);
        this.bottomMembrane.setRotationPoint(0.0F, -3.5F, 3.5F);
        this.mantle.addChild(bottomMembrane);
        this.setRotateAngle(bottomMembrane, -0.6545F, 0.0F, 0.0F);
        this.bottomMembrane.cubeList.add(new ModelBox(bottomMembrane, 62, 26, -2.5F, -2.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.topMembrane = new AdvancedModelRenderer(this);
        this.topMembrane.setRotationPoint(0.0F, -3.5F, 1.5F);
        this.mantle.addChild(topMembrane);
        this.setRotateAngle(topMembrane, 0.6545F, 0.0F, 0.0F);
        this.topMembrane.cubeList.add(new ModelBox(topMembrane, 62, 30, -2.5F, -2.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(3.5F, -2.0F, 2.0F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.0F, 0.9163F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 15, 62, -1.4F, -0.25F, -1.0F, 2, 2, 2, 0.0F, false));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 10, 66, -0.9F, -0.35F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-3.5F, -2.0F, 2.0F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, 0.0F, -0.9163F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 15, 62, -0.6F, -0.25F, -1.0F, 2, 2, 2, 0.0F, true));
        this.rightEye.cubeList.add(new ModelBox(rightEye, 10, 66, -0.1F, -0.35F, -0.5F, 1, 2, 1, 0.0F, true));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-0.75F, -3.5F, 3.5F);
        this.mantle.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, -0.6545F, 0.0F, 0.0F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 65, 45, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, -0.1289F, -0.0227F, -0.1731F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 0, 66, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle1c = new AdvancedModelRenderer(this);
        this.tentacle1c.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.tentacle1b.addChild(tentacle1c);
        this.setRotateAngle(tentacle1c, 0.3095F, -0.0376F, -0.215F);
        this.tentacle1c.cubeList.add(new ModelBox(tentacle1c, 40, 66, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));
        this.tentacle1c.cubeList.add(new ModelBox(tentacle1c, 5, 66, 0.0F, -3.5F, -2.0F, 0, 2, 2, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-2.0F, -3.5F, 3.5F);
        this.mantle.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.6239F, 0.639F, -0.7333F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 65, 50, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(-2.5F, -3.5F, 2.5F);
        this.mantle.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, 0.0F, -0.48F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 65, 55, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-2.0F, -3.5F, 1.5F);
        this.mantle.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.6574F, -0.632F, -0.7922F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 65, 60, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-0.75F, -3.5F, 1.5F);
        this.mantle.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.6545F, 0.0F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 65, 65, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(0.75F, -3.5F, 3.5F);
        this.mantle.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, -0.6545F, 0.0F, 0.0F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 65, 45, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, -0.1289F, 0.0227F, 0.1731F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 0, 66, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.tentacle6c = new AdvancedModelRenderer(this);
        this.tentacle6c.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.tentacle6b.addChild(tentacle6c);
        this.setRotateAngle(tentacle6c, 0.3095F, 0.0376F, 0.215F);
        this.tentacle6c.cubeList.add(new ModelBox(tentacle6c, 40, 66, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, true));
        this.tentacle6c.cubeList.add(new ModelBox(tentacle6c, 5, 66, 0.0F, -3.5F, -2.0F, 0, 2, 2, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(2.0F, -3.5F, 3.5F);
        this.mantle.addChild(tentacle7);
        this.setRotateAngle(tentacle7, -0.6239F, -0.639F, 0.7333F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 65, 50, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(2.5F, -3.5F, 2.5F);
        this.mantle.addChild(tentacle8);
        this.setRotateAngle(tentacle8, 0.0F, 0.0F, 0.48F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 65, 55, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(2.0F, -3.5F, 1.5F);
        this.mantle.addChild(tentacle9);
        this.setRotateAngle(tentacle9, 0.6574F, 0.632F, 0.7922F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 65, 60, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(0.75F, -3.5F, 1.5F);
        this.mantle.addChild(tentacle10);
        this.setRotateAngle(tentacle10, 0.6545F, 0.0F, 0.0F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 65, 65, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.offsetY = -1.0F;
        //this.Root.offsetZ = 1.0F;
        //this.base.rotateAngleX = (float) Math.toRadians(25);
        this.base.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
