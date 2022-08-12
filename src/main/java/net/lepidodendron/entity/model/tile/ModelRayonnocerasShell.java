package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelRayonnocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer hyponome;
    private final AdvancedModelRenderer headleft;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer eyeleft1;
    private final AdvancedModelRenderer headright;
    private final AdvancedModelRenderer eyeright;
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

    public ModelRayonnocerasShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 17.5F, -31.0F);
        this.setRotateAngle(root, 0.0F, 3.1416F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.root.addChild(head);
        this.setRotateAngle(head, 0.0F, -3.1416F, 0.0F);


        this.hyponome = new AdvancedModelRenderer(this);
        this.hyponome.setRotationPoint(0.0F, 3.0F, 4.8F);
        this.head.addChild(hyponome);
        this.setRotateAngle(hyponome, -1.1345F, 0.0F, 0.0F);


        this.headleft = new AdvancedModelRenderer(this);
        this.headleft.setRotationPoint(-5.0F, -0.2F, 0.0F);
        this.head.addChild(headleft);


        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(-0.7F, -1.1F, 4.5F);
        this.headleft.addChild(eyeleft);


        this.eyeleft1 = new AdvancedModelRenderer(this);
        this.eyeleft1.setRotationPoint(-1.1F, -0.25F, 0.0F);
        this.eyeleft.addChild(eyeleft1);


        this.headright = new AdvancedModelRenderer(this);
        this.headright.setRotationPoint(6.0F, -0.2F, 0.0F);
        this.head.addChild(headright);


        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(0.8F, -1.35F, 4.5F);
        this.headright.addChild(eyeright);


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

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1.5F;
        this.root.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
