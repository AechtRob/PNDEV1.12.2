package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelMegactenopetalus extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Firstdorsalfin;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Firstdorsalfinflesh;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Bellyend;
    public AdvancedModelRenderer Tailmiddle;
    public AdvancedModelRenderer Seconddorsalfin;
    public AdvancedModelRenderer Tailunderside;
    public AdvancedModelRenderer Seconddorsalfinflesh;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Throat;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Face;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Upperlips;
    public AdvancedModelRenderer Upperteeth;
    public AdvancedModelRenderer Lowerteeth;
    public AdvancedModelRenderer Lowertoothpoint;

    public ModelMegactenopetalus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Throat = new AdvancedModelRenderer(this, 34, 67);
        this.Throat.setRotationPoint(-0.009999999776482582F, 7.0F, -6.0F);
        this.Throat.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Throat, -0.5169665390881064F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 0, 57);
        this.Bodymiddle.setRotationPoint(0.0F, 0.699999988079071F, 2.0F);
        this.Bodymiddle.addBox(-2.0F, -2.5F, 0.0F, 4, 11, 4, 0.0F);
        this.setRotateAngle(Bodymiddle, -0.08482300397719036F, 0.0F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 53, 65);
        this.Lowerjaw.setRotationPoint(0.0F, 5.199999809265137F, -5.210000038146973F);
        this.Lowerjaw.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.40334560078853393F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 15, 46);
        this.Rightpelvicfin.setRotationPoint(-2.4000000953674316F, 8.5F, -2.5F);
        this.Rightpelvicfin.addBox(-8.0F, 0.0F, -6.5F, 8, 0, 13, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, -0.4457571069383183F);
        this.Seconddorsalfinflesh = new AdvancedModelRenderer(this, 1, 0);
        this.Seconddorsalfinflesh.setRotationPoint(0.0F, -0.4000000059604645F, 0.800000011920929F);
        this.Seconddorsalfinflesh.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(Seconddorsalfinflesh, 0.169820528229565F, 0.0F, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 4, 60);
        this.Leftpelvicfin.setRotationPoint(2.4000000953674316F, 8.5F, -2.5F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, -6.5F, 8, 0, 13, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.0F, 0.0F, 0.4457571069383183F);
        this.Bellyend = new AdvancedModelRenderer(this, 15, 47);
        this.Bellyend.setRotationPoint(0.0F, 9.399999618530273F, 0.0F);
        this.Bellyend.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(Bellyend, 0.23352505591421208F, 0.0F, 0.0F);
        this.Tailunderside = new AdvancedModelRenderer(this, 24, 32);
        this.Tailunderside.setRotationPoint(0.0F, 8.0F, 0.30000001192092896F);
        this.Tailunderside.addBox(-1.0F, -4.0F, 0.0F, 2, 4, 9, 0.0F);
        this.setRotateAngle(Tailunderside, 0.5447172435684637F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 43, 16);
        this.Tailend.setRotationPoint(0.0F, -0.5F, 3.9000000953674316F);
        this.Tailend.addBox(-0.6000000238418579F, -1.0F, 0.0F, 1, 2, 7, 0.0F);
        this.setRotateAngle(Tailend, 0.5942845969882637F, 0.0F, 0.0F);
        this.Firstdorsalfin = new AdvancedModelRenderer(this, 47, 12);
        this.Firstdorsalfin.setRotationPoint(0.0F, -2.799999952316284F, -0.5F);
        this.Firstdorsalfin.addBox(0.0F, -7.0F, -7.5F, 0, 8, 14, 0.0F);
        this.Seconddorsalfin = new AdvancedModelRenderer(this, 27, 0);
        this.Seconddorsalfin.setRotationPoint(0.009999999776482582F, -2.200000047683716F, -1.0F);
        this.Seconddorsalfin.addBox(0.0F, -6.0F, 0.0F, 0, 7, 10, 0.0F);
        this.setRotateAngle(Seconddorsalfin, 0.021293017373673524F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 21, 74);
        this.Headslope.setRotationPoint(0.009999999776482582F, -3.9000000953674316F, -2.799999952316284F);
        this.Headslope.addBox(-2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Headslope, 0.5731661290180989F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRenderer(this, 9, 27);
        this.Tailbase.setRotationPoint(0.009999999776482582F, 0.5F, 2.9000000953674316F);
        this.Tailbase.addBox(-1.5F, -1.5F, 0.0F, 3, 5, 8, 0.0F);
        this.setRotateAngle(Tailbase, 0.04241150198859518F, 0.0F, 0.0F);
        this.Lowertoothpoint = new AdvancedModelRenderer(this, 0, 0);
        this.Lowertoothpoint.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Lowertoothpoint.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F);
        this.Firstdorsalfinflesh = new AdvancedModelRenderer(this, 24, 18);
        this.Firstdorsalfinflesh.setRotationPoint(0.0F, -1.899999976158142F, -5.099999904632568F);
        this.Firstdorsalfinflesh.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 9, 0.0F);
        this.setRotateAngle(Firstdorsalfinflesh, 0.12740903872453743F, 0.0F, 0.0F);
        this.Face = new AdvancedModelRenderer(this, 57, 74);
        this.Face.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.Face.addBox(-2.0F, 0.0F, 0.0F, 4, 6, 5, 0.0F);
        this.setRotateAngle(Face, -0.5518731241279929F, 0.0F, 0.0F);
        this.Upperlips = new AdvancedModelRenderer(this, 34, 60);
        this.Upperlips.setRotationPoint(0.0F, 5.5F, -0.20000000298023224F);
        this.Upperlips.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 5, 0.0F);
        this.setRotateAngle(Upperlips, 0.169820528229565F, 0.0F, 0.0F);
        this.Analfin = new AdvancedModelRenderer(this, 49, 0);
        this.Analfin.setRotationPoint(0.0F, -0.20000000298023224F, 5.5F);
        this.Analfin.addBox(0.0F, 0.0F, -4.0F, 0, 6, 9, 0.0F);
        this.setRotateAngle(Analfin, 0.04241150198859518F, 0.0F, 0.0F);
        this.Upperteeth = new AdvancedModelRenderer(this, 45, 53);
        this.Upperteeth.setRotationPoint(0.0F, 1.0F, 0.20000000298023224F);
        this.Upperteeth.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Upperteeth, 0.1911135497644277F, 0.0F, 0.0F);
        this.Lowerteeth = new AdvancedModelRenderer(this, 50, 59);
        this.Lowerteeth.setRotationPoint(0.009999999776482582F, 0.10000000149011612F, -4.300000190734863F);
        this.Lowerteeth.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Lowerteeth, -0.169820528229565F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 74);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Bodyfront.addBox(-2.5F, -3.0F, -7.0F, 5, 13, 10, 0.0F);
        this.Bodyend = new AdvancedModelRenderer(this, 0, 41);
        this.Bodyend.setRotationPoint(0.0F, -0.8999999761581421F, 3.200000047683716F);
        this.Bodyend.addBox(-1.5F, -1.5F, 0.0F, 3, 10, 4, 0.0F);
        this.Tailmiddle = new AdvancedModelRenderer(this, 0, 21);
        this.Tailmiddle.setRotationPoint(0.0F, 0.699999988079071F, 7.300000190734863F);
        this.Tailmiddle.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 5, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.08482300397719036F, 0.0F, 0.0F);
        this.Tailfin = new AdvancedModelRenderer(this, 0, 0);
        this.Tailfin.setRotationPoint(-0.009999999776482582F, -1.0F, 1.5F);
        this.Tailfin.addBox(0.0F, 0.0F, -2.5F, 0, 7, 11, 0.0F);
        this.setRotateAngle(Tailfin, 0.08482300397719036F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 32, 75);
        this.Head.setRotationPoint(0.0F, 1.0F, -4.099999904632568F);
        this.Head.addBox(-3.0F, -2.0F, -6.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(Head, -0.04241150198859518F, 0.0F, 0.0F);
        this.Head.addChild(this.Throat);
        this.Bodyfront.addChild(this.Bodymiddle);
        this.Head.addChild(this.Lowerjaw);
        this.Bodyfront.addChild(this.Rightpelvicfin);
        this.Tailbase.addChild(this.Seconddorsalfinflesh);
        this.Bodyfront.addChild(this.Leftpelvicfin);
        this.Bodyend.addChild(this.Bellyend);
        this.Tailbase.addChild(this.Tailunderside);
        this.Tailmiddle.addChild(this.Tailend);
        this.Bodyfront.addChild(this.Firstdorsalfin);
        this.Tailbase.addChild(this.Seconddorsalfin);
        this.Head.addChild(this.Headslope);
        this.Bodyend.addChild(this.Tailbase);
        this.Lowerteeth.addChild(this.Lowertoothpoint);
        this.Bodyfront.addChild(this.Firstdorsalfinflesh);
        this.Head.addChild(this.Face);
        this.Face.addChild(this.Upperlips);
        this.Tailunderside.addChild(this.Analfin);
        this.Upperlips.addChild(this.Upperteeth);
        this.Lowerjaw.addChild(this.Lowerteeth);
        this.Bodymiddle.addChild(this.Bodyend);
        this.Tailbase.addChild(this.Tailmiddle);
        this.Tailend.addChild(this.Tailfin);
        this.Bodyfront.addChild(this.Head);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5 * 0.825F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.Bodyfront.render(0.01F);
        GlStateManager.enableCull();
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
        this.Bodyfront.offsetY = 1F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodymiddle, this.Bodyend, this.Tailbase, this.Tailmiddle, this.Tailend};

        float speed = 0.445F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.185F;
            taildegree = 0.25F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3.25, f2, 1);
            this.swing(Bodyfront, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(Leftpelvicfin, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 1.3F;
                this.bob(Bodyfront, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed*0.5F, 0.1F, -3, f2, 1);
            }
        }
    }
}
