package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelCyrtocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer leg10;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer leg9;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelCyrtocerasShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, 12.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, 0.0F, 3.1416F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -6.0F, -12.0F, -8.0F, 12, 12, 13, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.shell.addChild(bone2);
        this.setRotateAngle(bone2, 0.1309F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 25, -5.0F, -10.0F, 0.0F, 10, 10, 12, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -0.9483F, 11.3615F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, 0.3927F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 36, 39, -4.0F, -7.7517F, -0.1708F, 8, 8, 8, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, -2.0517F, 7.8164F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.3927F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0517F, -0.1212F);
        this.bone4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 0, -3.0F, -5.8517F, -1.0F, 6, 6, 7, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.5517F, 4.5802F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, 0.4363F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 50, 13, -2.0F, -4.5F, 0.2987F, 4, 4, 5, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -1.5F, 3.2987F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, 0.48F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 0, -1.0F, -1.5081F, 0.999F, 2, 3, 4, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(3.0F, -4.0F, 7.0F);
        this.body.addChild(leg1);


        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-3.0F, -4.0F, 7.0F);
        this.body.addChild(leg6);


        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(3.0F, -6.0F, 7.0F);
        this.body.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, -0.0436F, -0.3927F);


        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(-3.0F, -6.0F, 7.0F);
        this.body.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, 0.0436F, 0.3927F);


        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(3.0F, -2.0F, 7.0F);
        this.body.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, -0.0436F, 0.3491F);


        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(-3.0F, -2.0F, 7.0F);
        this.body.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.0436F, -0.3491F);


        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(2.0F, -1.0F, 7.0F);
        this.body.addChild(leg4);
        this.setRotateAngle(leg4, -0.0873F, 0.0436F, 1.3963F);


        this.leg10 = new AdvancedModelRenderer(this);
        this.leg10.setRotationPoint(-2.0F, -1.0F, 7.0F);
        this.body.addChild(leg10);
        this.setRotateAngle(leg10, -0.0873F, -0.0436F, -1.3963F);


        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(1.0F, -7.0F, 7.0F);
        this.body.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, 0.0F, -1.3526F);


        this.leg9 = new AdvancedModelRenderer(this);
        this.leg9.setRotationPoint(-1.0F, -7.0F, 7.0F);
        this.body.addChild(leg9);
        this.setRotateAngle(leg9, 0.0F, 0.0F, 1.3526F);


        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -11.0F, 3.0F);
        this.body.addChild(bone);
        this.setRotateAngle(bone, -1.1345F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 25, -5.0F, -1.0F, 0.0F, 10, 3, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 31, -4.0F, -1.0F, 2.0F, 8, 2, 5, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.offsetY = -1.2F;
        this.body.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
