package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelRhizostomites extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tentacleA;
    private final AdvancedModelRenderer tentacleA2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tentacleA3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tentacleA4;
    private final AdvancedModelRenderer tentacleA5;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tentacleA6;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tentacleA7;
    private final AdvancedModelRenderer tentacleA8;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tentacleA9;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tentacleA10;
    private final AdvancedModelRenderer tentacleA11;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tentacleA12;
    private final AdvancedModelRenderer cube_r8;

    public ModelRhizostomites() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 15.6667F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -0.1667F, -4.0F, 8, 2, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 11, -3.0F, -0.6667F, -3.0F, 6, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 19, -2.0F, -1.1667F, -2.0F, 4, 1, 4, 0.0F, false));

        this.tentacleA = new AdvancedModelRenderer(this);
        this.tentacleA.setRotationPoint(-1.0F, 1.3333F, 1.0F);
        this.main.addChild(tentacleA);
        this.setRotateAngle(tentacleA, 0.2618F, -0.7854F, 0.0F);
        this.tentacleA.cubeList.add(new ModelBox(tentacleA, 0, 0, -1.0F, -1.0F, -0.5F, 2, 4, 1, 0.0F, false));

        this.tentacleA2 = new AdvancedModelRenderer(this);
        this.tentacleA2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleA.addChild(tentacleA2);
        this.setRotateAngle(tentacleA2, -0.1309F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacleA2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 11, -1.0F, -1.25F, -0.5F, 2, 2, 1, 0.001F, false));

        this.tentacleA3 = new AdvancedModelRenderer(this);
        this.tentacleA3.setRotationPoint(0.0F, 1.5F, 0.4F);
        this.tentacleA2.addChild(tentacleA3);
        this.setRotateAngle(tentacleA3, -0.48F, 0.0F, 0.0F);
        this.tentacleA3.cubeList.add(new ModelBox(tentacleA3, 13, 19, -1.0F, -0.001F, -1.0436F, 2, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.999F, -0.0436F);
        this.tentacleA3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 5, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.tentacleA4 = new AdvancedModelRenderer(this);
        this.tentacleA4.setRotationPoint(1.0F, 1.3333F, 1.0F);
        this.main.addChild(tentacleA4);
        this.setRotateAngle(tentacleA4, 0.2618F, 0.7854F, 0.0F);
        this.tentacleA4.cubeList.add(new ModelBox(tentacleA4, 0, 0, -1.0F, -1.0F, -0.5F, 2, 4, 1, 0.0F, true));

        this.tentacleA5 = new AdvancedModelRenderer(this);
        this.tentacleA5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleA4.addChild(tentacleA5);
        this.setRotateAngle(tentacleA5, -0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacleA5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 11, -1.0F, -1.25F, -0.5F, 2, 2, 1, 0.001F, true));

        this.tentacleA6 = new AdvancedModelRenderer(this);
        this.tentacleA6.setRotationPoint(0.0F, 1.5F, 0.4F);
        this.tentacleA5.addChild(tentacleA6);
        this.setRotateAngle(tentacleA6, -0.48F, 0.0F, 0.0F);
        this.tentacleA6.cubeList.add(new ModelBox(tentacleA6, 13, 19, -1.0F, -0.001F, -1.0436F, 2, 2, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.999F, -0.0436F);
        this.tentacleA6.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 5, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.tentacleA7 = new AdvancedModelRenderer(this);
        this.tentacleA7.setRotationPoint(1.0F, 1.3333F, -1.0F);
        this.main.addChild(tentacleA7);
        this.setRotateAngle(tentacleA7, -0.2618F, -0.7854F, 0.0F);
        this.tentacleA7.cubeList.add(new ModelBox(tentacleA7, 0, 0, -1.0F, -1.0F, -0.5F, 2, 4, 1, 0.0F, true));

        this.tentacleA8 = new AdvancedModelRenderer(this);
        this.tentacleA8.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleA7.addChild(tentacleA8);
        this.setRotateAngle(tentacleA8, 0.1309F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacleA8.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 11, -1.0F, -1.25F, -0.5F, 2, 2, 1, 0.001F, true));

        this.tentacleA9 = new AdvancedModelRenderer(this);
        this.tentacleA9.setRotationPoint(0.0F, 1.5F, -0.4F);
        this.tentacleA8.addChild(tentacleA9);
        this.setRotateAngle(tentacleA9, 0.48F, 0.0F, 0.0F);
        this.tentacleA9.cubeList.add(new ModelBox(tentacleA9, 13, 19, -1.0F, -0.001F, 0.0436F, 2, 2, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.999F, 0.0436F);
        this.tentacleA9.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 5, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.tentacleA10 = new AdvancedModelRenderer(this);
        this.tentacleA10.setRotationPoint(-1.0F, 1.3333F, -1.0F);
        this.main.addChild(tentacleA10);
        this.setRotateAngle(tentacleA10, -0.2618F, 0.7854F, 0.0F);
        this.tentacleA10.cubeList.add(new ModelBox(tentacleA10, 0, 0, -1.0F, -1.0F, -0.5F, 2, 4, 1, 0.0F, false));

        this.tentacleA11 = new AdvancedModelRenderer(this);
        this.tentacleA11.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleA10.addChild(tentacleA11);
        this.setRotateAngle(tentacleA11, 0.1309F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacleA11.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 11, -1.0F, -1.25F, -0.5F, 2, 2, 1, 0.001F, false));

        this.tentacleA12 = new AdvancedModelRenderer(this);
        this.tentacleA12.setRotationPoint(0.0F, 1.5F, -0.4F);
        this.tentacleA11.addChild(tentacleA12);
        this.setRotateAngle(tentacleA12, 0.48F, 0.0F, 0.0F);
        this.tentacleA12.cubeList.add(new ModelBox(tentacleA12, 13, 19, -1.0F, -0.001F, 0.0436F, 2, 2, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.999F, 0.0436F);
        this.tentacleA12.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 5, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);

        this.main.render(f5);
        GlStateManager.disableBlend();

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

        //this.main.offsetY = 0.8F;
        this.main.setScaleX(1.0F);
        this.main.setScaleZ(1.0F);
        this.main.scaleChildren = false;

        AdvancedModelRenderer[] arm1 = {this.tentacleA, this.tentacleA2, this.tentacleA3};
        AdvancedModelRenderer[] arm2 = {this.tentacleA4, this.tentacleA5, this.tentacleA6};
        AdvancedModelRenderer[] arm3 = {this.tentacleA7, this.tentacleA8, this.tentacleA9};
        AdvancedModelRenderer[] arm4 = {this.tentacleA10, this.tentacleA11, this.tentacleA12};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(main, speed * 0.2F, 0.6F, true, 0, 0, f2, 1);
            //this.walk(main, speed * 0.3F, 0.5F, true, 0, 0, f2, 1);
            this.flap(main, speed * 0.2F, 0.4F, true, 0, 0, f2, 1);
           // this.chainWave(tentacle1, speed, 0.4F, -3, f2, 1);
           // this.chainWave(tentacle2, speed, -0.4F, -3, f2, 1);
           // this.chainFlap(tentacle3, speed, 0.4F, -3, f2, 1);
           // this.chainFlap(tentacle4, speed, -0.4F, -3, f2, 1);
            this.chainWave(arm1, speed, 0.2F, -3, f2, 1);
            this.chainWave(arm2, speed, 0.2F, -3, f2, 1);
            this.chainWave(arm3, speed, -0.2F, -3, f2, 1);
            this.chainWave(arm4, speed, -0.2F, -3, f2, 1);
            this.bob(main, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.50F;
                this.main.scaleChildren = true;
                this.main.setScaleX(0.2F);
                this.main.setScaleZ(1.2F);
            }
        }
    }
}
