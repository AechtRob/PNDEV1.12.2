package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelArandaspis extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyhead;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Headunderside1;
    public AdvancedModelRenderer Head2;
    public AdvancedModelRenderer Headslope1;
    public AdvancedModelRenderer Headunderside2;
    public AdvancedModelRenderer Headslope2;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer Tail6;
    public AdvancedModelRenderer Tailfin1;
    public AdvancedModelRenderer Tailfin2;
    public AdvancedModelRenderer Tailfin3;
    public AdvancedModelRenderer Tailfin4;
    public AdvancedModelRenderer Tailfin6;

    public ModelArandaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Tail4 = new AdvancedModelRenderer(this, 48, 46);
        this.Tail4.setRotationPoint(0.0F, 0.30000001192092896F, 2.0F);
        this.Tail4.addBox(-2.0F, -1.5F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Tail4, -0.017453292519943295F, 0.0F, 0.0F);
        this.Tail5 = new AdvancedModelRenderer(this, 37, 37);
        this.Tail5.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.Tail5.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
        this.Bodyhead = new AdvancedModelRenderer(this, 0, 48);
        this.Bodyhead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyhead.addBox(-3.5F, -1.5F, -6.0F, 7, 8, 8, 0.0F);
        this.Tailfin3 = new AdvancedModelRenderer(this, 0, 0);
        this.Tailfin3.setRotationPoint(0.009999999776482582F, 0.0F, 3.700000047683716F);
        this.Tailfin3.addBox(-0.5F, -3.0F, 0.0F, 1, 6, 2, 0.0F);
        this.Head1 = new AdvancedModelRenderer(this, 0, 27);
        this.Head1.setRotationPoint(0.0F, 0.0F, -5.900000095367432F);
        this.Head1.addBox(-3.0F, 0.0F, -4.0F, 6, 5, 4, 0.0F);
        this.Tailfin6 = new AdvancedModelRenderer(this, 21, 8);
        this.Tailfin6.setRotationPoint(0.009999999776482582F, 3.0F, 1.2000000476837158F);
        this.Tailfin6.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(Tailfin6, 0.3752457891787809F, 0.0F, 0.0F);
        this.Headunderside2 = new AdvancedModelRenderer(this, 18, 25);
        this.Headunderside2.setRotationPoint(0.009999999776482582F, 2.5F, 0.20000000298023224F);
        this.Headunderside2.addBox(-2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Headunderside2, -0.42446406875869874F, 0.0F, 0.0F);
        this.Tailfin4 = new AdvancedModelRenderer(this, 21, 16);
        this.Tailfin4.setRotationPoint(0.0F, -3.0F, 1.2000000476837158F);
        this.Tailfin4.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(Tailfin4, -0.3752457891787809F, 0.0F, 0.0F);
        this.Headunderside1 = new AdvancedModelRenderer(this, 0, 20);
        this.Headunderside1.setRotationPoint(0.009999999776482582F, 6.5F, -0.10000000149011612F);
        this.Headunderside1.addBox(-3.0F, -2.0F, -4.0F, 6, 2, 4, 0.0F);
        this.setRotateAngle(Headunderside1, -0.38205256260891435F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 37);
        this.Tail1.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.Tail1.addBox(-3.0F, -2.0F, 0.0F, 6, 7, 3, 0.0F);
        this.Headslope2 = new AdvancedModelRenderer(this, 21, 31);
        this.Headslope2.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Headslope2.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Headslope2, 0.4426155089584063F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 23, 46);
        this.Tail3.setRotationPoint(0.0F, -0.10000000149011612F, 2.0F);
        this.Tail3.addBox(-2.5F, -1.5F, 0.0F, 5, 5, 3, 0.0F);
        this.Head2 = new AdvancedModelRenderer(this, 19, 40);
        this.Head2.setRotationPoint(0.0F, 2.5F, -3.9000000953674316F);
        this.Head2.addBox(-2.5F, -1.5F, -2.0F, 5, 3, 2, 0.0F);
        this.Headslope1 = new AdvancedModelRenderer(this, 0, 13);
        this.Headslope1.setRotationPoint(-0.009999999776482582F, -1.5F, -0.10000000149011612F);
        this.Headslope1.addBox(-3.0F, 0.0F, -4.0F, 6, 2, 4, 0.0F);
        this.setRotateAngle(Headslope1, 0.38205256260891435F, 0.0F, 0.0F);
        this.Tail6 = new AdvancedModelRenderer(this, 18, 0);
        this.Tail6.setRotationPoint(-0.009999999776482582F, 0.0F, 4.5F);
        this.Tail6.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
        this.Tailfin2 = new AdvancedModelRenderer(this, 7, 0);
        this.Tailfin2.setRotationPoint(-0.009999999776482582F, 1.7999999523162842F, -0.10000000149011612F);
        this.Tailfin2.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(Tailfin2, -0.2972295835988592F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 31, 55);
        this.Tail2.setRotationPoint(0.009999999776482582F, 0.4000000059604645F, 2.0F);
        this.Tail2.addBox(-3.0F, -2.0F, 0.0F, 6, 6, 3, 0.0F);
        this.Tailfin1 = new AdvancedModelRenderer(this, 3, 6);
        this.Tailfin1.setRotationPoint(0.0F, -1.7999999523162842F, -0.10000000149011612F);
        this.Tailfin1.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(Tailfin1, 0.2972295835988592F, 0.0F, 0.0F);
        this.Tail3.addChild(this.Tail4);
        this.Tail4.addChild(this.Tail5);
        this.Tail5.addChild(this.Tailfin3);
        this.Bodyhead.addChild(this.Head1);
        this.Tail6.addChild(this.Tailfin6);
        this.Head2.addChild(this.Headunderside2);
        this.Tail6.addChild(this.Tailfin4);
        this.Head1.addChild(this.Headunderside1);
        this.Bodyhead.addChild(this.Tail1);
        this.Head2.addChild(this.Headslope2);
        this.Tail2.addChild(this.Tail3);
        this.Head1.addChild(this.Head2);
        this.Head1.addChild(this.Headslope1);
        this.Tail5.addChild(this.Tail6);
        this.Tail5.addChild(this.Tailfin2);
        this.Tail1.addChild(this.Tail2);
        this.Tail5.addChild(this.Tailfin1);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        this.Bodyhead.render(f5 * 0.25F);

    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Bodyhead.rotateAngleY = (float) Math.toRadians(90);
        this.Bodyhead.render(0.01F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.Bodyhead.offsetY = 1.2F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 0.8F);
            this.swing(Bodyhead, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Bodyhead.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyhead.offsetY = 1.4F;
                this.bob(Bodyhead, -speed, 5F, false, f2, 1);
            }
        }
    }
}
