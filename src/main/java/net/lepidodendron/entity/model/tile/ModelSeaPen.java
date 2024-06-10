package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelSeaPen extends AdvancedModelBase {
    private final AdvancedModelRenderer Seapen;
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer stem1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer stem2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer stem3top;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;

    public ModelSeaPen() {
        textureWidth = 32;
        textureHeight = 32;

        Seapen = new AdvancedModelRenderer(this);
        Seapen.setRotationPoint(8.0F, 24.0F, -8.0F);


        base = new AdvancedModelRenderer(this);
        base.setRotationPoint(0.0F, 0.0F, 0.0F);
        Seapen.addChild(base);
        base.cubeList.add(new ModelBox(base, 16, 7, -9.0F, -7.0F, 7.0F, 2, 3, 2, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 0, 0, -10.0F, -4.0F, 6.0F, 4, 4, 4, 0.0F, false));

        stem1 = new AdvancedModelRenderer(this);
        stem1.setRotationPoint(-8.0F, -6.0F, 7.7704F);
        base.addChild(stem1);
        stem1.cubeList.add(new ModelBox(stem1, 12, 18, -1.5F, -6.0F, -1.0204F, 1, 5, 2, 0.0F, false));
        stem1.cubeList.add(new ModelBox(stem1, 8, 8, -1.0F, -6.0F, -0.7704F, 2, 6, 2, -0.01F, false));
        stem1.cubeList.add(new ModelBox(stem1, 16, 0, 0.5F, -6.0F, -1.0204F, 1, 5, 2, 0.0F, false));

        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(1.5F, -3.75F, 0.4796F);
        stem1.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 12, 0.0F, -2.25F, 0.0F, 3, 5, 0, 0.0F, false));

        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(-1.5F, -3.75F, 0.4796F);
        stem1.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, -0.3927F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 23, -3.0F, -2.25F, 0.0F, 3, 5, 0, 0.0F, false));

        stem2 = new AdvancedModelRenderer(this);
        stem2.setRotationPoint(0.0F, -5.5F, 0.0F);
        stem1.addChild(stem2);
        stem2.cubeList.add(new ModelBox(stem2, 0, 8, -1.0F, -6.5F, -0.7704F, 2, 7, 2, 0.0F, false));
        stem2.cubeList.add(new ModelBox(stem2, 6, 15, 0.5F, -5.5F, -1.0204F, 1, 5, 2, 0.0F, false));
        stem2.cubeList.add(new ModelBox(stem2, 0, 15, -1.5F, -5.5F, -1.0204F, 1, 5, 2, 0.0F, false));

        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(-1.5F, -3.25F, 0.4796F);
        stem2.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, -0.3927F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 0, -3.0F, -2.25F, 0.0F, 3, 5, 0, 0.0F, false));

        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(1.5F, -3.25F, 0.4796F);
        stem2.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 22, 0.0F, -2.25F, 0.0F, 3, 5, 0, 0.0F, false));

        stem3top = new AdvancedModelRenderer(this);
        stem3top.setRotationPoint(0.0115F, -5.25F, 0.3122F);
        stem2.addChild(stem3top);
        stem3top.cubeList.add(new ModelBox(stem3top, 14, 13, -1.0115F, -3.25F, -1.0826F, 2, 3, 2, -0.01F, false));
        stem3top.cubeList.add(new ModelBox(stem3top, 0, 0, -1.0115F, -6.25F, 0.4174F, 2, 3, 0, 0.0F, false));

        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(-0.5115F, 0.0F, 0.1674F);
        stem3top.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0F, 0.3927F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 18, 1.2478F, -5.25F, 0.7654F, 3, 5, 0, 0.0F, false));

        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(-0.5115F, 0.0F, 0.1674F);
        stem3top.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.0F, -0.3927F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, -3.2739F, -5.25F, 0.3827F, 3, 5, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] bodyFull = {this.stem1,this.stem2,this.stem3top};
        float speed = 0.083F;
        this.chainWave(bodyFull, speed, 0.20F, 2, f, 0.42F);
        this.Seapen.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
