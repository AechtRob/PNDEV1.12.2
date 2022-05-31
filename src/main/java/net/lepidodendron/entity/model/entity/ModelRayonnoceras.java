package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraRayonnoceras;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRayonnoceras extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer shellcover1;
    private final AdvancedModelRenderer shellcover2;
    private final AdvancedModelRenderer shellcover3;
    private final AdvancedModelRenderer shellcovertop;
    private final AdvancedModelRenderer shellcovertop1;
    private final AdvancedModelRenderer shellcovertop2;
    private final AdvancedModelRenderer shellcover2a;
    private final AdvancedModelRenderer hyponome;
    private final AdvancedModelRenderer headleft;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer eyeleft1;
    private final AdvancedModelRenderer headright;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle2a;
    private final AdvancedModelRenderer tentacle2b;
    private final AdvancedModelRenderer tentacle3a;
    private final AdvancedModelRenderer tentacle3b;
    private final AdvancedModelRenderer tentacle4a;
    private final AdvancedModelRenderer tentacle4b;
    private final AdvancedModelRenderer tentacle5a;
    private final AdvancedModelRenderer tentacle5b;
    private final AdvancedModelRenderer tentacle6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle7a;
    private final AdvancedModelRenderer tentacle7b;
    private final AdvancedModelRenderer tentacle8a;
    private final AdvancedModelRenderer tentacle8b;
    private final AdvancedModelRenderer tentacle9a;
    private final AdvancedModelRenderer tentacle9b;
    private final AdvancedModelRenderer tentacle10a;
    private final AdvancedModelRenderer tentacle10b;
    private final AdvancedModelRenderer shellbase;
    private final AdvancedModelRenderer shellbasebottom;
    private final AdvancedModelRenderer shellbasebottom_r1;
    private final AdvancedModelRenderer shellbasetop;
    private final AdvancedModelRenderer shellbasetop_r1;
    private final AdvancedModelRenderer shell1;
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
    private final AdvancedModelRenderer shelltip;
    private final AdvancedModelRenderer shell10top;
    private final AdvancedModelRenderer shell10bottom;
    private final AdvancedModelRenderer shell9top;
    private final AdvancedModelRenderer shell9bottom;
    private final AdvancedModelRenderer shell8top;
    private final AdvancedModelRenderer shell8bottom;
    private final AdvancedModelRenderer shell7top;
    private final AdvancedModelRenderer shell7bottom;
    private final AdvancedModelRenderer shell6top;
    private final AdvancedModelRenderer shell6bottom;
    private final AdvancedModelRenderer shell5top;
    private final AdvancedModelRenderer shell5bottom;
    private final AdvancedModelRenderer shell4top;
    private final AdvancedModelRenderer shell4bottom;
    private final AdvancedModelRenderer shell3top;
    private final AdvancedModelRenderer shell3bottom;
    private final AdvancedModelRenderer shell2top;
    private final AdvancedModelRenderer shell2bottom;
    private final AdvancedModelRenderer shell1top;
    private final AdvancedModelRenderer shell1bottom;

    public ModelRayonnoceras() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 13.0F, -6.0F);
        this.setRotateAngle(root, 0.0F, 3.1416F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.root.addChild(head);
        this.setRotateAngle(head, 0.0F, -3.1416F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 38, 64, -5.0F, -5.0F, 0.0F, 10, 10, 7, 0.0F, false));

        this.shellcover1 = new AdvancedModelRenderer(this);
        this.shellcover1.setRotationPoint(0.0F, -6.65F, 7.2F);
        this.head.addChild(shellcover1);
        this.setRotateAngle(shellcover1, 0.0175F, 0.0F, 0.0F);
        this.shellcover1.cubeList.add(new ModelBox(shellcover1, 25, 104, 4.25F, 0.0F, -7.0F, 2, 2, 7, 0.0F, false));
        this.shellcover1.cubeList.add(new ModelBox(shellcover1, 67, 0, -6.25F, 0.0F, -7.0F, 2, 2, 7, 0.0F, false));

        this.shellcover2 = new AdvancedModelRenderer(this);
        this.shellcover2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.shellcover1.addChild(shellcover2);
        this.shellcover2.cubeList.add(new ModelBox(shellcover2, 35, 27, -5.5F, 0.0F, 0.0F, 11, 2, 1, 0.0F, false));

        this.shellcover3 = new AdvancedModelRenderer(this);
        this.shellcover3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shellcover2.addChild(shellcover3);
        this.shellcover3.cubeList.add(new ModelBox(shellcover3, 65, 64, -4.5F, 0.0F, 0.0F, 9, 2, 1, 0.0F, false));

        this.shellcovertop = new AdvancedModelRenderer(this);
        this.shellcovertop.setRotationPoint(0.0F, 0.2F, -7.0F);
        this.shellcover1.addChild(shellcovertop);
        this.shellcovertop.cubeList.add(new ModelBox(shellcovertop, 78, 14, -5.0F, -0.75F, 0.0F, 10, 1, 7, 0.0F, false));
        this.shellcovertop.cubeList.add(new ModelBox(shellcovertop, 0, 111, -0.5F, -0.76F, -1.01F, 1, 1, 4, 0.0F, false));

        this.shellcovertop1 = new AdvancedModelRenderer(this);
        this.shellcovertop1.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.shellcovertop.addChild(shellcovertop1);
        this.shellcovertop1.cubeList.add(new ModelBox(shellcovertop1, 35, 30, -4.0F, 0.25F, 0.0F, 8, 1, 1, 0.0F, false));

        this.shellcovertop2 = new AdvancedModelRenderer(this);
        this.shellcovertop2.setRotationPoint(0.0F, -1.0F, 6.0F);
        this.shellcovertop.addChild(shellcovertop2);


        this.shellcover2a = new AdvancedModelRenderer(this);
        this.shellcover2a.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shellcover1.addChild(shellcover2a);


        this.hyponome = new AdvancedModelRenderer(this);
        this.hyponome.setRotationPoint(0.0F, 3.0F, 4.8F);
        this.head.addChild(hyponome);
        this.setRotateAngle(hyponome, -1.1345F, 0.0F, 0.0F);
        this.hyponome.cubeList.add(new ModelBox(hyponome, 0, 6, -1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F, false));

        this.headleft = new AdvancedModelRenderer(this);
        this.headleft.setRotationPoint(-5.0F, -0.2F, 0.0F);
        this.head.addChild(headleft);
        this.headleft.cubeList.add(new ModelBox(headleft, 16, 95, -1.0F, -4.5F, 0.0F, 1, 9, 7, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(-0.7F, -1.1F, 4.5F);
        this.headleft.addChild(eyeleft);


        this.eyeleft1 = new AdvancedModelRenderer(this);
        this.eyeleft1.setRotationPoint(-1.1F, -0.25F, 0.0F);
        this.eyeleft.addChild(eyeleft1);
        this.eyeleft1.cubeList.add(new ModelBox(eyeleft1, 0, 120, 0.0F, -2.25F, -2.0F, 1, 4, 4, 0.0F, true));
        this.eyeleft1.cubeList.add(new ModelBox(eyeleft1, 11, 124, -0.01F, -1.24F, -0.5F, 1, 3, 1, 0.0F, true));
        this.eyeleft1.cubeList.add(new ModelBox(eyeleft1, 15, 126, -0.02F, -0.75F, -0.5F, 1, 1, 1, 0.0F, true));

        this.headright = new AdvancedModelRenderer(this);
        this.headright.setRotationPoint(6.0F, -0.2F, 0.0F);
        this.head.addChild(headright);
        this.headright.cubeList.add(new ModelBox(headright, 0, 95, -1.0F, -4.5F, 0.0F, 1, 9, 7, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(0.8F, -1.35F, 4.5F);
        this.headright.addChild(eyeright);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 0, 120, -1.0F, -2.25F, -2.0F, 1, 4, 4, 0.0F, false));
        this.eyeright.cubeList.add(new ModelBox(eyeright, 11, 124, -0.99F, -1.24F, -0.5F, 1, 3, 1, 0.0F, false));
        this.eyeright.cubeList.add(new ModelBox(eyeright, 15, 126, -0.98F, -0.75F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-4.7F, -0.4F, 1.0F);
        this.head.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, 0.0F, 0.2618F, 0.0F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 90, 29, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle1a.addChild(tentacle1b);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 72, 103, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(4.7F, -0.4F, 1.0F);
        this.head.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, 0.0F, -0.2618F, 0.0F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 76, 89, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle2a.addChild(tentacle2b);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 102, 86, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(-3.7F, -3.1F, 1.0F);
        this.head.addChild(tentacle3a);
        this.setRotateAngle(tentacle3a, -0.1309F, 0.2182F, 0.0F);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 60, 85, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle3a.addChild(tentacle3b);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 102, 52, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(3.7F, -3.1F, 1.0F);
        this.head.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, -0.1309F, -0.2182F, 0.0F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 44, 83, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle4a.addChild(tentacle4b);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 62, 100, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(-3.7F, 2.3F, 1.0F);
        this.head.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, 0.1309F, 0.2182F, 0.0F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 28, 81, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle5a.addChild(tentacle5b);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 52, 99, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(3.7F, 2.3F, 1.0F);
        this.head.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, 0.1309F, -0.2182F, 0.0F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 0, 81, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle6a.addChild(tentacle6b);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 96, 98, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(-1.3F, 3.7F, 1.0F);
        this.head.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, 0.2618F, 0.0873F, 0.0F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 78, 0, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle7a.addChild(tentacle7b);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 42, 97, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(1.3F, 3.7F, 1.0F);
        this.head.addChild(tentacle8a);
        this.setRotateAngle(tentacle8a, 0.2618F, -0.0873F, 0.0F);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 76, 75, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle8a.addChild(tentacle8b);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 32, 95, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(-1.3F, -4.5F, 1.0F);
        this.head.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, -0.2618F, 0.0873F, 0.0F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 76, 61, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle9a.addChild(tentacle9b);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 94, 0, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(1.3F, -4.5F, 1.0F);
        this.head.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, -0.2618F, -0.0873F, 0.0F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 60, 69, -1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F, false));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle10a.addChild(tentacle10b);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 92, 89, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.shellbase = new AdvancedModelRenderer(this);
        this.shellbase.setRotationPoint(0.0F, -1.0F, 17.0F);
        this.head.addChild(shellbase);
        this.shellbase.cubeList.add(new ModelBox(shellbase, 0, 0, -6.5F, -5.5F, -10.0F, 13, 11, 15, 0.0F, false));

        this.shellbasebottom = new AdvancedModelRenderer(this);
        this.shellbasebottom.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.shellbase.addChild(shellbasebottom);


        this.shellbasebottom_r1 = new AdvancedModelRenderer(this);
        this.shellbasebottom_r1.setRotationPoint(0.0F, 1.0F, -10.0F);
        this.shellbasebottom.addChild(shellbasebottom_r1);
        this.setRotateAngle(shellbasebottom_r1, 0.0175F, 0.0F, 0.0F);
        this.shellbasebottom_r1.cubeList.add(new ModelBox(shellbasebottom_r1, 41, 11, -5.5F, -1.25F, 0.001F, 11, 1, 15, 0.0F, false));

        this.shellbasetop = new AdvancedModelRenderer(this);
        this.shellbasetop.setRotationPoint(0.0F, -6.5F, 0.0F);
        this.shellbase.addChild(shellbasetop);


        this.shellbasetop_r1 = new AdvancedModelRenderer(this);
        this.shellbasetop_r1.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.shellbasetop.addChild(shellbasetop_r1);
        this.setRotateAngle(shellbasetop_r1, -0.0175F, 0.0F, 0.0F);
        this.shellbasetop_r1.cubeList.add(new ModelBox(shellbasetop_r1, 33, 34, -5.5F, 0.25F, 0.001F, 11, 1, 15, 0.0F, false));

        this.shell1 = new AdvancedModelRenderer(this);
        this.shell1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shellbase.addChild(shell1);


        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.shell1.addChild(shell2);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 26, -5.5F, -5.0F, -11.0F, 11, 10, 13, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.shell2.addChild(shell3);


        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.shell3.addChild(shell4);
        this.shell4.cubeList.add(new ModelBox(shell4, 0, 63, -4.5F, -4.0F, -22.0F, 9, 8, 10, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell4.addChild(shell5);


        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell5.addChild(shell6);
        this.shell6.cubeList.add(new ModelBox(shell6, 70, 27, -4.0F, -3.0F, -32.0F, 8, 6, 8, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.shell6.addChild(shell7);


        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell7.addChild(shell8);
        this.shell8.cubeList.add(new ModelBox(shell8, 92, 75, -3.0F, -2.0F, -39.0F, 6, 4, 7, 0.0F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell8.addChild(shell9);


        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell9.addChild(shell10);
        this.shell10.cubeList.add(new ModelBox(shell10, 54, 27, -2.0F, -1.0F, -46.0F, 4, 2, 5, 0.0F, false));

        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.shell10.addChild(shell11);
        this.shell11.cubeList.add(new ModelBox(shell11, 0, 0, -1.5F, -1.5F, -46.0F, 3, 3, 3, 0.0F, false));

        this.shelltip = new AdvancedModelRenderer(this);
        this.shelltip.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shell11.addChild(shelltip);
        this.shelltip.cubeList.add(new ModelBox(shelltip, 0, 26, -1.0F, -1.0F, -46.0F, 2, 2, 3, 0.0F, false));
        this.shelltip.cubeList.add(new ModelBox(shelltip, 5, 34, -0.5F, -0.5F, -43.0F, 1, 1, 3, 0.0F, false));

        this.shell10top = new AdvancedModelRenderer(this);
        this.shell10top.setRotationPoint(0.0F, -1.5F, 10.0F);
        this.shell10.addChild(shell10top);
        this.shell10top.cubeList.add(new ModelBox(shell10top, 92, 52, -1.5F, -0.5F, -56.0F, 3, 1, 5, 0.0F, false));

        this.shell10bottom = new AdvancedModelRenderer(this);
        this.shell10bottom.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.shell10.addChild(shell10bottom);
        this.shell10bottom.cubeList.add(new ModelBox(shell10bottom, 28, 64, -1.5F, 0.5F, -56.0F, 3, 1, 5, 0.0F, false));

        this.shell9top = new AdvancedModelRenderer(this);
        this.shell9top.setRotationPoint(0.0F, -2.0F, 10.0F);
        this.shell9.addChild(shell9top);


        this.shell9bottom = new AdvancedModelRenderer(this);
        this.shell9bottom.setRotationPoint(0.0F, 1.0F, 10.0F);
        this.shell9.addChild(shell9bottom);


        this.shell8top = new AdvancedModelRenderer(this);
        this.shell8top.setRotationPoint(0.0F, -2.5F, 10.0F);
        this.shell8.addChild(shell8top);
        this.shell8top.cubeList.add(new ModelBox(shell8top, 16, 81, -2.5F, -0.5F, -49.0F, 5, 1, 7, 0.0F, false));

        this.shell8bottom = new AdvancedModelRenderer(this);
        this.shell8bottom.setRotationPoint(0.0F, 1.5F, 10.0F);
        this.shell8.addChild(shell8bottom);
        this.shell8bottom.cubeList.add(new ModelBox(shell8bottom, 70, 41, -2.5F, 0.5F, -49.0F, 5, 1, 7, 0.0F, false));

        this.shell7top = new AdvancedModelRenderer(this);
        this.shell7top.setRotationPoint(0.0F, -3.0F, 10.0F);
        this.shell7.addChild(shell7top);


        this.shell7bottom = new AdvancedModelRenderer(this);
        this.shell7bottom.setRotationPoint(0.0F, 2.0F, 10.0F);
        this.shell7.addChild(shell7bottom);


        this.shell6top = new AdvancedModelRenderer(this);
        this.shell6top.setRotationPoint(0.0F, -3.5F, 10.0F);
        this.shell6.addChild(shell6top);
        this.shell6top.cubeList.add(new ModelBox(shell6top, 92, 61, -3.5F, -0.5F, -42.0F, 7, 1, 8, 0.0F, false));

        this.shell6bottom = new AdvancedModelRenderer(this);
        this.shell6bottom.setRotationPoint(0.0F, 2.5F, 10.0F);
        this.shell6.addChild(shell6bottom);
        this.shell6bottom.cubeList.add(new ModelBox(shell6bottom, 92, 43, -3.5F, 0.5F, -42.0F, 7, 1, 8, 0.0F, false));

        this.shell5top = new AdvancedModelRenderer(this);
        this.shell5top.setRotationPoint(0.0F, -4.0F, 10.0F);
        this.shell5.addChild(shell5top);


        this.shell5bottom = new AdvancedModelRenderer(this);
        this.shell5bottom.setRotationPoint(0.0F, 3.0F, 10.0F);
        this.shell5.addChild(shell5bottom);


        this.shell4top = new AdvancedModelRenderer(this);
        this.shell4top.setRotationPoint(0.0F, -4.5F, 10.0F);
        this.shell4.addChild(shell4top);
        this.shell4top.cubeList.add(new ModelBox(shell4top, 66, 50, -4.0F, -0.5F, -32.0F, 8, 1, 10, 0.0F, false));

        this.shell4bottom = new AdvancedModelRenderer(this);
        this.shell4bottom.setRotationPoint(0.0F, 3.5F, 10.0F);
        this.shell4.addChild(shell4bottom);
        this.shell4bottom.cubeList.add(new ModelBox(shell4bottom, 41, 0, -4.0F, 0.5F, -32.0F, 8, 1, 10, 0.0F, false));

        this.shell3top = new AdvancedModelRenderer(this);
        this.shell3top.setRotationPoint(0.0F, -5.0F, 10.0F);
        this.shell3.addChild(shell3top);


        this.shell3bottom = new AdvancedModelRenderer(this);
        this.shell3bottom.setRotationPoint(0.0F, 4.0F, 10.0F);
        this.shell3.addChild(shell3bottom);


        this.shell2top = new AdvancedModelRenderer(this);
        this.shell2top.setRotationPoint(0.0F, -5.5F, 10.0F);
        this.shell2.addChild(shell2top);
        this.shell2top.cubeList.add(new ModelBox(shell2top, 33, 50, -5.0F, 0.0F, -20.999F, 10, 1, 13, 0.0F, false));

        this.shell2bottom = new AdvancedModelRenderer(this);
        this.shell2bottom.setRotationPoint(0.0F, 4.5F, 10.0F);
        this.shell2.addChild(shell2bottom);
        this.shell2bottom.cubeList.add(new ModelBox(shell2bottom, 0, 49, -5.0F, 0.0F, -20.999F, 10, 1, 13, 0.0F, false));

        this.shell1top = new AdvancedModelRenderer(this);
        this.shell1top.setRotationPoint(0.0F, -6.0F, 10.0F);
        this.shell1.addChild(shell1top);


        this.shell1bottom = new AdvancedModelRenderer(this);
        this.shell1bottom.setRotationPoint(0.0F, 5.0F, 10.0F);
        this.shell1.addChild(shell1bottom);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5 * 0.645F);
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
        this.root.offsetY = 0.5F;
        //this.root.rotateAngleY = (float) Math.toRadians(180);

        AdvancedModelRenderer[] tentacle1 = {this.tentacle1a, this.tentacle1b};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle2a, this.tentacle2b};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle3a, this.tentacle3b};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle4a, this.tentacle4b};
        AdvancedModelRenderer[] tentacle5 = {this.tentacle5a, this.tentacle5b};
        AdvancedModelRenderer[] tentacle6 = {this.tentacle6a, this.tentacle6b};
        AdvancedModelRenderer[] tentacle7 = {this.tentacle7a, this.tentacle7b};
        AdvancedModelRenderer[] tentacle8 = {this.tentacle8a, this.tentacle8b};
        AdvancedModelRenderer[] tentacle9 = {this.tentacle9a, this.tentacle9b};
        AdvancedModelRenderer[] tentacle10 = {this.tentacle10a, this.tentacle10b};

        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        EntityPrehistoricFloraRayonnoceras ee = (EntityPrehistoricFloraRayonnoceras) e;
        if (ee.isAtBottom()) {
            speed = speed * 2F;
            //Left:
            this.chainSwing(tentacle2, speed, -0.2F, 0, f2, 1F);
            //Left lower middle:
            this.chainSwing(tentacle6, speed, -0.2F, 0, f2, 1F);
            //Left lower bottom:
            this.chainSwing(tentacle8, speed, -0.2F, 0, f2, 1F);
            //Left upper middle:
            this.chainSwing(tentacle4, speed, -0.2F, 0, f2, 1F);
            //Left upper top:
            this.chainSwing(tentacle10, speed, -0.2F, 0, f2, 1F);

            //Right:
            this.chainSwing(tentacle1, speed, -0.2F, 0, f2, 1F);
            //Right lower middle:
            this.chainSwing(tentacle5, speed, -0.2F, 0, f2, 1F);
            //Right lower bottom:
            this.chainSwing(tentacle7, speed, -0.2F, 0, f2, 1F);
            //Right upper middle:
            this.chainSwing(tentacle3, speed, -0.2F, 0, f2, 1F);
            //Right upper top:
            this.chainSwing(tentacle9, speed, -0.2F, 0, f2, 1F);
        }

        //Left:
        this.chainSwing(tentacle2, speed, -0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle6, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle6, speed, -0.3F, -1.5, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle8, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(tentacle8, speed, -0.1F, -1.5, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle4, speed, -0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle4, speed, -0.3F, -1.5, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle10, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(tentacle10, speed, -0.1F, -1.5, f2, 1F);

        //Right:
        this.chainSwing(tentacle1, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle5, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle5, speed, 0.3F, -1.5, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle7, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(tentacle7, speed, 0.1F, -1.5, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle3, speed, -0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle3, speed, 0.3F, -1.5, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle9, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(tentacle9, speed, 0.1F, -1.5, f2, 1F);

        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            if (ee.isAtBottom()) {
                this.walk(root, 0.3F, -0.25F, false, 0,-0.2F,1.5F,1.0F);
                bobSpeed = 0.2F;
            }
            this.bob(root, bobSpeed, 0.8F, false, f2, 2);
        }
        else {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 1.15F;
        }

    }

}
