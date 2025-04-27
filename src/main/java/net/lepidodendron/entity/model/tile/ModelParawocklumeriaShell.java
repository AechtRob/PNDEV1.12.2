package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelParawocklumeriaShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Shell;
    private final AdvancedModelRenderer thirdShell1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer thirdShell2;
    private final AdvancedModelRenderer thirdShell3;
    private final AdvancedModelRenderer thirdShell4;
    private final AdvancedModelRenderer thirdShell5;
    private final AdvancedModelRenderer Connectshell;
    private final AdvancedModelRenderer secondShell2;
    private final AdvancedModelRenderer secondShell3;
    private final AdvancedModelRenderer secondShell4;
    private final AdvancedModelRenderer secondShell5;
    private final AdvancedModelRenderer firstShell1;
    private final AdvancedModelRenderer firstShell2;
    private final AdvancedModelRenderer firstShell3;
    private final AdvancedModelRenderer firstShell4;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle1b3;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer eyeRight;

    public ModelParawocklumeriaShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Shell = new AdvancedModelRenderer(this);
        this.Shell.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.thirdShell1 = new AdvancedModelRenderer(this);
        this.thirdShell1.setRotationPoint(0.0F, -15.0F, 2.0F);
        this.Shell.addChild(thirdShell1);
        this.setRotateAngle(thirdShell1, -0.5672F, 0.0F, 0.0F);
        this.thirdShell1.cubeList.add(new ModelBox(thirdShell1, 18, 50, -3.0F, 0.0F, -3.0F, 6, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thirdShell1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 11, -3.0F, 0.0F, -3.0F, 6, 6, 3, 0.04F, false));

        this.thirdShell2 = new AdvancedModelRenderer(this);
        this.thirdShell2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.thirdShell1.addChild(thirdShell2);
        this.setRotateAngle(thirdShell2, 0.9163F, 0.0F, 0.0F);
        this.thirdShell2.cubeList.add(new ModelBox(thirdShell2, 36, 46, -3.0F, 0.0F, -3.0F, 6, 4, 3, 0.01F, false));

        this.thirdShell3 = new AdvancedModelRenderer(this);
        this.thirdShell3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.thirdShell2.addChild(thirdShell3);
        this.setRotateAngle(thirdShell3, 0.48F, 0.0F, 0.0F);
        this.thirdShell3.cubeList.add(new ModelBox(thirdShell3, 46, 27, -3.0F, 0.0F, -3.0F, 6, 4, 3, 0.0F, false));

        this.thirdShell4 = new AdvancedModelRenderer(this);
        this.thirdShell4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.thirdShell3.addChild(thirdShell4);
        this.setRotateAngle(thirdShell4, 0.6981F, 0.0F, 0.0F);
        this.thirdShell4.cubeList.add(new ModelBox(thirdShell4, 0, 50, -3.0F, 0.0F, -3.0F, 6, 3, 3, -0.01F, false));

        this.thirdShell5 = new AdvancedModelRenderer(this);
        this.thirdShell5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.thirdShell4.addChild(thirdShell5);
        this.setRotateAngle(thirdShell5, 0.3971F, 0.0F, 0.0F);
        this.thirdShell5.cubeList.add(new ModelBox(thirdShell5, 0, 42, -3.0F, 0.0F, -3.0F, 6, 5, 3, -0.04F, false));

        this.Connectshell = new AdvancedModelRenderer(this);
        this.Connectshell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thirdShell1.addChild(Connectshell);
        this.Connectshell.cubeList.add(new ModelBox(Connectshell, 20, 17, -3.0F, 5.425F, 2.35F, 6, 4, 6, 0.0F, false));
        this.Connectshell.cubeList.add(new ModelBox(Connectshell, 40, 38, -2.5F, 5.425F, -1.65F, 5, 4, 4, 0.0F, false));
        this.Connectshell.cubeList.add(new ModelBox(Connectshell, 48, 0, -2.5F, 0.425F, -0.65F, 5, 5, 3, 0.0F, false));

        this.secondShell2 = new AdvancedModelRenderer(this);
        this.secondShell2.setRotationPoint(0.0F, -4.825F, 6.0F);
        this.Shell.addChild(secondShell2);
        this.setRotateAngle(secondShell2, 0.9119F, 0.0F, 0.0F);
        this.secondShell2.cubeList.add(new ModelBox(secondShell2, 0, 23, -3.5F, -7.0F, 0.0F, 7, 7, 4, 0.04F, false));

        this.secondShell3 = new AdvancedModelRenderer(this);
        this.secondShell3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.secondShell2.addChild(secondShell3);
        this.setRotateAngle(secondShell3, 0.8727F, 0.0F, 0.0F);
        this.secondShell3.cubeList.add(new ModelBox(secondShell3, 0, 34, -3.5F, -4.0F, 0.0F, 7, 4, 4, 0.01F, false));

        this.secondShell4 = new AdvancedModelRenderer(this);
        this.secondShell4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.secondShell3.addChild(secondShell4);
        this.setRotateAngle(secondShell4, 0.6109F, 0.0F, 0.0F);
        this.secondShell4.cubeList.add(new ModelBox(secondShell4, 22, 35, -3.5F, -3.0F, 0.0F, 7, 3, 4, 0.0F, false));

        this.secondShell5 = new AdvancedModelRenderer(this);
        this.secondShell5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.secondShell4.addChild(secondShell5);
        this.setRotateAngle(secondShell5, 0.4102F, 0.0F, 0.0F);
        this.secondShell5.cubeList.add(new ModelBox(secondShell5, 18, 42, -3.5F, -6.0F, 0.0F, 7, 6, 2, -0.01F, false));

        this.firstShell1 = new AdvancedModelRenderer(this);
        this.firstShell1.setRotationPoint(0.0F, -5.0F, -7.0F);
        this.Shell.addChild(firstShell1);
        this.setRotateAngle(firstShell1, -1.0603F, 0.0F, 0.0F);
        this.firstShell1.cubeList.add(new ModelBox(firstShell1, 0, 0, -4.0F, -8.0F, 0.0F, 8, 8, 5, 0.04F, false));

        this.firstShell2 = new AdvancedModelRenderer(this);
        this.firstShell2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.firstShell1.addChild(firstShell2);
        this.setRotateAngle(firstShell2, 0.8727F, 0.0F, 0.0F);
        this.firstShell2.cubeList.add(new ModelBox(firstShell2, 0, 13, -4.0F, -5.0F, 0.0F, 8, 5, 5, 0.01F, false));

        this.firstShell3 = new AdvancedModelRenderer(this);
        this.firstShell3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.firstShell2.addChild(firstShell3);
        this.setRotateAngle(firstShell3, 0.6065F, 0.0F, 0.0F);
        this.firstShell3.cubeList.add(new ModelBox(firstShell3, 22, 27, -4.0F, -4.0F, 0.0F, 8, 4, 4, 0.0F, false));

        this.firstShell4 = new AdvancedModelRenderer(this);
        this.firstShell4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.firstShell3.addChild(firstShell4);
        this.setRotateAngle(firstShell4, 0.432F, 0.0F, 0.0F);
        this.firstShell4.cubeList.add(new ModelBox(firstShell4, 26, 0, -4.0F, -8.0F, 0.0F, 8, 8, 3, -0.01F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -5.5F, -6.25F);
        this.Shell.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.9599F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 44, 20, -3.5F, -5.0F, 0.0F, 7, 5, 2, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(1.5F, -0.5F, 0.5F);
        this.Mantle.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, 0.0873F, -0.0435F, -0.0038F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, -0.2628F, -0.0843F, 0.0226F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(2.75F, -0.5F, 0.5F);
        this.Mantle.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.1309F, -0.2182F, 0.0F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, -0.2657F, -0.1685F, 0.0456F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(3.0F, -1.25F, 0.5F);
        this.Mantle.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.2618F, -0.3054F, 0.0F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.3079F, -0.1248F, 0.0396F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(2.25F, -2.0F, 0.5F);
        this.Mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.1321F, -0.0399F, 0.0225F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.219F, -0.0852F, 0.0189F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(1.0F, -2.0F, 0.5F);
        this.Mantle.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, -0.0876F, 0.0869F, -0.0076F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle1b3 = new AdvancedModelRenderer(this);
        this.Tentacle1b3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle5a.addChild(Tentacle1b3);
        this.setRotateAngle(Tentacle1b3, -0.176F, -0.1289F, 0.0229F);
        this.Tentacle1b3.cubeList.add(new ModelBox(Tentacle1b3, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(-1.5F, -0.5F, 0.5F);
        this.Mantle.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, 0.0873F, 0.0435F, 0.0038F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, -0.2628F, 0.0843F, -0.0226F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(-2.75F, -0.5F, 0.5F);
        this.Mantle.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.1309F, 0.2182F, 0.0F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, -0.2657F, 0.1685F, -0.0456F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(-3.0F, -1.25F, 0.5F);
        this.Mantle.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, -0.2618F, 0.3054F, 0.0F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.3079F, 0.1248F, -0.0396F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(-2.25F, -2.0F, 0.5F);
        this.Mantle.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.1321F, 0.0399F, -0.0225F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.219F, 0.0852F, -0.0189F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(-1.0F, -2.0F, 0.5F);
        this.Mantle.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, -0.0876F, -0.0869F, 0.0076F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.176F, 0.1289F, -0.0229F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, -1, 56, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, -0.65F, 0.75F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, 0.3927F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 42, 53, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(3.05F, -4.75F, 0.75F);
        this.Mantle.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, -0.3715F, -0.7708F, 0.1087F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 52, 54, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(-3.05F, -4.75F, 0.75F);
        this.Mantle.addChild(eyeRight);
        this.setRotateAngle(eyeRight, -0.3715F, 0.7708F, -0.1087F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 52, 54, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Shell.offsetY = -1.4F;
        //this.Root.offsetZ = 1.0F;
        this.Shell.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
