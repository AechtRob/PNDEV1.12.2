package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelPtychocerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer mantle2;
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

    public ModelPtychocerasShell() {
        this.textureWidth = 54;
        this.textureHeight = 54;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -11.0F, 0.0F);
        this.base.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 17, 0, -1.5F, 0.0F, -3.0F, 3, 8, 3, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.5236F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 9, 17, -1.5F, 0.0F, -3.0F, 3, 3, 3, -0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.829F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 27, 12, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.02F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.7418F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 9, 28, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.7418F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 27, 17, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.01F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.3229F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 0, 17, -1.0F, 0.0F, -2.0F, 2, 18, 2, 0.0F, false));
        this.shell6.cubeList.add(new ModelBox(shell6, 22, 12, -0.5F, 8.5F, -2.75F, 1, 10, 1, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.shell.addChild(mantle);
        this.mantle.cubeList.add(new ModelBox(mantle, 0, 0, -1.5F, -11.0F, -5.0F, 3, 12, 5, 0.04F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 29, 22, -1.5F, -11.0F, -6.08F, 3, 2, 1, 0.04F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 29, 26, -1.5F, -8.0F, -6.08F, 3, 2, 1, 0.04F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 30, 0, -1.5F, -5.0F, -6.08F, 3, 2, 1, 0.04F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 9, 24, -1.5F, -12.08F, -5.0F, 3, 1, 2, 0.04F, false));

        this.mantle2 = new AdvancedModelRenderer(this);
        this.mantle2.setRotationPoint(-1.0F, -11.0F, -2.0F);
        this.mantle.addChild(mantle2);
        this.setRotateAngle(mantle2, -0.6981F, 0.0F, 0.0F);
        this.mantle2.cubeList.add(new ModelBox(mantle2, 20, 24, 0.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.5F, -1.5F, 1.5F);
        this.mantle2.addChild(siphon);
        this.setRotateAngle(siphon, -0.7418F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 17, 12, 0.0F, -1.9558F, -0.3995F, 1, 2, 1, 0.0F, false));

        this.tentacle1 = new AdvancedModelRenderer(this);
        this.tentacle1.setRotationPoint(0.75F, -3.0F, 1.5F);
        this.mantle2.addChild(tentacle1);
        this.setRotateAngle(tentacle1, -0.1702F, 0.0F, -0.0611F);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(0.375F, -3.0F, 1.5F);
        this.mantle2.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.0873F, 0.0F, -0.2574F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.mantle2.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, 0.0F, -0.3447F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(0.375F, -3.0F, 0.5F);
        this.mantle2.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.1265F, 0.0F, -0.2531F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(0.75F, -3.0F, 0.5F);
        this.mantle2.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.2136F, 0.0093F, -0.0426F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(1.25F, -3.0F, 1.5F);
        this.mantle2.addChild(tentacle6);
        this.setRotateAngle(tentacle6, -0.1702F, 0.0F, 0.0611F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(1.625F, -3.0F, 1.5F);
        this.mantle2.addChild(tentacle7);
        this.setRotateAngle(tentacle7, -0.0873F, 0.0F, 0.2574F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(2.0F, -3.0F, 1.0F);
        this.mantle2.addChild(tentacle8);
        this.setRotateAngle(tentacle8, 0.0F, 0.0F, 0.3447F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(1.625F, -3.0F, 0.5F);
        this.mantle2.addChild(tentacle9);
        this.setRotateAngle(tentacle9, 0.1265F, 0.0F, 0.2531F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(1.25F, -3.0F, 0.5F);
        this.mantle2.addChild(tentacle10);
        this.setRotateAngle(tentacle10, 0.2136F, -0.0093F, 0.0426F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.offsetY = -1.3F;
        //this.Root.offsetZ = 1.0F;
        this.base.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
