package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelEldonia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer center;
    private final AdvancedModelRenderer centercube;
    private final AdvancedModelRenderer gut;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer side;

    public ModelEldonia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.0F, 0.0F);


        this.center = new AdvancedModelRenderer(this);
        this.center.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(center);


        this.centercube = new AdvancedModelRenderer(this);
        this.centercube.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.center.addChild(centercube);
        this.centercube.cubeList.add(new ModelBox(centercube, 0, 14, -3.0F, -2.0F, -3.0F, 6, 2, 6, 0.0F, false));
        this.centercube.cubeList.add(new ModelBox(centercube, 3, 39, -2.0F, -2.0F, -2.0F, 4, 2, 4, 0.0F, false));

        this.gut = new AdvancedModelRenderer(this);
        this.gut.setRotationPoint(0.0F, -0.5F, -0.05F);
        this.centercube.addChild(gut);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.gut.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.2182F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 23, 0.0F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.gut.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.0873F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 17, -3.0F, 0.0F, -1.0F, 6, 0, 6, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(1.0F, -0.3F, -0.05F);
        this.gut.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.0F, 0.48F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 7, 27, 0.7983F, 0.2F, 0.4156F, 0, 3, 3, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(1.0F, -0.3F, -0.05F);
        this.gut.addChild(tentacle6);
        this.setRotateAngle(tentacle6, 0.0F, 0.2182F, 0.0F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 27, 24, 0.8787F, 0.2F, 0.1948F, 0, 3, 3, 0.0F, false));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(0.5F, -0.3F, -0.05F);
        this.gut.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.0F, -0.2182F, 0.0F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 20, 24, 0.4881F, 0.0F, -0.1082F, 0, 3, 3, 0.0F, false));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(0.5F, -0.3F, -0.05F);
        this.gut.addChild(tentacle8);
        this.setRotateAngle(tentacle8, 0.0F, -0.6545F, 0.0F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 27, 0.3967F, 0.0F, -0.3044F, 0, 3, 3, 0.0F, false));

        this.side = new AdvancedModelRenderer(this);
        this.side.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.center.addChild(side);
        this.side.cubeList.add(new ModelBox(side, 0, 0, -6.0F, -1.025F, -6.0F, 12, 1, 12, 0.0F, false));

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

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.0F;
        this.main.offsetX = -0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

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
        AdvancedModelRenderer[] tentacle1 = {this.tentacle5, this.tentacle6, this.tentacle7, this.tentacle8};

        float speed = 0.1F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(main, speed * 0.4F, 0.15F, true, 0, 0, f2, 1);
            this.walk(main, speed * 0.3F, 0.4F, true, 0, 0, f2, 1);
            this.flap(main, speed * 0.2F, 0.3F, true, 0, 0, f2, 1);
            this.chainFlap(tentacle1, speed, -0.4F, -3, f2, 1);

            this.bob(main, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 1.2F;
                this.main.scaleChildren = true;
                this.main.setScaleX(0.2F);
                this.main.setScaleZ(1.2F);
            }
        }
    }
}
