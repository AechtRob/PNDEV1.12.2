package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelMortonicerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer hook;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer hook2;
    private final AdvancedModelRenderer hook3;
    private final AdvancedModelRenderer hook4;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer knobs;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle2a;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tentacle2b;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tentacle2c;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tentacle3a;
    private final AdvancedModelRenderer tentacle3b;
    private final AdvancedModelRenderer tentacle4a;
    private final AdvancedModelRenderer tentacle4b;
    private final AdvancedModelRenderer tentacle5a;
    private final AdvancedModelRenderer tentacle5b;
    private final AdvancedModelRenderer tentacle6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle7a;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tentacle7b;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tentacle7c;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tentacle8a;
    private final AdvancedModelRenderer tentacle8b;
    private final AdvancedModelRenderer tentacle9a;
    private final AdvancedModelRenderer tentacle9b;
    private final AdvancedModelRenderer tentacle10a;
    private final AdvancedModelRenderer tentacle10b;
    private final AdvancedModelRenderer siphon;

    public ModelMortonicerasShell() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.root.addChild(shell);
        this.setRotateAngle(shell, 0.3054F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 25, 26, -2.5F, -5.0F, -5.0F, 5, 5, 5, 0.0F, false));

        this.hook = new AdvancedModelRenderer(this);
        this.hook.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(hook);
        this.setRotateAngle(hook, -0.9599F, 0.0F, 0.0F);
        this.hook.cubeList.add(new ModelBox(hook, 45, 55, -1.0F, 0.0F, -2.0F, 2, 7, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.hook.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 59, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.01F, false));

        this.hook2 = new AdvancedModelRenderer(this);
        this.hook2.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.hook.addChild(hook2);
        this.setRotateAngle(hook2, -0.829F, 0.0F, 0.0F);
        this.hook2.cubeList.add(new ModelBox(hook2, 60, 46, -1.0F, 0.0F, -2.0F, 2, 3, 2, -0.01F, false));

        this.hook3 = new AdvancedModelRenderer(this);
        this.hook3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.hook2.addChild(hook3);
        this.setRotateAngle(hook3, -1.0908F, 0.0F, 0.0F);
        this.hook3.cubeList.add(new ModelBox(hook3, 19, 28, -0.5F, 0.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.hook4 = new AdvancedModelRenderer(this);
        this.hook4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.hook3.addChild(hook4);
        this.setRotateAngle(hook4, -1.0908F, 0.0F, 0.0F);
        this.hook4.cubeList.add(new ModelBox(hook4, 26, 56, -0.5F, 0.0F, -1.0F, 1, 3, 1, -0.01F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.829F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 0, -2.5F, -6.0F, -7.0F, 5, 6, 7, -0.01F, false));
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 40, -1.0F, -11.0F, -8.0F, 2, 5, 6, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.7418F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 14, -2.5F, -6.0F, -7.0F, 5, 6, 7, -0.02F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.829F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 25, 0, -2.0F, -5.0F, -7.0F, 4, 5, 7, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.8727F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 25, 13, -2.0F, -5.0F, -7.0F, 4, 5, 7, -0.01F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.9163F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 0, 28, -1.5F, -5.0F, -6.0F, 3, 5, 6, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.9163F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 19, 37, -1.5F, -4.0F, -6.0F, 3, 4, 6, -0.01F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.9163F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 38, 37, -1.5F, -4.0F, -6.0F, 3, 4, 6, -0.02F, false));

        this.knobs = new AdvancedModelRenderer(this);
        this.knobs.setRotationPoint(0.0F, -3.5F, -8.5F);
        this.shell.addChild(knobs);
        this.setRotateAngle(knobs, -0.9599F, 0.0F, 0.0F);
        this.knobs.cubeList.add(new ModelBox(knobs, 48, 8, -3.0F, -5.0F, -1.0F, 6, 6, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.0F, 1.75F);
        this.knobs.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 48, -3.0F, -2.0F, -0.5F, 6, 5, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -15.25F, -3.75F);
        this.knobs.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -2.618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 56, -2.0F, -3.0F, -0.5F, 5, 4, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -13.5F, -6.25F);
        this.knobs.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.138F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 55, -2.0F, -3.0F, -0.5F, 5, 4, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -11.25F, -7.0F);
        this.knobs.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.8326F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 55, -2.0F, -3.0F, -0.5F, 5, 5, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -8.75F, -7.0F);
        this.knobs.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.4399F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 52, -2.0F, -3.0F, -0.5F, 5, 5, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -6.5F, -6.725F);
        this.knobs.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.2217F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 48, -2.0F, -3.0F, -0.5F, 5, 5, 1, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.25F, -5.0F);
        this.knobs.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 48, -3.0F, -3.0F, -0.5F, 6, 6, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.75F, -3.0F);
        this.knobs.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 16, -3.0F, -3.0F, -0.5F, 6, 6, 1, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.3054F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 46, 26, -2.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 63, 61, 1.7F, -1.0F, 0.4F, 1, 2, 2, 0.0F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 63, 61, -2.7F, -1.0F, 0.4F, 1, 2, 2, 0.0F, true));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-0.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, 0.262F, -0.0421F, -0.0113F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 54, 61, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, -0.0873F, 0.0435F, -0.0038F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 9, 62, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(-1.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, 0.0F, 0.0873F, -0.7854F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 18, 62, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.tentacle2a.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 57, 34, -3.0F, 0.0F, -4.0F, 3, 0, 3, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle2a.addChild(tentacle2b);
        this.setRotateAngle(tentacle2b, 0.0436F, 0.0F, 0.0F);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 27, 62, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.tentacle2b.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 57, 38, -3.0F, 0.0F, -1.0F, 3, 0, 3, 0.0F, false));

        this.tentacle2c = new AdvancedModelRenderer(this);
        this.tentacle2c.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle2b.addChild(tentacle2c);
        this.setRotateAngle(tentacle2c, 0.0873F, -0.0873F, 0.0F);
        this.tentacle2c.cubeList.add(new ModelBox(tentacle2c, 36, 62, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.0F, -2.0F);
        this.tentacle2c.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 42, -3.0F, 0.0F, 2.0F, 3, 0, 3, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(-1.5F, 1.5F, 4.0F);
        this.mantle.addChild(tentacle3a);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 63, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle3a.addChild(tentacle3b);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 63, 5, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(-1.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, -0.0296F, 0.0758F, -0.7435F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 63, 10, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle4a.addChild(tentacle4b);
        this.setRotateAngle(tentacle4b, 0.0436F, -0.0436F, 0.0F);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 63, 15, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(-0.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, 0.131F, -0.0433F, -0.0057F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 63, 20, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle5a.addChild(tentacle5b);
        this.setRotateAngle(tentacle5b, -0.0873F, 0.0435F, -0.0038F);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 63, 25, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(0.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, 0.262F, 0.0421F, 0.0113F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 54, 61, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, -0.0873F, -0.0435F, 0.0038F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 9, 62, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(1.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, 0.0F, -0.0873F, 0.7854F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 18, 62, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.0F, 4.0F);
        this.tentacle7a.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 57, 34, 0.0F, 0.0F, -4.0F, 3, 0, 3, 0.0F, true));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle7a.addChild(tentacle7b);
        this.setRotateAngle(tentacle7b, 0.0436F, 0.0F, 0.0F);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 27, 62, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.tentacle7b.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 57, 38, 0.0F, 0.0F, -1.0F, 3, 0, 3, 0.0F, true));

        this.tentacle7c = new AdvancedModelRenderer(this);
        this.tentacle7c.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle7b.addChild(tentacle7c);
        this.setRotateAngle(tentacle7c, 0.0873F, 0.0873F, 0.0F);
        this.tentacle7c.cubeList.add(new ModelBox(tentacle7c, 36, 62, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.tentacle7c.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 57, 42, 0.0F, 0.0F, 2.0F, 3, 0, 3, 0.0F, true));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(1.5F, 1.5F, 4.0F);
        this.mantle.addChild(tentacle8a);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 63, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle8a.addChild(tentacle8b);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 63, 5, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(1.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, -0.0296F, -0.0758F, 0.7435F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 63, 10, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle9a.addChild(tentacle9b);
        this.setRotateAngle(tentacle9b, 0.0436F, 0.0436F, 0.0F);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 63, 15, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(0.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, 0.131F, 0.0433F, 0.0057F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 63, 20, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tentacle10a.addChild(tentacle10b);
        this.setRotateAngle(tentacle10b, -0.0873F, -0.0435F, 0.0038F);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 63, 25, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 3.0F, 0.75F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.2618F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 48, 0, -1.0F, -1.0F, -1.0F, 2, 2, 5, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1.5F;
        //this.Root.offsetZ = 1.0F;
        this.root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
