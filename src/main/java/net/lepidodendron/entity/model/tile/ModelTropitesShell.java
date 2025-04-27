package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTropitesShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer shellFront;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle10;

    public ModelTropitesShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.main.addChild(shell);
        this.setRotateAngle(shell, -0.6109F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -8.0F, -5.0F, -7.0F, 16, 5, 7, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 47, 0, -5.0F, -12.0F, -7.0F, 10, 7, 7, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.7854F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 13, -7.5F, -5.0F, -7.0F, 15, 5, 7, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.8727F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shell3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -7.0F, -5.0F, -6.0F, 14, 5, 7, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, -0.25F, -7.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.9163F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.0553F, -1.0049F);
        this.shell4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 39, -6.5F, -4.0F, -6.0F, 13, 4, 7, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, -0.25F, -7.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.9163F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.0851F, -1.0517F);
        this.shell5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 41, 39, -6.5F, -4.0F, -6.0F, 12, 4, 7, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(1.5F, -0.25F, -7.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.9163F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -0.0661F, -1.1038F);
        this.shell6.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 15, -5.0F, -4.0F, -5.0F, 11, 4, 6, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, -0.25F, -6.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.9163F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.01F, 0.0246F, -1.0769F);
        this.shell7.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 51, -5.99F, -3.0F, -5.0F, 11, 3, 6, -0.01F, false));

        this.shellFront = new AdvancedModelRenderer(this);
        this.shellFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shellFront);
        this.setRotateAngle(shellFront, 0.5672F, 0.0F, 0.0F);
        this.shellFront.cubeList.add(new ModelBox(shellFront, 43, 26, -8.0F, -5.0F, 0.0F, 16, 5, 4, 0.01F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, -4.0F, 4.0F);
        this.shellFront.addChild(mantle);
        this.setRotateAngle(mantle, -0.3491F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 35, 51, -7.0F, 0.0F, 0.0F, 14, 3, 4, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(7.0F, 2.0F, 2.5F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.0F, -0.4363F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 35, 59, -2.0F, -3.0F, -1.75F, 3, 3, 3, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-7.0F, 2.0F, 2.5F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, 0.0F, 0.4363F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 35, 59, -1.0F, -3.0F, -1.75F, 3, 3, 3, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(1.0F, 3.0F, 1.0F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.1745F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 48, 59, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tentacle1 = new AdvancedModelRenderer(this);
        this.tentacle1.setRotationPoint(-1.75F, 2.25F, 3.75F);
        this.mantle.addChild(tentacle1);
        this.setRotateAngle(tentacle1, -0.3491F, 0.0F, 0.0F);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 0, 61, -2.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-5.25F, 2.25F, 3.5F);
        this.mantle.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.3065F, 0.0842F, -0.0226F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 13, 61, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(-5.75F, 0.75F, 3.5F);
        this.mantle.addChild(tentacle3);
        this.setRotateAngle(tentacle3, -0.393F, 0.0403F, -0.0167F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 61, 59, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-3.5F, 0.75F, 3.75F);
        this.mantle.addChild(tentacle4);
        this.setRotateAngle(tentacle4, -0.4367F, 0.0395F, -0.0184F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 48, 65, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-1.25F, 0.75F, 3.8F);
        this.mantle.addChild(tentacle5);
        this.setRotateAngle(tentacle5, -0.3927F, 0.0F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 61, 65, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(1.75F, 2.25F, 3.75F);
        this.mantle.addChild(tentacle6);
        this.setRotateAngle(tentacle6, -0.3491F, 0.0F, 0.0F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 0, 61, 0.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(5.25F, 2.25F, 3.5F);
        this.mantle.addChild(tentacle7);
        this.setRotateAngle(tentacle7, -0.3065F, -0.0842F, 0.0226F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 13, 61, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(5.75F, 0.75F, 3.5F);
        this.mantle.addChild(tentacle8);
        this.setRotateAngle(tentacle8, -0.393F, -0.0403F, 0.0167F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 61, 59, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, true));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(3.5F, 0.75F, 3.75F);
        this.mantle.addChild(tentacle9);
        this.setRotateAngle(tentacle9, -0.4367F, -0.0395F, 0.0184F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 48, 65, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, true));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(1.25F, 0.75F, 4.0F);
        this.mantle.addChild(tentacle10);
        this.setRotateAngle(tentacle10, -0.3927F, 0.0F, 0.0F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 61, 65, -1.0F, -0.5F, -0.225F, 2, 1, 4, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.main.offsetY = -1.5F;
        //this.Root.offsetZ = 1.0F;
        this.main.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
